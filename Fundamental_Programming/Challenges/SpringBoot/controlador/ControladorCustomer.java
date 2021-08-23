/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.Customer;
import modelo.Direcciones;
import Repositories.RepositorioCustomers;
import Repositories.RepositorioDirecciones;
import static java.util.Spliterators.iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.StoreManager;

public class ControladorCustomer implements ActionListener {

    RepositorioCustomers repositorioCustomers;
    Customer customer = Customer.crearCustomer();
    StoreManager vista;

    public ControladorCustomer() {
        super();
    }

    public ControladorCustomer(RepositorioCustomers customer, StoreManager vista) {
        super();
        this.repositorioCustomers = customer;
        this.vista = vista;
        agregarEventos();
        vista.setVisible(true);
    }

    //Metodo que controlara los eventos de botones
    private void agregarEventos() {
        vista.getBtnCreateCustomer().addActionListener(this);
        vista.getBtnSearchCustomer().addActionListener(this);
        vista.getBtnUpdateCustomer().addActionListener(this);
        vista.getBtnDeleteCustomer().addActionListener(this);
        vista.getBtnClearCustomer().addActionListener(this);
        vista.getBtnListCustomer().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnCreateCustomer()) {
            crearClic(e);
            listarClic(e);
        }

        if(e.getSource()==vista.getBtnClearCustomer()){
            clearFields(e);
        }
     
        if(e.getSource()==vista.getBtnDeleteCustomer()){
            eliminarClic(e);       
        }
        
        if(e.getSource()==vista.getBtnClearCustomer()){
            clearFields(e);  
        }
        
        if(e.getSource()==vista.getBtnUpdateCustomer() ){
            editarClic(e);
        
        }
        if(e.getSource()==vista.getBtnListCustomer() ){
            listarClic(e);
        }
        
        if(e.getSource()==vista.getBtnSearchCustomer() ){
            buscarClic(e);
        }
    }

    private void crearClic(ActionEvent e) {
        
        // customer information
        try{
            JTextField nameField = vista.getTxtCustomerName();
            JTextField lastNameField = vista.getTxtCustomerLastName();
            JTextField idField = vista.getTxtdocumentCustomer();
            JTextField idAddressField = vista.getTxtCustoAddressId();


            String nameSearched = nameField.getText();
            String lastNameSearched = lastNameField.getText();
            String idFieldSearched = idField.getText();
            String idAddressSearched = idAddressField.getText();
            Long addressSearched = Long.valueOf(idAddressSearched);

            Customer customer = Customer.crearCustomer(idFieldSearched, nameSearched, lastNameSearched,addressSearched);

            repositorioCustomers.save(customer);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(new JFrame() , "A customer can't be created whit code, this is generated automatically");}
    }


    private void listarClic(ActionEvent e) {
        JTable tabla = vista.getTbCustomerInfo() ;
        List<Customer> listaCustomer = (List<Customer>) repositorioCustomers.findAll();
        
        int cont = 0;
        
        for (Customer c : listaCustomer) {
            tabla.setValueAt(c.getIdCliente() , cont, 0);
            tabla.setValueAt(c.getDocumentoIdentidad() , cont, 1);
            tabla.setValueAt(c.getNombreCliente() , cont, 2);
            tabla.setValueAt(c.getApellido() , cont, 3);
            tabla.setValueAt(c.getIdDireccion(), cont, 4);
            cont++;
        }
    }

    private void clearFields(ActionEvent e) {
        vista.getTxtCustomerName().setText("");
        vista.getTxtCustomerLastName().setText("");
        vista.getTxtdocumentCustomer().setText("");
        vista.getTxtCustoAddressId().setText(""); 
    }

    private void editarClic(ActionEvent e) {
       JTextField idTxtCustomer = vista.getTxtCustomerCode();
       Long idBusqueda=Long.valueOf(idTxtCustomer.getText());
       JTextField txtNombre=vista.getTxtCustomerName();
       String nombreBusqueda=txtNombre.getText();
       JTextField txtapellido=vista.getTxtCustomerLastName();
       String apellidoBusqueda= txtapellido.getText();
       JTextField txtIdentificationCustomer=vista.getTxtdocumentCustomer() ;
       String idcustomerBusqueda = txtIdentificationCustomer.getText();
       JTextField txtIdAddressCustom =vista.getTxtCustoAddressId() ;
       String idAddressCustomBusqueda = txtIdAddressCustom.getText();
       Long AddressCustomBusqueda = Long.valueOf(idAddressCustomBusqueda);
       
       Customer customer = repositorioCustomers.findById(idBusqueda).get();
        
       customer.setNombreCliente(nombreBusqueda);
       customer.setApellido(apellidoBusqueda);
       customer.setDocumentoIdentidad(idcustomerBusqueda);
       customer.setIdDireccion(AddressCustomBusqueda);
       
       repositorioCustomers.save(customer);
       listarClic(e);
       
    }

    private void eliminarClic(ActionEvent e) {
       JTextField idTxtCustomer = vista.getTxtCustomerCode();
       Long idBusqueda=Long.valueOf(idTxtCustomer.getText());
        
        if(repositorioCustomers.existsById(idBusqueda)){
            repositorioCustomers.deleteById(idBusqueda);
        }
        CleanTable(e);
        listarClic(e);
        
    }

    private void buscarClic(ActionEvent e) {
        
        JTextField idField=vista.getTxtCustomerCode();
        JTextField nameField=vista.getTxtCustomerName();
        JTextField lastNameField=vista.getTxtCustomerLastName();
        JTextField identification =vista.getTxtdocumentCustomer() ;
        JTextField address = vista.getTxtCustoAddressId();
       
        Long idBusqueda= Long.valueOf(idField.toString());
        
        Customer custom = repositorioCustomers.findById(idBusqueda).get();
        nameField.setText(custom.getNombreCliente());
        lastNameField.setText(custom.getApellido());
        identification.setText(custom.getDocumentoIdentidad());
        address.setText(custom.getIdDireccion());
    }
    
    public void CleanTable(ActionEvent e){
        JTable tabla = vista.getTbCustomerInfo() ;
        
        for(int i=0; i < tabla.getRowCount() + 1 ; i++){
            tabla.setValueAt("" , i, 0);
            tabla.setValueAt("" , i, 1);
            tabla.setValueAt("" , i, 2);
            tabla.setValueAt("" , i, 3);
            tabla.setValueAt("",  i, 4);
            i++;
        }
    }
}


