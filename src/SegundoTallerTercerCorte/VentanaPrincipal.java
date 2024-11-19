package SegundoTallerTercerCorte;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
    public DefaultTableModel getModeloTabla(){
        return (DefaultTableModel) getTabla().getModel();
    }
    
    //Metodo para obtener la tabla
    public JTable getTabla() {
        return jTable1;
    }

 
    @SuppressWarnings("unchecked")

    //Getters para obtener los datos de los campos de texto 
    public String getCampoCodigoProducto() {
        return campoCodigoProducto.getText();
    }

    public String getCampoNombreProducto() {
        return campoNombreProducto.getText();
    }

    public String getCampoPrecioProducto() {
        return campoPrecioProducto.getText();
    }

    public String getCampoCategoriaProducto() {
        return campoCategoriaProducto.getText();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo1 = new javax.swing.JLabel();
        etiquetaTitulo2 = new javax.swing.JLabel();
        etiquetaTitulo3 = new javax.swing.JLabel();
        etiquetaTitulo4 = new javax.swing.JLabel();
        etiquetaTitulo5 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        campoCodigoProducto = new javax.swing.JTextField();
        campoNombreProducto = new javax.swing.JTextField();
        campoPrecioProducto = new javax.swing.JTextField();
        campoCategoriaProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO", "CATEGORIA"
            }
        ));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        etiquetaTitulo1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        etiquetaTitulo1.setText("REGISTRO DE PRODUCTOS");

        etiquetaTitulo2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo2.setText("CODIGO DEL PRODUCTO");

        etiquetaTitulo3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo3.setText("NOMBRE DEL PRODUCTO");

        etiquetaTitulo4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo4.setText("PRECIO DEL PRODUCTO");

        etiquetaTitulo5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo5.setText("CATEGORIA DEL PRODUCTO");

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonCargar.setText("CARGAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo1)
                .addGap(236, 236, 236))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTitulo2)
                            .addComponent(etiquetaTitulo3)
                            .addComponent(etiquetaTitulo4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCodigoProducto)
                            .addComponent(campoNombreProducto)
                            .addComponent(campoPrecioProducto)
                            .addComponent(campoCategoriaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addGap(70, 70, 70)
                                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(botonEliminar)
                                .addGap(51, 51, 51)
                                .addComponent(botonCargar))
                            .addComponent(etiquetaTitulo5))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo2)
                    .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo3)
                    .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo4)
                    .addComponent(campoPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo5)
                    .addComponent(campoCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String codigoProducto = getCampoCodigoProducto();
        String nombreProducto = getCampoNombreProducto();
        String precioProducto = getCampoPrecioProducto();
        String categoriaProducto = getCampoCategoriaProducto();

        if (codigoProducto.isEmpty() || nombreProducto.isEmpty() || precioProducto.isEmpty() || categoriaProducto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS TIENEN QUE ESTAR COMPLETOS!");
        } else {
            Object[] nuevaFila = {codigoProducto, nombreProducto, precioProducto, categoriaProducto};
            modelo.addRow(nuevaFila);
            campoCodigoProducto.setText("");
            campoNombreProducto.setText("");
            campoPrecioProducto.setText("");
            campoCategoriaProducto.setText("");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿ESTAS SEGURO DE ELIMINAR EL PRODUCTO?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        int filaSeleccionada = jTable1.getSelectedRow();
        if (confirmacion == JOptionPane.YES_OPTION) {
            if (filaSeleccionada != -1) {
                modelo.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(this, "PRODUCTO ELIMINADO CORRECTAMENTE");
                campoCodigoProducto.setText("");
                campoNombreProducto.setText("");
                campoPrecioProducto.setText("");
                campoCategoriaProducto.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "SELECCIONA UN PRODUCTO PARA ELIMINAR");
            }
        } else {
            JOptionPane.showMessageDialog(this, "NO VAS A ELIMINAR NINGUN PRODUCTO! :)");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            campoCodigoProducto.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
            campoNombreProducto.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
            campoPrecioProducto.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
            campoCategoriaProducto.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
        } else {
            JOptionPane.showMessageDialog(this, "SELECCIONA UN PRODUCTO");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            String codigoProducto = getCampoCodigoProducto();
            String nombreProducto = getCampoNombreProducto();
            String precioProducto = getCampoPrecioProducto();
            String categoriaProducto = getCampoCategoriaProducto();
            if (codigoProducto.isEmpty() || nombreProducto.isEmpty() || precioProducto.isEmpty() || categoriaProducto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS TIENEN QUE ESTAR COMPLETOS");
            } else {
                modelo.setValueAt(codigoProducto, filaSeleccionada, 0);
                modelo.setValueAt(nombreProducto, filaSeleccionada, 1);
                modelo.setValueAt(precioProducto, filaSeleccionada, 2);
                modelo.setValueAt(categoriaProducto, filaSeleccionada, 3);

                campoCodigoProducto.setText("");
                campoNombreProducto.setText("");
                campoPrecioProducto.setText("");
                campoCategoriaProducto.setText("");
                JOptionPane.showMessageDialog(this, "PRODUCTO ACTUALIZADO ");
            }
        } else {
            JOptionPane.showMessageDialog(this, "POR FAVOR SELECCIONE UN PRODUCTO ");
        }
    }//GEN-LAST:event_botonEditarActionPerformed

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
    private javax.swing.JTextField campoCategoriaProducto;
    private javax.swing.JTextField campoCodigoProducto;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPrecioProducto;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel etiquetaTitulo3;
    private javax.swing.JLabel etiquetaTitulo4;
    private javax.swing.JLabel etiquetaTitulo5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
