/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Admin;

import Vistas.Vendedor.*;
import AccesoADatos.Conexion;
import AccesoADatos.ClienteData;
import Entidades.Cliente;
import Entidades.Vendedor;
import Vistas.Vendedor.Login;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class ModificarCliente extends javax.swing.JFrame {

    private Connection con = Conexion.getConexion();
    ClienteData clidata = new ClienteData(con);
    Cliente cliente = null;

    /**
     * Creates new form Registro1
     */
    public ModificarCliente() {
        initComponents();
        cargarCombo();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Registrar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        estado = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        contraseña1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        apellido = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Modificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        apellidot = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Cancelar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        comboCliente = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Registrar.setBackground(new java.awt.Color(102, 102, 102));
        Registrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.setBorder(null);
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Buscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(null);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 255, 255));
        estado.setText("Alta / Baja");
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese Contraseña:");

        contraseña.setBackground(new java.awt.Color(102, 102, 102));
        contraseña.setBorder(null);
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Repita Contraseña:");

        contraseña1.setBackground(new java.awt.Color(102, 102, 102));
        contraseña1.setBorder(null);
        contraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseña1ActionPerformed(evt);
            }
        });

        apellido.setBackground(new java.awt.Color(51, 51, 51));
        apellido.setBorder(null);
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        id.setBackground(new java.awt.Color(51, 51, 51));
        id.setBorder(null);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Modificar.setBackground(new java.awt.Color(102, 102, 102));
        Modificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Guardar Cambios");
        Modificar.setBorder(null);
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 250, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 360, -1));

        apellidot.setBackground(new java.awt.Color(51, 51, 51));
        apellidot.setForeground(new java.awt.Color(255, 255, 255));
        apellidot.setBorder(null);
        apellidot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidotActionPerformed(evt);
            }
        });
        jPanel1.add(apellidot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 330, 30));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Datos De Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 360, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese Correo Electronico:");

        correo.setBackground(new java.awt.Color(102, 102, 102));
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setBorder(null);
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese DNI:");

        dni.setBackground(new java.awt.Color(102, 102, 102));
        dni.setForeground(new java.awt.Color(255, 255, 255));
        dni.setBorder(null);
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addGap(66, 66, 66)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(66, 66, 66)
                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 430, 450));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 310, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 310, 10));

        Cancelar1.setBackground(new java.awt.Color(102, 102, 102));
        Cancelar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar1.setText("Cancelar");
        Cancelar1.setBorder(null);
        Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 230, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seleccione el cliente a modificar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 350, -1));

        nombre1.setBackground(new java.awt.Color(51, 51, 51));
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setBorder(null);
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, 30));

        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });
        jPanel1.add(comboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 310, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

    }//GEN-LAST:event_BuscarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        String nombreCliente = nombre1.getText().trim();
        String apellidoCliente = apellidot.getText().trim();
        String correoCliente = correo.getText().trim();
        String dniCliente = dni.getText().trim();
        int dniConver = Integer.parseInt(dniCliente);

        int dnivali = 0;

        // Realizar validaciones
        if (!esDniValido(dniCliente)) {
            JOptionPane.showMessageDialog(this, "El DNI ingresado no es válido. Debe contener 8 dígitos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            dnivali = Integer.parseInt(dniCliente);
        }
        if (nombreCliente.isEmpty() && apellidoCliente.isEmpty() && correoCliente.isEmpty() && dniCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            Cliente cliente= (Cliente)comboCliente.getSelectedItem();
            cliente.setNombre(nombreCliente);
            cliente.setApellido(apellidoCliente);
            cliente.setDni(dnivali);
            clidata.modificarCliente(cliente);
        }

        ListadoClientes re = new ListadoClientes();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_ModificarActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void apellidotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidotActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void contraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseña1ActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar1ActionPerformed
        ListadoClientes re = new ListadoClientes();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Cancelar1ActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

    }//GEN-LAST:event_RegistrarActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed

        cliente = (Cliente) comboCliente.getSelectedItem();
        nombre1.setText(cliente.getNombre());
        apellidot.setText(cliente.getApellido());
        correo.setText(cliente.getCorreo());
        dni.setText(Integer.toString(cliente.getDni()));


    }//GEN-LAST:event_comboClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCliente().setVisible(true);
            }
        });
    }

    private void cargarCombo() {

        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes = clidata.ListarClientes();
        for (Cliente elemento : clientes) {
            comboCliente.addItem(elemento);

        }
    }

    private boolean esDniValido(String dni) {
        // Verificar que el DNI tiene exactamente 8 dígitos
        if (dni.length() != 8) {
            return false;
        }

        try {
            // Intentar convertir el DNI a un número
            Long.parseLong(dni);
            return true;
        } catch (NumberFormatException e) {
            // Si se lanza una excepción, significa que no es un número válido
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField apellidot;
    private javax.swing.JComboBox<Cliente> comboCliente;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JPasswordField contraseña1;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dni;
    private javax.swing.JCheckBox estado;
    private javax.swing.JTextField id;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombre1;
    // End of variables declaration//GEN-END:variables
}
