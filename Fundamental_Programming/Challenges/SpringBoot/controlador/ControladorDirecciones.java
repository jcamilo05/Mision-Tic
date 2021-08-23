
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Direcciones;
import Repositories.RepositorioDirecciones;
import javax.swing.JComboBox;
import vista.StoreManager;


public class ControladorDirecciones implements ActionListener {

    RepositorioDirecciones repositorioDirecciones;
    Direcciones direcciones = Direcciones.crearDirecciones();
    StoreManager vista;
    //DefaultTableModel modelo = new DefaultTableModel();

    public ControladorDirecciones() {
        super();
    }

    public ControladorDirecciones(RepositorioDirecciones repositorio, StoreManager vista) {
        super();
        this.repositorioDirecciones = repositorio;
        this.vista = vista;
        //manejador de eventos: ej clic en buscar
        agregarEventos();
        vista.setVisible(true);
    }

    //Metodo que controlara los eventos de botones
    private void agregarEventos() {
        vista.getBtnCreateAddress().addActionListener(this);
        vista.getBtnListAddress().addActionListener(this);
        vista.getBtnClearAddress().addActionListener(this);
        vista.getBtnUpdateAddress().addActionListener(this);
        vista.getBtnDeleteAddress().addActionListener(this);
        vista.getBtnSearchAddress().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnCreateAddress() ) {
            crearClic(e);
        }
        if (e.getSource() == vista.getBtnListAddress() ) {
            listarClic(e);
        }
        
        if(e.getSource()==vista.getBtnClearAddress() ){
            limpiarCampos(e);
        
        }
        
        if(e.getSource()==vista.getBtnUpdateAddress() ){
            editarClic(e);
        
        }
        if(e.getSource()==vista.getBtnDeleteAddress() ){
            eliminarCli(e);
        }
        
        if(e.getSource()==vista.getBtnSearchAddress() ){
            buscarClic(e);
        }
    }

    private void crearClic(ActionEvent e) {
       // address inforamtion
        
        JComboBox<String> streetField = vista.getCbStreetOrCarCustomer();
        JTextField numberAdressField = vista.getTxtNumberAdress();
        JTextField customerCityField = vista.getTxtCustomerCity() ;
        JTextField nHoodCustomer = vista.getTxtNHoodCustomer();
        
        String streetSearched = streetField.getSelectedItem().toString() ;
        String numberAdressSearched = numberAdressField.getText();
        String customerCitySearched = customerCityField.getText();
        String nHoodCustomerSearched = nHoodCustomer.getText();
        
        String street = "N/A";
        String career = "N/A";
        if(streetSearched.equals("Street")){
            street = "Street";
            }else{
            career = "Career";
        }
        
        Direcciones direcciones = Direcciones.crearDirecciones(street, career,
                            numberAdressSearched, customerCitySearched, nHoodCustomerSearched);
        
        repositorioDirecciones.save(direcciones);
        
        listarClic(e);

    }


    private void listarClic(ActionEvent e) {
        JTable tabla = vista.getTbAddressInfo();
        List<Direcciones> listaDirecciones = (List<Direcciones>) repositorioDirecciones.findAll();
        //con los elementos guardados en la lista, llenamos
        int cont = 0;
        for (Direcciones d : listaDirecciones) {
            tabla.setValueAt(d.getIdDireccion() , cont, 0);
            tabla.setValueAt(d.getCalle() , cont, 1);
            tabla.setValueAt(d.getCarrera() , cont, 2);
            tabla.setValueAt(d.getNumero() , cont, 3);
            tabla.setValueAt(d.getBarrio() , cont, 4);
            tabla.setValueAt(d.getCiudad() , cont, 5);
            cont++;
        }

    }

    private void limpiarCampos(ActionEvent e) {
        vista.getTxtNumberAdress().setText("");
        vista.getTxtCustomerCity().setText("");
        vista.getTxtNHoodCustomer().setText("");
    }

    private void editarClic(ActionEvent e) {
       JTextField txtIdAddress = vista.getTxtIdAddress() ;
       Long idBusqueda=Long.valueOf(txtIdAddress.getText());
       JTextField txtNumberAddress = vista.getTxtNumberAdress();
       String numberBusqueda = txtNumberAddress.getText();
       JTextField txtCustomerCity=vista.getTxtCustomerCity();
       String cityBusqueda = txtCustomerCity.getText();
       JTextField txtNHoodCustomer=vista.getTxtNHoodCustomer();
       String NHoodCustomerBusqueda = txtNHoodCustomer.getText();
       //Capturado el objeto categoria con ese id, lo podemos actualizar
       Direcciones direccion= repositorioDirecciones.findById(idBusqueda).get();
       
       direccion.setNumero(numberBusqueda);
       direccion.setBarrio(NHoodCustomerBusqueda);
       direccion.setCiudad(cityBusqueda);
       //Vamos a actualizar por medio de save --update
       
       repositorioDirecciones.save(direccion);
        listarClic(e);
       
    }

    private void eliminarCli(ActionEvent e) {
        JTextField idField =vista.getTxtIdAddress();
        Long idBusqueda=Long.valueOf(idField.getText());
        
        if(repositorioDirecciones.existsById(idBusqueda)){
            repositorioDirecciones.deleteById(idBusqueda);
        }
        listarClic(e);
        
    }

    private void buscarClic(ActionEvent e) {
        
        JTextField idField = vista.getTxtIdAddress();
        JTextField numberField=vista.getTxtNumberAdress();
        JTextField cityField=vista.getTxtCustomerCity();
        JTextField nhoodField=vista.getTxtNHoodCustomer();
        
        
        Long idBusqueda= Long.valueOf(idField.getText());
        
        Direcciones direccion = repositorioDirecciones.findById(idBusqueda).get();
        numberField.setText(direccion.getNumero());
        cityField.setText(direccion.getCiudad());
        nhoodField.setText(direccion.getBarrio());
        
        
        
    }

}
