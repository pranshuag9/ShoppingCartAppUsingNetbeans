
import java.awt.event.KeyEvent;
public class ShoppingCartActivity extends javax.swing.JFrame {
    public ShoppingCartActivity() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ta1 = new javax.swing.JTextField();
        ta3 = new javax.swing.JTextField();
        ta2 = new javax.swing.JTextField();
        tc1 = new javax.swing.JTextField();
        tb1 = new javax.swing.JTextField();
        tb2 = new javax.swing.JTextField();
        tb3 = new javax.swing.JTextField();
        tc2 = new javax.swing.JTextField();
        tc3 = new javax.swing.JTextField();
        td1 = new javax.swing.JTextField();
        totalButton = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jCheckBox2.setText("jCheckBox2");

        jTextField11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Item");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Pizza");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Cake");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Pepsi");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Amount");

        ta1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta1ActionPerformed(evt);
            }
        });

        ta3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta3ActionPerformed(evt);
            }
        });
        ta3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ta3KeyPressed(evt);
            }
        });

        ta2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ta2KeyPressed(evt);
            }
        });

        tc1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        tb1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        tb2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb2ActionPerformed(evt);
            }
        });
        tb2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb2KeyPressed(evt);
            }
        });

        tb3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb3ActionPerformed(evt);
            }
        });
        tb3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb3KeyPressed(evt);
            }
        });

        tc2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc2ActionPerformed(evt);
            }
        });
        tc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tc2KeyPressed(evt);
            }
        });

        tc3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc3ActionPerformed(evt);
            }
        });
        tc3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tc3KeyPressed(evt);
            }
        });

        td1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        td1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                td1ActionPerformed(evt);
            }
        });

        totalButton.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        totalButton.setText("Total");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });
        totalButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalButtonKeyPressed(evt);
            }
        });

        tf1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Discount(%)");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("=");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("=");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("=");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("*");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tc1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ta1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tb2)
                            .addComponent(ta2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ta3)
                            .addComponent(tb3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(tc3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(td1)
                            .addComponent(tf1))))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(td1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(tf1))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ta1ActionPerformed

    private void ta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta3ActionPerformed
        
    }//GEN-LAST:event_ta3ActionPerformed

    private void tb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb3ActionPerformed
        
    }//GEN-LAST:event_tb3ActionPerformed

    private void tc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc3ActionPerformed
        
    }//GEN-LAST:event_tc3ActionPerformed

    private void tc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tc2ActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        Double a,b,c,d,e,f;
        a = Double.parseDouble(ta3.getText());
        b = Double.parseDouble(tb3.getText());
        c = Double.parseDouble(tc3.getText());
        d = Double.parseDouble(td1.getText());
        f = a+b+c-((a+b+c)*d/100);
        tf1.setText(f+"");
    }//GEN-LAST:event_totalButtonActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void td1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_td1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_td1ActionPerformed

    private void ta2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double a,b,c;
            a = Double.parseDouble(ta1.getText());
            b = Double.parseDouble(ta2.getText());
            c = a*b;
            ta3.setText(c+"");
        }
    }//GEN-LAST:event_ta2KeyPressed

    private void tb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb2ActionPerformed

    private void tb2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double a,b,c;
            a = Double.parseDouble(tb1.getText());
            b = Double.parseDouble(tb2.getText());
            c = a*b;
            tb3.setText(c+"");
        }
    }//GEN-LAST:event_tb2KeyPressed

    private void tc2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tc2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double a,b,c;
            a = Double.parseDouble(tc1.getText());
            b = Double.parseDouble(tc2.getText());
            c = a*b;
            tc3.setText(c+"");
        }
    }//GEN-LAST:event_tc2KeyPressed

    private void totalButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalButtonKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double a,b,c,d,e,f;
            a = Double.parseDouble(ta3.getText());
            b = Double.parseDouble(tb3.getText());
            c = Double.parseDouble(tc3.getText());
            d = Double.parseDouble(td1.getText());
            f = a+b+c-((a+b+c)*d/100);
            tf1.setText(f+"");
        }
    }//GEN-LAST:event_totalButtonKeyPressed

    private void ta3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double a,b,c;
            a = Double.parseDouble(ta1.getText());
            b = Double.parseDouble(ta2.getText());
            c = a*b;
            ta3.setText(c+"");
        }
    }//GEN-LAST:event_ta3KeyPressed

    private void tb3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double a,b,c;
            a = Double.parseDouble(tb1.getText());
            b = Double.parseDouble(tb2.getText());
            c = a*b;
            tb3.setText(c+"");
        }
    }//GEN-LAST:event_tb3KeyPressed

    private void tc3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tc3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double a,b,c;
            a = Double.parseDouble(tc1.getText());
            b = Double.parseDouble(tc2.getText());
            c = a*b;
            tc3.setText(c+"");
        }
    }//GEN-LAST:event_tc3KeyPressed
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
            java.util.logging.Logger.getLogger(ShoppingCartActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCartActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField ta1;
    private javax.swing.JTextField ta2;
    private javax.swing.JTextField ta3;
    private javax.swing.JTextField tb1;
    private javax.swing.JTextField tb2;
    private javax.swing.JTextField tb3;
    private javax.swing.JTextField tc1;
    private javax.swing.JTextField tc2;
    private javax.swing.JTextField tc3;
    private javax.swing.JTextField td1;
    private javax.swing.JTextField tf1;
    private javax.swing.JButton totalButton;
    // End of variables declaration//GEN-END:variables
}
