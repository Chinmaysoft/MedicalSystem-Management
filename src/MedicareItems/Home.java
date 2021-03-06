/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicareItems;

import java.awt.Toolkit;
import javax.xml.crypto.KeySelector;

/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Medicare = new javax.swing.JLabel();
        Cust = new javax.swing.JButton();
        cosmetic = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        ayurvedic = new javax.swing.JButton();
        medicine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        getContentPane().setLayout(null);

        Medicare.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Medicare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicare.setText("MediCare");
        getContentPane().add(Medicare);
        Medicare.setBounds(480, 40, 480, 60);

        Cust.setBackground(new java.awt.Color(255, 255, 255));
        Cust.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Cust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person.png"))); // NOI18N
        Cust.setText("New Patient");
        Cust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustActionPerformed(evt);
            }
        });
        getContentPane().add(Cust);
        Cust.setBounds(260, 140, 165, 120);

        cosmetic.setBackground(new java.awt.Color(255, 255, 255));
        cosmetic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cosmetic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cosmetic.png"))); // NOI18N
        cosmetic.setText("Cosmetic");
        cosmetic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cosmetic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosmeticActionPerformed(evt);
            }
        });
        getContentPane().add(cosmetic);
        cosmetic.setBounds(780, 140, 150, 120);

        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice-icon.png"))); // NOI18N
        bill.setText("Bill");
        bill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        getContentPane().add(bill);
        bill.setBounds(520, 240, 150, 120);

        ayurvedic.setBackground(new java.awt.Color(255, 255, 255));
        ayurvedic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ayurvedic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayurvedic.png"))); // NOI18N
        ayurvedic.setText("Ayurvedic");
        ayurvedic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayurvedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayurvedicActionPerformed(evt);
            }
        });
        getContentPane().add(ayurvedic);
        ayurvedic.setBounds(780, 380, 150, 120);

        medicine.setBackground(new java.awt.Color(255, 255, 255));
        medicine.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        medicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medicine.png"))); // NOI18N
        medicine.setText("Medicine");
        medicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineActionPerformed(evt);
            }
        });
        getContentPane().add(medicine);
        medicine.setBounds(250, 380, 150, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 660, 40, 40);

        Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medi.png"))); // NOI18N
        Img.setText("jLabel1");
        getContentPane().add(Img);
        Img.setBounds(0, 0, 1410, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustActionPerformed
        Patient pe=new Patient();
        pe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      SignUP s=new SignUP();
       s.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void cosmeticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosmeticActionPerformed
        Cosmetic cos=new Cosmetic();
        cos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cosmeticActionPerformed

    private void ayurvedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayurvedicActionPerformed
        Ayurvedic ad=new Ayurvedic();
        ad.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ayurvedicActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
      Bill b=new Bill();
      b.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_billActionPerformed

    private void medicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineActionPerformed
        Medicine md=new Medicine();
        md.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_medicineActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cust;
    private javax.swing.JLabel Img;
    private javax.swing.JLabel Medicare;
    private javax.swing.JButton ayurvedic;
    private javax.swing.JButton bill;
    private javax.swing.JButton cosmetic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton medicine;
    // End of variables declaration//GEN-END:variables
}
