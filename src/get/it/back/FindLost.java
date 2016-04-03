/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get.it.back;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranjal Paliwal
 */
public class FindLost extends javax.swing.JFrame {

    /**
     * Creates new form FindLost
     */
    public FindLost() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        articleNameTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CategoryCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LocationTf = new javax.swing.JTextField();
        brandTf = new javax.swing.JTextField();
        LostDateTf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultList = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        confirmButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Find a Lost Item");

        jLabel2.setText("Enter Article Name");

        jLabel4.setText("Select Category");

        jLabel5.setText("Enter Brand Name (Optional)");

        CategoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identity Proof", "Watch", "Mobile Phone", "Wallet/Purse", "Bags", "Others" }));

        jLabel6.setText("Enter Lost Date (Optional) DD-MM-YY");

        jLabel7.setText("Location where you lost it");

        LocationTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationTfActionPerformed(evt);
            }
        });

        jButton1.setText("Search for Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ResultList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ResultList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ResultListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ResultList);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Found Results");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("More Details");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        confirmButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        confirmButton.setText("Confirm Item");
        confirmButton.setEnabled(false);

        jButton3.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel10)))
                        .addGap(0, 181, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(articleNameTf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LocationTf)
                                    .addComponent(LostDateTf)
                                    .addComponent(brandTf)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articleNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(LostDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ArticleName = articleNameTf.getText();
        String Category = (String) CategoryCB.getSelectedItem();
        String ArticleBrand = brandTf.getText();
        String Location = LocationTf.getText();
        String LostDate = LostDateTf.getText();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String uid = "root";
            String pwd = "clever";
            String dbURL = "jdbc:mysql://localhost/getitback";
            Connection conn = DriverManager.getConnection(dbURL, uid, pwd);
            Statement statement = conn.createStatement();

            ArticleName = ArticleName.replaceAll("'", "''");
            //Category = Category.replaceAll("'", "''");
            ArticleBrand = ArticleBrand.replaceAll("'", "''");
            String query = "SELECT * from foundItems where ArticleName like '%" + ArticleName + "%' and Category ='" + Category + "'";
            if (!ArticleBrand.equals("")) {
                query = query + "and ArticleBrand like '%" + ArticleBrand + "%'";
            }
            else {
                ArticleBrand = "Not Specified";
            }

            
            System.out.println(query);
            ResultSet rs = statement.executeQuery(query);

            DefaultListModel listModel = new DefaultListModel();
            if (!rs.next()) {
                int response = JOptionPane.showConfirmDialog(this, "Item was not found. Try Another Search?", "Select a Choice", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.NO_OPTION) {
                    int response2 = JOptionPane.showConfirmDialog(this, "Do you want to get notified when item is found?", "Select a Choice", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response2 == JOptionPane.YES_OPTION) {
                        JPanel panel = new JPanel();
                        JLabel details = new JLabel("Edit Details");
                        Font titleFont = new Font("Segoe UI", Font.PLAIN, 24);
                        details.setFont(titleFont);
                        JLabel articleName = new JLabel("Article Name");
                        JTextField articleNameTf = new JTextField();
                        articleNameTf.setText(ArticleName);
                        JLabel articleBrand = new JLabel("Article Brand");
                        JTextField articleBrandTf = new JTextField();
                        articleBrandTf.setText(ArticleBrand);
                        JLabel date = new JLabel("Lost Date");
                        JTextField dateTf = new JTextField();
                        dateTf.setText(LostDate);
                        JLabel LostLocation = new JLabel("Lost Location");
                        JTextField LostLocationTf = new JTextField();
                        LostLocationTf.setText(Location);
                        JLabel Name = new JLabel("Your Name");
                        JTextField NameTf = new JTextField();
                        LostLocationTf.setText(Location);
                        JLabel Number = new JLabel("Your Phone Number");
                        JTextField NumberTf = new JTextField();
                        LostLocationTf.setText(Location);
                        panel.add(details);
                        panel.add(articleName);
                        panel.add(articleNameTf);
                        panel.add(articleBrand);
                        panel.add(articleBrandTf);
                        panel.add(date);
                        panel.add(dateTf);
                        panel.add(LostLocation);
                        panel.add(LostLocationTf);
                        panel.add(Name);
                        panel.add(NameTf);
                        panel.add(Number);
                        panel.add(NumberTf);

                        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                        String[] options = new String[]{"OK", "Cancel"};
                        int option = JOptionPane.showOptionDialog(this, panel, "Edit Deatails",
                                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                null, options, options[1]);

                        String nArticleName = articleNameTf.getText();
                        String nArticleBrand = articleBrandTf.getText();
                        String nDate = dateTf.getText();
                        String nLocation = LostLocationTf.getText();
                        String nName = NameTf.getText();
                        String nNumber = NumberTf.getText();
                        long randID = System.currentTimeMillis();
                        int a = 0;
                        for (int i = 0; i < 5; i++) {
                            a = a*10 + new Random().nextInt(100);
                        }
                        randID/=a;

                        String addQuery = "Insert into LostItems values (" + randID + ",'" + nArticleName + "','" + nArticleBrand + "','" + Category + "','" + nDate + "','" + nLocation + "','" + nName + "'," + nNumber + ")";

                        System.out.println(addQuery);

                        statement.executeUpdate(addQuery);
                        JOptionPane.showMessageDialog(null, "You will be notified if the item is found on your number " + nNumber + " .Note down your ItemId:" + randID);

                    }
                }
            } else {
                String articleName = rs.getString("ArticleName");
                listModel.addElement(articleName);
                while (rs.next()) {
                    articleName = rs.getString("ArticleName");
                    listModel.addElement(articleName);
                }

                ResultList.setModel(listModel);
                ResultList.setEnabled(true);

                rs.close();
                statement.close();
                conn.close();
                
            }
            confirmButton.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(FindLost.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FindLost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LocationTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationTfActionPerformed

    private void ResultListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ResultListValueChanged
        // TODO add your handling code here:
        
        String ArticleName = ResultList.getSelectedValue();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String uid = "root";
            String pwd = "clever";
            String dbURL = "jdbc:mysql://localhost/getitback";
            Connection conn = DriverManager.getConnection(dbURL, uid, pwd);
            Statement statement = conn.createStatement();

            String query = "Select * from foundItems where ArticleName like '%"+ArticleName+"%'";
            
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            String articleName = rs.getString("ArticleName");
            String articleBrand = rs.getString("ArticleBrand");
            String category = rs.getString("Category");
            String FoundDate = rs.getString("FoundDate");
            String FoundLocation = rs.getString("FoundLocation");
            String PersonToContact = rs.getString("PersonToContact");
            String ContactNumber = rs.getString("ContactNumber");
            
            jTextArea1.setText("");
            
            jTextArea1.append("Name: " + articleName+ "\n");
            jTextArea1.append("Article Brand: "+articleBrand + "\n");
            jTextArea1.append("Category:" + category + "\n");
            jTextArea1.append("Found Date: "+FoundDate +"\n");
            jTextArea1.append("Found Location: "+FoundLocation+"\n");
            
            confirmButton.setEnabled(true);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportFound.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReportFound.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ResultListValueChanged

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
            java.util.logging.Logger.getLogger(FindLost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindLost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindLost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindLost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindLost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoryCB;
    private javax.swing.JTextField LocationTf;
    private javax.swing.JTextField LostDateTf;
    private javax.swing.JList<String> ResultList;
    private javax.swing.JTextField articleNameTf;
    private javax.swing.JTextField brandTf;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
