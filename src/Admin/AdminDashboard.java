/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import class_record_app.Login;
import java.awt.Color;
import javax.swing.JOptionPane;

import InternalPackage.Dash;
import InternalPackage.userDash;
import config.Session;




   
public class AdminDashboard extends javax.swing.JFrame {


    public AdminDashboard() {
         
        initComponents();
        
       

  }
  Color navcolor = new Color(204,188,255);
      Color hovercolor = new Color(173,136,198);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        su = new javax.swing.JPanel();
        das3 = new javax.swing.JLabel();
        sub = new javax.swing.JPanel();
        das2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        us = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        stud = new javax.swing.JPanel();
        das1 = new javax.swing.JLabel();
        dasb = new javax.swing.JPanel();
        dash = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        des = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        j.setBackground(new java.awt.Color(173, 136, 198));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\notebook-1117.png")); // NOI18N
        jLabel1.setText("Class Record App");

        su.setBackground(new java.awt.Color(173, 136, 198));
        su.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                suMousePressed(evt);
            }
        });
        su.setLayout(null);

        das3.setBackground(new java.awt.Color(153, 153, 153));
        das3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\books-stack-of-three.png")); // NOI18N
        das3.setText("Subject");
        su.add(das3);
        das3.setBounds(35, 0, 138, 25);

        sub.setBackground(new java.awt.Color(173, 136, 198));
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subMousePressed(evt);
            }
        });
        sub.setLayout(null);

        das2.setBackground(new java.awt.Color(153, 153, 153));
        das2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\grade.png")); // NOI18N
        das2.setText("Grades");
        sub.add(das2);
        das2.setBounds(26, 0, 138, 25);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        us.setBackground(new java.awt.Color(173, 136, 198));
        us.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usMousePressed(evt);
            }
        });
        us.setLayout(null);

        user.setBackground(new java.awt.Color(153, 153, 153));
        user.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\user_747376.png")); // NOI18N
        user.setText("User");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });
        us.add(user);
        user.setBounds(70, 0, 64, 24);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Log out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        acc_name1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        acc_name1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\profile_4945750.png")); // NOI18N
        acc_name1.setText("Admin");

        acc_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stud.setBackground(new java.awt.Color(173, 136, 198));
        stud.setOpaque(false);
        stud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studMouseExited(evt);
            }
        });
        stud.setLayout(null);

        das1.setBackground(new java.awt.Color(153, 153, 153));
        das1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\graduation.png")); // NOI18N
        das1.setText("Student List");
        das1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                das1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                das1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                das1MouseExited(evt);
            }
        });
        stud.add(das1);
        das1.setBounds(20, 0, 160, 25);

        dasb.setBackground(new java.awt.Color(173, 136, 198));
        dasb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dasbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dasbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dasbMouseExited(evt);
            }
        });
        dasb.setLayout(null);

        dash.setBackground(new java.awt.Color(153, 153, 153));
        dash.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\dashboard.png")); // NOI18N
        dash.setText("Dashboard");
        dasb.add(dash);
        dash.setBounds(30, 0, 169, 25);

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addGap(210, 210, 210))
                            .addGroup(jLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(acc_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(193, 193, 193)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dasb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(us, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(su, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_name1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dasb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(173, 136, 198));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        des.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desLayout = new javax.swing.GroupLayout(des);
        des.setLayout(desLayout);
        desLayout.setHorizontalGroup(
            desLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        desLayout.setVerticalGroup(
            desLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
          Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void suMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMousePressed

     
    }//GEN-LAST:event_suMousePressed

    private void suMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseClicked

    }//GEN-LAST:event_suMouseClicked

    private void subMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMousePressed

    }//GEN-LAST:event_subMousePressed

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked

    }//GEN-LAST:event_subMouseClicked

    private void usMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMousePressed

    }//GEN-LAST:event_usMousePressed

    private void usMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseClicked

    }//GEN-LAST:event_usMouseClicked

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed
     
    }//GEN-LAST:event_userMousePressed

    private void das1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_das1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_das1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess=  Session.getInstances();
         if(sess.getUid()==0){
              JOptionPane.showMessageDialog(null,"No account, Login First!");
              Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
         }
         acc_name.setText(""+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void suMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseEntered
        su.setBackground(hovercolor);
    }//GEN-LAST:event_suMouseEntered

    private void suMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseExited
       su.setBackground(navcolor);
    }//GEN-LAST:event_suMouseExited

    private void subMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseEntered
       sub.setBackground(hovercolor);
    }//GEN-LAST:event_subMouseEntered

    private void subMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseExited
          sub.setBackground(navcolor);
    }//GEN-LAST:event_subMouseExited

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
      
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
      
    }//GEN-LAST:event_userMouseExited

    private void usMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseEntered
          us.setBackground(hovercolor);
    }//GEN-LAST:event_usMouseEntered

    private void usMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseExited
       us.setBackground(navcolor);
    }//GEN-LAST:event_usMouseExited

    private void dasbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasbMouseClicked
      Dash ds= new Dash();
        des.add(ds).setVisible(true);
    }//GEN-LAST:event_dasbMouseClicked

    private void dasbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasbMouseEntered
         dasb.setBackground(hovercolor);
    }//GEN-LAST:event_dasbMouseEntered

    private void dasbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasbMouseExited
         dasb.setBackground(navcolor);
    }//GEN-LAST:event_dasbMouseExited

    private void studMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMouseEntered
         stud.setBackground(hovercolor);
    }//GEN-LAST:event_studMouseEntered

    private void studMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMouseExited
                 stud.setBackground(navcolor);
    }//GEN-LAST:event_studMouseExited

    private void das1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_das1MouseEntered
     
    }//GEN-LAST:event_das1MouseEntered

    private void das1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_das1MouseExited
      
    }//GEN-LAST:event_das1MouseExited

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel das1;
    private javax.swing.JLabel das2;
    private javax.swing.JLabel das3;
    private javax.swing.JPanel dasb;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel des;
    private javax.swing.JPanel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel stud;
    private javax.swing.JPanel su;
    private javax.swing.JPanel sub;
    private javax.swing.JPanel us;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
