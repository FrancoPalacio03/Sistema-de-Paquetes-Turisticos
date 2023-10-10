/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Ciudad;
import Entidades.Estados;
import Entidades.Paises;

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
      
      public List <Paises>  listarPaises(){
          String sql="Select * FROM pais ";
          PreparedStatement ps;
          ArrayList<Paises> paises = new ArrayList();
          try{
              ps=conb.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
              while (rs.next()) {
                  Paises pais = new Paises();
                  pais.setId(rs.getInt("id"));
                  pais.setPaisnombre(rs.getString("paisnombre"));
                  
                  paises.add(pais);
              }
              ps.close();
          }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla paises " + ex.getMessage());
              
          }
          return paises;
        }
      public List<Estados> listarCiudades(int id){
          String sql="Select * FROM estado where ubicacionpaisid=? ";
          PreparedStatement ps;
          ArrayList<Estados> ciudades = new ArrayList();
          try{
              ps=conb.prepareStatement(sql);
              ps.setInt(1, id);
              ResultSet rs = ps.executeQuery();
              while (rs.next()) {
                  Estados estado = new Estados();
                  estado.setId(rs.getInt("id"));
                  estado.setUbicacionpaisid(rs.getInt("ubicacionpaisid"));
                  estado.setEstadonombre(rs.getString("estadonombre"));
                  ciudades.add(estado);
              }
              ps.close();
              
          }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla estados " + ex.getMessage());
              
          }
          return ciudades;
        }

      
      public void ModificarCiudad(Ciudad idCiudad){
    
}
      public void BajaCiudad(Ciudad idCiudad){
          
      }
}
