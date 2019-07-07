package HotelProjectFinalComplict;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SARK
 */
public class CheckInCustomar extends javax.swing.JFrame {

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

    String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, s, t;

    /**
     * Creates new form NewJFrame
     */
    public CheckInCustomar() {
        initComponents();
        
        onLoad();
        displayIntable();
//getContentPane().setBackground(Color.CYAN);
getContentPane().setBackground(new java.awt.Color(204, 204, 255));
    }


    private void onLoad() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            Statement ste = con.createStatement();
            List plist = new ArrayList();
            String query = "select roomNum from roomnumber where available = 1";
            ResultSet rs = ste.executeQuery(query);
            while (rs.next()) {
                plist.add(rs.getString("roomNum"));

            }
           jroomNum.setModel(new javax.swing.DefaultComboBoxModel(plist.toArray()));
            jroomNum.insertItemAt("Select Room", 0);
           jroomNum.setSelectedIndex(0);
//       

        } catch (Exception e) {
        }

    }

//    private void room() {
//        try {
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
//            Statement stmt = con.createStatement();
//            String query = "select roomNum from roomnumber where available = 0";
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                jroomNum.addItem(rs.getString("roomNum"));
//            }
//        } catch (Exception e) {
//        }
//
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField13 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jpc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        je = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jtxtFirstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateOfBirth = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jRoomExt = new javax.swing.JComboBox();
        jText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSubTotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jbtnTotalCost = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCustomarMobile = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jtxtCustomerId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jNationality = new com.toedter.components.JLocaleChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCheckinDate = new com.toedter.calendar.JDateChooser();
        jCheckOutDate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jroomNum = new javax.swing.JComboBox();
        jRoomType = new javax.swing.JComboBox();
        jIdType = new javax.swing.JComboBox();
        jGender = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jMeal = new javax.swing.JComboBox();
        jsave = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Check In Date");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Check Out Date :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Room Type:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Room No.  :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Room Ext. No :");

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Address 2 :");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jpc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Post Code :");

        je.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Email :");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1206, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        jtxtFirstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Firstname :");

        jDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Date of Birth");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Room Ext No. :");

        jRoomExt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "010", "020", "030", "040", "050", "060", "070", "080", "090", "100" }));

        jText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Tax :");

        jSubTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("SubTotal :");

        jTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Total");

        jbtnTotalCost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnTotalCost.setText("Total Cost");
        jbtnTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTotalCostActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customar Information");
        setBackground(new java.awt.Color(204, 204, 255));
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Customar_Id");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Address  :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Customar Mobile:");

        jCustomarMobile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCustomarMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustomarMobileActionPerformed(evt);
            }
        });

        jtxtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAddressActionPerformed(evt);
            }
        });

        jName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });

        jtxtCustomerId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCustomerIdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Nationality");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("ID Type");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Gender");

        jNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arabic (United Arab Emirates)", "Arabic (Jordan)", "Arabic (Syria)", "Croatian (Croatia)", "French (Belgium)", "Spanish (Panama)", "Maltese (Malta)", "Spanish (Venezuela)", "Chinese (Taiwan)", "Danish (Denmark)", "Spanish (Puerto Rico)", "Vietnamese (Vietnam)", "English (United States)", "Serbian (Montenegro)", "Swedish (Sweden)", "Spanish (Bolivia)", "English (Singapore)", "Arabic (Bahrain)", "Arabic (Saudi Arabia)", "Arabic (Yemen)", "Hindi (India)", "English (Malta)", "Finnish (Finland)", "Serbian (Latin,Bosnia and Herzegovina)", "Ukrainian (Ukraine)", "French (Switzerland)", "Spanish (Argentina)", "Arabic (Egypt)", "Japanese (Japan,JP)", "Spanish (El Salvador)", "Portuguese (Brazil)", "Icelandic (Iceland)", "Czech (Czech Republic)", "Polish (Poland)", "Catalan (Spain)", "Serbian (Serbia and Montenegro)", "Malay (Malaysia)", "Spanish (Spain)", "Spanish (Colombia)", "Bulgarian (Bulgaria)", "Serbian (Bosnia and Herzegovina)", "Spanish (Paraguay)", "Spanish (Ecuador)", "Spanish (United States)", "Arabic (Sudan)", "Romanian (Romania)", "English (Philippines)", "Arabic (Tunisia)", "Serbian (Latin,Montenegro)", "Spanish (Guatemala)", "Korean (South Korea)", "Greek (Cyprus)", "Spanish (Mexico)", "Russian (Russia)", "Spanish (Honduras)", "Chinese (Hong Kong)", "Norwegian (Norway,Nynorsk)", "Hungarian (Hungary)", "Thai (Thailand)", "Arabic (Iraq)", "Spanish (Chile)", "Arabic (Morocco)", "Irish (Ireland)", "Turkish (Turkey)", "Estonian (Estonia)", "Arabic (Qatar)", "Portuguese (Portugal)", "French (Luxembourg)", "Arabic (Oman)", "Albanian (Albania)", "Spanish (Dominican Republic)", "Spanish (Cuba)", "English (New Zealand)", "Serbian (Serbia)", "German (Switzerland)", "Spanish (Uruguay)", "Greek (Greece)", "Hebrew (Israel)", "English (South Africa)", "Thai (Thailand,TH)", "French (France)", "German (Austria)", "Norwegian (Norway)", "English (Australia)", "Dutch (Netherlands)", "French (Canada)", "Latvian (Latvia)", "German (Luxembourg)", "Spanish (Costa Rica)", "Arabic (Kuwait)", "Arabic (Libya)", "Italian (Switzerland)", "German (Germany)", "Arabic (Algeria)", "Slovak (Slovakia)", "Lithuanian (Lithuania)", "Italian (Italy)", "English (Ireland)", "Chinese (Singapore)", "English (Canada)", "Dutch (Belgium)", "Chinese (China)", "Japanese (Japan)", "German (Greece)", "Serbian (Latin,Serbia)", "English (India)", "Arabic (Lebanon)", "Spanish (Nicaragua)", "Macedonian (Macedonia)", "Belarusian (Belarus)", "Slovenian (Slovenia)", "Spanish (Peru)", "Indonesian (Indonesia)", "English (United Kingdom)", "Bangali (Bangladesh)" }));
        jNationality.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNationalityActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Check In Date :");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Check Out Date :");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Room Type :");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Room No. :");

        jCheckinDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jCheckOutDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(51, 51, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customar_Id", "Name", "Address ", "Customar Mobil", "Nationality", "ID Type", "Gender", "Check In Date", "Check Out Date", "Meal", "Room Type", "Room No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jroomNum.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jroomNum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jroomNumItemStateChanged(evt);
            }
        });
        jroomNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jroomNumActionPerformed(evt);
            }
        });

        jRoomType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double", "Family", " " }));
        jRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoomTypeActionPerformed(evt);
            }
        });

        jIdType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jIdType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Driving Lic", "Passport", "Pilot Lic", "Student Id." }));
        jIdType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdTypeActionPerformed(evt);
            }
        });

        jGender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Meal");

        jMeal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMeal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", " " }));
        jMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMealActionPerformed(evt);
            }
        });

        jsave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jsave.setText("Back");
        jsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaveActionPerformed(evt);
            }
        });

        jbtnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbtnUpdateItemStateChanged(evt);
            }
        });
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnDelete.setText("Display");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIdType, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCustomarMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jroomNum, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRoomType, javax.swing.GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE)
                                .addComponent(jMeal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50)
                        .addComponent(jbtnUpdate)
                        .addGap(42, 42, 42)
                        .addComponent(jbtnDelete)
                        .addGap(41, 41, 41)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jsave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCustomarMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jIdType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jCheckinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jroomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jbtnUpdate)
                    .addComponent(jbtnDelete)
                    .addComponent(jbtnReset)
                    .addComponent(jbtnExit)
                    .addComponent(jsave))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed

        displayIntable();


    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hotel Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed


        update();

    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        jtxtCustomerId.setText(null);
        // jtxtFirstname.setText(null);
        jName.setText(null);
        jtxtAddress.setText(null);
        // jpc.setText(null);
        jCustomarMobile.setText(null);
        //je.setText(null);
        jNationality.setSelectedIndex(0);
        jDateOfBirth.setDate(null);
        jIdType.setSelectedIndex(0);
        jGender.setSelectedIndex(0);
        jCheckinDate.setDate(null);
        jCheckOutDate.setDate(null);
        jMeal.setSelectedIndex(0);
        jRoomType.setSelectedIndex(0);
        jroomNum.setSelectedIndex(0);
        // jRoomExt.setSelectedIndex(0);
