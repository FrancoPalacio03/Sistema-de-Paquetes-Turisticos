/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

/**
 *
 * @author Beatriz
 */


import Entidades.Alojamiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AlojamientoData {
    
    private Connection con= Conexion.getConexion();
    
    
    
     public void RegistroAlojamiento(Alojamiento alojamiento) {
     String sql = "INSERT INTO alojamiento (fechain, fechaon, estado, servicio, importeDiario, Ciudad) VALUES (?, ?, ?, ?, ?,?)";  
        PreparedStatement ps;
        try {
           ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setDate(2, Date.valueOf(alojamiento.getIngreso()));
           ps.setDate(3, Date.valueOf(alojamiento.getSalida()));
           ps.setBoolean(3, alojamiento.isEstado());
           ps.setString(4, alojamiento.getServicio());
           ps.setDouble(5, alojamiento.getImporteDiario());
           ps.setString(6, alojamiento.getCiudadDest());
           int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idAlojamientoGenerado = rs.getInt(1); // Obtenemos la clave generada
                    alojamiento.setIdAlojamiento(idAlojamientoGenerado);
                    JOptionPane.showMessageDialog(null, "Alojamiento añadido con éxito. ID: " + idAlojamientoGenerado);
                }
                rs.close();
            }

            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento" + ex.getMessage());
         
}
    }
     
    public void BuscarAlojamiento (int idAlojamiento){
        
        Alojamiento alojamiento = null;
      String sql = "Select * FROM Alojamiento where idAlojamiento = ? " ;
      PreparedStatement ps;
     try {
         ps = con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            ResultSet rs = ps.executeQuery();
         if (rs.next()) {
         
             alojamiento = new Alojamiento ();
            alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
            ps.setDate(2, Date.valueOf(alojamiento.getIngreso()));
            ps.setDate(3, Date.valueOf(alojamiento.getSalida()));
            alojamiento.setEstado(true);
            alojamiento.setServicio("servicio");
            alojamiento.setImporteDiario(rs.getInt("importeDiario"));
            alojamiento.setCiudadDest(rs.getString("CiudadDest"));
            
            ps.close();
        
     }  else {
             
                 JOptionPane.showMessageDialog(null, "No existe la materia");    
         }
             
     
     }catch (SQLException ex)  {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

        }
       
    }
    
    public List < Alojamiento > ListarAlojamiento() {
        
        List<Alojamiento> alojamientos= new ArrayList<Alojamiento>();
        try {
            String sql = "SELECT * FROM alojamiento WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setIngreso(rs.getDate("fechain").toLocalDate());
                alojamiento.setSalida(rs.getDate("fechaon").toLocalDate());
                alojamiento.setEstado(true);
                alojamiento.setServicio(rs.getString("servicio"));
                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
                alojamiento.setCiudadDest(rs.getString("CiudadDest"));
             
                alojamientos.add(alojamiento);
            
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alojamiento " + ex.getMessage());
        }
        return alojamientos;
        
        
    }
     
    public void ModificarAlojamiento (Alojamiento alojamiento) {
        String sql = "UPDATE alojamiento SET  idAlojamiento= ?, fechain = ?, fechaon= ?, estado = ?, servicio =?, importeDiario = ?,Ciudad = ? WHERE idAlojamiento";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alojamiento.getIdAlojamiento());
            ps.setDate(2, Date.valueOf(alojamiento.getIngreso()));
            ps.setDate(3, Date.valueOf(alojamiento.getSalida()));
            ps.setBoolean(4, alojamiento.isEstado());
            ps.setString(5, alojamiento.getServicio());
            ps.setDouble(6, alojamiento.getImporteDiario());
            ps.setInt(6, 0);
       
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alojamiento no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento" + ex.getMessage());
              
    }
    
     }
    
    public void BajaAlojamiento(int idAlojamiento) {
         try {
            String sql = "UPDATE alojamiento SET estado = 0 WHERE idAlojamiento= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idAlojamiento);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Alojamiento");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alojamiento");
        }
    }
}
    

