/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TercerTallerTercerCorte;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

   private DefaultTableModel modelo;

    public VentanaPrincipal() {
        initComponents();
          modelo = getModeloTabla();
    }

    //Metodo para obtener el modelo de la tabla
    public DefaultTableModel getModeloTabla() {
        return (DefaultTableModel) getTabla().getModel();
    }

    //Metodo para obtener la tabla
    public JTable getTabla() {
        return jTable1;
    }
    
    public String getCampoCodigoProducto(){
        return campoCodigoProducto.getText();
    }
    
    public String getCampoNombreProducto(){
        return campoNombreProducto.getText();
    }
    
    public String getCampoCantidadProducto(){
        return campoCantidadProducto.getText();
    }
    
    public String getCampoPrecioProducto(){
        return campoPrecioProducto.getText();
    }
    
    public String getCampoImpuestoProducto(){
        return campoImpuestoProducto.getText();
    }
    
    public double precioTotalProducto(){
        double precioProducto = Double.parseDouble(getCampoPrecioProducto());
        double impuestoProducto = Double.parseDouble(getCampoImpuestoProducto());
        double precioTotalProducto = precioProducto + impuestoProducto;
        return precioTotalProducto;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        etiquetaTitulo1 = new javax.swing.JLabel();
        etiquetaTitulo2 = new javax.swing.JLabel();
        etiquetaTitulo3 = new javax.swing.JLabel();
        etiquetaTitulo4 = new javax.swing.JLabel();
        etiquetaTitulo5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoCodigoProducto = new javax.swing.JTextField();
        campoNombreProducto = new javax.swing.JTextField();
        campoCantidadProducto = new javax.swing.JTextField();
        campoPrecioProducto = new javax.swing.JTextField();
        campoImpuestoProducto = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "CANTIDAD", "PRECIO", "IMPUESTO", "TOTAL"
            }
        ));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        etiquetaTitulo1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        etiquetaTitulo1.setText("REGISTRO DE FACTURAS");

        etiquetaTitulo2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo2.setText("CODIGO DEL PRODUCTO:");

        etiquetaTitulo3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo3.setText("NOMBRE DEL PRODUCTO:");

        etiquetaTitulo4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo4.setText("CANTIDAD DE PRODUCTO:");

        etiquetaTitulo5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo5.setText("PRECIO DEL PRODUCTO:");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("IMPUESTO DEL PRODUCTO:");
        jLabel1.setToolTipText("");

        campoPrecioProducto.setToolTipText("");

        botonGuardar.setText("GUARDAR");

        botonEditar.setText("EDITAR");

        botonEliminar.setText("ELIMINAR");

        botonCargar.setText("CARGAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(botonEditar)
                        .addGap(60, 60, 60)
                        .addComponent(botonEliminar)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaTitulo2)
                                .addGap(18, 18, 18)
                                .addComponent(campoCodigoProducto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaTitulo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNombreProducto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoImpuestoProducto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaTitulo4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCantidadProducto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaTitulo5)
                                .addGap(18, 18, 18)
                                .addComponent(campoPrecioProducto))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaTitulo1)
                        .addGap(6, 6, 6)))
                .addGap(48, 48, 48)
                .addComponent(botonCargar)
                .addGap(272, 272, 272))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo1)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaTitulo2))
                    .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo3)
                    .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo4)
                    .addComponent(campoCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo5)
                    .addComponent(campoPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoImpuestoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCantidadProducto;
    private javax.swing.JTextField campoCodigoProducto;
    private javax.swing.JTextField campoImpuestoProducto;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPrecioProducto;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel etiquetaTitulo3;
    private javax.swing.JLabel etiquetaTitulo4;
    private javax.swing.JLabel etiquetaTitulo5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