//        jText.setText(null);
//        jSubTotal.setText(null);
//        jTotal.setText(null);
//        // allRecord();

    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTotalCostActionPerformed

     

    }//GEN-LAST:event_jbtnTotalCostActionPerformed

    private void jsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaveActionPerformed
      HotelManageMent select = new HotelManageMent();
        select.setVisible(true);
        dispose();



    }//GEN-LAST:event_jsaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        allForm();
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void allForm() {

        Date date;
        date = jCheckinDate.getDate();

        Date date1;
        date1 = jCheckOutDate.getDate();
        if (jtxtCustomerId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Customar ID ");
            jtxtCustomerId.requestFocus();

        } else if (jName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Customar Name ");
            jName.requestFocus();

        } else if (jtxtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Customar Address ");
            jtxtAddress.requestFocus();

        } else if (jNationality.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Customar Nationality ");
            jNationality.requestFocus();

        } else if (jIdType.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Customar ID Type ");
            jIdType.requestFocus();

        } else if (date == null) {
            JOptionPane.showMessageDialog(null, "Choose Check-in Date", "Error", JOptionPane.ERROR_MESSAGE);
            jCheckinDate.grabFocus();
        } else if (date1 == null) {
            JOptionPane.showMessageDialog(null, "Choose Check-out Date", "Error", JOptionPane.ERROR_MESSAGE);
            jCheckOutDate.grabFocus();

        } else {
            allRecord();
           // roomNumber();
            onLoad();
        }

    }


    private void jtxtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCustomerIdActionPerformed
        jName.requestFocus();
    }//GEN-LAST:event_jtxtCustomerIdActionPerformed

    private void jroomNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jroomNumActionPerformed
