/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

/**
 *
 * @author shrikrishnajoisa
 */
 
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDir;
import Business.EcoSystem;
import Business.Laboratory.BloodWork;
import Business.Laboratory.BloodWorkDirectory;
import Business.PandemicCenter.PandemicCenter;
import Business.PandemicCenter.PandemicCenter_Dir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class BloodRegistration extends javax.swing.JPanel {

    /**
     * Creates new form BloodRegistration
     */
    EcoSystem system;
    JPanel rightSidePanel;

    public BloodRegistration(EcoSystem system, JPanel rightSidePanel) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.setSize(1160, 750);
        displayTable();
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userNameTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        userNameTextField4 = new javax.swing.JTextField();
        userNameTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userNameTextField7 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

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

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 630));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 580, 630));

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

        userNameTextField3.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Location");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

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

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           String name = (userNameTextField4.getText());
            String location = (userNameTextField3.getText());
            String pwd = (userNameTextField6.getText());
            String userId = (userNameTextField5.getText());
            String phoneNum = (userNameTextField7.getText());

            BloodWork doc = new BloodWork(name,location,userId,pwd,phoneNum);
            system.getUserAccDir().addAccount(doc);
            system.getBloodBankDir().addBloodWork(doc);
           //System.out.println(system.getUserAccDir().getUserAccList().get(1)); 
            displayTable();
            
              userNameTextField3.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");
           
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int sRow=jTable1.getSelectedRow();
        if(sRow>=0)
        {
             
        String value=(String)table.getValueAt(sRow, 3);
            BloodWorkDirectory doctorDirectory = system.getBloodBankDir();
        ArrayList<BloodWork> list=doctorDirectory.getBloodWorkList();
        int listsize=list.size();
        for(int i=0;i<listsize;i++)
        {
            BloodWork doc=list.get(i);
            //System.out.println(doc.getUserName());
            
            if(doc.getUserName().matches(value))
                    {
                        if(!userNameTextField7.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                userNameTextField7.setText("");
                return;
            }

                      doc.setUserNames(userNameTextField4.getText());
                        doc.setUserLocation(userNameTextField3.getText());
                        doc.setUserPhone(userNameTextField7.getText());
                        doc.setUserId(userNameTextField5.getText());
                        doc.setPassword(userNameTextField6.getText());
                      
                    
                    }
        }
          displayTable();
            
              userNameTextField3.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");
          
             }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                
         DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int sRow=jTable1.getSelectedRow();
        if(sRow>=0)
        {
             
        String value=(String)table.getValueAt(sRow, 3);
         BloodWorkDirectory doctorDirectory = system.getBloodBankDir();
        ArrayList<BloodWork> list=doctorDirectory.getBloodWorkList();
        int z=list.size();
        for(int i=0;i<z;i++)
           {
            BloodWork d=list.get(i);
            if(d.getUserName().matches(value))
                    {
                       doctorDirectory.removeBloodWork(d);
                       system.getUserAccDir().removeccount(d);
                  
                        break;
                    }
        }
          displayTable();
          userNameTextField3.setText("");
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
        userNameTextField3.setText(table.getValueAt(selectedRow,1).toString());
        userNameTextField5.setText(table.getValueAt(selectedRow,2).toString());
        userNameTextField6.setText(table.getValueAt(selectedRow,3).toString());
        userNameTextField7.setText(table.getValueAt(selectedRow,4).toString());
    
        
          }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField userNameTextField3;
    private javax.swing.JTextField userNameTextField4;
    private javax.swing.JTextField userNameTextField5;
    private javax.swing.JTextField userNameTextField6;
    private javax.swing.JTextField userNameTextField7;
    // End of variables declaration//GEN-END:variables
 private void displayTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        BloodWorkDirectory docDir = system.getBloodBankDir();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (BloodWork doc : docDir.getBloodWorkList()) {
                    Object[] row = new Object[6];
                    row[0] = doc.getUserNames();
                    row[1] = doc.getUserLocation();
                    row[2] = doc.getUserId();
                    row[3] = doc.getPassword();
                    row[4] = doc.getUserPhone();
                    

                    model.addRow(row);
                
            }
        
    }}
