/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abeeh
 */
public class PostJob_Form extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PostJob_Form.class.getName());

    /**
     * Creates new form PostJob_Form
     */
    public PostJob_Form() {
        initComponents();
        this.setSize(600, 660);
        this.setLocationRelativeTo(null);
        this.client = client;
        java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
        this.getContentPane().setBackground(lightNudeBeige);

        java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
        jLabel1.setForeground(coffeeBrown);
        jLabel2.setForeground(coffeeBrown);
        jLabel3.setForeground(coffeeBrown);
        jLabel4.setForeground(coffeeBrown);

        jLabel5.setText("JOB POST FORM");
        jLabel5.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
        jLabel5.setForeground(coffeeBrown);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        java.awt.Color btnColor = new java.awt.Color(184, 115, 81);
        java.awt.Color whiteText = java.awt.Color.WHITE;

        post_btn.setBackground(btnColor);
        post_btn.setForeground(whiteText);
        post_btn.setFocusPainted(false);

        exit_btn.setBackground(btnColor);
        exit_btn.setForeground(whiteText);
        exit_btn.setFocusPainted(false);

        id_txt.setBackground(java.awt.Color.WHITE);
        title_txt.setBackground(java.awt.Color.WHITE);
        desc_txt.setBackground(java.awt.Color.WHITE);
        Budget_txt.setBackground(java.awt.Color.WHITE);

        this.setLocationRelativeTo(null);
    }
    
    public PostJob_Form(Client client) {
    initComponents();
    this.client = client;  
    
    java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
    this.getContentPane().setBackground(lightNudeBeige);
    java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
    jLabel1.setForeground(coffeeBrown);
    jLabel2.setForeground(coffeeBrown);
    jLabel3.setForeground(coffeeBrown);
    jLabel4.setForeground(coffeeBrown);
    
    java.awt.Font boldLabel = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13);

        jLabel1.setFont(boldLabel);
        jLabel2.setFont(boldLabel);
        jLabel3.setFont(boldLabel);
        jLabel4.setFont(boldLabel);
        jLabel6.setFont(boldLabel);
    
    jLabel5.setText("JOB POST FORM");
    jLabel5.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
    jLabel5.setForeground(coffeeBrown);
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    java.awt.Color btnColor = new java.awt.Color(184, 115, 81);
    java.awt.Color whiteText = java.awt.Color.WHITE;
    post_btn.setBackground(btnColor);
    post_btn.setForeground(whiteText);
    post_btn.setFocusPainted(false);
    exit_btn.setBackground(btnColor);
    exit_btn.setForeground(whiteText);
    exit_btn.setFocusPainted(false);
    id_txt.setBackground(java.awt.Color.WHITE);
    title_txt.setBackground(java.awt.Color.WHITE);
    desc_txt.setBackground(java.awt.Color.WHITE);
    Budget_txt.setBackground(java.awt.Color.WHITE);
    this.setLocationRelativeTo(null);
    
    // ── ALIGNMENT FIX ──
        javax.swing.JPanel card = new javax.swing.JPanel(new java.awt.GridBagLayout());
        card.setBackground(new java.awt.Color(242, 230, 218));
        card.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Title
        gbc.gridy = 0; gbc.insets = new java.awt.Insets(0, 0, 25, 0);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card.add(jLabel5, gbc);

        // Job ID label
        gbc.gridy = 1; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel1, gbc);

        // Job ID field
        gbc.gridy = 2; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        id_txt.setPreferredSize(new java.awt.Dimension(380, 32));
        card.add(id_txt, gbc);

        // Title label
        gbc.gridy = 3; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel2, gbc);

        // Title field
        gbc.gridy = 4; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        title_txt.setPreferredSize(new java.awt.Dimension(380, 32));
        card.add(title_txt, gbc);

        // Description label
        gbc.gridy = 5; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel3, gbc);

        // Description field
        gbc.gridy = 6; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        desc_txt.setPreferredSize(new java.awt.Dimension(380, 80));
        card.add(desc_txt, gbc);

        // Budget label
        gbc.gridy = 7; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel4, gbc);

        // Budget field
        gbc.gridy = 8; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        Budget_txt.setPreferredSize(new java.awt.Dimension(380, 32));
        card.add(Budget_txt, gbc);

        // Duration label  
        gbc.gridy = 9; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel6, gbc);

        // Duration field
        gbc.gridy = 10; gbc.insets = new java.awt.Insets(0, 0, 25, 0);
        deadline_txt.setPreferredSize(new java.awt.Dimension(380, 32));
        card.add(deadline_txt, gbc);

        // Buttons row
        gbc.gridy = 11; gbc.insets = new java.awt.Insets(0, 0, 0, 0);
        javax.swing.JPanel btnRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));
        btnRow.setBackground(new java.awt.Color(242, 230, 218));
        post_btn.setPreferredSize(new java.awt.Dimension(120, 36));
        exit_btn.setPreferredSize(new java.awt.Dimension(170, 36));
        btnRow.add(post_btn);
        btnRow.add(exit_btn);
        card.add(btnRow, gbc);

        // Center card on frame
        javax.swing.JPanel outer = new javax.swing.JPanel(new java.awt.GridBagLayout());
        outer.setBackground(new java.awt.Color(242, 230, 218));
        outer.add(card);

        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(outer, java.awt.BorderLayout.CENTER);
        this.setSize(540, 620);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        title_txt = new javax.swing.JTextField();
        desc_txt = new javax.swing.JTextField();
        Budget_txt = new javax.swing.JTextField();
        post_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deadline_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Job ID");

        jLabel2.setText("Title");

        jLabel3.setText("Description");

        jLabel4.setText("Budget");

        jLabel5.setText(" JOB POST FORM");

        id_txt.addActionListener(this::id_txtActionPerformed);

        title_txt.addActionListener(this::title_txtActionPerformed);

        desc_txt.addActionListener(this::desc_txtActionPerformed);

        Budget_txt.addActionListener(this::Budget_txtActionPerformed);

        post_btn.setText("Post Job");
        post_btn.addActionListener(this::post_btnActionPerformed);

        exit_btn.setText("Back to dashboard");
        exit_btn.addActionListener(this::exit_btnActionPerformed);

        jLabel6.setText("Duration");

        deadline_txt.addActionListener(this::deadline_txtActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deadline_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(post_btn)
                            .addGap(103, 103, 103)
                            .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(desc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Budget_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(185, 185, 185)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Budget_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deadline_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(post_btn)
                            .addComponent(exit_btn)))
                    .addComponent(jLabel2))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>                        

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void title_txtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void desc_txtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void Budget_txtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    public static Client client;
    
    private void post_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    String idStr = id_txt.getText().trim();
    String title = title_txt.getText().trim();
    String desc = desc_txt.getText().trim();
    String budgetStr = Budget_txt.getText().trim();
    String deadline = deadline_txt.getText().trim();

    if (idStr.isEmpty() || title.isEmpty() || desc.isEmpty() || budgetStr.isEmpty() || deadline.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill all fields!");
        return;
    }
    
    try {
        int jobId = Integer.parseInt(idStr);
        double budget = Double.parseDouble(budgetStr);

        Job j = client.postJob(jobId, title, desc, budget , deadline);
        FileManagement file = new FileManagement("Jobs.txt");
        file.appendFile(j.getJobInfo());

        javax.swing.JOptionPane.showMessageDialog(this, "Job posted successfully by: " + client.getName());

        id_txt.setText("");
        title_txt.setText("");
        desc_txt.setText("");
        Budget_txt.setText("");
        deadline_txt.setText("");
        
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Job ID and Budget must be numbers!");
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "System Error: " + e.getMessage());
    }
    
    
    }                                        

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new Client_Dashboard(this.client).setVisible(true);
        this.dispose();
    }                                        

    private void deadline_txtActionPerformed(java.awt.event.ActionEvent evt) {                                             
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
        java.awt.EventQueue.invokeLater(() -> new PostJob_Form().setVisible(true));
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JTextField Budget_txt;
    private javax.swing.JTextField deadline_txt;
    private javax.swing.JTextField desc_txt;
    private javax.swing.JButton exit_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton post_btn;
    private javax.swing.JTextField title_txt;
    // End of variables declaration                   
}
