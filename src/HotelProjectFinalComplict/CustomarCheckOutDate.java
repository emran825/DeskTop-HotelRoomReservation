/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelProjectFinalComplict;

import ComplictHotel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author emran
 */
public class CustomarCheckOutDate extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form cout
     */
    public CustomarCheckOutDate() {
        initComponents();
        showTime();

        Date d = new Date();
        SimpleDateFormat si = new SimpleDateFormat("dd-MM-yyyy");
        jd.setText(si.format(d));

        model = new DefaultTableModel();
        jTable.setModel(model);
        model.addColumn("c_id");
        model.addColumn("name");
        model.addColumn("address");
        model.addColumn("c_m");
        model.addColumn("nation");
        model.addColumn("id_t");
        model.addColumn("gender");
        model.addColumn("c_i_d");
        model.addColumn("c_o_d");
        model.addColumn("meal");
        model.addColumn("room_T");
        model.addColumn("room_n");

    }
    //============================================================================

    void showTime() {

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat si = new SimpleDateFormat("hh:mm:ss a");
                jTime.setText(si.format(d));
            }
        }).start();

    }
    //==============================================================================

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();
        jDateC = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnCout = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 4));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Customar Check Out");

        jd.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jd.setText("                            ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Date :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Time :");

        jTime.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTime.setText("                    ");

        jDateC.setForeground(new java.awt.Color(205, 205, 0));
        jDateC.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Select Date");

        jButton3.setBackground(new java.awt.Color(205, 205, 240));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(205, 0, 240));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jd)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jTime)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(57, 57, 57)
                        .addComponent(jDateC, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTime))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton3)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jTable.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(102, 0, 102));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customar Id", "Name", "Address", "Customar Mobile", "Nationality", "ID Type", "Gender", "Check In Date", "Check Out Date", "Meal", "Room Type", "Room Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnCout.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCout.setText("Check out");
        btnCout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoutActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnCout)
                .addGap(148, 148, 148)
                .addComponent(jButton2)
                .addGap(136, 136, 136)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnCout)
                    .addComponent(jButton4))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    public void findInTable() {
        SimpleDateFormat datf = new SimpleDateFormat("yyyy-MM-dd");
        String date = datf.format(jDateC.getDate());
        if (jTable.getRowCount() > 0) {
            for (int i = jTable.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            //Create the Statement object
            stmt = con.createStatement();

            //Execute the query
            // rs = stmt.executeQuery("select * from hotelm where c_o_d='"+jCheckOut.getDate().toString()+"'");
            rs = stmt.executeQuery("select * from hotelm where c_o_d='" + date + "'");
            int count = 0;
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("c_id"), rs.getString("name"), rs.getString("address"), rs.getString("c_m"), rs.getString("nation"), rs.getString("id_t"), rs.getString("gender"), rs.getString("c_i_d"), rs.getString("c_o_d"), rs.getString("meal"), rs.getString("room_T"), rs.getString("room_n")});

                count++;
            }
            if (count == 0) {
                JOptionPane.showMessageDialog(rootPane, "There is no such record");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //Close the connection and statement object
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        displayInTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoutActionPerformed
        // TODO add your handling code here:
        TableModel tbm = jTable.getModel();
        int index = tbm.getRowCount();
        if(index==0){
            JOptionPane.showMessageDialog(rootPane, "select a row");
        }else{
        int selectedrow = jTable.getSelectedRow();
        int room2cout = Integer.parseInt((jTable.getValueAt(selectedrow, 11).toString()));
        ///////////////////////////////

        Connection con = null;
        Statement stmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");

            stmt = con.createStatement();
            int count = 0;
            String query = "update roomnumber set available='1' where roomNum='" + room2cout + "' ";
            count = stmt.executeUpdate(query);

            // delete the row
            stmt.executeUpdate("delete from hotelm where room_n='" + room2cout + "' ");
            displayInTable();
//             if (count > 0) {
////                System.out.println("inserted successfully");
//                JOptionPane.showMessageDialog(this, "Deleted successfully");
//                clear();
//            } else {
////                System.out.println("insertion failed");
//                JOptionPane.showMessageDialog(this, "Delete failed", "Error", JOptionPane.ERROR_MESSAGE);
//            }

        } catch (Exception e) {
        }
        }
        ////////////////////////////////
    }//GEN-LAST:event_btnCoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Date date;
        date = jDateC.getDate();

        if (date == null) {
            JOptionPane.showMessageDialog(null, "Please Select Check Out Date", "Error", JOptionPane.ERROR_MESSAGE);
            jDateC.grabFocus();
        } else {
            findInTable();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        HotelManageMent select = new HotelManageMent();
        select.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
//        TableModel tb = jTable.getModel();
//        int index = tb.getRowCount();
//        if(index==0){
//        
//        }else{
//            int selectedrow = jTable.getSelectedRow();
//        int room2cout = Integer.parseInt((jTable.getValueAt(selectedrow, 11).toString()));
//        ///////////////////////////////
//
//        Connection con = null;
//        Statement stmt = null;
//
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
//
//            stmt = con.createStatement();
//            int count = 0;
//            String query = "update roomnumber set available='1' where roomNum='" + room2cout + "' ";
//            count = stmt.executeUpdate(query);
//
//            // delete the row
//            stmt.executeUpdate("delete from hotelm where room_n='" + room2cout + "' ");
//            displayInTable();
////             if (count > 0) {
//////                System.out.println("inserted successfully");
////                JOptionPane.showMessageDialog(this, "Deleted successfully");
////                clear();
////            } else {
//////                System.out.println("insertion failed");
////                JOptionPane.showMessageDialog(this, "Delete failed", "Error", JOptionPane.ERROR_MESSAGE);
////            }
//
//        } catch (Exception e) {
//        }
//        }
    }//GEN-LAST:event_jTableMouseClicked

    public void displayInTable() {
        if (jTable.getRowCount() > 0) {
            for (int i = jTable.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            //Create the Statement object
            stmt = con.createStatement();

            //Execute the query
            rs = stmt.executeQuery("select * from hotelm ");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("c_id"), rs.getString("name"), rs.getString("address"), rs.getString("c_m"), rs.getString("nation"), rs.getString("id_t"), rs.getString("gender"), rs.getString("c_i_d"), rs.getString("c_o_d"), rs.getString("meal"), rs.getString("room_T"), rs.getString("room_n")});

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //Close the connection and statement object
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
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

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomarCheckOutDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jTime;
    private javax.swing.JLabel jd;
    // End of variables declaration//GEN-END:variables
}
