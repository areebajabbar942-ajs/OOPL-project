/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/

/**
 *
 * @author A
 */
import javax.swing.JOptionPane;
public class freelance_dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(freelance_dashboard.class.getName());
    private Freelancer freelancer;
    private String selectedJobId;
    private String currentEmailTracker = null;
    private String localName = null;
    private String localEmail = null;
    
    public freelance_dashboard(Freelancer freelancer) {

    initComponents();
     // Center the window on screen
this.setLocationRelativeTo(null);

// Set a proper window size
this.setSize(440, 400);
this.setLocationRelativeTo(null);

    this.freelancer = freelancer;

    txt_name.setVisible(false);

    txt_email.setVisible(false);

    txt_skills.setVisible(false);
    try {
        this.getContentPane().setBackground(new java.awt.Color(242, 230, 218));

        this.setLocationRelativeTo(null);

        java.awt.Color bgNudeBeige = new java.awt.Color(242, 230, 218);

        mainpanel.setBackground(bgNudeBeige);
        sidepanel.setBackground(bgNudeBeige);
        toppanel.setBackground(bgNudeBeige);

        jLabel1.setText("WELCOME TO FREELANCE DASHBOARD");
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        java.awt.Color darkBeigeText = new java.awt.Color(74, 60, 50);
        java.awt.Font boldLabel = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12);

        jLabel9.setFont(boldLabel);  jLabel9.setForeground(darkBeigeText);  
        jLabel10.setFont(boldLabel); jLabel10.setForeground(darkBeigeText); 
        jLabel11.setFont(boldLabel); jLabel11.setForeground(darkBeigeText); 

        java.awt.Font inputFont = new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12);
        txt_name.setFont(inputFont);   txt_name.setBackground(java.awt.Color.WHITE);
        txt_email.setFont(inputFont);  txt_email.setBackground(java.awt.Color.WHITE);
        txt_skills.setFont(inputFont); txt_skills.setBackground(java.awt.Color.WHITE);

        java.awt.Color btnColor = new java.awt.Color(184, 115, 81);
        java.awt.Color btnTextColor = java.awt.Color.WHITE;
        java.awt.Font btnFont = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12);

        btnhome.setBackground(btnColor);      btnhome.setForeground(btnTextColor);      btnhome.setFont(btnFont);      btnhome.setFocusPainted(false);
        btnviewjobs.setBackground(btnColor);  btnviewjobs.setForeground(btnTextColor);  btnviewjobs.setFont(btnFont);  btnviewjobs.setFocusPainted(false);
        btnmybids.setBackground(btnColor);    btnmybids.setForeground(btnTextColor);    btnmybids.setFont(btnFont);    btnmybids.setFocusPainted(false);
        btnprofile.setBackground(btnColor);   btnprofile.setForeground(btnTextColor);   btnprofile.setFont(btnFont);   btnprofile.setFocusPainted(false);
        btnlogout.setBackground(btnColor);    btnlogout.setForeground(btnTextColor);    btnlogout.setFont(btnFont);    btnlogout.setFocusPainted(false);

        btn_saveskills.setBackground(btnTextColor);
        btn_saveskills.setForeground(btnColor);
        btn_saveskills.setFont(btnFont);
        btn_saveskills.setFocusPainted(false);
        // ADD after your existing button styling code, inside try block:

// Welcome message with freelancer name
String welcomeName = (freelancer != null) ? freelancer.getname() : "Freelancer";
jLabel2.setText("Welcome, " + welcomeName + " !");
jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
jLabel2.setForeground(new java.awt.Color(184, 115, 81));
jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

// Center the title
jLabel1.setText("FREELANCER DASHBOARD");
jLabel1.setForeground(new java.awt.Color(54, 43, 36));

// Hover effect on all buttons
javax.swing.JButton[] buttons = {btnprofile, btnmybids, btnviewjobs, btnhome, btnlogout};
java.awt.Color hoverColor = new java.awt.Color(160, 90, 60);
java.awt.Color normalColor = new java.awt.Color(184, 115, 81);

for (javax.swing.JButton btn : buttons) {
    btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent e) {
            btn.setBackground(hoverColor);
        }
        public void mouseExited(java.awt.event.MouseEvent e) {
            btn.setBackground(normalColor);
        }
    });
    
    
}

