/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.EmergencyAmbulance.Ambulance;
import Business.EmergencyFire.Fire;
import Business.EmergencyPolice.Police;

import Business.PandemicCenter.PandemicCenter;
import UserInterface.SysAdmin.SysAdminWorkAreaJPanel;
import java.awt.CardLayout;

/**
 *
 * @author shrikrishnajoisa
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */

    // set the default size of the main frame
//     private EcoSystem system;
//    public static DB4OUtil dB4OUtil = DB4OUtil.getInstance();
     private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    
    public MainJFrame() {
        initComponents();
          system = dB4OUtil.retrieveSystem();
        this.setSize(1920, 1080);
        this.setResizable(false);
       // system = dB4OUtil.retrieveSystem();

         //setSystemAdmin();


         setAdminPage();
         
//         //Creation of test data for adding Doctors to Sys Admin tables
//          Doctor doc = new Doctor("Raksha","Cardio","Boston Public","raksha","pass","1111111111");
//            system.getUserAccDir().addAccount(doc);
//            system.getDoctorDir().addNewDoc(doc);
//            
//              Doctor doc2 = new Doctor("Krishna","Neuro","CityView Hospital","krishna","pass","1911111111");
//            system.getUserAccDir().addAccount(doc2);
//            system.getDoctorDir().addNewDoc(doc2);
//            
//              Doctor doc3 = new Doctor("Arjun","Ortho","Roxbury Hospital","arjun","pass","1011111111");
//            system.getUserAccDir().addAccount(doc3);
//            system.getDoctorDir().addNewDoc(doc3);
//            
//         //Creation of test data for adding Pandemic Ceters to Sys Admin tables   
//          PandemicCenter pCenter = new PandemicCenter("Cabot","Boston","cabot","pass","3333333333");
//              system.getUserAccDir().addAccount(pCenter);
//            system.getPandemicCenterDir().addPandemicCenter(pCenter);
//            
//        //Creation of test data for adding BloodBanks to Sys Admin tables       
//         BloodWork bBank = new BloodWork("Red Cross","Boston","redcross","pass","2222222222");
//              system.getUserAccDir().addAccount(bBank);
//            system.getBloodBankDir().addBloodWork(bBank);
//            
//             //Creation of test data for adding pharmacies to Sys Admin tables       
//         Pharma pharma = new Pharma("CVS","Boston","cvs","pass","2222222222");
//              system.getUserAccDir().addAccount(pharma);
//            system.getPharmaDir().addToPharma(pharma);
//            
//            //creating test data for user
//            User user1 = new User("Rambo", "kr", "abc@gmail.com", "2222222222", "rambo", "rambo", "boston");
//            system.getUserAccDir().addAccount(user1);
//            system.getUserDir().addUser(user1);
//            
//             User user2 = new User("Bo", "kr", "abc@gmail.com", "2222222222", "bo", "bo", "boston");
//            system.getUserAccDir().addAccount(user2);
//            system.getUserDir().addUser(user2);
//            System.out.println(system.getUserAccDir().getUserAccList());
//         
//        
            Police pol = new Police("police1", "pol123", "Boston", "NUPD","9999999991");
            system.getPoliceDir().addNewPolice(pol);
            system.getUserAccDir().addAccount(pol);
            
            Fire fire = new Fire("f1", "f123", "Boston", "FPD", "1234567890");
            system.getFireDir().addNewFire(fire);
            system.getUserAccDir().addAccount(fire);
            
            
            Ambulance ambu = new Ambulance("amb1", "a123", "boston", "driver1","9999999980");
            system.getAmbulanceDir().addNewAmbulance(ambu);
            system.getUserAccDir().addAccount(ambu);
            
            PandemicCenter pa = new PandemicCenter("Pandu","Boston","pan1", "pan123","1234567890");
            system.getPandemicCenterDir().addPandemicCenter(pa);
            system.getUserAccDir().addAccount(pa);
         
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        workArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
 
    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
   // Initial launch screen for the adminPage
    private void setAdminPage() {
         UserLogin wa=new UserLogin(workArea,system);
        workArea.add("UserLogin",wa);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    private void setSystemAdmin() {
        SysAdminWorkAreaJPanel wa=new SysAdminWorkAreaJPanel(workArea,system);
        workArea.add("UserLogin",wa);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
  

}
