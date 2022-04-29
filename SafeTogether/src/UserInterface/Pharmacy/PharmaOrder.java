/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Pharmacy;

import Business.EcoSystem;
import Business.Pharma.Pharma;
import Business.UserAcc.UserAcc;
import Business.WorkQueue.Req_Medicine;
import Business.WorkQueue.Req_MedicineDir;
import Business.userR.User;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikrishnajoisa
 */
public class PharmaOrder extends javax.swing.JPanel {

    /**
     * Creates new form PharmaOrder
     */
     private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    public PharmaOrder(EcoSystem system,JPanel userProcessContainer, UserAcc userAcc) {
        initComponents();
         this.system = system;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patient Name", "Doctor Name", "Order Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 780, 310));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        jLabel2.setText("Cost");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 360, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        jLabel1.setText("Order");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 360, 190));

        jButton1.setBackground(new java.awt.Color(10, 132, 255));
        jButton1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update status");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 670, 200, 39));

        jButton4.setBackground(new java.awt.Color(255, 55, 95));
        jButton4.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 670, 180, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
       Req_MedicineDir dire=system.getMedicineReqDir();
        ArrayList<Req_Medicine> order=dire.getMedReqDir();
        
        int u=order.size();
        
        for(int i=0;i<u;i++)
        {
            Req_Medicine o=order.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Order Placed"))
                {
                o.setStatus("Ready for pickup");
                }
                else
                {
                 JOptionPane.showMessageDialog(null,"Order Cancelled");  

                }
            }
        }
           jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Patient Name","Doctor Name","Status"}));
        displayTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");  
        }
       // DB4OUtil.dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
       Req_MedicineDir dire=system.getMedicineReqDir();
        ArrayList<Req_Medicine> order=dire.getMedReqDir();
        
        int u=order.size();
        
        for(int i=0;i<u;i++)
        {
            Req_Medicine o=order.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Ready for pickup"))
                {
                o.setStatus("Order Placed");
                }
                else
                {
                 JOptionPane.showMessageDialog(null,"Order Cancelled");  

                }
            }
        }
           jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Patient Name","Doctor Name","Status"}));
        displayTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");  
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        
           jTextArea2.setText("");
                jTextArea1.setText("");

        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        Req_MedicineDir dire=system.getMedicineReqDir();
        ArrayList<Req_Medicine> order=dire.getMedReqDir();
        
        int u=order.size();
        for(int i=0;i<u;i++)
        {
            Req_Medicine o=order.get(i);
            if(s==o.getId())
            {
                Map<String,String> f=o.getMedOrderlist();
                int count =1;
                for (String key: f.keySet()) {
                    jTextArea1.append("Item "+ count+ " : "+key+" Quantity : "+f.get(key)+"\n");
                    count++;
                   
            }
                Map<String,String> f1=o.getMedCostlist();
                int a=0;
                for (String key: f1.keySet()) {
                     System.out.println(Integer.parseInt(f1.get(key)));
                     a=a+(Integer.parseInt(f1.get(key)));
                     System.out.println("a"+a);
                   
            }
                jTextArea2.append(String.valueOf(a));
                
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          
       // System.out.print("im inside display table "+system);
        Req_MedicineDir dire=system.getMedicineReqDir();
        ArrayList<Req_Medicine> order=dire.getMedReqDir();
    
        int u=order.size();
        Pharma r=(Pharma)userAcc;
        for(int i=0;i<u;i++)
        {
            Req_Medicine o=order.get(i);
            if(r.getPharmaName().matches(o.getPharmaName()))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());
                
                
                String s[]={s1,o.getPatientId(),o.getDoctorName(),o.getStatus()};
                t2.addRow(s);
            
            
            }
        }
    
    
    }
}
