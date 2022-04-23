/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.user;

import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import UserInterface.SysAdmin.PandemicRegistration;
import java.awt.CardLayout;
import java.awt.Color;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import javax.swing.JPanel;

/**
 *
 * @author raksh
 */
public class UserAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserAreaJPanel
     */
    private UserAcc userAcc;
    private EcoSystem system;
     private JPanel container;

    
    public UserAreaJPanel(  JPanel userProcessContainer, UserAcc userAcc,EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        
        this.userAcc = userAcc;
    }
 public void displayRequestTable(){
        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        emergencyReport = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        medicine = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        testing = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bloodDonation = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vaccination = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bookAppointment = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-logout-24.png"))); // NOI18N
        goBack.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel22.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(115, 120, 128));
        jLabel22.setText("Return");
        goBack.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 290, 60));

        emergencyReport.setBackground(new java.awt.Color(255, 255, 255));
        emergencyReport.setPreferredSize(new java.awt.Dimension(100, 48));
        emergencyReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emergencyReportMousePressed(evt);
            }
        });
        emergencyReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-ambulance-24 (1).png"))); // NOI18N
        emergencyReport.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(115, 120, 128));
        jLabel17.setText("Emergency Report");
        emergencyReport.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.add(emergencyReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 60));

        medicine.setBackground(new java.awt.Color(255, 255, 255));
        medicine.setPreferredSize(new java.awt.Dimension(100, 48));
        medicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                medicineMousePressed(evt);
            }
        });
        medicine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-supplement-bottle-24.png"))); // NOI18N
        medicine.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel15.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(115, 120, 128));
        jLabel15.setText("Medicine");
        medicine.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 290, 60));

        testing.setBackground(new java.awt.Color(255, 255, 255));
        testing.setPreferredSize(new java.awt.Dimension(100, 48));
        testing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                testingMousePressed(evt);
            }
        });
        testing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-pcr-test-24.png"))); // NOI18N
        testing.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(115, 120, 128));
        jLabel11.setText("Testing");
        testing.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.add(testing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 60));

        bloodDonation.setBackground(new java.awt.Color(255, 255, 255));
        bloodDonation.setPreferredSize(new java.awt.Dimension(100, 48));
        bloodDonation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bloodDonationMousePressed(evt);
            }
        });
        bloodDonation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-drop-of-blood-24.png"))); // NOI18N
        bloodDonation.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(115, 120, 128));
        jLabel13.setText("Blood Donation");
        bloodDonation.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.add(bloodDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 290, 60));

        vaccination.setBackground(new java.awt.Color(255, 255, 255));
        vaccination.setPreferredSize(new java.awt.Dimension(100, 48));
        vaccination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vaccinationMousePressed(evt);
            }
        });
        vaccination.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-vaccination-24.png"))); // NOI18N
        vaccination.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(115, 120, 128));
        jLabel7.setText("Vaccination");
        vaccination.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.add(vaccination, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, 60));

        bookAppointment.setBackground(new java.awt.Color(255, 255, 255));
        bookAppointment.setPreferredSize(new java.awt.Dimension(100, 48));
        bookAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookAppointmentMousePressed(evt);
            }
        });
        bookAppointment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-planner-24.png"))); // NOI18N
        bookAppointment.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(115, 120, 128));
        jLabel6.setText("Book Appointment");
        bookAppointment.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.add(bookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 60));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo/safe together-logos_transparent copy.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel9.setText("3:45 PM");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("User Requests");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jLabel1.setText("Manage everything related to hospital enterprises");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel2.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1300, 750));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 1010));
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_goBackMousePressed

    private void bookAppointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookAppointmentMousePressed
        // TODO add your handling code here:
        
        bookAppointment();
    }//GEN-LAST:event_bookAppointmentMousePressed

    private void vaccinationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccinationMousePressed
        // TODO add your handling code here:
        vaccinationStatus();
    }//GEN-LAST:event_vaccinationMousePressed

    private void testingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testingMousePressed
        // TODO add your handling code here:
        PandemicTest();
    }//GEN-LAST:event_testingMousePressed

    private void bloodDonationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodDonationMousePressed
        // TODO add your handling code here:
        BloodDonation();
    }//GEN-LAST:event_bloodDonationMousePressed

    private void medicineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_medicineMousePressed

    private void emergencyReportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergencyReportMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyReportMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bloodDonation;
    private javax.swing.JPanel bookAppointment;
    private javax.swing.JPanel emergencyReport;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel medicine;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JPanel testing;
    private javax.swing.JPanel vaccination;
    // End of variables declaration//GEN-END:variables

    private void bookAppointment() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      emergencyReport.setBackground(new Color(255,255,255));
        medicine.setBackground(new Color(255,255,255));
         bloodDonation.setBackground(new Color(255,255,255));
         vaccination.setBackground(new Color(255,255,255));
        testing.setBackground(new Color(255,255,255));
    bookAppointment.setBackground(new Color(213,230,249));
        //255,255,255 PandemicTestCentreJPanel
        BloodDonations pcr=new BloodDonations (system, container);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    
    
    }

    private void vaccinationStatus() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    emergencyReport.setBackground(new Color(255,255,255));
        medicine.setBackground(new Color(255,255,255));
         bloodDonation.setBackground(new Color(255,255,255));
         bookAppointment.setBackground(new Color(255,255,255));
        testing.setBackground(new Color(255,255,255));
    vaccination.setBackground(new Color(213,230,249));
        //255,255,255 PandemicTestCentreJPanel
        VaccinationAppointments pcr=new VaccinationAppointments (system, container);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    
    }

    private void PandemicTest() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     emergencyReport.setBackground(new Color(255,255,255));
        medicine.setBackground(new Color(255,255,255));
         bloodDonation.setBackground(new Color(255,255,255));
         vaccination.setBackground(new Color(255,255,255));
        bookAppointment.setBackground(new Color(255,255,255));
    testing.setBackground(new Color(213,230,249));
        //255,255,255 PandemicTestCentreJPanel
        TestRegistration pcr=new TestRegistration (system, container);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }
    
    private void BloodDonation() {
        
        emergencyReport.setBackground(new Color(255,255,255));
        medicine.setBackground(new Color(255,255,255));
        bloodDonation.setBackground(new Color(213,230,249));
        vaccination.setBackground(new Color(255,255,255));
        testing.setBackground(new Color(255,255,255));
        bookAppointment.setBackground(new Color(255,255,255));
      
        BloodDonations pcr = new BloodDonations(system, container);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    
    }
    
    private void OrderMedicine() {
        
        emergencyReport.setBackground(new Color(255,255,255));
        medicine.setBackground(new Color(213,230,249));
        bloodDonation.setBackground(new Color(255,255,255));
        vaccination.setBackground(new Color(255,255,255));
        testing.setBackground(new Color(255,255,255));
        bookAppointment.setBackground(new Color(255,255,255));
      
        BloodDonations pcr = new BloodDonations(system, container);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    
    }
}
