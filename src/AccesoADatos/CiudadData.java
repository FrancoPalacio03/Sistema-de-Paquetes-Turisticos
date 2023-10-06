/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Ciudad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author diakz
 */
public class CiudadData {
    
     private Connection con= Conexion.getConexion();
    
    private Connection conb= Conexion.getConexionPaises();

    public CiudadData() {
        
    }
     public CiudadData(Connection con,Connection conb) {
       this.con=con;
       this.conb=conb;
    }
      public CiudadData(Connection conb) {
        this.conb=conb;
    }
    
      public void RegistroCiudad(){
          
      }
      public void BuscarCiudad(Ciudad idCiudad){
          
      }
      
      public List <String>  listarPaises(){
          String sql="Select* FROM pais ";
          PreparedStatement ps;
          ArrayList<String> paises = new ArrayList();
          try{
              ps=conb.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
              while (rs.next()) {
                  paises.add(rs.getString("paisnombre"));
              }
              ps.close();
          }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla paises " + ex.getMessage());
              
          }
          return paises;
        }
      public List <String>  listarCiudades(String nombre){
          String sql="Select* FROM estado where=nombrepais ";
          PreparedStatement ps;
          ArrayList<String> ciudades = new ArrayList();
          try{
              ps=conb.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
              while (rs.next()) {
                  
                  
                  ciudades.add(rs.getString("estadonombre"));
              }
              ps.close();
          }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla estados " + ex.getMessage());
              
          }
          return ciudades;
        }

      public void ListarCiudad( Ciudad idCiudad){
          
      }
      public void ModificarCiudad(Ciudad idCiudad){
    
}
      public void BajaCiudad(Ciudad idCiudad){
          
      }
}
