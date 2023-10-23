/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Admin;


import Vistas.Admin.CreacionPaquete.SeleccionCiudad;
import Vistas.Vendedor.Login;

/**
 *
 * @author franc
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        RAlojamiento = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        FormularioCiudad2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        RCiudad = new javax.swing.JButton();
        FormularioCiudad5 = new javax.swing.JButton();
        FormularioCiudad7 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        FormularioCiudad6 = new javax.swing.JButton();
        RVendedor = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        FormularioCiudad9 = new javax.swing.JButton();
        RPaquete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        RVendedor1 = new javax.swing.JButton();
        FormularioCiudad8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, 30));

        RAlojamiento.setBackground(new java.awt.Color(29, 29, 29));
        RAlojamiento.setForeground(new java.awt.Color(204, 204, 204));
        RAlojamiento.setText("Registro Alojamiento");
        RAlojamiento.setBorder(null);
        RAlojamiento.setBorderPainted(false);
        RAlojamiento.setFocusPainted(false);
        RAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAlojamientoActionPerformed(evt);
            }
        });
        jPanel1.add(RAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 42));

        jTextField1.setBackground(new java.awt.Color(102, 102, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Alojamiento");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 420, 28));

        FormularioCiudad2.setBackground(new java.awt.Color(29, 29, 29));
        FormularioCiudad2.setForeground(new java.awt.Color(204, 204, 204));
        FormularioCiudad2.setText("Listado Alojamientos");
        FormularioCiudad2.setBorder(null);
        FormularioCiudad2.setBorderPainted(false);
        FormularioCiudad2.setFocusPainted(false);
        FormularioCiudad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioCiudad2ActionPerformed(evt);
            }
        });
        jPanel1.add(FormularioCiudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 132, 42));

        jTextField3.setBackground(new java.awt.Color(102, 102, 255));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Ciudad");
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 28));

        RCiudad.setBackground(new java.awt.Color(29, 29, 29));
        RCiudad.setForeground(new java.awt.Color(204, 204, 204));
        RCiudad.setText("Registrar Ciudad");
        RCiudad.setBorder(null);
        RCiudad.setBorderPainted(false);
        RCiudad.setFocusPainted(false);
        RCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(RCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 42));

        FormularioCiudad5.setBackground(new java.awt.Color(29, 29, 29));
        FormularioCiudad5.setForeground(new java.awt.Color(204, 204, 204));
        FormularioCiudad5.setText("Listado Ciudades");
        FormularioCiudad5.setBorder(null);
        FormularioCiudad5.setBorderPainted(false);
        FormularioCiudad5.setFocusPainted(false);
        FormularioCiudad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioCiudad5ActionPerformed(evt);
            }
        });
        jPanel1.add(FormularioCiudad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 132, 42));

        FormularioCiudad7.setBackground(new java.awt.Color(29, 29, 29));
        FormularioCiudad7.setForeground(new java.awt.Color(204, 204, 204));
        FormularioCiudad7.setText("Listado Cliente");
        FormularioCiudad7.setBorder(null);
        FormularioCiudad7.setBorderPainted(false);
        FormularioCiudad7.setFocusPainted(false);
        FormularioCiudad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioCiudad7ActionPerformed(evt);
            }
        });
        jPanel1.add(FormularioCiudad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 120, 42));

        jTextField4.setBackground(new java.awt.Color(102, 102, 255));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Clientes");
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 420, 28));

        FormularioCiudad6.setBackground(new java.awt.Color(29, 29, 29));
        FormularioCiudad6.setForeground(new java.awt.Color(204, 204, 204));
        FormularioCiudad6.setText("Listado Vendedores");
        FormularioCiudad6.setBorder(null);
        FormularioCiudad6.setBorderPainted(false);
        FormularioCiudad6.setFocusPainted(false);
        FormularioCiudad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioCiudad6ActionPerformed(evt);
            }
        });
        jPanel1.add(FormularioCiudad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 132, 42));

        RVendedor.setBackground(new java.awt.Color(29, 29, 29));
        RVendedor.setForeground(new java.awt.Color(204, 204, 204));
        RVendedor.setText("Registro Vendedor");
        RVendedor.setBorder(null);
        RVendedor.setBorderPainted(false);
        RVendedor.setFocusPainted(false);
        RVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(RVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 120, 42));

        jTextField5.setBackground(new java.awt.Color(102, 102, 255));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Vendedor");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 420, 28));

        jTextField6.setBackground(new java.awt.Color(102, 102, 255));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("Paquete");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 420, 28));

        FormularioCiudad9.setBackground(new java.awt.Color(29, 29, 29));
        FormularioCiudad9.setForeground(new java.awt.Color(204, 204, 204));
        FormularioCiudad9.setText("Listado Paquete");
        FormularioCiudad9.setBorder(null);
        FormularioCiudad9.setBorderPainted(false);
        FormularioCiudad9.setFocusPainted(false);
        FormularioCiudad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioCiudad9ActionPerformed(evt);
            }
        });
        jPanel1.add(FormularioCiudad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 132, 42));

        RPaquete.setBackground(new java.awt.Color(29, 29, 29));
        RPaquete.setForeground(new java.awt.Color(204, 204, 204));
        RPaquete.setText("Registro Paquete");
        RPaquete.setBorder(null);
        RPaquete.setBorderPainted(false);
        RPaquete.setFocusPainted(false);
        RPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPaqueteActionPerformed(evt);
            }
        });
        jPanel1.add(RPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, 42));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 10, 420));

        jTextField7.setBackground(new java.awt.Color(102, 102, 255));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("Pasaje");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 420, 28));

        RVendedor1.setBackground(new java.awt.Color(29, 29, 29));
        RVendedor1.setForeground(new java.awt.Color(204, 204, 204));
        RVendedor1.setText("Registro Pasaje");
        RVendedor1.setBorder(null);
        RVendedor1.setBorderPainted(false);
        RVendedor1.setFocusPainted(false);
        RVendedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVendedor1ActionPerformed(evt);
            }
        });
        jPanel1.add(RVendedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 120, 42));

        FormularioCiudad8.setBackground(new java.awt.Color(29, 29, 29));
        FormularioCiudad8.setForeground(new java.awt.Color(204, 204, 204));
        FormularioCiudad8.setText("Listado Pasaje");
        FormularioCiudad8.setBorder(null);
        FormularioCiudad8.setBorderPainted(false);
        FormularioCiudad8.setFocusPainted(false);
        FormularioCiudad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioCiudad8ActionPerformed(evt);
            }
        });
        jPanel1.add(FormularioCiudad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 132, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        Login re= new Login();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void RAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAlojamientoActionPerformed
        FormularioAlojamiento re= new FormularioAlojamiento();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RAlojamientoActionPerformed

    private void FormularioCiudad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioCiudad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormularioCiudad2ActionPerformed

    private void RCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCiudadActionPerformed
        // TODO add your handling code here:
        FormularioCiudad re= new FormularioCiudad();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RCiudadActionPerformed

    private void FormularioCiudad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioCiudad5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FormularioCiudad5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void FormularioCiudad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioCiudad7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormularioCiudad7ActionPerformed

    private void FormularioCiudad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioCiudad6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormularioCiudad6ActionPerformed

    private void RVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVendedorActionPerformed
        // TODO add your handling code here:
        FormularioVendedor re= new FormularioVendedor();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RVendedorActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void FormularioCiudad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioCiudad9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormularioCiudad9ActionPerformed

    private void RPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPaqueteActionPerformed
        SeleccionCiudad re= new SeleccionCiudad();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
    }//GEN-LAST:event_RPaqueteActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void RVendedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVendedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RVendedor1ActionPerformed

    private void FormularioCiudad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioCiudad8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormularioCiudad8ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FormularioCiudad2;
    private javax.swing.JButton FormularioCiudad5;
    private javax.swing.JButton FormularioCiudad6;
    private javax.swing.JButton FormularioCiudad7;
    private javax.swing.JButton FormularioCiudad8;
    private javax.swing.JButton FormularioCiudad9;
    private javax.swing.JButton RAlojamiento;
    private javax.swing.JButton RCiudad;
    private javax.swing.JButton RPaquete;
    private javax.swing.JButton RVendedor;
    private javax.swing.JButton RVendedor1;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
