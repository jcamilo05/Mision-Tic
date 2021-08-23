package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.Productos;
import modelo.Direcciones;
import Repositories.RepositorioProductos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.StoreManager;

public class ControladorProductos implements ActionListener {

    RepositorioProductos repositorioProductos;
    Productos productos = Productos.crearProductos();
    StoreManager vista;
    //DefaultTableModel modelo = new DefaultTableModel();

    public ControladorProductos() {
        super();
    }

    public ControladorProductos(RepositorioProductos productos, StoreManager vista) {
        super();
        this.repositorioProductos = productos;
        this.vista = vista;
        agregarEventos();
        vista.setVisible(true);
    }

    //Metodo que controlara los eventos de botones
    private void agregarEventos() {
        vista.getBtnCreateProduct().addActionListener(this);
        vista.getBtnSearchProduct().addActionListener(this);
        vista.getBtnUpdateProduct().addActionListener(this);
        vista.getBtnDeleteProduct().addActionListener(this);
        vista.getBtnClearProducts().addActionListener(this);
        vista.getBtnListProducts().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnCreateProduct()) {
            crearClic(e);
            listarClic(e);
        }

        if(e.getSource()== vista.getBtnSearchProduct()){
            clearFields(e);
        }
     
        if(e.getSource()==vista.getBtnDeleteProduct()){
            eliminarClic(e);       
        }
        
        if(e.getSource()==vista.getBtnClearProducts()){
            clearFields(e);  
        }
        
        if(e.getSource()==vista.getBtnUpdateProduct() ){
            editarClic(e);
        
        }
        if(e.getSource()==vista.getBtnListProducts() ){
            listarClic(e);
        }
        
        if(e.getSource()==vista.getBtnSearchProduct() ){
            buscarClic(e);
        }
    }

    private void crearClic(ActionEvent e) {
        
        // customer information
        try{
            JTextField nameField = vista.getTxtNameProduct();
            JTextField priceField = vista.getTxtCurrentPrice();
            JTextField stokeField = vista.getTxtStokeInStore();
            JTextField idsuppliersField = vista.getTxtIdSuppliers();
            JTextField idCategoryField = vista.getTxtIdCategory();

            String nameSearched = nameField.getText();
            String priceSearched = priceField.getText();
            String stokeSearched = stokeField.getText();
            String idsuppliersSearched = idsuppliersField.getText();
            String idCategorySearched = idCategoryField.getText();


            Productos productos = Productos.crearProductos(nameSearched, priceSearched, stokeSearched, idsuppliersSearched, idCategorySearched);

            repositorioProductos.save(productos);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(new JFrame() , "A product can't be created whit code, this is generated automatically");}
    }


    private void listarClic(ActionEvent e) {
        JTable tabla = vista.getTbProductsInfo();
        List<Productos> listaProducts = (List<Productos>) repositorioProductos.findAll();
        //con los elementos guardados en la lista, llenamos
        
        int cont = 0;
        
        for (Productos p : listaProducts) {
            tabla.setValueAt(p.getIdproducto() , cont, 0);
            tabla.setValueAt(p.getNombreProducto() , cont, 1);
            tabla.setValueAt(p.getExistencia() , cont, 2);
            tabla.setValueAt(p.getIdproveedores() , cont, 3);
            tabla.setValueAt(p.getIdCategoria(), cont, 4);
            cont++;
        }
    }

    private void clearFields(ActionEvent e) {
        vista.getTxtNameProduct().setText("");
        vista.getTxtCurrentPrice().setText("");
        vista.getTxtStokeInStore().setText("");
        vista.getTxtIdSuppliers().setText(""); 
        vista.getTxtIdCategory().setText("");
    }

    private void editarClic(ActionEvent e) {
       JTextField idTxtproduct = vista.getTxtProductCode();
       Long idBusqueda=Long.valueOf(idTxtproduct.getText());
       JTextField txtName=vista.getTxtNameProduct();
       String NameBusqueda = txtName.getText();
       JTextField txtprice=vista.getTxtCurrentPrice();
       String priceBusqueda= txtprice.getText();
       JTextField txtStoke=vista.getTxtStokeInStore() ;
       String stokeBusqueda = txtStoke.getText();
       JTextField txtIdSuppliers =vista.getTxtIdSuppliers();
       String suppliersBusqueda = txtIdSuppliers.getText();
       JTextField txtCategory =vista.getTxtIdCategory();
       String categoryBusqueda = txtCategory.getText();
       
       
       //Capturado el objeto categoria con ese id, lo podemos actualizar
       Productos producto = repositorioProductos.findById(idBusqueda).get();
        
       producto.setNombreProducto(NameBusqueda);
       producto.setPrecioActual(priceBusqueda);
       producto.setExistencia(stokeBusqueda);
       producto.setIdCategoria(priceBusqueda);
       //Vamos a actualizar por medio de save --update
       
       repositorioProductos.save(producto);
       listarClic(e);
       
    }

    private void eliminarClic(ActionEvent e) {
       JTextField idTxtproduct = vista.getTxtProductCode();
       Long idBusqueda=Long.valueOf(idTxtproduct.getText());
        
        if(repositorioProductos.existsById(idBusqueda)){
            repositorioProductos.deleteById(idBusqueda);
        }
        CleanTable(e);
        listarClic(e);
        
    }

    private void buscarClic(ActionEvent e) {
        
        JTextField idField=vista.getTxtProductCode();
        JTextField nameField=vista.getTxtNameProduct();
        JTextField priceField=vista.getTxtCurrentPrice();
        JTextField stokeField =vista.getTxtStokeInStore();
        JTextField suppliersField = vista.getTxtIdSuppliers();
        JTextField categoryField = vista.getTxtIdCategory();
       
        Long idBusqueda= Long.valueOf(idField.toString());
        
        Productos products = repositorioProductos.findById(idBusqueda).get();
        nameField.setText(products.getNombreProducto());
        priceField.setText(products.getPrecioActual());
        stokeField.setText(products.getExistencia());
        suppliersField.setText(products.getIdproveedores());
        categoryField.setText(products.getIdCategoria());
        
 
    }
    
    public void CleanTable(ActionEvent e){
        JTable tabla = vista.getTbCustomerInfo() ;
        
        for(int i=0; i < tabla.getRowCount() + 1 ; i++){
            tabla.setValueAt("" , i, 0);
            tabla.setValueAt("" , i, 1);
            tabla.setValueAt("" , i, 2);
            tabla.setValueAt("" , i, 3);
            tabla.setValueAt("",  i, 4);
            tabla.setValueAt("",  i, 5);
            i++;
        }
    }
}




