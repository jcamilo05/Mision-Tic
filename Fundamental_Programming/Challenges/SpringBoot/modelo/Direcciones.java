/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("tb_direcciones")
public class Direcciones {    
    
    @Id  
    @Column("idDireccion")
    private Long idDireccion;
    
    @Column("calle")
    private String calle;
    @Column("carrera")
    private String carrera;
    @Column("numero")
    private String numero;
    @Column("barrio")
    private String barrio;
    @Column("ciudad")
    private String ciudad;
    
    
    public Direcciones(Long idDireccion, String calle, String carrera, String numero, String barrio, String ciudad) {
        this.calle = calle;
        this.carrera = carrera;
        this.numero = numero;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.idDireccion = idDireccion;
    }
    
    public static Direcciones crearDirecciones(Long idDireccion, String calle, String carrera, String numero, String barrio, String ciudad){
        return new Direcciones(idDireccion, calle, carrera, numero, barrio, ciudad);
    }

    public static Direcciones crearDirecciones(String calle, String carrera, String numero, String barrio, String ciudad){
        return new Direcciones(null, calle, carrera, numero, barrio, ciudad);
    }
    public static Direcciones crearDirecciones(){
        return new Direcciones(null, null, null, null, null,null);
    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}



