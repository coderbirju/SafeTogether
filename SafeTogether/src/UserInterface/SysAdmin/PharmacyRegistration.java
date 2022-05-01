/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

import Business.EcoSystem;
import Business.BloodBank.BloodWork;
import Business.BloodBank.BloodWorkDirectory;
import Business.PandemicCenter.PandemicCenter;
import Business.PandemicCenter.PandemicCenter_Dir;
import Business.Pharma.Pharma;
import Business.Pharma.PharmaDirectory;
import Utility.MapCoordinates;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikrishnajoisa
 */
public class PharmacyRegistration extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyRegistration
     */
     EcoSystem system;
    JPanel rightSidePanel;
    ArrayList<String> locations = new ArrayList<String>();
    ArrayList<String> pharmacies = new ArrayList<String>();
    int locationCount = 0;
    int pharmaciesCount = 0;
    MapCoordinates locationPoint;
    
 
    public PharmacyRegistration(EcoSystem system, JPanel rightSidePanel,MapCoordinates locationPoint) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.locationPoint = locationPoint;
        this.setSize(1160, 750);
        displayTable();
        populateDashBoard();

    }
    
    private void populateDashBoard() {
        // Print the count of the location
        // Converting it to hash set
        HashSet<String> uniqueLocations = new HashSet<String>(locations);
        HashSet<String> uniquePharma = new HashSet<String>(pharmacies);
        
        // get the count of hash sets
        locationCount = uniqueLocations.size();
        pharmaciesCount = uniqueLocations.size();
        
        locationLabel.setText(Integer.toString(locationCount));
        jLabel3.setText(Integer.toString(pharmaciesCount));
        
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
        jPanel2 = new javax.swing.JPanel();
        locationLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userNameTextField4 = new javax.swing.JTextField();
        userNameTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userNameTextField7 = new javax.swing.JTextField();
        locationInputField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pharmaLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        locationLabel.setFont(new java.awt.Font("SF Pro Display", 1, 64)); // NOI18N
        locationLabel.setText("75");
        jPanel2.add(locationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, 90));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        jLabel6.setText("Locations");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(152, 151, 151));
        jLabel13.setText("Total number of location that are");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 151, 151));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel19.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(152, 151, 151));
        jLabel19.setText("are available in our database");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 220));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 370));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 580, 370));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(10, 132, 255));
        jButton1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, 39));

        jButton2.setBackground(new java.awt.Color(94, 92, 230));
        jButton2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 140, 39));

        jButton3.setBackground(new java.awt.Color(255, 55, 95));
        jButton3.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 140, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        userNameTextField4.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 40));

        userNameTextField5.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 420, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        userNameTextField6.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Phone Number");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        userNameTextField7.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, 40));

        locationInputField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(locationInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Location");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        jButton4.setBackground(new java.awt.Color(255, 55, 95));
        jButton4.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 150, 39));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 64)); // NOI18N
        jLabel3.setText("11");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, 90));

        pharmaLabel.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        pharmaLabel.setText("Pharmacies");
        jPanel8.add(pharmaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(152, 151, 151));
        jLabel17.setText("Total number of pharmacies that");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(152, 151, 151));
        jLabel14.setText("we have under belt");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 270, 220));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String name = (userNameTextField4.getText());
            String location = (locationInputField.getText());
            String phoneNum = (userNameTextField7.getText());
            String userId = (userNameTextField5.getText());
            String pwd = (userNameTextField6.getText());
            
            
            if(system.getUserAccountDirectory().checkIfUsernameIsUnique(userId)){
                if(!phoneNum.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
                {
                    JOptionPane.showMessageDialog(null, " 10 digit phone number");
                    userNameTextField7.setText("");
                    return;
                }

                Pharma pc = new Pharma(name,location,userId,pwd,phoneNum);
                system.getUserAccDir().addAccount(pc);
                system.getPharmaDir().addToPharma(pc);
                displayTable();
                locationInputField.setText("");
                userNameTextField4.setText("");
                userNameTextField5.setText("");
                userNameTextField6.setText("");
                userNameTextField7.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Username " + userId + " already exists !!!, Please try a new one");
            }
            
 
             
         //  System.out.println(system.getUserAccDir().getUserAccList().get(1)); 

            displayTable();
            populateDashBoard();
            locationInputField.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         String username= userNameTextField5.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {      
            String a=(String)t.getValueAt(t1, 2);
            PharmaDirectory bbd = system.getPharmaDir();
            ArrayList<Pharma> cd1=bbd.getPharmaArrayList();
            int z=cd1.size();
              if(!username.matches(a)){
                JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
                locationInputField.setText("");
                userNameTextField4.setText("");
                userNameTextField5.setText("");
                userNameTextField6.setText("");
                userNameTextField7.setText("");
                return;
                }
            for(int i=0;i<z;i++)
            {
                Pharma c=cd1.get(i);
                c.getUserName();
                if(c.getUserName().matches(username))
                {
                  if(!userNameTextField7.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
                {
                    JOptionPane.showMessageDialog(null, " 10 digit phone number");
                    userNameTextField7.setText("");
                    return;
                }

                    c.setPharmaName(userNameTextField4.getText());
                    c.setPharmaLocation(locationInputField.getText());
                    c.setPharmaUserID(userNameTextField5.getText());
                    c.setPharmaPassword(userNameTextField6.getText());
                    c.setPharmaPhoneNumber(userNameTextField7.getText());       
                }
            }
                displayTable();
                populateDashBoard();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         
         String username=userNameTextField5.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
        String a=(String)t.getValueAt(t1, 3);
        PharmaDirectory bbd = system.getPharmaDir();
        ArrayList<Pharma> cd1=bbd.getPharmaArrayList();
        int z=cd1.size();
        for(int i=0;i<z;i++)
        {
            Pharma c=cd1.get(i);
          
            
            if(c.getUserName().matches(username))
            {
                bbd.removeFromPharma(c);
                system.getUserAccDir().removeccount(c);
               // System.out.println("delete");
                 break;
            }
        }
        displayTable();
        locationInputField.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
        
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
            DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
          if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Person from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else{
        userNameTextField4.setText(table.getValueAt(selectedRow,0).toString());
        locationInputField.setText(table.getValueAt(selectedRow,1).toString());
        userNameTextField5.setText(table.getValueAt(selectedRow,2).toString());
        userNameTextField6.setText(table.getValueAt(selectedRow,3).toString());
        userNameTextField7.setText(table.getValueAt(selectedRow,4).toString());
       
        
          }
        
    }//GEN-LAST:event_jTable1MouseClicked

    public void populateLongituteLatitude(MapCoordinates locationPoint) {
        this.locationPoint = locationPoint;
        locationInputField.setText(locationPoint.getLatitudeCoordinate()+ ", " + locationPoint.getLongitudeCoordinate());   
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MapViewr oLJP = new MapViewr(rightSidePanel);
        rightSidePanel.add("MapViewr", oLJP);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationInputField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel pharmaLabel;
    private javax.swing.JTextField userNameTextField4;
    private javax.swing.JTextField userNameTextField5;
    private javax.swing.JTextField userNameTextField6;
    private javax.swing.JTextField userNameTextField7;
    // End of variables declaration//GEN-END:variables
private void displayTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       PharmaDirectory docDir = system.getPharmaDir();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Pharma doc : docDir.getPharmaArrayList()) {
                    Object[] row = new Object[6];
                    row[0] = doc.getPharmaName();
                    row[1] = doc.getPharmaLocation();
                    row[2] = doc.getPharmaUserID();
                    row[3] = doc.getPharmaPassword();
                    row[4] = doc.getPharmaPhoneNumber();
                    locations.add(doc.getPharmaLocation());
                    pharmacies.add(doc.getPharmaName());

                    model.addRow(row);
                
            }
        
    }}
