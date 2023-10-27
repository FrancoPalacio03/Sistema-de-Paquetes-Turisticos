/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Ciudad;
import Entidades.Estados;
import Entidades.Paises;
import Entidades.Vendedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author diakz
 */
public class CiudadData {

    private Connection con = Conexion.getConexion();


    public CiudadData() {

    }

    public void GuardarCiudad(Ciudad ciudad) {
        String sql = "INSERT INTO ciudad (nombre, pais, estado,provincia, url) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ciudad.getNombre());
            ps.setInt(2, ciudad.getPais().getId());
            ps.setBoolean(3, true);
            ps.setInt(4, ciudad.getProvincia().getId());
            ps.setString(5, ciudad.getUrlImagen());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idCiudadGenerado = rs.getInt(1); // Obtenemos la clave generada
                    ciudad.setIdCiudad(idCiudadGenerado);
                    JOptionPane.showMessageDialog(null, "Ciudad añadido con éxito. ID: " + idCiudadGenerado);
                }
                rs.close();
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad: " + ex.getMessage());
        }

    }

    public Ciudad BuscarCiudad(int idCiudad) {
        String sql = "SELECT*  FROM Ciudad WHERE idCiudad = ?";
        PreparedStatement ps = null;
        Ciudad ciudad = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ciudad = new Ciudad();
                Paises pais = new Paises();
                pais.setPaisnombre(rs.getString("pais"));
                Estados prov = new Estados();
                prov.setEstadonombre(rs.getString("provincia"));
                ciudad.setIdCiudad(idCiudad);
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(pais);
                ciudad.setEstado(rs.getBoolean("estado"));
                ciudad.setProvincia(prov);
                ciudad.setUrlImagen(rs.getString("url"));
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el vendedor ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad " + ex.getMessage());

        }
        return ciudad;
    }



public List<Paises> listarPaises() {
        String sql = "Select * FROM pais ";
        PreparedStatement ps;
        ArrayList<Paises> paises = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paises pais = new Paises();
                pais.setId(rs.getInt("id"));
                pais.setPaisnombre(rs.getString("paisnombre"));

                paises.add(pais);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla paises " + ex.getMessage());

        }
        return paises;
    }

    public List<Estados> listarCiudades(int id) {
        String sql = "Select * FROM estado where ubicacionpaisid=? ";
        PreparedStatement ps;
        ArrayList<Estados> ciudades = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla estados " + ex.getMessage());

        }
        return ciudades;
    }
    
    public List<Ciudad> listar() {
        String sql = "Select * FROM ciudad where estado=1 ";
        PreparedStatement ps;
        ArrayList<Ciudad> ciudades = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setEstado(rs.getBoolean("estado"));
                ciudades.add(ciudad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla estados " + ex.getMessage());

        }
        return ciudades;
    }

    public void ModificarCiudad(Ciudad idCiudad) {

    }

    public void BajaCiudad(Ciudad idCiudad) {

    }
}
