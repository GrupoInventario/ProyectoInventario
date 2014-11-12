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
import pe.edu.upeu.inventario.interfaces.InterfaceFacultad;
import pe.edu.upeu.inventario.modelo.Facultad;
import pe.edu.upeu.inventario.modelo.Facultad;

/**
 *
 * @author USER
 */
public class FacultadDAO implements InterfaceFacultad{
    ConexionBD conn;
    @Override
    public List<Facultad> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM facultad");
        List<Facultad> list = new ArrayList<Facultad>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Facultad prov = new Facultad();
            prov.setIdfac(rs.getInt("idFacultad"));
            prov.setFac(rs.getString("facultad"));
            prov.setUbicacion(rs.getString("clave"));
            prov.setTelef(rs.getInt("idPersona"));
            list.add(prov);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public List<Facultad> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM facultad WHERE idFacultad=").append(id);
        List<Facultad> list = new ArrayList<Facultad>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Facultad us = new Facultad();
            us.setIdfac(rs.getInt("idFacultad"));
            us.setFac(rs.getString("facultad"));
            us.setUbicacion(rs.getString("clave"));
            us.setTelef(rs.getInt("idPersona"));
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean edit(Facultad facultad) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE facultad SET idFacultad = ").append(facultad.getIdfac());
            sql.append("', facultad = '").append(facultad.getFac());
            sql.append("', ubicacion = '").append(facultad.getUbicacion());
            sql.append("', telefono = '").append(facultad.getTelef()).append("' WHERE idFacultad = ").append(facultad.getIdfac());
            this.conn.execute(sql.toString());
            save = true;
            //System.out.println(departamento.getDpto());
        } catch (Exception e) {
        }finally{
            this.conn.close();
        }
//        System.out.println(departamento.getIddpto());
//        System.out.println(departamento.getDpto());
//        System.out.println(departamento.getCostos());
//        System.out.println(departamento.getStatus());
        return save;
    }

    @Override
    public boolean save(Facultad facultad) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
//            System.out.println(departamentp.getId()+", "+departamentp.getProv()+", "+departamentp.getDir()+", "+departamentp.getRuc()+", "+departamentp.getTel()+", "+departamentp.getEst());
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO facultad(idFacultad,facultad,ubicacion,telefono) VALUES(").append("NULL");
                sql.append("', '").append(facultad.getFac());
                sql.append("', '").append(facultad.getUbicacion());
                sql.append("', '").append(facultad.getTelef()).append("')");
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
            sql.append("DELETE FROM facultad WHERE idFacultad = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }
    

    
    
    
    
}
