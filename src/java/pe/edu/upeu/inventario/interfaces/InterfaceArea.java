/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Area;

/**
 *
 * @author alum.fial7
 */
public interface InterfaceArea {
    public List<Area> list();
    public List<Area> list(int id);
    public boolean edit(Area area);
    public boolean save(Area area);
    public boolean delete(int id);
}
