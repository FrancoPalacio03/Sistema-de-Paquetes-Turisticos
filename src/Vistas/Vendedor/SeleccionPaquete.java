/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Vendedor;

import Vistas.Admin.CreacionPaquete.*;
import AccesoADatos.AlojamientoData;
import AccesoADatos.PaqueteData;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Paquete;
import Entidades.Vendedor;
import Vistas.Admin.Admin;
import Vistas.Vendedor.FormularioCliente;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class SeleccionPaquete extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private AlojamientoData aloData = new AlojamientoData();
    private PaqueteData packData= new PaqueteData();
    private Vendedor vendedor;

    /**
     * Creates new form RegistroAlojamiento1
     */
    public SeleccionPaquete() {
        initComponents();
        cargarTabla();
        llenarTabla();
    }

    public SeleccionPaquete(Vendedor vendedor) {
        initComponents();        
        this.vendedor = vendedor;
        cargarTabla();
        llenarTabla();  
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
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
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 130, 50));

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
        jPanel1.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 130, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 720, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            // Obtiene la información del alojamiento a partir del modelo de la tabla
            int id = (int) jTable1.getValueAt(filaSeleccionada, 0);
            Paquete paquete= packData.buscarPaquete(id);
            
            
            FormularioCliente re = new FormularioCliente(vendedor, paquete);
            re.pack();
            re.setVisible(true);
            re.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una ciudad antes de continuar.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_SiguienteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            // Obtiene la información del alojamiento a partir del modelo de la tabla
            int id = (int) jTable1.getValueAt(filaSeleccionada, 0);
            //ABRIR DETALLES DE PAQUETE
            
            
            // Crea una nueva ventana para mostrar los detalles del alojamiento
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(SeleccionPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SeleccionPaquete().setVisible(true);
            }
        });
    }

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        // Borra cualquier fila existente en la tabla
        modelo.setRowCount(0);
        List<Paquete> paquetes= new ArrayList();
        paquetes=packData.listarPaquete();
        // Recorre la lista de alojamientos y agrega cada uno a la tabla
        for (Paquete paquete : paquetes) {
            modelo.addRow(new Object[]{
                paquete.getIdPaquete(),
                paquete.getOrigen().getNombre(),
                paquete.getDestino().getNombre(),
                paquete.getAlojamiento().getNombre(),
                paquete.getAlojamiento().getIngreso(),
                paquete.getAlojamiento().getSalida(),
                paquete.getPasaje().getTipoTransporte(),});
        }
    }

    private void cargarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Salida");
        modelo.addColumn("Destino");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("Fecha Regreso");
        modelo.addColumn("Transporte");
        jTable1.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Siguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}