// Hide unused components
jLabel9.setVisible(false);
jLabel10.setVisible(false);
jLabel11.setVisible(false);
btn_saveskills.setVisible(false);

    } 
    catch (Exception e) {
        System.out.println("Dashboard Styling Error: " + e.getMessage());
    }
    // ── ALIGNMENT FIX ──
        javax.swing.JPanel card = new javax.swing.JPanel(new java.awt.GridBagLayout());
        card.setBackground(new java.awt.Color(242, 230, 218));
        card.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Welcome label
        gbc.gridy = 0; gbc.insets = new java.awt.Insets(0, 0, 20, 0);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card.add(jLabel2, gbc);

        // Profile button
        gbc.gridy = 1; gbc.insets = new java.awt.Insets(0, 0, 10, 0);
        btnprofile.setPreferredSize(new java.awt.Dimension(300, 38));
        card.add(btnprofile, gbc);

        // My Bids button
        gbc.gridy = 2; gbc.insets = new java.awt.Insets(0, 0, 10, 0);
        btnmybids.setPreferredSize(new java.awt.Dimension(300, 38));
        card.add(btnmybids, gbc);

        // View Jobs button
        gbc.gridy = 3; gbc.insets = new java.awt.Insets(0, 0, 10, 0);
        btnviewjobs.setPreferredSize(new java.awt.Dimension(300, 38));
        card.add(btnviewjobs, gbc);

        // Home button
        gbc.gridy = 4; gbc.insets = new java.awt.Insets(0, 0, 10, 0);
        btnhome.setPreferredSize(new java.awt.Dimension(300, 38));
        card.add(btnhome, gbc);

        // Logout button
        gbc.gridy = 5; gbc.insets = new java.awt.Insets(0, 0, 0, 0);
        btnlogout.setPreferredSize(new java.awt.Dimension(300, 38));
        card.add(btnlogout, gbc);

        // Center card on frame
        javax.swing.JPanel outer = new javax.swing.JPanel(new java.awt.GridBagLayout());
        outer.setBackground(new java.awt.Color(242, 230, 218));
        outer.add(card);

        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(outer, java.awt.BorderLayout.CENTER);
        this.setSize(440, 380);
        this.setLocationRelativeTo(null);
        this.revalidate();
        this.repaint();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        skills_txt = new javax.swing.JTextField();
        toppanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_skills = new javax.swing.JTextField();
        btn_saveskills = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sidepanel = new javax.swing.JPanel();
        btnprofile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnmybids = new javax.swing.JButton();
        btnviewjobs = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();

        jButton1.setText("logout");

        jLabel4.setText("jLabel4");

        name_txt.setText("Name");
        name_txt.addActionListener(this::name_txtActionPerformed);

        email_txt.setText("Email");
        email_txt.addActionListener(this::email_txtActionPerformed);

        skills_txt.setText("Skills");

        jLabel1.setText("welcome freelancer");

        jLabel5.setText("welcome to FreeLance Job System");

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
        );

        txt_name.addActionListener(this::txt_nameActionPerformed);

        jLabel9.setText("Name");

        txt_email.addActionListener(this::txt_emailActionPerformed);

        btn_saveskills.setText("save");
        btn_saveskills.addActionListener(this::btn_saveskillsActionPerformed);

        jLabel10.setText("Email");

        jLabel11.setText("skill");

        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 28, -1, -1));
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 28, -1, -1));
        mainpanel.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 28, -1, -1));
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 56, -1, -1));

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnprofile.setText("profile");
        btnprofile.addActionListener(this::btnprofileActionPerformed);

        jLabel2.setText("WELCOME TO FREELANCE DASHBOARD");

        btnmybids.setText("mybids");
        btnmybids.addActionListener(this::btnmybidsActionPerformed);

        btnviewjobs.setText("view jobs");
        btnviewjobs.addActionListener(this::btnviewjobsActionPerformed);

        btnlogout.setText("logout");
        btnlogout.addActionListener(this::btnlogoutActionPerformed);

        btnhome.setText("home");
        btnhome.addActionListener(this::btnhomeActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmybids, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewjobs, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(btnprofile)
                .addGap(18, 18, 18)
                .addComponent(btnmybids)
                .addGap(24, 24, 24)
                .addComponent(btnviewjobs)
                .addGap(24, 24, 24)
                .addComponent(btnhome)
                .addGap(26, 26, 26)
                .addComponent(btnlogout)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (freelancer != null) {
        txt_name.setVisible(true);
        txt_email.setVisible(true);
        txt_skills.setVisible(true);
        
        jLabel9.setVisible(true); 
        jLabel10.setVisible(true);
        jLabel11.setVisible(true); 
        btn_saveskills.setVisible(true);

        String latestName = freelancer.getname();
        String latestEmail = freelancer.getemail();
        String latestSkills = "";

        java.io.File file = new java.io.File("users.txt");
        if (file.exists()) {
            try (java.util.Scanner scanner = new java.util.Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    if (line.isEmpty()) continue;
                    
                    String[] data = line.split(",");
                    if (data.length >= 6 && data[1].trim().equalsIgnoreCase(freelancer.getemail())) {
                        latestName = data[0].trim();
                        latestEmail = data[1].trim();
                        latestSkills = data[5].trim().replace("-", ", "); 
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Profile error: " + e.getMessage());
            }
        }

        txt_name.setText(latestName);
        txt_email.setText(latestEmail);
        txt_skills.setText(latestSkills.isEmpty() ? "Add your skills here..." : latestSkills);
        
        this.revalidate();
        this.repaint();
        
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Freelancer session expired! Please login again.");
    }
        
        new profile(this.freelancer).setVisible(true);
        this.dispose();
        
    }                                          

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btn_saveskillsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String updatedName = txt_name.getText().trim();
    String updatedEmail = txt_email.getText().trim();
    String updatedSkills = txt_skills.getText().trim();

    if (this.freelancer == null) {
        JOptionPane.showMessageDialog(this, "No profile loaded to update!");
        return;
    }

    String oldEmail = (currentEmailTracker != null) ? currentEmailTracker : this.freelancer.getemail();

    if (updatedName.isEmpty() || updatedEmail.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Name and Email fields cannot be empty!");
        return;
    }

    java.io.File file = new java.io.File("users.txt");
    java.util.ArrayList<String> fileLines = new java.util.ArrayList<>();
    boolean isUpdated = false;
    String skillsForFile = updatedSkills.replace(",", "-");

    try {
        java.util.Scanner scanner = new java.util.Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] data = line.split(",");

            if (data.length >= 5 && data[1].trim().equalsIgnoreCase(oldEmail)) {
                line = updatedName + "," + updatedEmail + "," + data[2] + "," + data[3] + "," + data[4] + "," + skillsForFile;
                isUpdated = true;
            }
            fileLines.add(line);
        }
        scanner.close();

        if (isUpdated) {
            try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(file, false))) {
                for (String fileLine : fileLines) writer.println(fileLine);
            }

            try {
                java.lang.reflect.Field nameField = this.freelancer.getClass().getSuperclass().getDeclaredField("name");
                nameField.setAccessible(true);
                nameField.set(this.freelancer, updatedName);

                java.lang.reflect.Field emailField = this.freelancer.getClass().getSuperclass().getDeclaredField("email");
                emailField.setAccessible(true);
                emailField.set(this.freelancer, updatedEmail);
            } catch (Exception ex) {
                System.out.println("Reflection error: " + ex.getMessage());
            }

            this.currentEmailTracker = updatedEmail;
            JOptionPane.showMessageDialog(this, "Profile updated successfully!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }                                              

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        home homeScreen = new home();
        homeScreen.setVisible(true);
        this.dispose();
    }                                       

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        LoginForm LoginFormScreen = new LoginForm();
        LoginFormScreen.setVisible(true);
        this.dispose();
    }                                         

    private void btnviewjobsActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ViewJob_Form ViewJob_FormScreen = new ViewJob_Form(this.freelancer);
        ViewJob_FormScreen.setVisible(true);
        this.dispose();
        
    }                                           

    private void btnmybidsActionPerformed(java.awt.event.ActionEvent evt) {                                          
        mybidsform mybidsformScreen = new mybidsform(this.freelancer);
        mybidsformScreen.setVisible(true);
        this.dispose();
    }                                         

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
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
        //java.awt.EventQueue.invokeLater(() -> new freelance_dashboard().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_saveskills;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmybids;
    private javax.swing.JButton btnprofile;
    private javax.swing.JButton btnviewjobs;
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField name_txt;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTextField skills_txt;
    private javax.swing.JPanel toppanel;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_skills;
    // End of variables declaration                   
}


