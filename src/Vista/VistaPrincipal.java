package Vista;

import Controlador.ControladorProductos;
import Modelo.ModeloProductos;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        ModeloProductos modelo = new ModeloProductos(this);
        ControladorProductos controlador = new ControladorProductos(modelo);
        setControladorP(controlador);
        btnGuardarDatosV.setEnabled(false);
        lblClienteV.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdReportes = new javax.swing.JTabbedPane();
        ifrmVentas = new javax.swing.JInternalFrame();
        pnlAgregarProductoV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAgregarProductoV = new javax.swing.JTextField();
        btnAgregarProductoV = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadV = new javax.swing.JTextField();
        pnlDatosV = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosV = new javax.swing.JTable();
        pnlTotalV = new javax.swing.JPanel();
        lblTotalV = new javax.swing.JLabel();
        pnlDisponibleV = new javax.swing.JPanel();
        lblDisponibleV = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardarDatosV = new javax.swing.JButton();
        btnLimpiarV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOrdenV = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblUsuarioV = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNitV = new javax.swing.JTextField();
        lblClienteV = new javax.swing.JLabel();
        ifrmIngresos = new javax.swing.JInternalFrame();
        ifrmProductos = new javax.swing.JInternalFrame();
        ifrmInventario = new javax.swing.JInternalFrame();
        ifrmReportes = new javax.swing.JInternalFrame();
        ifrmCuadreDiario = new javax.swing.JInternalFrame();
        ifrmConfiguracion = new javax.swing.JInternalFrame();
        ifrmUsuarios = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Inventarios y Ventas");

        ifrmVentas.setTitle("Modulo de Ventas");
        ifrmVentas.setVisible(true);

        pnlAgregarProductoV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Producto:");

        btnAgregarProductoV.setText("Agregar");

        jLabel2.setText("Cantidad:");

        txtCantidadV.setText("0");

        javax.swing.GroupLayout pnlAgregarProductoVLayout = new javax.swing.GroupLayout(pnlAgregarProductoV);
        pnlAgregarProductoV.setLayout(pnlAgregarProductoVLayout);
        pnlAgregarProductoVLayout.setHorizontalGroup(
            pnlAgregarProductoVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarProductoVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgregarProductoV, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadV, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarProductoV)
                .addContainerGap())
        );
        pnlAgregarProductoVLayout.setVerticalGroup(
            pnlAgregarProductoVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarProductoVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregarProductoVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAgregarProductoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProductoV)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidadV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblDatosV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatosV);

        javax.swing.GroupLayout pnlDatosVLayout = new javax.swing.GroupLayout(pnlDatosV);
        pnlDatosV.setLayout(pnlDatosVLayout);
        pnlDatosVLayout.setHorizontalGroup(
            pnlDatosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlDatosVLayout.setVerticalGroup(
            pnlDatosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTotalV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTotalV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalV.setText("Total: Q0.00");

        javax.swing.GroupLayout pnlTotalVLayout = new javax.swing.GroupLayout(pnlTotalV);
        pnlTotalV.setLayout(pnlTotalVLayout);
        pnlTotalVLayout.setHorizontalGroup(
            pnlTotalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalV)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        pnlTotalVLayout.setVerticalGroup(
            pnlTotalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDisponibleV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDisponibleV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDisponibleV.setText("Disponible: 0");

        javax.swing.GroupLayout pnlDisponibleVLayout = new javax.swing.GroupLayout(pnlDisponibleV);
        pnlDisponibleV.setLayout(pnlDisponibleVLayout);
        pnlDisponibleVLayout.setHorizontalGroup(
            pnlDisponibleVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisponibleVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisponibleV)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        pnlDisponibleVLayout.setVerticalGroup(
            pnlDisponibleVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisponibleVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisponibleV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGuardarDatosV.setText("Guardar");

        btnLimpiarV.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardarDatosV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiarV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDatosV)
                    .addComponent(btnLimpiarV))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblOrdenV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrdenV.setText("Orden:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrdenV)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrdenV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUsuarioV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuarioV.setText("Usuario:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioV)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("NIT:");

        lblClienteV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClienteV.setText("Cliente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNitV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClienteV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNitV)
                        .addComponent(lblClienteV)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ifrmVentasLayout = new javax.swing.GroupLayout(ifrmVentas.getContentPane());
        ifrmVentas.getContentPane().setLayout(ifrmVentasLayout);
        ifrmVentasLayout.setHorizontalGroup(
            ifrmVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifrmVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ifrmVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ifrmVentasLayout.createSequentialGroup()
                        .addComponent(pnlAgregarProductoV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTotalV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDisponibleV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ifrmVentasLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ifrmVentasLayout.setVerticalGroup(
            ifrmVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifrmVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ifrmVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAgregarProductoV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTotalV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDisponibleV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatosV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifrmVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbdReportes.addTab("VENTAS", ifrmVentas);

        ifrmIngresos.setVisible(true);

        javax.swing.GroupLayout ifrmIngresosLayout = new javax.swing.GroupLayout(ifrmIngresos.getContentPane());
        ifrmIngresos.getContentPane().setLayout(ifrmIngresosLayout);
        ifrmIngresosLayout.setHorizontalGroup(
            ifrmIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifrmIngresosLayout.setVerticalGroup(
            ifrmIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdReportes.addTab("INGRESOS", ifrmIngresos);

        ifrmProductos.setVisible(true);

        javax.swing.GroupLayout ifrmProductosLayout = new javax.swing.GroupLayout(ifrmProductos.getContentPane());
        ifrmProductos.getContentPane().setLayout(ifrmProductosLayout);
        ifrmProductosLayout.setHorizontalGroup(
            ifrmProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifrmProductosLayout.setVerticalGroup(
            ifrmProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdReportes.addTab("PRODUCTOS", ifrmProductos);

        ifrmInventario.setVisible(true);

        javax.swing.GroupLayout ifrmInventarioLayout = new javax.swing.GroupLayout(ifrmInventario.getContentPane());
        ifrmInventario.getContentPane().setLayout(ifrmInventarioLayout);
        ifrmInventarioLayout.setHorizontalGroup(
            ifrmInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifrmInventarioLayout.setVerticalGroup(
            ifrmInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdReportes.addTab("INVENTARIO", ifrmInventario);

        ifrmReportes.setVisible(true);

        javax.swing.GroupLayout ifrmReportesLayout = new javax.swing.GroupLayout(ifrmReportes.getContentPane());
        ifrmReportes.getContentPane().setLayout(ifrmReportesLayout);
        ifrmReportesLayout.setHorizontalGroup(
            ifrmReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifrmReportesLayout.setVerticalGroup(
            ifrmReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdReportes.addTab("REPORTES", ifrmReportes);

        ifrmCuadreDiario.setVisible(true);

        javax.swing.GroupLayout ifrmCuadreDiarioLayout = new javax.swing.GroupLayout(ifrmCuadreDiario.getContentPane());
        ifrmCuadreDiario.getContentPane().setLayout(ifrmCuadreDiarioLayout);
        ifrmCuadreDiarioLayout.setHorizontalGroup(
            ifrmCuadreDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifrmCuadreDiarioLayout.setVerticalGroup(
            ifrmCuadreDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdReportes.addTab("CUADRE DIARIO", ifrmCuadreDiario);

        ifrmConfiguracion.setVisible(true);

        javax.swing.GroupLayout ifrmConfiguracionLayout = new javax.swing.GroupLayout(ifrmConfiguracion.getContentPane());
        ifrmConfiguracion.getContentPane().setLayout(ifrmConfiguracionLayout);
        ifrmConfiguracionLayout.setHorizontalGroup(
            ifrmConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifrmConfiguracionLayout.setVerticalGroup(
            ifrmConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdReportes.addTab("CONFIGURACION", ifrmConfiguracion);

        ifrmUsuarios.setVisible(true);

        javax.swing.GroupLayout ifrmUsuariosLayout = new javax.swing.GroupLayout(ifrmUsuarios.getContentPane());
        ifrmUsuarios.getContentPane().setLayout(ifrmUsuariosLayout);
        ifrmUsuariosLayout.setHorizontalGroup(
            ifrmUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifrmUsuariosLayout.setVerticalGroup(
            ifrmUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdReportes.addTab("USUARIOS", ifrmUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdReportes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarProductoV;
    public javax.swing.JButton btnGuardarDatosV;
    public javax.swing.JButton btnLimpiarV;
    private javax.swing.JInternalFrame ifrmConfiguracion;
    private javax.swing.JInternalFrame ifrmCuadreDiario;
    private javax.swing.JInternalFrame ifrmIngresos;
    private javax.swing.JInternalFrame ifrmInventario;
    private javax.swing.JInternalFrame ifrmProductos;
    private javax.swing.JInternalFrame ifrmReportes;
    private javax.swing.JInternalFrame ifrmUsuarios;
    private javax.swing.JInternalFrame ifrmVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblClienteV;
    public javax.swing.JLabel lblDisponibleV;
    public javax.swing.JLabel lblOrdenV;
    public javax.swing.JLabel lblTotalV;
    public javax.swing.JLabel lblUsuarioV;
    private javax.swing.JPanel pnlAgregarProductoV;
    private javax.swing.JPanel pnlDatosV;
    private javax.swing.JPanel pnlDisponibleV;
    private javax.swing.JPanel pnlTotalV;
    private javax.swing.JTabbedPane tbdReportes;
    public javax.swing.JTable tblDatosV;
    public javax.swing.JTextField txtAgregarProductoV;
    public javax.swing.JTextField txtCantidadV;
    public javax.swing.JTextField txtNitV;
    // End of variables declaration//GEN-END:variables
    
    public void setControladorP(ControladorProductos c){
        btnAgregarProductoV.addActionListener(c);
        txtAgregarProductoV.addFocusListener(c);
        txtNitV.addFocusListener(c);
    }
}
