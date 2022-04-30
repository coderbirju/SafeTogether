/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.user;

import Business.EcoSystem;
import Business.PandemicCenter.PandemicCenter;
import Business.PandemicCenter.PandemicCenter_Dir;
import Business.UserAcc.UserAcc;
import Business.WorkQueue.OutbreakTracer;
import Business.WorkQueue.OutbreakTracerDir;
import Business.userR.User;
import UserInterface.SysAdmin.MapViewerTwo;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikrishnajoisa
 */
public class TestRegistration extends javax.swing.JPanel {

    /**
     * Creates new form TestRegistration
     */
    EcoSystem system;
    JPanel rightSidePanel;
    UserAcc userAcc;
    String locationCordinate;
    
    public TestRegistration(EcoSystem system, JPanel rightSidePanel,UserAcc userAcc) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.userAcc=userAcc;
        this.setSize(1160, 750);
        User a =(User)(userAcc);
        firstNameInputBox.setText(a.getFirstName());
        emailTextInput.setText(a.getEmail());
        PandemicCenter_Dir cd= system.getPandemicCenterDir();
        ArrayList<PandemicCenter> ol=cd.getPandemicdirectory();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            PandemicCenter o=ol.get(i);
            comboCenter.addItem(o.getName());
            locationCordinate = o.getLocation();
        }
        displayCenter();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lastDisease = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        symptoms = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        positive = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        firstNameInputBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        timeBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        emailTextInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        temperatureInput = new javax.swing.JTextField();
        comboCenter = new javax.swing.JComboBox<>();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();
        cancelButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Schedule Testing");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 1090, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setText("Questionnaire");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 22, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel3.setText("Have you been tested for outbreak in the last 14 Days?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 71, -1, -1));

        lastDisease.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Maybe" }));
        lastDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastDiseaseActionPerformed(evt);
            }
        });
        jPanel2.add(lastDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 68, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Maybe" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 113, -1, -1));

        symptoms.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        symptoms.setText("Have you had any outbreak Symptoms?");
        jPanel2.add(symptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 117, -1, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel11.setText("in the past 14 days?");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Maybe" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        positive.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive.setText("Have you received any  positive test result");
        jPanel2.add(positive, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 520, 350));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(73, 84, 90));
        jLabel4.setText("First Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        firstNameInputBox.setBackground(new java.awt.Color(248, 248, 249));
        firstNameInputBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameInputBoxActionPerformed(evt);
            }
        });
        jPanel3.add(firstNameInputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 40));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(73, 84, 90));
        jLabel5.setText("Test Center");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "19:00 - 20:00", " ", " " }));
        jPanel3.add(timeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 35));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Appointment Time");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 84, 90));
        jLabel6.setText("Appointment Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        dateChooser.setPreferredSize(new java.awt.Dimension(160, 20));
        jPanel3.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 221, 35));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Email");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        emailTextInput.setBackground(new java.awt.Color(248, 248, 249));
        jPanel3.add(emailTextInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 220, 38));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("Temperature");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 130, -1));

        temperatureInput.setBackground(new java.awt.Color(248, 248, 249));
        jPanel3.add(temperatureInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 230, 38));

        comboCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCenterActionPerformed(evt);
            }
        });
        jPanel3.add(comboCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 220, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 520, 350));

        registerButton.setBackground(new java.awt.Color(10, 132, 255));
        registerButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Book Appointment");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 220, 39));

        cancelButton.setBackground(new java.awt.Color(138, 189, 188));
        cancelButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("View Result");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 700, 200, 39));

        cancelButton1.setBackground(new java.awt.Color(255, 55, 95));
        cancelButton1.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton1.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton1.setText("Cancel Appointment");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 700, 200, 39));

        cancelButton2.setBackground(new java.awt.Color(172, 142, 104));
        cancelButton2.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton2.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton2.setText("Available Centers");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 200, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameInputBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameInputBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputBoxActionPerformed

    private void lastDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastDiseaseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_lastDiseaseActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        testRegistration();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:

        viewResult();

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        // TODO add your handling code here:
        
          cancelRegistration();
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        // TODO add your handling code here:
        showInMap();
    }//GEN-LAST:event_cancelButton2ActionPerformed

    private void comboCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCenterActionPerformed

    private void showInMap() {
        System.out.println(locationCordinate);
        String [] parts = locationCordinate.split(",");
        String lattitude = parts[0].replaceAll("\\s","");
        String longitude = parts[1].replaceAll("\\s","");
        
        MapViewerTwo oLJP = new MapViewerTwo(rightSidePanel, lattitude, longitude);
        rightSidePanel.add("MapViewr", oLJP);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
        

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JComboBox<String> comboCenter;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextField emailTextInput;
    private javax.swing.JTextField firstNameInputBox;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> lastDisease;
    private javax.swing.JLabel positive;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel symptoms;
    private javax.swing.JTextField temperatureInput;
    private javax.swing.JComboBox<String> timeBox;
    // End of variables declaration//GEN-END:variables

    private void testRegistration() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     if(dateChooser.getDate()!=null)
        {
            OutbreakTracer c1 =new OutbreakTracer();
            int x = 1 + (int) (Math.random() * 100);
            c1.setId(x);
            c1.setFirstName(firstNameInputBox.getText());
            c1.setTestCenter(comboCenter.getSelectedItem().toString());
            c1.setTemp(temperatureInput.getText());
            c1.setContact(lastDisease.getSelectedItem().toString());
            c1.setSymptoms(jComboBox4.getSelectedItem().toString());
            c1.setPositive(jComboBox5.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String d1 = sdf.format(dateChooser.getDate());
            c1.setStatus("Appoinment Booked");
            c1.setResult("NA");
            User a=(User)(userAcc);
          
            c1.setUserName(a.getFirstName());
            c1.setUserId(a.getUserId());
            
            c1.setAppDate(d1);
            c1.setAppTime(timeBox.getSelectedItem().toString());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDateTime d2 = LocalDateTime.now();
            System.out.println(dtf.format(d2));
            if(d1.compareTo(d2.toString()) >= 0) {
                OutbreakTracerDir cdd= system.getOutbreakStatusDir();
                cdd.addrequest(c1);
                jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Status","Center","Temperature","Date","Time","Result"}));
                displayCenter();
                 JOptionPane.showMessageDialog(null, "Your Appointment Booked successfully!!");
        
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please book a future date !!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select A Date!!");
        }
    
    }

    private void cancelRegistration() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
     DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
            System.out.println("id"+s);
            OutbreakTracerDir cdd = system.getOutbreakStatusDir();
            ArrayList<OutbreakTracer> ol=cdd.getOutbreakLog();
            int u=ol.size();
            User bb=(User)(userAcc);
            for(int i=0;i<u;i++)
            {
                OutbreakTracer o=ol.get(i);
                if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
                {
                    if(o.getStatus().matches("Appoinment Booked"))
                    {
                        o.setStatus("Cancled");
                         JOptionPane.showMessageDialog(null,"Your Appointment is cancelled successfully!!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"wrong move!!");
                    }

                }
            }
            jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Status","Center","Temparature","Date","Time","Result"}));
            displayCenter();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Select an appointment to cancel!!");
        }
    
    }

    private void displayCenter() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     OutbreakTracerDir c = system.getOutbreakStatusDir();
        ArrayList<OutbreakTracer> ol=c.getOutbreakLog();
        int u=ol.size();
     
        for(int i=0;i<u;i++)
        {
            OutbreakTracer o=ol.get(i);
            
          
            if(userAcc.getUserName().matches(o.getUserId()))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());    
                String s[]={s1,o.getStatus(),o.getTestCenter(),o.getTemp(), o.getAppDate(),o.getAppTime(),o.getResult()};
                t2.addRow(s);
            }
        }
    
    }

    private void viewResult() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
          
           OutbreakTracerDir c = system.getOutbreakStatusDir();
        ArrayList<OutbreakTracer> ol=c.getOutbreakLog();
            int u=ol.size();
           
            for(int i=0;i<u;i++)
            {
                OutbreakTracer o=ol.get(i);
                if(s==o.getId())
                {
                    if(o.getResult().matches("Positive"))
                    {
                        JOptionPane.showMessageDialog(null,"Result : "+o.getResult());
                    }
                    else if(o.getResult().matches("Negative"))
                    {
                        JOptionPane.showMessageDialog(null,"Result : "+o.getResult());
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(null,"Results not Available!!");  
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");
        }
    
    
    
    
    }
}
