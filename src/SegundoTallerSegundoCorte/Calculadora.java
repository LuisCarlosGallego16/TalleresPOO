/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SegundoTallerSegundoCorte;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author luisc
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        etiquetaTitutlo1 = new javax.swing.JLabel();
        botonNumero1 = new javax.swing.JButton();
        botonNumero2 = new javax.swing.JButton();
        botonNumero4 = new javax.swing.JButton();
        botonNumero7 = new javax.swing.JButton();
        botonNumero5 = new javax.swing.JButton();
        botonNumero8 = new javax.swing.JButton();
        botonNumero3 = new javax.swing.JButton();
        botonNumero6 = new javax.swing.JButton();
        botonNumero9 = new javax.swing.JButton();
        botonNumero0 = new javax.swing.JButton();
        etiquetaTitulo2 = new javax.swing.JLabel();
        botonSumar = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoResultado = new javax.swing.JTextField();
        etiquetaNumero1 = new javax.swing.JLabel();
        etiquetaNumero2 = new javax.swing.JLabel();
        campoNumero1 = new javax.swing.JTextField();
        campoNumero2 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        etiquetaTitutlo1.setText("CALCULADORA");

        botonNumero1.setText("1");
        botonNumero1.setFocusable(false);
        botonNumero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero1MouseClicked(evt);
            }
        });

        botonNumero2.setText("2");
        botonNumero2.setFocusable(false);
        botonNumero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero2MouseClicked(evt);
            }
        });

        botonNumero4.setText("4");
        botonNumero4.setFocusable(false);
        botonNumero4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero4MouseClicked(evt);
            }
        });

        botonNumero7.setText("7");
        botonNumero7.setFocusable(false);
        botonNumero7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero7MouseClicked(evt);
            }
        });

        botonNumero5.setText("5");
        botonNumero5.setFocusable(false);
        botonNumero5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero5MouseClicked(evt);
            }
        });

        botonNumero8.setText("8");
        botonNumero8.setFocusable(false);
        botonNumero8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero8MouseClicked(evt);
            }
        });

        botonNumero3.setText("3");
        botonNumero3.setFocusable(false);
        botonNumero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero3MouseClicked(evt);
            }
        });

        botonNumero6.setText("6");
        botonNumero6.setFocusable(false);
        botonNumero6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero6MouseClicked(evt);
            }
        });

        botonNumero9.setText("9");
        botonNumero9.setFocusable(false);
        botonNumero9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero9MouseClicked(evt);
            }
        });

        botonNumero0.setText("0");
        botonNumero0.setFocusable(false);
        botonNumero0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNumero0MouseClicked(evt);
            }
        });

        etiquetaTitulo2.setText("OPERACIONES");

        botonSumar.setText("+");
        botonSumar.setFocusable(false);
        botonSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSumarMouseClicked(evt);
            }
        });

        botonRestar.setText("-");
        botonRestar.setFocusable(false);
        botonRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRestarMouseClicked(evt);
            }
        });
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });

        botonMultiplicar.setText("*");
        botonMultiplicar.setFocusable(false);
        botonMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMultiplicarMouseClicked(evt);
            }
        });

        botonDividir.setText("/");
        botonDividir.setFocusable(false);
        botonDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDividirMouseClicked(evt);
            }
        });

        jLabel2.setText("RESULTADO:");

        campoResultado.setEditable(false);
        campoResultado.setFocusable(false);

        etiquetaNumero1.setText("NUMERO 1:");

        etiquetaNumero2.setText("NUMERO 2:");

        campoNumero1.setFocusable(false);

        campoNumero2.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo2)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(337, 337, 337))))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(etiquetaNumero1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaNumero2)
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(botonNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonNumero4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonNumero7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(botonNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(botonNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botonNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(botonNumero5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(botonNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(144, 144, 144)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(botonNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(botonNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaTitutlo1)
                                .addGap(187, 187, 187)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonRestar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                .addComponent(botonSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(campoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etiquetaTitutlo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumero1)
                    .addComponent(etiquetaNumero2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(etiquetaTitulo2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonNumero6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(botonRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botonNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonNumero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero1MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("1");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("1");
        }

    }//GEN-LAST:event_botonNumero1MouseClicked

    private void botonNumero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero2MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("2");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("2");
        }    }//GEN-LAST:event_botonNumero2MouseClicked

    private void botonNumero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero3MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("3");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("3");
        }
    }//GEN-LAST:event_botonNumero3MouseClicked

    private void botonNumero4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero4MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("4");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("4");
        }
    }//GEN-LAST:event_botonNumero4MouseClicked

    private void botonNumero5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero5MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("5");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("5");
        }
    }//GEN-LAST:event_botonNumero5MouseClicked

    private void botonNumero6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero6MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("6");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("6");
        }
    }//GEN-LAST:event_botonNumero6MouseClicked

    private void botonNumero7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero7MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("7");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("7");
        }
    }//GEN-LAST:event_botonNumero7MouseClicked

    private void botonNumero8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero8MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("8");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("8");
        }
    }//GEN-LAST:event_botonNumero8MouseClicked

    private void botonNumero9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero9MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("9");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("9");
        }
    }//GEN-LAST:event_botonNumero9MouseClicked

    private void botonNumero0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNumero0MouseClicked
        if (campoNumero1.getText().equals("")) {
            campoNumero1.setText("0");
        } else if (campoNumero2.getText().equals("")) {
            campoNumero2.setText("0");
        }
    }//GEN-LAST:event_botonNumero0MouseClicked

    private void botonSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSumarMouseClicked
        int numero1 = Integer.parseInt(campoNumero1.getText());
        int numero2 = Integer.parseInt(campoNumero2.getText());
        int resultado = numero1 + numero2;
        campoResultado.setText(String.valueOf(resultado)); //El String.valueOF sirve para pasar de entero a string
        campoNumero1.setText("");
        campoNumero2.setText("");
    }//GEN-LAST:event_botonSumarMouseClicked

    private void botonRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRestarMouseClicked
        int numero1 = Integer.parseInt(campoNumero1.getText());
        int numero2 = Integer.parseInt(campoNumero2.getText());
        int resultado = numero1 - numero2;
        campoResultado.setText(String.valueOf(resultado)); //El String.valueOF sirve para pasar de entero a string
        campoNumero1.setText("");
        campoNumero2.setText("");
    }//GEN-LAST:event_botonRestarMouseClicked

    private void botonMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMultiplicarMouseClicked
        int numero1 = Integer.parseInt(campoNumero1.getText());
        int numero2 = Integer.parseInt(campoNumero2.getText());
        int resultado = numero1 * numero2;
        campoResultado.setText(String.valueOf(resultado)); //El String.valueOF sirve para pasar de entero a string
        campoNumero1.setText("");
        campoNumero2.setText("");
    }//GEN-LAST:event_botonMultiplicarMouseClicked

    private void botonDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDividirMouseClicked
        double numero1 = Double.parseDouble(campoNumero1.getText());
        double numero2 = Double.parseDouble(campoNumero2.getText());
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            campoResultado.setText(String.valueOf(resultado)); //El String.valueOF sirve para pasar de entero a string
            campoNumero1.setText("");
            campoNumero2.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR DIVISON POR 0");
            campoNumero1.setText("");
            campoNumero2.setText("");
        }

    }//GEN-LAST:event_botonDividirMouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        String numero = String.valueOf(evt.getKeyChar());
        if (numero.equals("1")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("1");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("1");
            }
        }
        if (numero.equals("2")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("2");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("2");
            }
        }
        if (numero.equals("3")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("3");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("3");
            }
        }
        if (numero.equals("4")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("4");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("4");
            }
        }
        if (numero.equals("5")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("5");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("5");
            }
        }
        if (numero.equals("6")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("6");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("6");
            }
        }
        if (numero.equals("7")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("7");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("7");
            }
        }
        if (numero.equals("8")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("8");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("8");
            }
        }
        if (numero.equals("9")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("9");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("9");
            }
        }
        if (numero.equals("0")) {
            if (campoNumero1.getText().equals("")) {
                campoNumero1.setText("0");
            } else if (campoNumero2.getText().equals("")) {
                campoNumero2.setText("0");
            }
        }
    }//GEN-LAST:event_formKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            JOptionPane.showConfirmDialog(this, "HAZ PRESIONADO LA TECLA N");
        }

        if (evt.getKeyCode() == KeyEvent.VK_ADD) {
            int numero1 = Integer.parseInt(campoNumero1.getText());
            int numero2 = Integer.parseInt(campoNumero2.getText());
            int resultado = numero1 + numero2;
            campoResultado.setText(String.valueOf(resultado));
            campoNumero1.setText("");
            campoNumero2.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            int numero1 = Integer.parseInt(campoNumero1.getText());
            int numero2 = Integer.parseInt(campoNumero2.getText());
            int resultado = numero1 - numero2;
            campoResultado.setText(String.valueOf(resultado));
            campoNumero1.setText("");
            campoNumero2.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            int numero1 = Integer.parseInt(campoNumero1.getText());
            int numero2 = Integer.parseInt(campoNumero2.getText());
            int resultado = numero1 * numero2;
            campoResultado.setText(String.valueOf(resultado));
            campoNumero1.setText("");
            campoNumero2.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_DIVIDE) {
            double numero1 = Double.parseDouble(campoNumero1.getText());
            double numero2 = Double.parseDouble(campoNumero2.getText());
            if (numero2 != 0) {
                double resultado = numero1 / numero2;
                campoResultado.setText(String.valueOf(resultado)); //El String.valueOF sirve para pasar de entero a string
                campoNumero1.setText("");
                campoNumero2.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR DIVISON POR 0");
                campoNumero1.setText("");
                campoNumero2.setText("");
            }
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonNumero0;
    private javax.swing.JButton botonNumero1;
    private javax.swing.JButton botonNumero2;
    private javax.swing.JButton botonNumero3;
    private javax.swing.JButton botonNumero4;
    private javax.swing.JButton botonNumero5;
    private javax.swing.JButton botonNumero6;
    private javax.swing.JButton botonNumero7;
    private javax.swing.JButton botonNumero8;
    private javax.swing.JButton botonNumero9;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JTextField campoNumero1;
    private javax.swing.JTextField campoNumero2;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JLabel etiquetaNumero1;
    private javax.swing.JLabel etiquetaNumero2;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel etiquetaTitutlo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
