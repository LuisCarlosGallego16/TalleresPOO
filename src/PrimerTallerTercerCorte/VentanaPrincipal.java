/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PrimerTallerTercerCorte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private DefaultTableModel modelo;

    public VentanaPrincipal() {
        initComponents();
        modelo = (DefaultTableModel) getTabla().getModel();
        guardarArchivo();
        //cargarArchivos();
    }

    @SuppressWarnings("unchecked")

    public JTable getTabla() {
        return jTable1;
    }

    //Metodo para escribir lo de la tabla en el archivo plano
    public void guardarArchivo() {
        BufferedWriter bufferedWriter = null;

        try {
            File file = new File("C:\\Users\\luisc\\OneDrive\\Documentos\\NetBeansProjects\\TalleresPOO\\src\\PrimerTallerTercerCorte\\productos.txt");
            //Segun lo investigado, el true nos sirve para no sobreescribir el archivo y que al momento de seguir agregando productos se escriba en una nueva linea pero guardando datos anteriores.
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            //Recorrer la fila de la tabla 
            for (int i = 0; i < modelo.getRowCount(); i++) {
                //Obtener los datos
                String codigoProducto = modelo.getValueAt(i, 0).toString();
                String nombreProducto = modelo.getValueAt(i, 1).toString();
                String precioProducto = modelo.getValueAt(i, 2).toString();
                String categoriaProducto = modelo.getValueAt(i, 3).toString();

                //Guardar los datos en el archivo, los separe por comas.
                bufferedWriter.write(codigoProducto + "," + nombreProducto + "," + precioProducto + "," + categoriaProducto);
                bufferedWriter.newLine(); //Agrego una nueva linea para que se vea organizado.
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void cargarArchivos() {
        BufferedReader bufferedReader = null;

        try {
            File file = new File("C:\\Users\\luisc\\OneDrive\\Documentos\\NetBeansProjects\\TalleresPOO\\src\\PrimerTallerTercerCorte\\productos.txt");  // Ruta del archivo donde guardas los productos
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea;

            // Limpiar la tabla antes de cargar los nuevos datos
            modelo.setRowCount(0); // Esto elimina todas las filas de la tabla

            // Leer cada línea del archivo
            while ((linea = bufferedReader.readLine()) != null) {
                // Dividir cada línea por comas para obtener los valores de cada columna
                String[] lista = linea.split(",");

                // Agregar la fila a la tabla (cada elemento de la lista corresponde a una columna)
                Object[] nuevaFila = {lista[0], lista[1], lista[2], lista[3]};  // Asumiendo que el archivo tiene 4 columnas
                modelo.addRow(nuevaFila);
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaTitulo2 = new javax.swing.JLabel();
        campoCodigoProducto = new javax.swing.JTextField();
        etiquetaTitulo3 = new javax.swing.JLabel();
        campoNombreProducto = new javax.swing.JTextField();
        etiquetaTitulo4 = new javax.swing.JLabel();
        campoPrecioProducto = new javax.swing.JTextField();
        etiquetaTitulo5 = new javax.swing.JLabel();
        campoCategoriaProducto = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        etiquetaTitulo.setText("REGISTRO DE PRODUCTOS");

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

        botonCancelar.setText("CANCELAR");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonCargar.setText("CARGAR");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTitulo2)
                            .addComponent(etiquetaTitulo3)
                            .addComponent(etiquetaTitulo4)
                            .addComponent(etiquetaTitulo5))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodigoProducto)
                            .addComponent(campoNombreProducto)
                            .addComponent(campoPrecioProducto)
                            .addComponent(campoCategoriaProducto))))
                .addGap(238, 238, 238))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(botonCargar)
                .addGap(50, 50, 50)
                .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo2)
                    .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo3)
                    .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo4)
                    .addComponent(campoPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo5)
                    .addComponent(campoCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botonCargar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String codigoProducto = campoCodigoProducto.getText();
        String nombreProducto = campoNombreProducto.getText();
        String precioProducto = campoPrecioProducto.getText();
        String categoriaProducto = campoCategoriaProducto.getText();

        if (codigoProducto.isEmpty() || nombreProducto.isEmpty() || precioProducto.isEmpty() || categoriaProducto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS TIENEN QUE ESTAR COMPLETOS!");
        } else {
            Object[] nuevaFila = {codigoProducto, nombreProducto, precioProducto, categoriaProducto};
            modelo.addRow(nuevaFila);
            guardarArchivo();
            campoCodigoProducto.setText("");
            campoNombreProducto.setText("");
            campoPrecioProducto.setText("");
            campoCategoriaProducto.setText("");
        }

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "ESTAS SEGURO DE CANCELAR", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            campoCodigoProducto.setText("");
            campoNombreProducto.setText("");
            campoPrecioProducto.setText("");
            campoCategoriaProducto.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "SIGUE INGRESANDO PRODUCTOS :)");
        }


    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        cargarArchivos();
    }//GEN-LAST:event_botonCargarActionPerformed

    //GETTER PARA OBTENER LA INFORMACION DE LOS CAMPOS DE TEXTO.
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
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCategoriaProducto;
    private javax.swing.JTextField campoCodigoProducto;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPrecioProducto;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel etiquetaTitulo3;
    private javax.swing.JLabel etiquetaTitulo4;
    private javax.swing.JLabel etiquetaTitulo5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
