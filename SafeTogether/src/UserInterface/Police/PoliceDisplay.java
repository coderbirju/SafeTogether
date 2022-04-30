/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Police;

import Business.EcoSystem;
import Business.EmergencyPolice.Police;
import Business.UserAcc.UserAcc;
import Business.WorkQueue.Req_Emergency;
import Business.WorkQueue.Req_EmergencyDir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikrishnajoisa
 */
public class PoliceDisplay extends javax.swing.JPanel {

    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    
    /**
     * Creates new form PoliceDisplay
     */
    PoliceDisplay(EcoSystem ecosystem, JPanel userProcessContainer, UserAcc userAcc) {
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        initComponents();
        populate_table();
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
        bookButton2 = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        bookButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Police Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        bookButton2.setBackground(new java.awt.Color(255, 55, 95));
        bookButton2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        bookButton2.setForeground(new java.awt.Color(255, 255, 255));
        bookButton2.setText("False Alarm");
        bookButton2.setBorder(null);
        bookButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(bookButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 180, 50));

        bookButton.setBackground(new java.awt.Color(255, 69, 58));
        bookButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.setText("Close Case");
        bookButton.setBorder(null);
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 180, 50));

        bookButton1.setBackground(new java.awt.Color(10, 132, 255));
        bookButton1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        bookButton1.setForeground(new java.awt.Color(255, 255, 255));
        bookButton1.setText("Respond");
        bookButton1.setBorder(null);
        bookButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(bookButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 180, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Location", "Status", "Response"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 853, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int rowId = Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
        Req_EmergencyDir reqEmergencyDirectory = system.getEmergencyReqDir();
        ArrayList<Req_Emergency> requestEmergencies = reqEmergencyDirectory.getEmergencyUserList();
        Police a=(Police)userAcc;
        int size = requestEmergencies.size();
        for(int i=0;i<size;i++)
        {
            Req_Emergency emergency = requestEmergencies.get(i);
            if(rowId == emergency.getId())
            {
                if(emergency.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(emergency.getStatus().matches("False Alarm"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(emergency.getResponse().matches("No Response"))
                {
                    JOptionPane.showMessageDialog(null, "respond to emergency");
                }
                else
                {
                    emergency.setStatus("False Alarm");
                }
                
                

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_bookButton2ActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int rowId = Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
        Req_EmergencyDir reqEmergencyDirectory = system.getEmergencyReqDir();
        ArrayList<Req_Emergency> emergencies = reqEmergencyDirectory.getEmergencyUserList();
        int size = emergencies.size();
        for(int i=0;i<size;i++)
        {
            Req_Emergency emergency = emergencies.get(i);
            if(rowId ==emergency.getId())
            {
                if(emergency.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(emergency.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(emergency.getResponse().matches("No Response"))
                {
                    JOptionPane.showMessageDialog(null, "respond to emergency");
                }
                else
                {
                    emergency.setStatus("Closed");
                }

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void bookButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButton1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel  table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {       
        int rowId = Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
        Req_EmergencyDir reqEmergencyDirectory=system.getEmergencyReqDir();
        ArrayList<Req_Emergency> reqEmergencyList = reqEmergencyDirectory.getEmergencyUserList();
        int size= reqEmergencyList.size();
        Police police =(Police)userAcc;
        for(int i=0;i<size;i++)
        {
            Req_Emergency emergency = reqEmergencyList.get(i);
            if(rowId ==emergency.getId())
            {
                if(emergency.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(emergency.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(emergency.getResponse().matches("No Response"))
                {
                    emergency.setResponse(police.getNamePolice()+" "+"Responded");
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "Already Responded!!"); 
                }
                

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_bookButton1ActionPerformed

    
    
    public void populate_table()
    {
        Req_EmergencyDir reqEmergencyDirectory=system.getEmergencyReqDir();
        ArrayList<Req_Emergency> reqEmergencyList=reqEmergencyDirectory.getEmergencyUserList();
        int size = reqEmergencyList.size();
        
        for(int i=0;i<size;i++)
        {
            Req_Emergency emergency = reqEmergencyList.get(i);
            if(emergency.getEmergency().matches("Police"))
            {
            
                DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(emergency.getId());
                
                
                String row[]={s1,emergency.getName(),emergency.getEmergency(),emergency.getLocation(),emergency.getStatus(),emergency.getResponse()};
                table2.addRow(row);
            
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookButton;
    private javax.swing.JButton bookButton1;
    private javax.swing.JButton bookButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
