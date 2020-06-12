/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicareItems;

import ConnectionPack.SQLConnection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class Medicine extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form Medicine
     */
    public Medicine() {
        this.setResizable(false);
        initComponents();
        MedicineData();
    }
//    Display all the data into JTable
 public void MedicineData(){
            try(Connection con=SQLConnection.ConnectDB();){ 
            String sql="select Product_id,Product_Name,Company_Name,Mfg_Date,Exp_Date,Price,Quantity from products where Status='Medicine'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            Medicine_Table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception ex){
            ex.printStackTrace();
            }
    }
    
   public void clearall(){
       pnm.setText("");
       cnm.setText("");
       price.setText("");
       qut.setText("");
    
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
        jLabel1 = new javax.swing.JLabel();
        pnm = new javax.swing.JTextField();
        cnm = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Medicine_Table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        AddData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mfg = new com.toedter.calendar.JDateChooser();
        exp = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        qut = new javax.swing.JTextField();
        updateorg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medicine");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Medicine Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 19, -1, -1));

        pnm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnmActionPerformed(evt);
            }
        });
        pnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnmKeyPressed(evt);
            }
        });
        jPanel1.add(pnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 91, 153, 30));

        cnm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnmKeyPressed(evt);
            }
        });
        jPanel1.add(cnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 148, 153, 30));

        price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 276, 153, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Price :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Exp Date :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Mfg Date :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Company Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Product Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, -1, -1));

        Medicine_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Medicine_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medicine_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Medicine_Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 80, 749, -1));

        clear.setBackground(new java.awt.Color(204, 255, 102));
        clear.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, 38));

        AddData.setBackground(new java.awt.Color(51, 255, 0));
        AddData.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        AddData.setText("Add");
        AddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDataActionPerformed(evt);
            }
        });
        jPanel1.add(AddData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 38));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3d-home-icon-silver.gif"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 68, 62));

        mfg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(mfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 198, 153, -1));

        exp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 238, 153, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Quantity :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        qut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        qut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qutKeyPressed(evt);
            }
        });
        jPanel1.add(qut, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 324, 153, -1));

        updateorg.setBackground(new java.awt.Color(153, 255, 153));
        updateorg.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        updateorg.setText("Update");
        updateorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateorgActionPerformed(evt);
            }
        });
        jPanel1.add(updateorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        pnm.setText("");
       cnm.setText("");
       price.setText("");
       qut.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Home h=new Home();
       h.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void AddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDataActionPerformed
        if(pnm.getText().equals("")||cnm.getText().equals("")||price.getText().equals("")||qut.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Please Enter All Data !");
          pnm.grabFocus();
        } 
        else{ 
            String sql="Insert into Products(Product_Name,Company_Name,Mfg_Date,Exp_Date,Price,Quantity,Status) values(?,?,?,?,?,?,?)";
        try (Connection cn=SQLConnection.ConnectDB();){
            pst=cn.prepareStatement(sql);
            pst.setString(1, pnm.getText());
            pst.setString(2, cnm.getText());
            pst.setString(3,((JTextField)mfg.getDateEditor().getUiComponent()).getText());
            pst.setString(4, ((JTextField)exp.getDateEditor().getUiComponent()).getText());
            pst.setString(5, price.getText());
            pst.setString(6,qut.getText());
            pst.setString(7, "Medicine");
            int r=pst.executeUpdate();
            if(r>0){
                JOptionPane.showMessageDialog(this, "Data Added in Table...");
            MedicineData();
            clearall();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddDataActionPerformed

    private void Medicine_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medicine_TableMouseClicked
        int i=Medicine_Table.getSelectedRow();
        TableModel m=Medicine_Table.getModel();
        pnm.setText(m.getValueAt(i, 1).toString());
        cnm.setText(m.getValueAt(i, 2).toString());
        ((JTextField)mfg.getDateEditor().getUiComponent()).setText(m.getValueAt(i, 3).toString());
        ((JTextField)exp.getDateEditor().getUiComponent()).setText(m.getValueAt(i, 4).toString());
        price.setText(m.getValueAt(i, 5).toString());
        qut.setText(m.getValueAt(i, 6).toString());
    }//GEN-LAST:event_Medicine_TableMouseClicked

    private void updateorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateorgActionPerformed
        if(pnm.getText().equals("")||cnm.getText().equals("")||price.getText().equals("")||qut.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Please Select The Table Row !");
          pnm.grabFocus();
        } 
        else{
        int i=Medicine_Table.getSelectedRow();
        String m = (Medicine_Table.getModel().getValueAt(i, 0).toString());
        String sql="Update Products set Company_Name=?,Mfg_Date=?,Exp_Date=?,Price=?,Quantity=?where Product_Id="+m;
        try (Connection cn=SQLConnection.ConnectDB();){
            pst=cn.prepareStatement(sql);
            pst.setString(1, cnm.getText());
            pst.setString(2,((JTextField)mfg.getDateEditor().getUiComponent()).getText());
            pst.setString(3, ((JTextField)exp.getDateEditor().getUiComponent()).getText());
            pst.setString(4, price.getText());
            pst.setString(5,qut.getText());
            int r=pst.executeUpdate();
            DefaultTableModel m1=(DefaultTableModel)Medicine_Table.getModel();
            m1.setRowCount(0);
            if(r>0){
                JOptionPane.showMessageDialog(this, "Data Updated in Table...");
                MedicineData();
                clearall();
            }else{
                JOptionPane.showMessageDialog(this, "Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          }  
    }//GEN-LAST:event_updateorgActionPerformed

    private void pnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnmKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)){
            pnm.setEditable(true);
        }else{
            pnm.setEditable(false);
        }
    }//GEN-LAST:event_pnmKeyPressed

    private void cnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnmKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)){
            cnm.setEditable(true);
        }else{
            cnm.setEditable(false);
        }
    }//GEN-LAST:event_cnmKeyPressed

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
        // TODO add your handling code here:
        String ephno=price.getText();
        int len = ephno.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
          if(len<10){
             price.setEditable(true);
          }else{
              price.setEditable(false);
          }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                price.setEditable(true);
            }else{
               price.setEditable(false);    
            }
        }
    }//GEN-LAST:event_priceKeyPressed

    private void qutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qutKeyPressed
        // TODO add your handling code here:
        String ephno=qut.getText();
        int len = ephno.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
          if(len<10){
             qut.setEditable(true);
          }else{
              qut.setEditable(false);
          }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                qut.setEditable(true);
            }else{
               qut.setEditable(false);    
            }
        }
    }//GEN-LAST:event_qutKeyPressed

    private void pnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnmActionPerformed

    
  
  
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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddData;
    private javax.swing.JTable Medicine_Table;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cnm;
    private com.toedter.calendar.JDateChooser exp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser mfg;
    private javax.swing.JTextField pnm;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qut;
    private javax.swing.JButton updateorg;
    // End of variables declaration//GEN-END:variables
}
