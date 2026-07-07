/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abeeh
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class LoginForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginForm.class.getName());

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        try {
        java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
        java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
        java.awt.Color terracottaBtn = new java.awt.Color(184, 115, 81);

        // Background change karne ke liye
        javax.swing.UIManager.put("OptionPane.background", lightNudeBeige);
        javax.swing.UIManager.put("Panel.background", lightNudeBeige);

        // Text color coffee brown karne ke liye
        javax.swing.UIManager.put("OptionPane.messageForeground", coffeeBrown);
        javax.swing.UIManager.put("OptionPane.messageFont", new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

        // Button terracotta aur white text karne ke liye
        javax.swing.UIManager.put("Button.background", terracottaBtn);
        javax.swing.UIManager.put("Button.foreground", java.awt.Color.WHITE);
        javax.swing.UIManager.put("Button.font", new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        javax.swing.UIManager.put("Button.focusPainted", false);
    } catch (Exception e) {
        e.printStackTrace();
    }
        initComponents();
        this.setSize(480, 520);
        this.setLocationRelativeTo(null);
        try {
            this.getContentPane().setBackground(new java.awt.Color(242, 230, 218));
            
            this.setLocationRelativeTo(null);
            
            jLabel1.setText("LOGIN FORM");
            jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            
            jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
            jLabel1.setForeground(new java.awt.Color(54, 43, 36)); 
            
            java.awt.Color darkBeigeText = new java.awt.Color(74, 60, 50);
            java.awt.Font boldLabel = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13);
            
            jLabel2.setFont(boldLabel); 
            jLabel2.setForeground(darkBeigeText);
            
            jLabel3.setFont(boldLabel); 
            jLabel3.setForeground(darkBeigeText); 
            
            role_txt.setFont(boldLabel); 
            role_txt.setForeground(darkBeigeText); 
            
            java.awt.Font inputFont = new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13);
            
            email_text.setFont(inputFont);
            pass_Field.setFont(inputFont);
            jComboBox1.setFont(inputFont);
            jComboBox1.setBackground(java.awt.Color.WHITE); 
            
            remember_checkbtn.setOpaque(false);
            remember_checkbtn.setFont(inputFont);
            remember_checkbtn.setForeground(darkBeigeText);
            
            jLabel4.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
            jLabel4.setForeground(new java.awt.Color(115, 98, 86));
            

            Login_btn.setBackground(new java.awt.Color(184, 115, 81));
            Login_btn.setForeground(java.awt.Color.WHITE); 
            Login_btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
            Login_btn.setFocusPainted(false); 
            
            register_btn.setBackground(new java.awt.Color(253, 251, 249));
            register_btn.setForeground(new java.awt.Color(184, 115, 81)); 
            register_btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
            register_btn.setFocusPainted(false);
            
            javax.swing.JPanel card = new javax.swing.JPanel(new java.awt.GridBagLayout());
            card.setBackground(new java.awt.Color(242, 230, 218));
            card.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 40, 20, 40));

            java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridwidth = 2;
            gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gbc.weightx = 1.0;

            // Title
            gbc.gridy = 0; gbc.insets = new java.awt.Insets(0, 0, 30, 0);
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            card.add(jLabel1, gbc);

            // Email label
            gbc.gridy = 1; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
            card.add(jLabel2, gbc);

            // Email field
            gbc.gridy = 2; gbc.insets = new java.awt.Insets(0, 0, 18, 0);
            email_text.setPreferredSize(new java.awt.Dimension(320, 36));
            card.add(email_text, gbc);

            // Password label
            gbc.gridy = 3; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
            card.add(jLabel3, gbc);

            // Password field
            gbc.gridy = 4; gbc.insets = new java.awt.Insets(0, 0, 18, 0);
            pass_Field.setPreferredSize(new java.awt.Dimension(320, 36));
            card.add(pass_Field, gbc);

            // Role label
            gbc.gridy = 5; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
            card.add(role_txt, gbc);

            // Role combo
            gbc.gridy = 6; gbc.insets = new java.awt.Insets(0, 0, 20, 0);
            jComboBox1.setPreferredSize(new java.awt.Dimension(320, 36));
            card.add(jComboBox1, gbc);

            // Remember me
            gbc.gridy = 7; gbc.insets = new java.awt.Insets(0, 0, 18, 0);
            card.add(remember_checkbtn, gbc);

            // Login button
            gbc.gridy = 8; gbc.insets = new java.awt.Insets(0, 0, 16, 0);
            Login_btn.setPreferredSize(new java.awt.Dimension(320, 40));
            card.add(Login_btn, gbc);

            // Bottom row
            gbc.gridy = 9; gbc.insets = new java.awt.Insets(0, 0, 0, 0);
            javax.swing.JPanel bottomRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 0));
            bottomRow.setBackground(new java.awt.Color(242, 230, 218));
            bottomRow.add(jLabel4);
            bottomRow.add(register_btn);
            card.add(bottomRow, gbc);

            // Center card on frame
            javax.swing.JPanel outer = new javax.swing.JPanel(new java.awt.GridBagLayout());
            outer.setBackground(new java.awt.Color(242, 230, 218));
            outer.add(card);

            this.getContentPane().setLayout(new java.awt.BorderLayout());
            this.getContentPane().add(outer, java.awt.BorderLayout.CENTER);
            this.revalidate();
            this.repaint();

        } 
        catch (Exception e) {
            System.out.println("Styling Error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        pass_Field = new javax.swing.JPasswordField();
        Login_btn = new javax.swing.JButton();
        register_btn = new javax.swing.JButton();
        remember_checkbtn = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        role_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setText("             LOGIN FORM");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        email_text.addActionListener(this::email_textActionPerformed);

        Login_btn.setText("Login");
        Login_btn.addActionListener(this::Login_btnActionPerformed);

        register_btn.setText("Register");
        register_btn.addActionListener(this::register_btnActionPerformed);

        remember_checkbtn.setText("Remember me");
        remember_checkbtn.addActionListener(this::remember_checkbtnActionPerformed);

        jLabel4.setText("Don't have an account? ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose role", "Client", "Freelancer" }));

        role_txt.setText("Role");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(remember_checkbtn)
                        .addGap(85, 85, 85)
                        .addComponent(Login_btn)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(role_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(register_btn)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass_Field, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(role_txt))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remember_checkbtn)
                    .addComponent(Login_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_btn)
                    .addComponent(jLabel4))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        RegisterForm rf = new RegisterForm();
        rf.setVisible(true);
        this.dispose();
    }                                            

    private void remember_checkbtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void Login_btnActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String email = email_text.getText().trim(); // txt_email aapki email field ka naam hai

    // ===== EMAIL VALIDATION START =====
    if (email.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter your email!", "Login Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!email.contains("@") || !email.endsWith(".com")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid Email Format!", "Login Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return; 
    }

    int atIndex = email.indexOf("@");
    int dotIndex = email.lastIndexOf(".com");
    if (atIndex == 0 || dotIndex - atIndex <= 1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid Email Structure!", "Login Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
       
       String password = new String(pass_Field.getPassword());
       String role = jComboBox1.getSelectedItem().toString();

       FileManagement fm = new FileManagement("users.txt");

       boolean found = fm.checkLogin(email, password, role);

       if(found){
           javax.swing.JOptionPane.showMessageDialog(this, "Login Successful!");
           if (role.equalsIgnoreCase("Freelancer")) {
               Freelancer f = fm.getFreelancer(email, password);

               new freelance_dashboard(f).setVisible(true);

               this.dispose();
            }
           else if (role.equalsIgnoreCase("Client")) {
               System.setProperty("current.logged.in.email",email);
               Client c = fm.getClient(email, password);

               new Client_Dashboard(c).setVisible(true);
               this.dispose();
            }
        }
       else{
           javax.swing.JOptionPane.showMessageDialog(this , "invalid Credentials! ");
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Login_btn;
    private javax.swing.JTextField email_text;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass_Field;
    private javax.swing.JButton register_btn;
    private javax.swing.JCheckBox remember_checkbtn;
    private javax.swing.JLabel role_txt;
    // End of variables declaration                   
}
