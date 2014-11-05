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
public class Area {
    public int idArea;
    public String area;
    public String ubicacion;
    public int telefono;
    public int estado;
    public int idEscuela;

    public Area() {
    }

    public Area(int idArea, String area, String ubicacion, int telefono, int estado, int idEscuela) {
        this.idArea = idArea;
        this.area = area;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.estado = estado;
        this.idEscuela = idEscuela;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public int getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }
  
    

    
}
