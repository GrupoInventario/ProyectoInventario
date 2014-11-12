/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Inventario;

/**
 *
 * @author USER
 */
public interface InterfaceInventario {
    
    public List<Inventario> list();
    public List<Inventario> list(int id);
    public boolean edit(Inventario inventario);
    public boolean save(Inventario inventario);
    public boolean delete(int id);
}
