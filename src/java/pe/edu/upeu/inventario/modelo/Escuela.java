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
public class Escuela {
    private int idesc;
    private String esc;
    private String ubicacion;
    private int idfac;

    public Escuela() {
    }

    public Escuela(int idesc, String esc, String ubicacion, int idfac) {
        this.idesc = idesc;
        this.esc = esc;
        this.ubicacion = ubicacion;
        this.idfac = idfac;
    }

    public int getIdesc() {
        return idesc;
    }

    public void setIdesc(int idesc) {
        this.idesc = idesc;
    }

    public String getEsc() {
        return esc;
    }

    public void setEsc(String esc) {
        this.esc = esc;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdfac() {
        return idfac;
    }

    public void setIdfac(int idfac) {
        this.idfac = idfac;
    }
    
    
    
}
