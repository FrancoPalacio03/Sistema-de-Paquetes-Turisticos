package AccesoADatos;

import Entidades.Estados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EstadoData {
    private Connection con = Conexion.getConexion();

    public EstadoData() {
    }

    public Estados BuscarEstado(int idEstado) {
        Estados estado = null;
        String sql = "SELECT * FROM estado WHERE id = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEstado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int ubicacionPaisId = rs.getInt("ubicacionpaisid");
                String nombreEstado = rs.getString("estadonombre");
                estado = new Estados(idEstado, ubicacionPaisId, nombreEstado);
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el estado con ID " + idEstado);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Estados: " + ex.getMessage());
        }

        return estado;
    }
}
