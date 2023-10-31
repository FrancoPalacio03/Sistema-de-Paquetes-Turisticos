/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Admin.CreacionPaquete;

import AccesoADatos.PasajeData;
import Entidades.Paquete;
import Entidades.Pasaje;
import Entidades.TipoTransporte;
import Vistas.Vendedor.Login;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class FormularioPasaje extends javax.swing.JFrame {

    private Paquete paquete;
    

    /**
     * Creates new form RegistroTransporte1
     */
    public FormularioPasaje() {
        initComponents();
        llenarBox();
    }

    public FormularioPasaje(Paquete paquete) {
        initComponents();
        this.paquete = paquete;
        llenarBox();
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
        transporte = new javax.swing.JComboBox<>();
        precioLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cancelar.setBackground(new java.awt.Color(102, 102, 102));
        Cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 130, 50));

        Siguiente.setBackground(new java.awt.Color(102, 102, 102));
        Siguiente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        Siguiente.setText("Siguiente");
        Siguiente.setBorder(null);
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 130, 50));

        transporte.setBackground(new java.awt.Color(51, 51, 51));
        transporte.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        transporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transporteActionPerformed(evt);
            }
        });
        jPanel1.add(transporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 360, 40));

        precioLabel.setBackground(new java.awt.Color(255, 255, 255));
        precioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        precioLabel.setForeground(new java.awt.Color(255, 255, 255));
        precioLabel.setText("-");
        jPanel1.add(precioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 310, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio: $");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione Transporte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        Login re = new Login();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
        TipoTransporte selected = (TipoTransporte) transporte.getSelectedItem();
        
        Pasaje pasaje = new Pasaje(selected.name(), selected.getImporte(), paquete.getOrigen(), true);
        
       
        RegistroPaquete re = new RegistroPaquete(pasaje,paquete);
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SiguienteActionPerformed

    private void transporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transporteActionPerformed
        // TODO add your handling code here:
        TipoTransporte selected = (TipoTransporte) transporte.getSelectedItem();
        String precio = Double.toString(selected.getImporte());
        DecimalFormat df = new DecimalFormat("#,###");
        precioLabel.setText(df.format(selected.getImporte()));        
    }//GEN-LAST:event_transporteActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPasaje().setVisible(true);
            }
        });
    }
    
    private void llenarBox() {
        
        for (TipoTransporte elemento : TipoTransporte.values()) {
            transporte.addItem(elemento);
        }        
    }

//    private TipoTransporte seleccionado(){
//        TipoTransporte selected= ()
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JComboBox<TipoTransporte> transporte;
    // End of variables declaration//GEN-END:variables
}
