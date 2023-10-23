/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import Entidades.Paquete;

public class PaqueteData {

    private Connection con = Conexion.getConexion();
    private Connection conb = Conexion.getConexionPaises();

    public void registroPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquete (idCiudadOrigen, idCiudadDestino, IdAlojamiento, idpasaje) VALUES (?, ?, ?, ?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idPaqueteGenerado = rs.getInt(1); // Obtenemos la clave generada
                    paquete.setIdPaquete(rowsAffected);
                    JOptionPane.showMessageDialog(null, "Paquete añadido con éxito. ID: " + idPaqueteGenerado);
                }
                rs.close();
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete" + ex.getMessage());
            return;
        }
    }

    public Paquete buscarPaquete(int idPaquete) {
        Paquete paquete = null;
        String sql = "SELECT* FROM paquete WHERE idPaquete = ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPaquete);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(idPaquete);
                paquete.getOrigen().getIdCiudad();
                paquete.getDestino().getIdCiudad();
                paquete.getAlojamiento().getIdAlojamiento();
                paquete.getPasaje().getIdPasaje();

                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Paquete");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete " + ex.getMessage());

        }

        return paquete;
    }

    public List<Paquete> listarPaquete() {
        Paquete paquete = null;
        List<Paquete> paquetes = new ArrayList<Paquete>();

        try {
            String sql = "SELECT * FROM paquete WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.getOrigen().getIdCiudad();
                paquete.getDestino().getIdCiudad();
                paquete.getAlojamiento().getIdAlojamiento();
                paquete.getPasaje().getIdPasaje();
                paquetes.add(paquete);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasaje " + ex.getMessage());
        }
        return paquetes;
    }

    public void modificarPaquete(Paquete paquete) {

        String sql = "UPDATE  paquete SET origen = ?, destino = ?,  alojamiento = ?, pasaje = ? WHERE idPaquete = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, paquete.getIdPaquete());
            ps.setInt(2, paquete.getOrigen().getIdCiudad());
            ps.setInt(3, paquete.getDestino().getIdCiudad());
            ps.setInt(1, paquete.getPasaje().getIdPasaje());
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

    public void ba(int id) {

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
    
    public List<Paquete> listarPaqueteXVendedor(int id) {
        Paquete paquete = null;
        List<Paquete> paquetes = new ArrayList<Paquete>();

        try {
            String sql = "SELECT * FROM paquete WHERE estado = 1 and idVendedor=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.getOrigen().getIdCiudad();
                paquete.getDestino().getIdCiudad();
                paquete.getAlojamiento().getIdAlojamiento();
                paquete.getPasaje().getIdPasaje();
                paquetes.add(paquete);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasaje " + ex.getMessage());
        }
        return paquetes;
    }
}
