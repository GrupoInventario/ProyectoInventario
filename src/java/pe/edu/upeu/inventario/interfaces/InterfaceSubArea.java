/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.SubArea;

/**
 *
 * @author alum.fial7
 */
public interface InterfaceSubArea {
    public List<SubArea> list();
    public List<SubArea> list(int id);
    public boolean edit(SubArea subArea);
    public boolean save(SubArea subArea);
    public boolean delete(int id);
}
