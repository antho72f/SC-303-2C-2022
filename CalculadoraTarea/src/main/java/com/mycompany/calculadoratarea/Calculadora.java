/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadoratarea;

/**
 *
 * @author antho
 */
public class Calculadora extends javax.swing.JFrame {

    String memoria1;
    String signo;
    String memoria2;

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

        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JTextField();
        Num2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num1 = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        BorrarCaracter = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        BorrarTodo = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        Inversa = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        Punto = new javax.swing.JButton();
        Signo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Pantalla.setBackground(new java.awt.Color(0, 153, 51));
        Pantalla.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Pantalla.setForeground(new java.awt.Color(255, 255, 255));
        Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaActionPerformed(evt);
            }
        });

        Num2.setBackground(new java.awt.Color(0, 0, 0));
        Num2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num2.setForeground(new java.awt.Color(255, 255, 255));
        Num2.setText("2");
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        Num3.setBackground(new java.awt.Color(0, 0, 0));
        Num3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num3.setForeground(new java.awt.Color(255, 255, 255));
        Num3.setText("3");
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        Num1.setBackground(new java.awt.Color(0, 0, 0));
        Num1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num1.setForeground(new java.awt.Color(255, 255, 255));
        Num1.setText("1");
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Resta.setBackground(new java.awt.Color(0, 0, 0));
        Resta.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Resta.setForeground(new java.awt.Color(255, 255, 255));
        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        BorrarCaracter.setBackground(new java.awt.Color(0, 0, 0));
        BorrarCaracter.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BorrarCaracter.setForeground(new java.awt.Color(255, 255, 255));
        BorrarCaracter.setText("C");
        BorrarCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCaracterActionPerformed(evt);
            }
        });

        Num4.setBackground(new java.awt.Color(0, 0, 0));
        Num4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num4.setForeground(new java.awt.Color(255, 255, 255));
        Num4.setText("4");
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        Num5.setBackground(new java.awt.Color(0, 0, 0));
        Num5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num5.setForeground(new java.awt.Color(255, 255, 255));
        Num5.setText("5");
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });

        Num6.setBackground(new java.awt.Color(0, 0, 0));
        Num6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num6.setForeground(new java.awt.Color(255, 255, 255));
        Num6.setText("6");
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });

        Suma.setBackground(new java.awt.Color(0, 0, 0));
        Suma.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Suma.setForeground(new java.awt.Color(255, 255, 255));
        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        BorrarTodo.setBackground(new java.awt.Color(0, 0, 0));
        BorrarTodo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BorrarTodo.setForeground(new java.awt.Color(255, 255, 255));
        BorrarTodo.setText("CE");
        BorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTodoActionPerformed(evt);
            }
        });

        Num9.setBackground(new java.awt.Color(0, 0, 0));
        Num9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num9.setForeground(new java.awt.Color(255, 255, 255));
        Num9.setText("9");
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });

        Inversa.setBackground(new java.awt.Color(0, 0, 0));
        Inversa.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Inversa.setForeground(new java.awt.Color(255, 255, 255));
        Inversa.setText("1/x");
        Inversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InversaActionPerformed(evt);
            }
        });

        Num7.setBackground(new java.awt.Color(0, 0, 0));
        Num7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num7.setForeground(new java.awt.Color(255, 255, 255));
        Num7.setText("7");
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });

        Num8.setBackground(new java.awt.Color(0, 0, 0));
        Num8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num8.setForeground(new java.awt.Color(255, 255, 255));
        Num8.setText("8");
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });

        Multiplicacion.setBackground(new java.awt.Color(0, 0, 0));
        Multiplicacion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicacion.setText("*");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("=");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        Division.setBackground(new java.awt.Color(0, 0, 0));
        Division.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Division.setForeground(new java.awt.Color(255, 255, 255));
        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Num0.setBackground(new java.awt.Color(0, 0, 0));
        Num0.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Num0.setForeground(new java.awt.Color(255, 255, 255));
        Num0.setText("0");
        Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num0ActionPerformed(evt);
            }
        });

        Punto.setBackground(new java.awt.Color(0, 0, 0));
        Punto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Punto.setForeground(new java.awt.Color(255, 255, 255));
        Punto.setText(".");
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });

        Signo.setBackground(new java.awt.Color(0, 0, 0));
        Signo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Signo.setForeground(new java.awt.Color(255, 255, 255));
        Signo.setText("+/-");
        Signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BorrarCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Inversa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inversa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        Pantalla.setText(Pantalla.getText() + "1");
    }//GEN-LAST:event_Num1ActionPerformed

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        Pantalla.setText(Pantalla.getText() + "2");
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
        Pantalla.setText(Pantalla.getText() + "3");
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
        Pantalla.setText(Pantalla.getText() + "4");
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
        Pantalla.setText(Pantalla.getText() + "5");
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
        Pantalla.setText(Pantalla.getText() + "6");
    }//GEN-LAST:event_Num6ActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
        Pantalla.setText(Pantalla.getText() + "7");
    }//GEN-LAST:event_Num7ActionPerformed

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
        Pantalla.setText(Pantalla.getText() + "8");
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
        Pantalla.setText(Pantalla.getText() + "9");
    }//GEN-LAST:event_Num9ActionPerformed

    private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num0ActionPerformed
        Pantalla.setText(Pantalla.getText() + "0");
    }//GEN-LAST:event_Num0ActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        String cadena;
        cadena = Pantalla.getText();
        if (cadena.length() == 0) {
            Pantalla.setText("0.");
        } else {
            if (!existePunto(Pantalla.getText())) {
                Pantalla.setText(Pantalla.getText() + ".");
            }
        }

    }//GEN-LAST:event_PuntoActionPerformed

    private void BorrarCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCaracterActionPerformed
        String cadena;
        cadena = Pantalla.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            Pantalla.setText(cadena);
        }
    }//GEN-LAST:event_BorrarCaracterActionPerformed

    private void BorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTodoActionPerformed
        Pantalla.setText("");
    }//GEN-LAST:event_BorrarTodoActionPerformed

    private void InversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InversaActionPerformed
        String cadena;
        cadena = Pantalla.getText();
        Double num;

        if (cadena.length() > 0) {
            num = 1 / (Double.parseDouble(cadena));
            Pantalla.setText(num.toString());
        }

    }//GEN-LAST:event_InversaActionPerformed

    private void SignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoActionPerformed
        Double num;
        String cadena;
        cadena = Pantalla.getText();

        if (cadena.length() > 0) {
            num = (-1) * Double.parseDouble(cadena);
            Pantalla.setText(num.toString());
        }

    }//GEN-LAST:event_SignoActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        if (!Pantalla.getText().equals("")) {
            memoria1 = Pantalla.getText();
            signo = "-";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_RestaActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        if (!Pantalla.getText().equals("")) {
            memoria1 = Pantalla.getText();
            signo = "+";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_SumaActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        if (!Pantalla.getText().equals("")) {
            memoria1 = Pantalla.getText();
            signo = "*";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        if (!Pantalla.getText().equals("")) {
            memoria1 = Pantalla.getText();
            signo = "/";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_DivisionActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String resultado;
        memoria2 = Pantalla.getText();

        if (!memoria2.equals("")) {
            resultado = calculadora(memoria1, signo, memoria2);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    public static String calculadora(String memoria1, String signo, String memoria2){
        Double resultado = 0.0;
        String respuesta;
        
        
        if (signo.equals("-")){
            resultado = Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
        }
        if (signo.equals("+")){
            resultado = Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
        }
        if (signo.equals("*")){
            resultado = Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
        }
        if (signo.equals("/")){
            resultado = Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
        }
        
        respuesta = resultado.toString();
        return respuesta;
                
    }
    
    public static boolean existePunto(String cadena) {
        boolean result;
        result = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(".")) {
                result = true;
                break;
            }
        }
        return result;
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
    private javax.swing.JButton BorrarCaracter;
    private javax.swing.JButton BorrarTodo;
    private javax.swing.JButton Division;
    private javax.swing.JButton Inversa;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JButton Punto;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Signo;
    private javax.swing.JButton Suma;
    private javax.swing.JButton jButton16;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
