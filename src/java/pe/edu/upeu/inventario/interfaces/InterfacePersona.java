/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Persona;

/**
 *
 * @author alum.fial7
 */
public interface InterfacePersona {
    public List<Persona> list();
    public List<Persona> list(int id);
    public boolean edit(Persona persona);
    public boolean save(Persona persona);
    public boolean delete(int id);
}
