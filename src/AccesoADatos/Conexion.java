package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    private static final String url = ("jdbc:mariadb://localhost:3306/despegar");
    private static final String usuario = "root";
    private static final String password = "";
    private static Conexion conexion = null;

    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }

    public static Connection getConexion() {
        Connection con = null;
        if (conexion == null) {

            conexion = new Conexion();
        }
        try {
            // Setup the connection with the DB
            con = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }
//JOptionPane.showMessageDialog(null, "concectado con exito");
        return con;
    }
    
}
