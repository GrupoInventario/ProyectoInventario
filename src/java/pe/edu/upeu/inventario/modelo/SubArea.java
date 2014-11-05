/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.modelo;

/**
 *
 * @author alum.fial7
 */
public class SubArea {
    private int idSubArea;
    private int idArea;
    private String subArea;
    private String ubicacion;
    private int telefono;
    private int estado;
    private int idPersona;   

    public SubArea() {
    }

    public SubArea(int idSubArea, int idArea, String subArea, String ubicacion, int telefono, int estado, int idPersona) {
        this.idSubArea = idSubArea;
        this.idArea = idArea;
        this.subArea = subArea;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.estado = estado;
        this.idPersona = idPersona;
    }

    public int getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(int idSubArea) {
        this.idSubArea = idSubArea;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getSubArea() {
        return subArea;
    }

    public void setSubArea(String subArea) {
        this.subArea = subArea;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
}
