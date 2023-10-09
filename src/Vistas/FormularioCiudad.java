/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.CiudadData;
import AccesoADatos.Conexion;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author diakz
 */
public class FormularioCiudad extends javax.swing.JFrame {
private Connection conb= Conexion.getConexionPaises();
    /**
     * Creates new form FormularioCiudad
     */
    public FormularioCiudad() {
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

        jPanel1 = new javax.swing.JPanel();
        Cancelar = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        combopais = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        combopais1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 50));

        Siguiente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.setBorder(null);
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 130, 50));

        combopais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combopais.setBorder(null);
        combopais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopaisActionPerformed(evt);
            }
        });
        jPanel1.add(combopais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione la Ciudad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, -1));

        combopais1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combopais1.setBorder(null);
        combopais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopais1ActionPerformed(evt);
            }
        });
        jPanel1.add(combopais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione Pais ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        Login re=new Login();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
        RegistroAlojamiento re=new RegistroAlojamiento();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SiguienteActionPerformed

    private void combopaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopaisActionPerformed

    }//GEN-LAST:event_combopaisActionPerformed

    private void combopais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopais1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combopais1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCiudad().setVisible(true);
            }
        });
    }
private void  cargarCombo(){
    combopais.removeAllItems();
        CiudadData awp=new CiudadData(conb);
       ArrayList<String> paises = new ArrayList();
      paises= (ArrayList<String>) awp.listarPaises();
       for(String elemento:paises){
           combopais.addItem(elemento);
       }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Siguiente;
    private javax.swing.JComboBox<String> combopais;
    private javax.swing.JComboBox<String> combopais1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}