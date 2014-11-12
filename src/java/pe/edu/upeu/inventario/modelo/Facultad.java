/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.modelo;

/**
 *
 * @author USER
 */
public class Facultad {
    private int idfac;
    private String fac;
    private String ubicacion;
    private int telef;

    public Facultad() {
    }

    public Facultad(int idfac, String fac, String ubicacion, int telef) {
        this.idfac = idfac;
        this.fac = fac;
        this.ubicacion = ubicacion;
        this.telef = telef;
    }
    

    public int getIdfac() {
        return idfac;
    }

    public void setIdfac(int idfac) {
        this.idfac = idfac;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }
    
    
}
