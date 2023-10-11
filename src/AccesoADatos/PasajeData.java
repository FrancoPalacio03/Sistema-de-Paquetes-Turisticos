/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import Entidades.Pasaje;
import Entidades.Ciudad;
public class PasajeData {
  private Connection con= Conexion.getConexion();
private Connection conb= Conexion.getConexionPaises();
  
    
public void registroPasaje(Pasaje pasaje){
String sql = "INSERT INTO pasaje (tipoTransporte, importe, nombreCiudadOrigen,   estado) VALUES (?, ?, ?, ?)";  
 
  
        PreparedStatement ps;
        try {
           ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, pasaje.getTipoTransporte());
           ps.setDouble(2, pasaje.getImporte());
           ps.setInt(3, pasaje.getNombreCiudadOrigen().getIdCiudad());
           ps.setBoolean(4, pasaje.isEstado());
           int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idPasajeGenerado = rs.getInt(1); // Obtenemos la clave generada
                    pasaje.setIdPasaje(rowsAffected);
                    JOptionPane.showMessageDialog(null, "PASAJE añadido con éxito. ID: " + idPasajeGenerado);
                }
                rs.close();
            }

            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex.getMessage());
            return;
        }
    }
 public Pasaje buscarPasaje(int idPasaje) {
        Pasaje pasaje = null;
       String sql = "SELECT * FROM pasaje WHERE estado = 1 ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPasaje);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
               pasaje = new Pasaje();
               pasaje.setIdPasaje(idPasaje);
               pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
               pasaje.setImporte(rs.getDouble("importe"));
               pasaje.setNombreCiudadOrigen(rs.get)
               pasaje.setEstado(true);
               
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Pasaje");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje " + ex.getMessage());

        }

        return pasaje;
    }
  public List<Pasaje> listarPasaje() {
      List<Pasaje> pasajes = new ArrayList<Pasaje>();

        try {
            String sql = "SELECT * FROM pasaje WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Pasaje pasaje = new Pasaje();
               pasaje.setIdPasaje(rs.getInt("idPasaje"));
               pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
               pasaje.getNombreCiudadOrigen().getIdCiudad();
               pasaje.setImporte(rs.getDouble("importe"));
               pasaje.setEstado(true);
               pasajes.add(pasaje);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return pasajes;
    }
 public void modificarPasaje(Pasaje pasaje)  {
        String sql = "UPDATE  pasaje SET tipoTransporte = ?, nombreCiudadOrigen = ?,  importe = ?, estado = ?";  
        PreparedStatement ps = null;
       

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setInt(2,pasaje.getNombreCiudadOrigen().getIdCiudad());
            ps.setDouble(3, pasaje.getImporte());
            ps.setBoolean(4, pasaje.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El pasaje no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje " + ex.getMessage());
        }

    }
  public void bajaPasaje(int id) {

        try {
            String sql = "UPDATE pasaje SET estado = 0 WHERE idPasaje = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se do de baja el pasaje.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pasajes");
        }
    }
}
 
