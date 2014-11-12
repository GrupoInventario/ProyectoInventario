/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Escuela;

/**
 *
 * @author USER
 */
public interface InterfaceEscuela {
    
    public List<Escuela> list();
    public List<Escuela> list(int id);
    public boolean edit(Escuela escuela);
    public boolean save(Escuela escuela);
    public boolean delete(int id);
}
