/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alojamiento;
import Entidades.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import Entidades.Paquete;
import Entidades.Pasaje;
import Entidades.Vendedor;


public class PaqueteVendidoData {

    private Connection con = Conexion.getConexion();
    private CiudadData ciuData= new CiudadData();
    private AlojamientoData aloData= new AlojamientoData();
    private PasajeData passData= new PasajeData();
    private VendedorData vendeData= new VendedorData();
    

    public int registroPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquetevendido (idCiudadOrigen, idCiudadDestino,  IdAlojamiento, idPasaje, idVendedor) VALUES (?, ?, ?, ?, ?)";
        int idPaqueteGenerado=0;
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
                    idPaqueteGenerado = rs.getInt(1); // Obtenemos la clave generada
                    paquete.setIdPaquete(rowsAffected);
                    JOptionPane.showMessageDialog(null, "Paquete añadido con éxito. ID: " + idPaqueteGenerado);
                }
                rs.close();
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete" + ex.getMessage());
        }
        return idPaqueteGenerado;
    }

    

    
    public List<Paquete> listarPaqueteXVendedor(int id) {
        Paquete paquete = null;
        List<Paquete> paquetes = new ArrayList<Paquete>();

        try {
            String sql = "SELECT * FROM paquetevendido WHERE idVendedor=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaqueteVendido"));
                Ciudad origen= ciuData.BuscarCiudad(rs.getInt("idCiudadOrigen"));
                paquete.setOrigen(origen);
                Ciudad destino= ciuData.BuscarCiudad(rs.getInt("idCiudadDestino"));
                paquete.setDestino(destino);
                Alojamiento alojamiento= aloData.BuscarAlojamiento(rs.getInt("IdAlojamiento"));
                paquete.setAlojamiento(alojamiento);
                Pasaje pasaje= passData.buscarPasaje(rs.getInt("idPasaje"));
                paquete.setPasaje(pasaje);
                paquetes.add(paquete);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasaje " + ex.getMessage());
        }
        return paquetes;
    }
    
    public Paquete buscarPaquete(int idPaquete) {
        Paquete paquete = null;
        String sql = "SELECT * FROM paquetevendido WHERE idPaqueteVendido = ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPaquete);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaqueteVendido"));
                Ciudad origen= ciuData.BuscarCiudad(rs.getInt("idCiudadOrigen"));
                paquete.setOrigen(origen);
                Ciudad destino= ciuData.BuscarCiudad(rs.getInt("idCiudadDestino"));
                paquete.setDestino(destino);
                Alojamiento alojamiento= aloData.BuscarAlojamiento(rs.getInt("IdAlojamiento"));
                paquete.setAlojamiento(alojamiento);
                Pasaje pasaje= passData.buscarPasaje(rs.getInt("idPasaje"));
                paquete.setPasaje(pasaje);
                Vendedor vendedor= vendeData.BuscarVendedor(rs.getInt("idVendedor"));
                paquete.setVendedor(vendedor);
                    
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Paquete");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete " + ex.getMessage());

        }

        return paquete;
    }
}
