package AccesoADatos;

import Entidades.Cliente;
import Entidades.Paquete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection con = Conexion.getConexion();
    private PaqueteVendidoData packData = new PaqueteVendidoData();

    public ClienteData(Connection con) {
        this.con = con;
    }
    
    public ClienteData() {
    }

    public void altaCliente(Cliente cliente) {
        String sql = "INSERT INTO Cliente (correo, nombre, apellido, dni, cantPersonas,idPaquete) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getCorreo());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getDni());
            ps.setInt(5, cliente.getCantPersonas());
            ps.setInt(6, cliente.getPaquete().getIdPaquete());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idClienteGenerado = rs.getInt(1);
                    cliente.setId(idClienteGenerado);
                    JOptionPane.showMessageDialog(null, "Cliente añadido con éxito. ID: " + idClienteGenerado);
                }
                rs.close();
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente: " + ex.getMessage());
        }
    }

    public Cliente BuscarCliente(int id) {
        Cliente cliente = null;
        String sql = "SELECT correo, nombre, apellido, dni, cantPersonas ,idPaquete FROM cliente WHERE idCliente = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Paquete pack = new Paquete();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(id);
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setCantPersonas(rs.getInt("cantPersonas"));
                pack.setIdPaquete(rs.getInt("idPaquete"));

                int idPaquete = rs.getInt("idPaquete");

                Paquete paquete = packData.buscarPaquete(idPaquete);

                cliente.setPaquete(paquete);

                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el cliente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente " + ex.getMessage());
        }

        return cliente;
    }

    public void modificarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET correo = ?, nombre = ?, apellido = ?, dni = ?, cantPersonas= ? WHERE idCliente = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getCorreo());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getDni());
            ps.setInt(5, cliente.getCantPersonas());
            ps.setInt(6, cliente.getId());
            int success = ps.executeUpdate();

            if (success == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Cliente no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente " + ex.getMessage());
        }
    }

    public List<Cliente> ListarClientes() {
        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM Cliente";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setCantPersonas(rs.getInt("cantPersonas"));
                int idPaquete = rs.getInt("idPaquete");
                Paquete paquete = packData.buscarPaquete(idPaquete);
                cliente.setPaquete(paquete);

                clientes.add(cliente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente " + ex.getMessage());
        }
        return clientes;
    }

    public void BajaCliente(int id) {
        String sql = "DELETE FROM Cliente WHERE idCliente = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int success = ps.executeUpdate();

            if (success == 1) {
                JOptionPane.showMessageDialog(null, "Baja Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente " + ex.getMessage());
        }
    }

    // Implement a method to find a Paquete by id

    public Cliente BuscarClienteXPaquete(int idPaquete) {
        Cliente cliente = null;
        String sql = "SELECT * FROM cliente WHERE idPaquete = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPaquete);
            ResultSet rs = ps.executeQuery();
            Paquete pack = new Paquete();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setCantPersonas(rs.getInt("cantPersonas"));
                pack.setIdPaquete(rs.getInt("idPaquete"));

                Paquete paquete = packData.buscarPaquete(idPaquete);

                cliente.setPaquete(paquete);

                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el cliente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente " + ex.getMessage());
        }

        return cliente;
    
    }
}
