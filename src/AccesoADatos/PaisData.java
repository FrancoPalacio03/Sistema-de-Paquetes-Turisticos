package AccesoADatos;

import Entidades.Paises;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PaisData {
    private Connection con = Conexion.getConexion();

    public PaisData() {
    }

    public Paises BuscarPais(int idPais) {
        Paises pais = null;
        String sql = "SELECT * FROM pais WHERE id = ?";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPais);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombrePais = rs.getString("paisnombre");
                pais = new Paises(idPais, nombrePais);
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el país con ID " + idPais);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paises: " + ex.getMessage());
        }

        return pais;
    }
}