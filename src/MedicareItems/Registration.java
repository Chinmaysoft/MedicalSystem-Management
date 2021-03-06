/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicareItems;

import java.sql.*;
import javax.swing.JOptionPane;
import ConnectionPack.SQLConnection;
import java.awt.event.KeyEvent;

/**
 *
 * @author Admin
 */
public class Registration extends javax.swing.JFrame {
    PreparedStatement pst=null;
    
    /**
     * Creates new form Registration
     */
    public Registration() {
         this.setResizable(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        adder = new javax.swing.JTextField();
        phno = new javax.swing.JTextField();
        medi = new javax.swing.JTextField();
        Signin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setBackground(new java.awt.Color(204, 153, 0));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor-5216835_640.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 460));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Provide Following Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("UserName ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 36, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Email Id");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 96, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Phone No");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 227, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Medical Name ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 289, -1, -1));

        user.setBackground(new java.awt.Color(153, 255, 255));
        user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 33, 184, 31));

        email.setBackground(new java.awt.Color(153, 255, 255));
        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 87, 184, 31));

        adder.setBackground(new java.awt.Color(153, 255, 255));
        adder.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        adder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adderKeyPressed(evt);
            }
        });
        jPanel2.add(adder, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 151, 184, 31));

        phno.setBackground(new java.awt.Color(153, 255, 255));
        phno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phnoKeyPressed(evt);
            }
        });
        jPanel2.add(phno, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 218, 184, 31));

        medi.setBackground(new java.awt.Color(153, 255, 255));
        medi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        medi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mediKeyPressed(evt);
            }
        });
        jPanel2.add(medi, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 280, 184, 31));

        Signin.setBackground(new java.awt.Color(255, 255, 51));
        Signin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Office.png"))); // NOI18N
        Signin.setText("Sign In");
        Signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninActionPerformed(evt);
            }
        });
        jPanel2.add(Signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 262, 45));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        pwd.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninActionPerformed
      if(user.getText().equals("")||email.getText().equals("")||adder.getText().equals("")||phno.getText().equals("")||medi.getText().equals("")||pwd.getText().equals("") )
      { 
          JOptionPane.showMessageDialog(this,"Please Enter All Data !");
          user.grabFocus();
      }else{
       String sql="insert into Registration(UserName,Email,Addre,Phone_Number,Medical_Name,UPassword) values(?,?,?,?,?,?)";
          try(Connection cn=SQLConnection.ConnectDB();){
              pst=cn.prepareStatement(sql);
              pst.setString(1, user.getText());
              pst.setString(2,email.getText());
              pst.setString(3, adder.getText());
              pst.setString(4, phno.getText());
              pst.setString(5, medi.getText());
              pst.setString(6, pwd.getText());
              int r=pst.executeUpdate();
              if(r>0){
                  JOptionPane.showMessageDialog(this, "Record Save Successfully...");
                    SignUP sp=new SignUP();
                    sp.setVisible(true);
                    this.setVisible(false);
              }else{
              JOptionPane.showMessageDialog(this, "Error While Saving Data");
              }
          } catch (Exception e) {
              e.printStackTrace();
          }
      
       
      } 
        
        
       
    }//GEN-LAST:event_SigninActionPerformed

    private void adderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adderKeyPressed
       char c=evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)){
            adder.setEditable(true);
        }else{
            adder.setEditable(false);
        }
    }//GEN-LAST:event_adderKeyPressed

    private void mediKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mediKeyPressed
       char c=evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)){
            medi.setEditable(true);
        }else{
            medi.setEditable(false);
        }
    }//GEN-LAST:event_mediKeyPressed

    private void phnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnoKeyPressed
       String ephno=phno.getText();
        int len = ephno.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
          if(len<10){
             phno.setEditable(true);
          }else{
              phno.setEditable(false);
          }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                phno.setEditable(true);
            }else{
               phno.setEditable(false);    
            }
        }
    }//GEN-LAST:event_phnoKeyPressed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signin;
    private javax.swing.JTextField adder;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField medi;
    private javax.swing.JTextField phno;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
