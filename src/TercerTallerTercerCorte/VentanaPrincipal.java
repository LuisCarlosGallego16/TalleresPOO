package TercerTallerTercerCorte;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.google.gson.reflect.TypeToken; 
 
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

    //Getters para obtener los valores de los campos de texto
    public String getCampoCodigoProducto() {
        return campoCodigoProducto.getText();
    }

    public String getCampoNombreProducto() {
        return campoNombreProducto.getText();
    }

    public String getCampoCantidadProducto() {
        return campoCantidadProducto.getText();
    }

    public String getCampoPrecioProducto() {
        return campoPrecioProducto.getText();
    }

    public String getCampoImpuestoProducto() {
        return campoImpuestoProducto.getText();
    }

    public String getCampoPrecioTotal() {
        return campoPrecioTotal.getText();
    }
    
    

    //Metodo para calcular el precio de un producto
    public double precioTotalProducto() {
        double precioProducto = Double.parseDouble(getCampoPrecioProducto());
        double impuestoProducto = Double.parseDouble(getCampoImpuestoProducto());
        int cantidadProducto = Integer.parseInt(getCampoCantidadProducto());
        double precioTotalProducto = cantidadProducto * (precioProducto + impuestoProducto);
        return precioTotalProducto;
    }

    public void guardarArchivoJSON() {
        //Lista para almacener los objetos factura
        List<Factura> listaFacturas = new ArrayList<>();

        //Iterar sobre cada fila de la tabla para obtener los valores
        for (int i = 0; i < modelo.getRowCount(); i++) {
            int codigoProducto = Integer.parseInt(modelo.getValueAt(i, 0).toString());
            String nombreProducto = modelo.getValueAt(i, 1).toString();
            int cantidadProducto = Integer.parseInt(modelo.getValueAt(i, 2).toString());
            double precioProducto = Double.parseDouble(modelo.getValueAt(i, 3).toString());
            double impuestoProducto = Double.parseDouble(modelo.getValueAt(i, 4).toString());
            double precioTotalProducto = Double.parseDouble(modelo.getValueAt(i, 5).toString());

            //Creamos un objeto factura, con los datos que obtenemos de cada fila de la tabla.
            Factura factura = new Factura(codigoProducto, nombreProducto, cantidadProducto, precioProducto, impuestoProducto, precioTotalProducto);
            listaFacturas.add(factura);
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter file = new FileWriter("facturas.json")) {
            gson.toJson(listaFacturas, file);
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente en el archivo JSON");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "ERROR AL GUARDAR LOS DATOS EN EL ARCHIVO JSON ");
        }
    }

    public void cargarDatosJSON() {
    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\luisc\\OneDrive\\Documentos\\NetBeansProjects\\TalleresPOO\\facturas.json"))) {
        // Crear una instancia de Gson
        Gson gson = new Gson();

        // Definir el tipo usando TypeToken
        java.lang.reflect.Type tipoFactura = new TypeToken<List<Factura>>() {}.getType();

        List<Factura> facturas = gson.fromJson(reader, tipoFactura);

        // Limpiar el modelo de la tabla
        modelo.setRowCount(0);

        // Agregar las filas de la lista de facturas a la tabla
        for (Factura factura : facturas) {
            Object[] fila = {
                factura.getCodigoProducto(),
                factura.getNombreProducto(),
                factura.getCantidadProducto(),
                factura.getPrecioProducto(),
                factura.getImpuestoProducto(),
                factura.getPrecioTotalProducto()
            };
            modelo.addRow(fila);
        }

        JOptionPane.showMessageDialog(this, "Datos cargados correctamente desde el archivo JSON.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar el archivo JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
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
        etiquetaTitulo7 = new javax.swing.JLabel();
        campoPrecioTotal = new javax.swing.JTextField();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        etiquetaTitulo7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaTitulo7.setText("PRECIO TOTAL DEL PRODUCTO:");

        campoPrecioTotal.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEditar)
                        .addGap(60, 60, 60)
                        .addComponent(botonEliminar)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaTitulo1)
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
                                .addComponent(campoPrecioProducto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaTitulo7)
                                .addGap(18, 18, 18)
                                .addComponent(campoPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(37, 37, 37)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo7)
                    .addComponent(campoPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String codigoProducto = getCampoCodigoProducto();
        String nombreProducto = getCampoNombreProducto();
        String cantidadProducto = getCampoCantidadProducto();
        String precioProducto = getCampoPrecioProducto();
        String impuestoProducto = getCampoImpuestoProducto();
        if (codigoProducto.isEmpty()
                || nombreProducto.isEmpty()
                || cantidadProducto.isEmpty()
                || precioProducto.isEmpty()
                || impuestoProducto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS TIENE QUE ESTAR DILIGENCIADOS!", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            double precioTotalProducto = precioTotalProducto();
            Object[] nuevaFila = {codigoProducto, nombreProducto, cantidadProducto, precioProducto, impuestoProducto, precioTotalProducto};
            modelo.addRow(nuevaFila);
            guardarArchivoJSON();
            campoCodigoProducto.setText("");
            campoNombreProducto.setText("");
            campoCantidadProducto.setText("");
            campoPrecioProducto.setText("");
            campoImpuestoProducto.setText("");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            String codigoProducto = getCampoCodigoProducto();
            String nombreProducto = getCampoNombreProducto();
            String cantidadProducto = getCampoCantidadProducto();
            String precioProducto = getCampoPrecioProducto();
            String impuestoProducto = getCampoImpuestoProducto();
            if (codigoProducto.isEmpty() || nombreProducto.isEmpty() || cantidadProducto.isEmpty() || precioProducto.isEmpty()
                    || precioProducto.isEmpty() || impuestoProducto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "ADVERTENCIA", "TODOS LOS CAMPOS TIENE QUE ESTAR DILIGENCIADOS!", JOptionPane.WARNING_MESSAGE);
            } else {
                modelo.setValueAt(codigoProducto, filaSeleccionada, 0);
                modelo.setValueAt(nombreProducto, filaSeleccionada, 1);
                modelo.setValueAt(cantidadProducto, filaSeleccionada, 2);
                modelo.setValueAt(precioProducto, filaSeleccionada, 3);
                modelo.setValueAt(impuestoProducto, filaSeleccionada, 4);
                modelo.setValueAt(precioTotalProducto(), filaSeleccionada, 5);
                guardarArchivoJSON();
            }
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada != -1) {
            campoCodigoProducto.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
            campoNombreProducto.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
            campoCantidadProducto.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
            campoPrecioProducto.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
            campoImpuestoProducto.setText(modelo.getValueAt(filaSeleccionada, 4).toString());
            campoPrecioTotal.setText(modelo.getValueAt(filaSeleccionada, 5).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked
     
    
    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿ESTAS SEGURO DE ELIMINAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        int filaSeleccionada = jTable1.getSelectedRow();
        if (confirmacion == JOptionPane.YES_OPTION) {
            if (filaSeleccionada != -1) {
                modelo.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(this, "FACTURA ELIMINADA CORRECTAMENTE");
                campoCodigoProducto.setText("");
                campoNombreProducto.setText("");
                campoCantidadProducto.setText("");
                campoPrecioProducto.setText("");
                campoImpuestoProducto.setText("");
                campoPrecioTotal.setText("");
                guardarArchivoJSON();
            } else {
                JOptionPane.showConfirmDialog(this, "SELECCIONADA UNA FACTURA  PARA ELIMINAR");
            }
        } else {
            JOptionPane.showConfirmDialog(this, "NO HAZ ELIMINADO NINGUNA FACTURA ");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        cargarDatosJSON();
    }//GEN-LAST:event_botonCargarActionPerformed

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
    private javax.swing.JTextField campoPrecioTotal;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel etiquetaTitulo3;
    private javax.swing.JLabel etiquetaTitulo4;
    private javax.swing.JLabel etiquetaTitulo5;
    private javax.swing.JLabel etiquetaTitulo7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