//allForm();
    }//GEN-LAST:event_jroomNumActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int index = jTable.getSelectedRow();
        jtxtCustomerId.setText(model.getValueAt(index, 0).toString());
        // jtxtFirstname.setText(null);
        jName.setText(model.getValueAt(index, 1).toString());
        jtxtAddress.setText(model.getValueAt(index, 2).toString());
        // jpc.setText(null);
        jCustomarMobile.setText(model.getValueAt(index, 3).toString());
        //je.setText(null);
        jNationality.setSelectedItem(model.getValueAt(index, 4).toString());

        jIdType.setSelectedItem(model.getValueAt(index, 5).toString());
        jGender.setSelectedItem(model.getValueAt(index, 6).toString());
        try {
            jCheckinDate.setDate(date.parse(model.getValueAt(index, 7).toString()));
        } catch (ParseException ex) {
           
        }
        try {
            jCheckOutDate.setDate(date.parse(model.getValueAt(index, 8).toString()));
        } catch (ParseException ex) {
           
        }

        // jCheckOutDate.setDate(null);
        jMeal.setSelectedItem(model.getValueAt(index, 9).toString());
        jRoomType.setSelectedItem(model.getValueAt(index, 10).toString());
        jroomNum.setSelectedItem(model.getValueAt(index, 11).toString());
    }//GEN-LAST:event_jTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        allShow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnUpdateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbtnUpdateItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnUpdateItemStateChanged

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        jtxtAddress.requestFocus();
    }//GEN-LAST:event_jNameActionPerformed

    private void jtxtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAddressActionPerformed
        jCustomarMobile.requestFocus();
    }//GEN-LAST:event_jtxtAddressActionPerformed

    private void jCustomarMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustomarMobileActionPerformed
        jNationality.requestFocus();
    }//GEN-LAST:event_jCustomarMobileActionPerformed

    private void jNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNationalityActionPerformed
        jIdType.requestFocus();
    }//GEN-LAST:event_jNationalityActionPerformed

    private void jIdTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdTypeActionPerformed
        jGender.requestFocus();
    }//GEN-LAST:event_jIdTypeActionPerformed

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        jMeal.requestFocus();
    }//GEN-LAST:event_jGenderActionPerformed

    private void jMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMealActionPerformed
        jRoomType.requestFocus();
    }//GEN-LAST:event_jMealActionPerformed

    private void jRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRoomTypeActionPerformed
        jroomNum.requestFocus();
    }//GEN-LAST:event_jRoomTypeActionPerformed

    private void jroomNumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jroomNumItemStateChanged
     
    }//GEN-LAST:event_jroomNumItemStateChanged
    private void allShow() {
        a = jtxtCustomerId.getText();
        int id = Integer.parseInt(a);

        // String roomNumber = jroomNum.getSelectedItem().toString();
        // String id = jtxtCustomerId.getText();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            //Create the Statement object
            stmt = con.createStatement();

            //Execute the query
            rs = stmt.executeQuery("select  name, address,c_m, nation,id_t,gender,c_i_d ,c_o_d,meal,room_T,room_n from hotelm where c_id= '" + id + "' ");
            int count = 0;
            while (rs.next()) {
                //  jtxtCustomerId.setText(rs.getString("c_id"));
                jName.setText(rs.getString("name"));
                jtxtAddress.setText(rs.getString("address"));
                jCustomarMobile.setText(rs.getString("c_m"));
                jNationality.setSelectedItem(rs.getString("nation"));
                jIdType.setSelectedItem(rs.getString("id_t"));
                jGender.setSelectedItem(rs.getString("gender"));

                jCheckinDate.setDate(rs.getDate("c_i_d"));
                jCheckOutDate.setDate(rs.getDate("c_o_d"));
                jMeal.setSelectedItem(rs.getString("meal"));
                jRoomType.setSelectedItem(rs.getString("room_T"));
                jroomNum.setSelectedItem(rs.getString("room_n"));

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

    private void allRecord() {
        SimpleDateFormat datf = new SimpleDateFormat("yyyy-MM-dd");
        a = jtxtCustomerId.getText();
        int id = Integer.parseInt(a);
        b = jName.getText();
        c = jtxtAddress.getText();
        d = jCustomarMobile.getText();
        e = jNationality.getSelectedItem().toString();
        // f = datf.format(jDateOfBirth.getDate());
        g = jIdType.getSelectedItem().toString();
        h = jGender.getSelectedItem().toString();
        i = datf.format(jCheckinDate.getDate());

        j = datf.format(jCheckOutDate.getDate());
        if (j.compareTo(i) < 0) {
            JOptionPane.showMessageDialog(this, "select correct Check-Out-Date ");
            jCheckOutDate.requestFocus();
        }
        k = jMeal.getSelectedItem().toString();
        l = jRoomType.getSelectedItem().toString();
        m = jroomNum.getSelectedItem().toString();
//        if(!"Value".equals(jroomNum.getSelectedItem())){
//            
//        }

        Connection con = null;
        Statement stmt = null;

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");

            stmt = con.createStatement();
            int count = 0;
            //Execute the query
            count = stmt.executeUpdate("insert into hotelm(c_id,name,address,c_m,nation,id_t,gender,c_i_d,c_o_d,meal,room_T,room_n) values('" + id + "','" + b + "','" + c + "','" + d + "','" + e + "','" + g + "','" + h + "','" + i + "','" + j + "','" + k + "','" + l + "','" + m + "')");
            stmt.executeUpdate("update roomnumber set available='0' where roomNum='" + m + "' ");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "inserted successfully");
                //roomNumber();
                onLoad();
            } else {
                JOptionPane.showMessageDialog(this, "insertion failed", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Customar ID Exist");
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInCustomar ().setVisible(true);
            }
        });
    }

    private void displayIntable() {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            String sql = "select * from hotelm";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) jTable.getModel();
            tm.setRowCount(0);
            //c_id, name,address,c_m,nation,id_t,gender,c_i_d,c_o_d,meal,room_T,room_n
            while (rs.next()) {
                Object o[] = {rs.getInt("c_id"), rs.getString("name"), rs.getString("address"), rs.getString("c_m"), rs.getString("nation"), rs.getString("id_t"), rs.getString("gender"), rs.getString("c_i_d"), rs.getString("c_o_d"), rs.getString("meal"), rs.getString("room_T"), rs.getString("room_n")};
                tm.addRow(o);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    private void update() {

        a = jtxtCustomerId.getText();
        int id = Integer.parseInt(a);
        b = jName.getText();
        c = jtxtAddress.getText();
        d = jCustomarMobile.getText();
        e = jNationality.getSelectedItem().toString();
        // f = datf.format(jDateOfBirth.getDate());
        g = jIdType.getSelectedItem().toString();
        h = jGender.getSelectedItem().toString();
        SimpleDateFormat datf = new SimpleDateFormat("yyyy-MM-dd");

        i = datf.format(jCheckinDate.getDate());

        j = datf.format(jCheckOutDate.getDate());
//        if (j.compareTo(h) < 0) {
//            JOptionPane.showMessageDialog(this, "select correct Check-Out-Date ");
//            jCheckOutDate.requestFocus();
        // }
        k = jMeal.getSelectedItem().toString();
        l = jRoomType.getSelectedItem().toString();
        m = jroomNum.getSelectedItem().toString();
//        if(!"Value".equals(jroomNum.getSelectedItem())){
//            
//        }

        Connection con = null;
        Statement stmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            //Create the Statement object
            stmt = con.createStatement();
            int count = 0;
            //Execute the query
            count = stmt.executeUpdate("update hotelm set    name='" + b + "', address='" + c + "',c_m='" + d + "',nation='" + e + "',id_t='" + g + "',gender='" + h + "',c_i_d='" + i + "',c_o_d='" + j + "',meal='" + k + "',room_T='" + l + "',room_n='" + m + "'where c_id='" + id + "' ");
            if (count > 0) {
//                System.out.println("inserted successfully");
                JOptionPane.showMessageDialog(this, "Updated successfully");
                clear();
            } else {
//                System.out.println("insertion failed");
                JOptionPane.showMessageDialog(this, "Update failed", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void clear() {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        jtxtCustomerId.setText(null);
        // jtxtFirstname.setText(null);
        jName.setText(null);
        jtxtAddress.setText(null);
        // jpc.setText(null);
        jCustomarMobile.setText(null);
        //je.setText(null);
        jNationality.setSelectedIndex(0);
        // jDateOfBirth.setDate(null);
        jIdType.setSelectedIndex(0);
        jGender.setSelectedIndex(0);
        jCheckinDate.setDate(null);
        jCheckOutDate.setDate(null);
        jMeal.setSelectedIndex(0);
        jRoomType.setSelectedIndex(0);
        jroomNum.setSelectedIndex(0);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jCheckOutDate;
    private com.toedter.calendar.JDateChooser jCheckinDate;
    private javax.swing.JTextField jCustomarMobile;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateOfBirth;
    private javax.swing.JComboBox jGender;
    private javax.swing.JComboBox jIdType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox jMeal;
    private javax.swing.JTextField jName;
    private com.toedter.components.JLocaleChooser jNationality;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox jRoomExt;
    private javax.swing.JComboBox jRoomType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSubTotal;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jText;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTotal;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTotalCost;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField je;
    private javax.swing.JTextField jpc;
    private javax.swing.JComboBox jroomNum;
    private javax.swing.JButton jsave;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtCustomerId;
    private javax.swing.JTextField jtxtFirstname;
    // End of variables declaration//GEN-END:variables
}
