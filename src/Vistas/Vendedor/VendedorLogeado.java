/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Vendedor;

import AccesoADatos.AlojamientoVendidoData;
import AccesoADatos.ClienteData;
import AccesoADatos.PaqueteData;
import AccesoADatos.PaqueteVendidoData;
import AccesoADatos.VendedorData;
import Entidades.Alojamiento;
import Entidades.Cliente;
import Entidades.Paquete;
import Entidades.Vendedor;
import Vistas.Admin.Admin;
import Vistas.Admin.CreacionPaquete.FormularioPasaje;
import java.awt.Image;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.tree.DefaultTreeModel;
import java.net.URL;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class VendedorLogeado extends javax.swing.JFrame {

    private DefaultTreeModel modelo;
    private Vendedor vendedor;
    private PaqueteVendidoData packData = new PaqueteVendidoData();
    private VendedorData vendeData = new VendedorData();
    private AlojamientoVendidoData aloData = new AlojamientoVendidoData();
    private ClienteData cliData = new ClienteData();

    /**
     * Creates new form ClienteLogeado
     */
    public VendedorLogeado() {
        initComponents();
        arbol.setModel(modelo);
        llenarBox();
    }

    public VendedorLogeado(Vendedor vendedor) {
        initComponents();
        this.vendedor = vendedor;
        arbol.setModel(modelo);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        venderPaquete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        comboPaquete = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        precio = new javax.swing.JTextField();
        precio1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        origen = new javax.swing.JLabel();
        precioTransporte = new javax.swing.JLabel();
        precioAlojamiento = new javax.swing.JLabel();
        alojamiento = new javax.swing.JLabel();
        transporte = new javax.swing.JLabel();
        precioAlojamiento1 = new javax.swing.JLabel();
        precioTransporte1 = new javax.swing.JLabel();
        fechaIn = new com.toedter.calendar.JDateChooser();
        fechaOn = new com.toedter.calendar.JDateChooser();
        dniCliente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idCliente = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JLabel();
        apellidoCliente = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        viajantes = new javax.swing.JComboBox<>();
        PanelImagen = new javax.swing.JPanel();
        url = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        ventas = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        temporada = new javax.swing.JLabel();
        Salir2 = new javax.swing.JButton();
        NombreVendedor = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        venderPaquete.setBackground(new java.awt.Color(102, 102, 102));
        venderPaquete.setForeground(new java.awt.Color(255, 255, 255));
        venderPaquete.setText("Vender Paquete");
        venderPaquete.setBorder(null);
        venderPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderPaqueteActionPerformed(evt);
            }
        });
        jPanel1.add(venderPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 270, 290, 90));

        arbol.setBackground(new java.awt.Color(51, 102, 255));
        arbol.setBorder(null);
        arbol.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        arbol.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("INFORMACION");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Medios de pago");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ventas");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Paquetes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Promociones");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Transportes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Alojamientos");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode1.add(treeNode2);
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbol.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                arbolAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(arbol);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 855));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        comboPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaqueteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione el Paquete deseado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, 120));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informacion Del Paquete");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 228, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 8, 1039, 50));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Ciudad de Destino:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 139, 175, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Fecha De Partida:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 201, 159, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Fecha De Regreso:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 262, 159, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Transporte:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 329, 115, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Nombre Alojamiento:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 91, 198, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cantidad Viajantes:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 166, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Precio Diario De Alojamiento:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 150, 240, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Precio total:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 116, -1));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        precio.setBackground(new java.awt.Color(255, 153, 0));
        precio.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        precio.setText("precio");
        precio.setBorder(null);

        precio1.setBackground(new java.awt.Color(255, 153, 0));
        precio1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        precio1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        precio1.setText("$");
        precio1.setBorder(null);
        precio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 330, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(242, 242, 242));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Ciudad de Origen:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 75, -1, -1));

        destino.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        destino.setForeground(new java.awt.Color(242, 242, 242));
        destino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        destino.setText("-");
        jPanel4.add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 139, 130, -1));

        origen.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        origen.setForeground(new java.awt.Color(242, 242, 242));
        origen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        origen.setText("-");
        jPanel4.add(origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 79, 120, 16));

        precioTransporte.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        precioTransporte.setForeground(new java.awt.Color(242, 242, 242));
        precioTransporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioTransporte.setText("-");
        jPanel4.add(precioTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 132, -1));

        precioAlojamiento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        precioAlojamiento.setForeground(new java.awt.Color(242, 242, 242));
        precioAlojamiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioAlojamiento.setText("-");
        jPanel4.add(precioAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 160, -1));

        alojamiento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        alojamiento.setForeground(new java.awt.Color(242, 242, 242));
        alojamiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        alojamiento.setText("-");
        jPanel4.add(alojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 91, 160, -1));

        transporte.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        transporte.setForeground(new java.awt.Color(242, 242, 242));
        transporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transporte.setText("-");
        jPanel4.add(transporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 329, 130, -1));

        precioAlojamiento1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        precioAlojamiento1.setForeground(new java.awt.Color(242, 242, 242));
        precioAlojamiento1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioAlojamiento1.setText("$");
        jPanel4.add(precioAlojamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 22, -1));

        precioTransporte1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        precioTransporte1.setForeground(new java.awt.Color(242, 242, 242));
        precioTransporte1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioTransporte1.setText("$");
        jPanel4.add(precioTransporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 22, -1));
        jPanel4.add(fechaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 190, 25));
        jPanel4.add(fechaOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 190, 25));

        dniCliente.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        dniCliente.setForeground(new java.awt.Color(255, 255, 255));
        dniCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dniCliente.setText("-");
        jPanel4.add(dniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 570, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cliente:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 120, -1));

        idCliente.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        idCliente.setForeground(new java.awt.Color(255, 255, 255));
        idCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idCliente.setText("-");
        jPanel4.add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 570, -1));

        nombreCliente.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        nombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreCliente.setText("-");
        jPanel4.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 570, -1));

        apellidoCliente.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        apellidoCliente.setForeground(new java.awt.Color(255, 255, 255));
        apellidoCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        apellidoCliente.setText("-");
        jPanel4.add(apellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 570, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 242, 242));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Precio Transporte:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 210, 170, -1));

        viajantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel4.add(viajantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 60, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 1040, 630));

        url.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        url.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        url.setText("Url");

        javax.swing.GroupLayout PanelImagenLayout = new javax.swing.GroupLayout(PanelImagen);
        PanelImagen.setLayout(PanelImagenLayout);
        PanelImagenLayout.setHorizontalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImagenLayout.createSequentialGroup()
                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelImagenLayout.setVerticalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(url, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        jPanel1.add(PanelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 390, 240));

        Modificar.setBackground(new java.awt.Color(102, 102, 102));
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.setBorder(null);
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 540, 290, 90));

        ventas.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        ventas.setForeground(new java.awt.Color(255, 255, 255));
        ventas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ventas.setText("-");
        jPanel1.add(ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 130, 22));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Nro Ventas:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, 22));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Temporada:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 120, 22));

        temporada.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        temporada.setForeground(new java.awt.Color(255, 255, 255));
        temporada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        temporada.setText("-");
        jPanel1.add(temporada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 130, 22));

        Salir2.setBackground(new java.awt.Color(102, 102, 102));
        Salir2.setForeground(new java.awt.Color(255, 255, 255));
        Salir2.setText("Salir");
        Salir2.setBorder(null);
        Salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir2ActionPerformed(evt);
            }
        });
        jPanel1.add(Salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 660, 290, 90));

        NombreVendedor.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        NombreVendedor.setForeground(new java.awt.Color(255, 255, 255));
        NombreVendedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NombreVendedor.setText("Bienvenido/a ,");
        jPanel1.add(NombreVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 202, 440, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaqueteActionPerformed
        // TODO add your handling code here:
        Paquete paquete = (Paquete) comboPaquete.getSelectedItem();
        // Verifica si se ha seleccionado un paquete válido
        if (paquete != null) {
            // Establece la información del paquete en los JLabel
            origen.setText(paquete.getOrigen().getNombre());
            destino.setText(paquete.getDestino().getNombre());
            Date fechaSalida = Date.from(paquete.getAlojamiento().getSalida().atStartOfDay(ZoneId.systemDefault()).toInstant());
            Date fechaIngreso = Date.from(paquete.getAlojamiento().getIngreso().atStartOfDay(ZoneId.systemDefault()).toInstant());
            fechaIn.setDate(fechaSalida);
            fechaOn.setDate(fechaIngreso);
            double importeTransporte = paquete.getPasaje().getImporte();
            DecimalFormat formato = new DecimalFormat("#,###.##");
            String importeTransporteFormateado = formato.format(importeTransporte);
            precioTransporte.setText(importeTransporteFormateado);
            alojamiento.setText(paquete.getAlojamiento().getNombre());
            precioAlojamiento.setText(Double.toString(paquete.getAlojamiento().getImporteDiario()));

            double importeDiario = paquete.getAlojamiento().getImporteDiario();

            String importeDiarioFormateado = formato.format(importeDiario);

            precioAlojamiento.setText(importeDiarioFormateado);

            transporte.setText(paquete.getPasaje().getTipoTransporte());

            String urlImagen = paquete.getAlojamiento().getCiudadDest().getUrlImagen();
            setImagen(urlImagen);

            String temporadas = CalcularTemporada(paquete.getAlojamiento().getIngreso());
            temporada.setText(temporadas);

            Cliente cli = cliData.BuscarClienteXPaquete(paquete.getIdPaquete());
            idCliente.setText("id: " + Integer.toString(cli.getId()));
            nombreCliente.setText("Nombre: " + cli.getNombre());
            apellidoCliente.setText("Apellido: " + cli.getApellido());
            dniCliente.setText("Dni: " + Integer.toString(cli.getDni()));
            viajantes.setSelectedItem(Integer.toString(cli.getCantPersonas()));
            precio.setText(Double.toString(presupuestoTotal(paquete.getPasaje().getImporte(), paquete.getAlojamiento().getImporteDiario(), paquete.getAlojamiento().getIngreso(), paquete.getAlojamiento().getSalida(), cli.getCantPersonas())));

            double precioTotal = presupuestoTotal(paquete.getPasaje().getImporte(), paquete.getAlojamiento().getImporteDiario(), paquete.getAlojamiento().getIngreso(), paquete.getAlojamiento().getSalida(), cli.getCantPersonas());

            // Crear un objeto DecimalFormat para formatear el número
            // Formatear el precio con separadores de miles
            String precioFormateado = formato.format(precioTotal);

            precio.setText(precioFormateado);

            NombreVendedor.setText("Bienvenido/a al sistema usuario:  " + vendedor.getApellido() + " " + vendedor.getNombre());
        } else {
            return;
        }
    }//GEN-LAST:event_comboPaqueteActionPerformed

    private void arbolAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_arbolAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_arbolAncestorAdded

    private void venderPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderPaqueteActionPerformed
        // TODO add your handling code here:

        SeleccionPaquete re = new SeleccionPaquete(vendedor);
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);

    }//GEN-LAST:event_venderPaqueteActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        LocalDate fechaActual = LocalDate.now();

        // Obtiene las fechas seleccionadas
        Date fechaIngreso = fechaIn.getDate();
        Date fechaSalida = fechaOn.getDate();
        int cantPasajeros = Integer.parseInt((String) viajantes.getSelectedItem());

        if (fechaIngreso != null && fechaSalida != null) {
            // Convierte las fechas a objetos LocalDate
            LocalDate fechaIngresoLocal = fechaIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalidaLocal = fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Verifica que la fecha de salida no sea anterior a la fecha de ingreso
            if (!fechaIngresoLocal.isBefore(fechaActual) && !fechaSalidaLocal.isBefore(fechaActual)) {
                // Continúa con la lógica de tu aplicación
                Paquete paquete = (Paquete) comboPaquete.getSelectedItem();
                Alojamiento alo = paquete.getAlojamiento();
                alo.setIngreso(fechaIngresoLocal);
                alo.setSalida(fechaSalidaLocal);
                aloData.ModificarAlojamiento(alo);

                Cliente cli = cliData.BuscarClienteXPaquete(paquete.getIdPaquete());
                cli.setCantPersonas(cantPasajeros);
                cliData.modificarCliente(cli);

            } else {
                // Muestra un mensaje de error si alguna de las fechas es anterior a la fecha actual
                JOptionPane.showMessageDialog(this, "Las fechas deben ser posteriores a la fecha actual.");
            }
        } else {
            // Muestra un mensaje de error si alguna de las fechas está vacía
            JOptionPane.showMessageDialog(this, "Por favor, seleccione ambas fechas.");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void precio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio1ActionPerformed

    private void Salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir2ActionPerformed
        // TODO add your handling code here:
        Login re = new Login();
        re.pack();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Salir2ActionPerformed

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
            java.util.logging.Logger.getLogger(VendedorLogeado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendedorLogeado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendedorLogeado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendedorLogeado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendedorLogeado().setVisible(true);
            }
        });
    }

    private void llenarBox() {
        List<Paquete> paquetes = new ArrayList();
        paquetes = packData.listarPaqueteXVendedor(vendedor.getId());
        for (Paquete elemento : paquetes) {
            comboPaquete.addItem(elemento);
        }
        ventas.setText(Integer.toString(vendedor.getCont()));

    }

    private void setImagen(String urlImagen) {
        int anchoImagen = 400;
        int altoImagen = 300;  // Alto deseado

        try {
            URL imageUrl = new URL(urlImagen);
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            Image image = imageIcon.getImage().getScaledInstance(anchoImagen, altoImagen, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);
            url.setIcon(scaledImageIcon);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public String CalcularTemporada(LocalDate fechaIn) {
        if (fechaIn.getMonth() == Month.JANUARY || fechaIn.getMonth() == Month.JULY) {
            return "Alta";
        } else if (fechaIn.getMonth() == Month.FEBRUARY || fechaIn.getMonth() == Month.JUNE) {
            return "Media";
        } else {
            return "Baja";
        }
    }

    public double presupuestoTotal(double precioTransporte, double precioEstadia, LocalDate fechaIn, LocalDate fechaOn, int cantPersonas) {
        long diass = ChronoUnit.DAYS.between(fechaIn, fechaOn);
        int dias = (int) diass;
        double estadia = precioEstadia * dias;
        double precioFinal = 0;
        String temporada = CalcularTemporada(fechaIn);

        if (temporada.equals("Alta")) {
            precioFinal = ((estadia + precioTransporte) * cantPersonas) * 1.30;
        } else if (temporada.equals("Media")) {
            precioFinal = ((estadia + precioTransporte) * cantPersonas) * 1.15;
        } else {
            precioFinal = (estadia + precioTransporte) * cantPersonas;
        }
        return precioFinal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel NombreVendedor;
    private javax.swing.JPanel PanelImagen;
    private javax.swing.JButton Salir2;
    private javax.swing.JLabel alojamiento;
    private javax.swing.JLabel apellidoCliente;
    private javax.swing.JTree arbol;
    private javax.swing.JComboBox<Paquete> comboPaquete;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel dniCliente;
    private com.toedter.calendar.JDateChooser fechaIn;
    private com.toedter.calendar.JDateChooser fechaOn;
    private javax.swing.JLabel idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JLabel origen;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField precio1;
    private javax.swing.JLabel precioAlojamiento;
    private javax.swing.JLabel precioAlojamiento1;
    private javax.swing.JLabel precioTransporte;
    private javax.swing.JLabel precioTransporte1;
    private javax.swing.JLabel temporada;
    private javax.swing.JLabel transporte;
    private javax.swing.JLabel url;
    private javax.swing.JButton venderPaquete;
    private javax.swing.JLabel ventas;
    private javax.swing.JComboBox<String> viajantes;
    // End of variables declaration//GEN-END:variables
}
