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
import Entidades.Ciudad;
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

    private Connection con = Conexion.getConexion();
    private CiudadData ciudata = new CiudadData();

    public void RegistroAlojamiento(Alojamiento alojamiento) {
        String sql = "INSERT INTO alojamiento (nombre,  estado, servicio, importeDiario, Ciudad) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alojamiento.getNombre());
            ps.setBoolean(2, alojamiento.isEstado());
            ps.setString(3, alojamiento.getServicio());
            ps.setDouble(4, alojamiento.getImporteDiario());
            Ciudad ciudad = alojamiento.getCiudadDest();
            ps.setInt(5, ciudad.getIdCiudad());
            
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento" + ex.getMessage());

        }
    }

    public Alojamiento BuscarAlojamiento(int idAlojamiento) {

        Alojamiento alojamiento = null;
        String sql = "Select * FROM Alojamiento where idAlojamiento = ? ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                alojamiento = new Alojamiento();
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setEstado(true);
                alojamiento.setServicio("servicio");
                alojamiento.setImporteDiario(rs.getInt("importeDiario"));
                Ciudad ciudad = ciudata.BuscarCiudad(rs.getInt("Ciudad"));
                alojamiento.setCiudadDest(ciudad);

                ps.close();

            } else {

                JOptionPane.showMessageDialog(null, "No existe el alojamiento");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento " + ex.getMessage());

        }
        return alojamiento;
    }

    public List< Alojamiento> ListarAlojamiento() {

        List<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
        try {
            String sql = "SELECT * FROM alojamiento WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setEstado(true);
                alojamiento.setServicio(rs.getString("servicio"));
                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
                Ciudad ciudad = ciudata.BuscarCiudad(rs.getInt("Ciudad"));
                alojamiento.setCiudadDest(ciudad);

                alojamientos.add(alojamiento);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alojamiento " + ex.getMessage());
        }
        return alojamientos;

    }

    public void ModificarAlojamiento(Alojamiento alojamiento) {
        String sql = "UPDATE alojamiento SET nombre= ?,  estado = ?, servicio =?, importeDiario = ?,Ciudad = ? WHERE idAlojamiento";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(2, alojamiento.isEstado());
            ps.setString(3, alojamiento.getServicio());
            ps.setDouble(4, alojamiento.getImporteDiario());
            Ciudad ciudad = alojamiento.getCiudadDest();
            ps.setInt(5, ciudad.getIdCiudad());
            ps.setString(1, alojamiento.getNombre());

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
            String sql = "DELETE from alojamiento WHERE idAlojamiento= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Alojamiento");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alojamiento");
        }
    }
    
    public List< Alojamiento> ListarAlojamientoXCiudad(int id) {

        List<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
        try {
            String sql = "SELECT * FROM alojamiento WHERE estado = 1 and Ciudad=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();            
            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setEstado(true);
                alojamiento.setServicio(rs.getString("servicio"));
                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
                Ciudad ciudad = ciudata.BuscarCiudad(rs.getInt("Ciudad"));
                alojamiento.setCiudadDest(ciudad);

                alojamientos.add(alojamiento);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alojamiento " + ex.getMessage());
        }
        return alojamientos;

    }
}
