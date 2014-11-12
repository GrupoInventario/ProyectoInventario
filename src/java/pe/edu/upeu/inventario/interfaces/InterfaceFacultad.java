/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Facultad;

/**
 *
 * @author USER
 */
public interface InterfaceFacultad {
    public List<Facultad> list();
    public List<Facultad> list(int id);
    public boolean edit(Facultad facultad);
    public boolean save(Facultad facultad);
    public boolean delete(int id);
    
}
