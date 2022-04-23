/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.EcoSystem;
import Business.userR.User;
import java.awt.CardLayout;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.mail.*;

/**
 *
 * @author raksh
 */
public class UserRegister extends javax.swing.JPanel {

    /**
     * Creates new form UserRegister
     */
         EcoSystem ecosystem;
    JPanel workArea;
    
//        private UserRegister() {
//        initComponents();
//        this.setSize(1920, 1080);
//        
//        this.ecosystem=null; // change this
//    }
    public UserRegister(JPanel workArea,EcoSystem system) {
        initComponents();
         this.ecosystem=system;
        this.workArea=workArea;
        this.setSize(1920, 1080);
       
    }
public  void sendmail()
        {           
            String ToEmail = emailTextField.getText();
            String myAccountEmail = "safetogetherhelp2022@gmail.com";
            String password = "INFO5100aed";

            System.out.println("to : "+ ToEmail);
            Properties properties = new Properties();
            properties.put("mail.smtp.auth","true");
            properties.put("mail.smtp.starttls.enable","true");
            properties.put("mail.smtp.host","smtp.gmail.com");
            properties.put("mail.smtp.port","587");

            Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(myAccountEmail, password);
                }

            });
            try{
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(myAccountEmail));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
                message.setSubject("User Account Created!!");
                message.setText("Welcome to SafeTogether");
                Transport.send(message);
            } catch(Exception ex){
                System.out.println(""+ex);
            }
        
        }

 public static void sendTextMessage(String contact) {
        // Recipient's email ID needs to be mentioned.
        String to = contact;
        System.out.println(contact);
        String from = "donotreplyers@gmail.com";
        String pass = "devhuskies";
        // Assuming you are sending email from localhost
        // String host = "192.168.0.16";
        // Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
        // properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        // Setup mail server
        // properties.setProperty("mail.smtp.host", host);
        //  properties.put("mail.smtp.starttls.enable", "true");
        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
        //       final PasswordAuthentication auth = new PasswordAuthentication(from, pass);
//Session session = Session.getDefaultInstance(properties, new Authenticator() {
//    @Override
//    protected PasswordAuthentication getPasswordAuthentication() { return auth; }
//});
//Session session = Session.getInstance(properties);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Patient Registration");
            message.setText("Thank you for registering with us. Your account will be activated within 24 hours. We will keep you posted in case of emergencies.");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2565809.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 1080));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 97, 93));
        jLabel2.setText("Create Account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 86, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(73, 84, 90));
        jLabel3.setText("Use your email for registration ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 139, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(73, 84, 90));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 201, -1, -1));

        userNameTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 236, 271, 48));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(73, 84, 90));
        jLabel5.setText("First Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 302, -1, -1));

        firstNameTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 337, 271, 48));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 84, 90));
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 302, -1, -1));

        lastNameTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 337, 271, 48));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 403, -1, -1));

        emailTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 438, 271, 48));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("Phone");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 201, -1, -1));

        phoneTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 236, 271, 48));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Location");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 518, -1, -1));

        locationTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(locationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 553, 618, 48));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 403, -1, -1));

        passwordTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 438, 271, 48));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(235, 97, 91));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 97, 91), null));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 670, 179, 56));

        signUpButton.setBackground(new java.awt.Color(235, 97, 91));
        signUpButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.setBorder(null);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 665, 179, 56));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
           UserLogin wa=new UserLogin(workArea,ecosystem);
        workArea.add("UserLogin",wa);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
          if(userNameTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() || firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty() || emailTextField.getText().isEmpty() || passwordTextField.getText().isEmpty() || locationTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        } 
        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userNameTextField.getText())){
            if(!phoneTextField.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                phoneTextField.setText("");
                return;
            }
            if(!emailTextField.getText().matches("^[a-zA-Z0-9]+@[a-z]*.com"))
            {
                JOptionPane.showMessageDialog(null, "Please enter valid email address!!");
                emailTextField.setText("");
                return;
            }
            User customer = new User(firstNameTextField.getText(),lastNameTextField.getText(), emailTextField.getText(),phoneTextField.getText(),userNameTextField.getText(),passwordTextField.getText(), locationTextField.getText());
            ecosystem.getUserAccDir().addAccount(customer);
            ecosystem.getUserDir().addUser(customer);
           sendemail();
            userNameTextField.setText("");
            emailTextField.setText("");
            firstNameTextField.setText("");
            phoneTextField.setText("");
            lastNameTextField.setText("");
            passwordTextField.setText("");
            locationTextField.setText("");
            
            JOptionPane.showMessageDialog(null, "User Account Created!!");
            
            
         }else{
            JOptionPane.showMessageDialog(null, "Username " + userNameTextField.getText() + " already exists !!!, Please try a new one");
         }
    }//GEN-LAST:event_signUpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
