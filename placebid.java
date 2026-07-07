/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author A
 */
import javax.swing.JOptionPane;
public class Placebid extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Placebid.class.getName());

    /**
     * Creates new form Placebid
     */
    private Freelancer freelancer;
    private String selectedJobId;
    
    public Placebid(Freelancer freelancer , String jobId) {
        initComponents();
        this.setSize(800, 700);
        this.setLocationRelativeTo(null);
        this.freelancer = freelancer;
        this.selectedJobId = jobId;
         job_txt.setText(jobId);        // ADD THIS - auto fill job id
         job_txt.setEditable(false);
        java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
        this.getContentPane().setBackground(lightNudeBeige);

        java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
        placebid.setForeground(coffeeBrown);
        jLabel1.setForeground(coffeeBrown);
        jLabel2.setForeground(coffeeBrown);
        jLabel3.setForeground(coffeeBrown);
        jLabel4.setForeground(coffeeBrown);
        
        java.awt.Font boldLabel = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13);

        jLabel1.setFont(boldLabel);
        jLabel2.setFont(boldLabel);
        jLabel3.setFont(boldLabel);
        jLabel4.setFont(boldLabel);
        
        placebid.setText("PLACE YOUR BID");
        placebid.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
        placebid.setForeground(coffeeBrown);
        placebid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);


        java.awt.Color btnColor = new java.awt.Color(184, 115, 81);
        java.awt.Color whiteText = java.awt.Color.WHITE;

        submit_txt.setBackground(btnColor);
        submit_txt.setForeground(whiteText);
        submit_txt.setFocusPainted(false);

        back_txt.setBackground(btnColor);
        back_txt.setForeground(whiteText);
        back_txt.setFocusPainted(false);

        job_txt.setBackground(java.awt.Color.WHITE);
        bidamount_txt.setBackground(java.awt.Color.WHITE);
        proposal_txt.setBackground(java.awt.Color.WHITE);
        deadline_txt.setBackground(java.awt.Color.WHITE);

        this.setLocationRelativeTo(null);
        
        /// ── ALIGNMENT FIX ──
        java.awt.Color lightNudeBeige2 = new java.awt.Color(242, 230, 218);
        javax.swing.JPanel card = new javax.swing.JPanel(new java.awt.GridBagLayout());
        card.setBackground(lightNudeBeige2);
        card.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Title
        gbc.gridy = 0; gbc.insets = new java.awt.Insets(0, 0, 25, 0);
        placebid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card.add(placebid, gbc);

        // Job ID label
        gbc.gridy = 1; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel1, gbc);

        // Job ID field
        gbc.gridy = 2; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        job_txt.setPreferredSize(new java.awt.Dimension(380, 32));
        card.add(job_txt, gbc);

        // Bid Amount label
        gbc.gridy = 3; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel2, gbc);

        // Bid Amount field
        gbc.gridy = 4; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        bidamount_txt.setPreferredSize(new java.awt.Dimension(380, 32));
        card.add(bidamount_txt, gbc);

        // Proposal label
        gbc.gridy = 5; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel3, gbc);

        // Proposal field
        gbc.gridy = 6; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        proposal_txt.setPreferredSize(new java.awt.Dimension(380, 80));
        card.add(proposal_txt, gbc);

        // Duration label
        gbc.gridy = 7; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(jLabel4, gbc);

        // Duration field
        gbc.gridy = 8; gbc.insets = new java.awt.Insets(0, 0, 25, 0);
        deadline_txt.setPreferredSize(new java.awt.Dimension(380, 32));
        card.add(deadline_txt, gbc);

        // Submit button centered
        gbc.gridy = 9; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        javax.swing.JPanel submitRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        submitRow.setBackground(lightNudeBeige2);
        submit_txt.setPreferredSize(new java.awt.Dimension(160, 36));
        submitRow.add(submit_txt);
        card.add(submitRow, gbc);

        // Back button bottom left
        gbc.gridy = 10; gbc.insets = new java.awt.Insets(0, 0, 0, 0);
        javax.swing.JPanel backRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        backRow.setBackground(lightNudeBeige2);
        back_txt.setPreferredSize(new java.awt.Dimension(100, 34));
        backRow.add(back_txt);
        card.add(backRow, gbc);

        // Center card on frame
        javax.swing.JPanel outer = new javax.swing.JPanel(new java.awt.GridBagLayout());
        outer.setBackground(lightNudeBeige2);
        outer.add(card);
        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(outer, java.awt.BorderLayout.CENTER);
        this.setSize(540, 560);
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

        placebid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        job_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bidamount_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        proposal_txt = new javax.swing.JTextField();
        submit_txt = new javax.swing.JButton();
        back_txt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        deadline_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        placebid.setText("PLACE YOUR BID");

        jLabel1.setText("Enter Job ID");

        job_txt.addActionListener(this::job_txtActionPerformed);

        jLabel2.setText("Enter Your Bid Amount ($)");

        bidamount_txt.addActionListener(this::bidamount_txtActionPerformed);

        jLabel3.setText("Why Should a Client Hire You?");

        submit_txt.setText("Submit Bid");
        submit_txt.addActionListener(this::submit_txtActionPerformed);

        back_txt.setText("Back");
        back_txt.addActionListener(this::back_txtActionPerformed);

        jLabel4.setText("Duration (days)");

        deadline_txt.addActionListener(this::deadline_txtActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(proposal_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(bidamount_txt)
                            .addComponent(job_txt)
                            .addComponent(deadline_txt))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(placebid, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_txt)
                .addGap(85, 85, 85)
                .addComponent(submit_txt)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(placebid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(job_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bidamount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(proposal_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deadline_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_txt)
                    .addComponent(back_txt))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void bidamount_txtActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void job_txtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void back_txtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        freelance_dashboard freelance_dashboardScreen = new freelance_dashboard(this.freelancer);
        freelance_dashboardScreen.setVisible(true);
        this.dispose();
        
    }                                        

    private void submit_txtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String jobId = job_txt.getText().trim();
        String amountStr = bidamount_txt.getText().trim();
        String proposal = proposal_txt.getText().trim();
        String durationStr = deadline_txt.getText().trim();
        String status = "Pending";

        if (jobId.isEmpty() || amountStr.isEmpty() || durationStr.isEmpty() || proposal.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
         

            java.io.FileWriter writer = new java.io.FileWriter("bids.txt", true);

            String cleanProposal = proposal.replace(",", " ");

            String bidLine = jobId + "," +
                             freelancer.getemail() + "," +
                             amount + "," +
                             durationStr + "," +
                             cleanProposal + "," + 
                             status + "\n";

            writer.write(bidLine);
            writer.close();

            javax.swing.JOptionPane.showMessageDialog(this, "Your bid has been placed successfully!");

            freelance_dashboard dashboard = new freelance_dashboard(this.freelancer);
            dashboard.setVisible(true);
            this.dispose(); 

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Format Error: Bid Amount and Deadline must be numbers!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
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

        java.awt.EventQueue.invokeLater(() -> {
            
            System.out.println("Placebid screen ready to be called from dashboard.");
        });
      }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton back_txt;
    private javax.swing.JTextField bidamount_txt;
    private javax.swing.JTextField deadline_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField job_txt;
    private javax.swing.JLabel placebid;
    private javax.swing.JTextField proposal_txt;
    private javax.swing.JButton submit_txt;
    // End of variables declaration                   
}
