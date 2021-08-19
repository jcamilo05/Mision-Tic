/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("cliente")
public class Customer {    
    
    @Id
    @Column("idCliente")
    private Long idCliente; 
    
    @Column("documentoIdentidad")
    private String documentoIdentidad;
    
    @Column("nombreCliente")
    private String nombreCliente;
    
    @Column("apellido")
    private String apellido;
    
    @Column("idDireccion")
    private Long idDireccion;


    public Customer(Long idCliente, String documentoIdentidad, String nombreCliente, 
        String apellido,Long idDireccion) {
        this.idCliente = idCliente;
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCliente = nombreCliente;
        this.apellido = apellido;
        this.idDireccion = idDireccion;
    }
    
    public static Customer crearCustomer(Long idCliente, String documentoIdentidad, String nombreCliente, 
            String apellido,Long idDireccion){
        return new Customer(idCliente, documentoIdentidad, nombreCliente, apellido, idDireccion);
    }
    
   public static Customer crearCustomer(String documentoIdentidad, String nombreCliente, 
            String apellido,Long idDireccion){
        return new Customer(null,documentoIdentidad, nombreCliente, apellido, idDireccion);
    }

   public static Customer crearCustomer(){
        return new Customer(null,null, null, null, null);
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdDireccion() {
        return idDireccion.toString();
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }
  
}

