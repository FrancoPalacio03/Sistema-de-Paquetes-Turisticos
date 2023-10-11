/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetesturisticos;

import AccesoADatos.Conexion;
import Vistas.Vendedor.Login;
import java.sql.Connection;

/**
 *
 * @author franc
 */
public class PaquetesTuristicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion.getConexion();
        Login re=new Login();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
    }
    
}
