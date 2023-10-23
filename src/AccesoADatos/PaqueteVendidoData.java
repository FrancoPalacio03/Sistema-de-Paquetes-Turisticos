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


public class PaqueteVendidoData {

    private Connection con = Conexion.getConexion();
    private Connection conb = Conexion.getConexionPaises();
    

    public void registroPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquetevendido (idCiudadOrigen, idCiudadDestino,  IdAlojamiento, idPasaje, idVendedor) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.setInt(5, paquete.getVendedor().getId());
            
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

    

    public List<Paquete> listarPaqueteXVendedor(int id) {
        Paquete paquete = null;
        List<Paquete> paquetes = new ArrayList<Paquete>();

        try {
            String sql = "SELECT * FROM paquete WHERE estado = 1 and idVendedor=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setInt(1, id);
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
