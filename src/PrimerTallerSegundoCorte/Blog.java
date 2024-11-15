/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PrimerTallerSegundoCorte;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Blog extends javax.swing.JFrame {

    public Blog() {
        initComponents();

        //METODO QUE NOS PERMITE SOLO SELECCIONAR UN BOTON Y NO TODOS.
        ButtonGroup botonesGrupo = new ButtonGroup();
        botonesGrupo.add(radioButton1);
        botonesGrupo.add(radioButton2);
        botonesGrupo.add(radioButton3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaModoOscuro = new javax.swing.JLabel();
        botonModoOscuro = new javax.swing.JToggleButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaTitulo2 = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellido = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        etiquetaRangoEdad = new javax.swing.JLabel();
        rangoEdad = new javax.swing.JSlider();
        etiquetaEdad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etiquetaMostrarEdad = new javax.swing.JLabel();
        etiquetaGenero = new javax.swing.JLabel();
        radioButton1 = new javax.swing.JRadioButton();
        radioButton2 = new javax.swing.JRadioButton();
        radioButton3 = new javax.swing.JRadioButton();
        botonContinuar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaModoOscuro.setText("MODO OSCURO");

        botonModoOscuro.setText("ON");
        botonModoOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModoOscuroActionPerformed(evt);
            }
        });

        etiquetaTitulo.setText("MINI BLOG PERSONAL");

        etiquetaTitulo2.setText("PREGUNTAS PERSONALES");

        etiquetaNombre.setText("CUAL ES TU NOMBRE");

        etiquetaApellido.setText("CUAL ES TU APELLIDO");

        etiquetaRangoEdad.setText("SELECCIONA TU RANGO DE EDAD");

        rangoEdad.setMajorTickSpacing(10);
        rangoEdad.setMaximum(90);
        rangoEdad.setMinimum(10);
        rangoEdad.setPaintLabels(true);
        rangoEdad.setPaintTicks(true);
        rangoEdad.setValue(10);
        rangoEdad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rangoEdadStateChanged(evt);
            }
        });

        etiquetaEdad.setText("EDAD:");

        etiquetaGenero.setText("SELECCIONA TU GENERO");

        radioButton1.setText("MASCULINO");

        radioButton2.setText("FEMENINO");

        radioButton3.setText("OTRO");

        botonContinuar.setText("CONTINUAR");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaModoOscuro)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonModoOscuro)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(etiquetaTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(etiquetaTitulo2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaNombre)
                                .addGap(18, 18, 18)
                                .addComponent(campoNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaRangoEdad)
                                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(rangoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(etiquetaEdad)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaMostrarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(radioButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(radioButton2)
                                .addGap(105, 105, 105)
                                .addComponent(radioButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(etiquetaGenero))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(botonContinuar)
                        .addGap(93, 93, 93)
                        .addComponent(botonSalir)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaModoOscuro)
                    .addComponent(etiquetaTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModoOscuro)
                    .addComponent(etiquetaTitulo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaApellido)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(etiquetaRangoEdad)
                .addGap(18, 18, 18)
                .addComponent(rangoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(etiquetaMostrarEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(etiquetaGenero)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton2)
                    .addComponent(radioButton1)
                    .addComponent(radioButton3))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonContinuar)
                    .addComponent(botonSalir))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rangoEdadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rangoEdadStateChanged
        int edadR = rangoEdad.getValue();
        etiquetaMostrarEdad.setText(String.valueOf(edadR));
    }//GEN-LAST:event_rangoEdadStateChanged

    private void botonModoOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModoOscuroActionPerformed
        if (botonModoOscuro.isSelected()) {
            jPanel1.setBackground(Color.black);
            etiquetaTitulo.setForeground(Color.white);
            etiquetaTitulo2.setForeground(Color.white);
            etiquetaNombre.setForeground(Color.white);
            etiquetaApellido.setForeground(Color.white);
            etiquetaRangoEdad.setForeground(Color.white);
            etiquetaModoOscuro.setForeground(Color.white);
            etiquetaGenero.setForeground(Color.white);
            radioButton1.setForeground(Color.white);
            radioButton2.setForeground(Color.white);
            radioButton3.setForeground(Color.white);
            etiquetaMostrarEdad.setForeground(Color.white);
            etiquetaEdad.setForeground(Color.white);
            rangoEdad.setForeground(Color.white);
            etiquetaModoOscuro.setText("MODO CLARO");
            botonModoOscuro.setText("ON");
        } else {
            jPanel1.setBackground(Color.white);
            etiquetaTitulo.setForeground(Color.black);
            etiquetaTitulo2.setForeground(Color.black);
            etiquetaNombre.setForeground(Color.black);
            etiquetaApellido.setForeground(Color.black);
            etiquetaRangoEdad.setForeground(Color.black);
            etiquetaModoOscuro.setForeground(Color.black);
            etiquetaModoOscuro.setForeground(Color.black);
            etiquetaGenero.setForeground(Color.black);
            radioButton1.setForeground(Color.black);
            radioButton2.setForeground(Color.black);
            radioButton3.setForeground(Color.black);
            etiquetaMostrarEdad.setForeground(Color.black);
            etiquetaEdad.setForeground(Color.black);
            rangoEdad.setForeground(Color.black);
            etiquetaModoOscuro.setText("MODO OSCURO");
            botonModoOscuro.setText("ON");
        }
    }//GEN-LAST:event_botonModoOscuroActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Bienvenida inicio = new Bienvenida();
        int salirInicio = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE QUIERES SALIR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        if (salirInicio == JOptionPane.YES_OPTION) {
            dispose();
            inicio.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "TE HAZ QUEDADO! :)");
        }

    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        botonContinuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Blog2 blog2 = new Blog2();
                blog2.setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_botonContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JToggleButton botonModoOscuro;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaModoOscuro;
    private javax.swing.JLabel etiquetaMostrarEdad;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRangoEdad;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioButton1;
    private javax.swing.JRadioButton radioButton2;
    private javax.swing.JRadioButton radioButton3;
    private javax.swing.JSlider rangoEdad;
    // End of variables declaration//GEN-END:variables
}
