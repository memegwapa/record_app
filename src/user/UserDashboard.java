/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Admin.*;
import class_record_app.Login;
import java.awt.Color;
import javax.swing.JOptionPane;

import InternalPackage.Dash;
import InternalPackage.userDash;
import config.Session;




   
public class UserDashboard extends javax.swing.JFrame {


   Color DefaultColor;
     Color ClickedColor;
    public UserDashboard() {
         
        initComponents();
        
        
     
      DefaultColor=new Color (173,136,198);
ClickedColor=new Color (225, 175, 209);
das.setBackground (DefaultColor); 
st.setBackground (DefaultColor);
su.setBackground (DefaultColor);
sub.setBackground (DefaultColor);



  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        das = new javax.swing.JPanel();
        dash = new javax.swing.JLabel();
        st = new javax.swing.JPanel();
        das1 = new javax.swing.JLabel();
        su = new javax.swing.JPanel();
        das3 = new javax.swing.JLabel();
        sub = new javax.swing.JPanel();
        das2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_user = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        desh = new javax.swing.JPanel();

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

        das.setBackground(new java.awt.Color(173, 136, 198));
        das.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dasMousePressed(evt);
            }
        });

        dash.setBackground(new java.awt.Color(153, 153, 153));
        dash.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\dashboard.png")); // NOI18N
        dash.setText("Dashboard");

        javax.swing.GroupLayout dasLayout = new javax.swing.GroupLayout(das);
        das.setLayout(dasLayout);
        dasLayout.setHorizontalGroup(
            dasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dasLayout.setVerticalGroup(
            dasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dasLayout.createSequentialGroup()
                .addComponent(dash)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        st.setBackground(new java.awt.Color(173, 136, 198));
        st.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stMousePressed(evt);
            }
        });

        das1.setBackground(new java.awt.Color(153, 153, 153));
        das1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\graduation.png")); // NOI18N
        das1.setText("Student List");
        das1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                das1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout stLayout = new javax.swing.GroupLayout(st);
        st.setLayout(stLayout);
        stLayout.setHorizontalGroup(
            stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(das1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        stLayout.setVerticalGroup(
            stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(das1))
        );

        su.setBackground(new java.awt.Color(173, 136, 198));
        su.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                suMousePressed(evt);
            }
        });

        das3.setBackground(new java.awt.Color(153, 153, 153));
        das3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\books-stack-of-three.png")); // NOI18N
        das3.setText("Subject");

        javax.swing.GroupLayout suLayout = new javax.swing.GroupLayout(su);
        su.setLayout(suLayout);
        suLayout.setHorizontalGroup(
            suLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(das3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        suLayout.setVerticalGroup(
            suLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(das3))
        );

        sub.setBackground(new java.awt.Color(173, 136, 198));
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subMousePressed(evt);
            }
        });

        das2.setBackground(new java.awt.Color(153, 153, 153));
        das2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\grade.png")); // NOI18N
        das2.setText("Grades");

        javax.swing.GroupLayout subLayout = new javax.swing.GroupLayout(sub);
        sub.setLayout(subLayout);
        subLayout.setHorizontalGroup(
            subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(das2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        subLayout.setVerticalGroup(
            subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(das2))
        );

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
        acc_name1.setText("User");

        acc_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(210, 210, 210))
                            .addGroup(jLayout.createSequentialGroup()
                                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(su, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(st, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(das, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(acc_name1)))
                                .addGap(204, 204, 204)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_name1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(das, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
        );

        jPanel7.setBackground(new java.awt.Color(173, 136, 198));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        desh.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout deshLayout = new javax.swing.GroupLayout(desh);
        desh.setLayout(deshLayout);
        deshLayout.setHorizontalGroup(
            deshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        deshLayout.setVerticalGroup(
            deshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                    .addComponent(desh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(j, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(desh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
          Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void stMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stMousePressed
      das.setBackground (DefaultColor);
        st.setBackground (ClickedColor);
        su.setBackground (DefaultColor);
        sub.setBackground (DefaultColor);
      
              
    }//GEN-LAST:event_stMousePressed

    private void stMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stMouseClicked

    }//GEN-LAST:event_stMouseClicked

    private void dasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasMousePressed
        das.setBackground (ClickedColor);
        st.setBackground (DefaultColor);
        su.setBackground (DefaultColor);
        sub.setBackground (DefaultColor);
       
    }//GEN-LAST:event_dasMousePressed

    private void dasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasMouseClicked
        userDash dpg = new userDash();
        desh.add(dpg).setVisible(true);
    }//GEN-LAST:event_dasMouseClicked

    private void suMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMousePressed

        das.setBackground (DefaultColor);
        st.setBackground (DefaultColor);
        su.setBackground (ClickedColor);
        sub.setBackground (DefaultColor);
      
    }//GEN-LAST:event_suMousePressed

    private void suMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseClicked

    }//GEN-LAST:event_suMouseClicked

    private void subMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMousePressed

        das.setBackground (DefaultColor);
        st.setBackground (DefaultColor);
        su.setBackground (DefaultColor);
        sub.setBackground (ClickedColor);
        
    }//GEN-LAST:event_subMousePressed

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked

    }//GEN-LAST:event_subMouseClicked

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
         acc_user.setText(""+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel acc_user;
    private javax.swing.JPanel das;
    private javax.swing.JLabel das1;
    private javax.swing.JLabel das2;
    private javax.swing.JLabel das3;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel desh;
    private javax.swing.JPanel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel st;
    private javax.swing.JPanel su;
    private javax.swing.JPanel sub;
    // End of variables declaration//GEN-END:variables
}
