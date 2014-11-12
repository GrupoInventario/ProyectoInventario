/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.inventario.Factory.ConexionBD;
import pe.edu.upeu.inventario.Factory.FactoryConnectionDB;
import pe.edu.upeu.inventario.interfaces.InterfaceEscuela;
import pe.edu.upeu.inventario.modelo.Escuela;

/**
 *
 * @author USER
 */
public class EscuelaDAO implements InterfaceEscuela{
    ConexionBD conn;
    @Override
    public List<Escuela> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM escuela");
        List<Escuela> list = new ArrayList<Escuela>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Escuela prov = new Escuela();
            prov.setIdesc(rs.getInt("idEscuela"));
            prov.setEsc(rs.getString("escuela"));
            prov.setUbicacion(rs.getString("ubicacion"));
            prov.setIdfac(rs.getInt("idFacultad"));
            list.add(prov);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public List<Escuela> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM escuela WHERE idEscuela=").append(id);
        List<Escuela> list = new ArrayList<Escuela>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Escuela us = new Escuela();
            us.setIdesc(rs.getInt("idEscuela"));
            us.setEsc(rs.getString("escuela"));
            us.setUbicacion(rs.getString("ubicacion"));
            us.setIdfac(rs.getInt("idFacultad"));
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean edit(Escuela escuela) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE escuela SET idEscuela = ").append(escuela.getIdesc());
            sql.append("', escuela = '").append(escuela.getEsc());
            sql.append("', ubicacion = '").append(escuela.getUbicacion());
            sql.append("', idFacultad = '").append(escuela.getIdfac()).append("' WHERE idEscuela = ").append(escuela.getIdesc());
            this.conn.execute(sql.toString());
            save = true;
            //System.out.println(departamento.getDpto());
        } catch (Exception e) {
        }finally{
            this.conn.close();
        }
        return save;
    }

    @Override
    public boolean save(Escuela escuela) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
//            System.out.println(departamentp.getId()+", "+departamentp.getProv()+", "+departamentp.getDir()+", "+departamentp.getRuc()+", "+departamentp.getTel()+", "+departamentp.getEst());
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO escuela(idEscuela,escuela,ubicacion,idFacultad) VALUES(").append("NULL");
               
                sql.append("', '").append(escuela.getEsc());
                sql.append("', '").append(escuela.getUbicacion());
                sql.append("', '").append(escuela.getIdfac()).append("')");
                //String sql1 = "INSERT INTO Proveedor(iddepartamentp)VALUES(10)";
                this.conn.execute(sql.toString());
                save = true;
        } catch (Exception e) {
            this.conn.close();
        }        
        return save;
    }

    @Override
    public boolean delete(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean delete = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM escuela WHERE idEscuela = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }
    
}
