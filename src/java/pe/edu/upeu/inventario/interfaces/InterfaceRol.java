/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Rol;

/**
 *
 * @author USER
 */
public interface InterfaceRol {
    public List<Rol> list();
    public List<Rol> list(int id);
    public boolean edit(Rol rol);
    public boolean save(Rol rol);
    public boolean delete(int id);
    
}
