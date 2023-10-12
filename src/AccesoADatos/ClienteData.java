
package AccesoADatos;

import Entidades.Cliente;
import Entidades.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteData {
    private Connection con =Conexion.getConexion();
    
    public ClienteData(){}
    
    public void altaCliente(Vendedor vendedor){
        String sql = "INSERT INTO Vendedor (correo, pass, nombre, apellido, dni, cont, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, vendedor.getCorreo());
            ps.setString(2, vendedor.getPass());
            ps.setString(3, vendedor.getNombre());
            ps.setString(4, vendedor.getApellido());
            ps.setInt(5, vendedor.getDni());
            ps.setInt(6, vendedor.getCont());
            ps.setBoolean(7, vendedor.getEstado());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idVendedorGenerado = rs.getInt(1); // Obtenemos la clave generada
                    vendedor.setId(idVendedorGenerado);
                    JOptionPane.showMessageDialog(null, "Vendedor añadido con éxito. ID: " + idVendedorGenerado);
                }
                rs.close();
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
    }
    public Vendedor BuscarCliente(int id){
        Vendedor vendedor = null;
        String sql = "SELECT correo, pass, nombre, apellido, dni, cont, estado FROM VENDEDOR WHERE idVendedor = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                vendedor = new Vendedor();
                vendedor.setId(id);
                vendedor.setDni(rs.getInt("dni"));
                vendedor.setApellido(rs.getString("apellido"));
                vendedor.setNombre(rs.getString("nombre"));
                vendedor.setCorreo(rs.getString("correo"));
                vendedor.setPass(rs.getString("pass"));
                vendedor.setCont(rs.getInt("cont"));
                vendedor.setEstado(true);
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el vendedor ");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor " + ex.getMessage());

        }

        return vendedor;
    }
    public void modificarCliente(Vendedor vendedor){
        String sql = "UPDATE Vendedor SET correo = ? , pass = ?, nombre = ?, apellido = ?, dni = ?, cont = ?, estado= ? WHERE idVendedor = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vendedor.getCorreo());
            ps.setString(2, vendedor.getPass());
            ps.setString(3, vendedor.getNombre());
            ps.setString(4, vendedor.getApellido());
            ps.setInt(5, vendedor.getDni());
            ps.setInt(6, vendedor.getCont());
            ps.setBoolean(7, vendedor.getEstado());
            ps.setInt(8, vendedor.getId());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Vendedor no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor " + ex.getMessage());
        }
    }
    
    public List<Cliente> ListarClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idVendedor"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setCorreo(rs.getString("correo"));
                clientes.add(cliente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cliente " + ex.getMessage());
        }
        return clientes;
    }
    
    public void BajaCliente(int id){
        String sql = "DELETE from cliente WHERE idCliente = ?";
        PreparedStatement ps = null;

        try {
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Baja Exita");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente " + ex.getMessage());
        }
    }
}
