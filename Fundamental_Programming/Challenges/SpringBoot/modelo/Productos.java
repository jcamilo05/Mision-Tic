/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author camil
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author Grupo 41
 */
@Table("tb_productos")
public class Productos {    
    @Id
    @Column("idproducto")        
    private Long idproducto;
    @Column("nombreProducto")
    private String nombreProducto;
    @Column("precioActual")
    private String precioActual;
    @Column("existencia")
    private String existencia;
    @Column("idproveedores")
    private String idproveedores;
    @Column("idCategoria")
    private String idCategoria;

    public Productos(Long idproducto, String nombreProducto, String precioActual, String existencia, String idproveedores, String idCategoria  ) {
        this.idproducto = idproducto;
        this.nombreProducto = nombreProducto;
        this.precioActual = precioActual;
        this.existencia = existencia;
        this.idproveedores = idproveedores;
        this.idCategoria = idCategoria;
    }
    

    public static Productos crearProductos(Long idproducto, String nombreProducto, String precioActual, String existencia, String idproveedores, String idCategoria){
        return new Productos(idproducto, nombreProducto, precioActual, existencia, null, null);
    }
    //Funcion que solo recibe dos parametros
   public static Productos crearProductos(String nombreProducto, String precioActual,String existencia, String idproveedores, String idCategoria){
        return new Productos(null, nombreProducto, precioActual, existencia, null, null);
    }
    
   public static Productos crearProductos(){
        return new Productos(null, null, null, null, null, null);
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(String precioActual) {
        this.precioActual = precioActual;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getIdproveedores() {
        return idproveedores;
    }

    public void setIdproveedores(String idproveedores) {
        this.idproveedores = idproveedores;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }
   
    
}

