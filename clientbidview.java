
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abeeh
 */
public class clientbidview extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(clientbidview.class.getName());
    private Client client;
    /**
     * Creates new form clientbidview
     */
    public clientbidview(Client client) {
        this.client = client;
        initComponents();
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
        new Object[][]{},
        new String[]{"Job ID", "Freelancer Email", "Bid Amount", "Their Duration", "Proposal", "Status"}
    );
    table_bids.setModel(model);
    
        this.setSize(800, 450);  // ADD THIS
        this.setLocationRelativeTo(null);
        this.setSize(1280, 720);
        // Center the heading
heading_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        // Make table auto resize to fill full width
table_bids.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

// Make scroll pane fill the window
jScrollPane1.setPreferredSize(new java.awt.Dimension(1240, 350));
        this.setLocationRelativeTo(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1240, 400));

        table_bids.getTableHeader().setReorderingAllowed(false); // prevent reordering
        table_bids.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); // allow manual resize
        
        java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
        java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
        java.awt.Color terracotta = new java.awt.Color(184, 115, 81);

        this.getContentPane().setBackground(lightNudeBeige);

        heading_txt.setText("Bids Received on Your Projects");
        heading_txt.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
        heading_txt.setForeground(coffeeBrown);

        lbl_clientemail.setForeground(coffeeBrown);
        lbl_clientemail.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

        btn_back.setBackground(terracotta);
        btn_back.setForeground(java.awt.Color.WHITE);
        btn_back.setFocusPainted(false);
        
       
       counter_btn.setBackground(terracotta);
       counter_btn.setForeground(java.awt.Color.WHITE);
       counter_btn.setFocusPainted(false);

// Also style Hire button same way
       hire_txt.setBackground(terracotta);
       hire_txt.setForeground(java.awt.Color.WHITE);
       hire_txt.setFocusPainted(false);

        hire_txt.setBackground(terracotta);
        hire_txt.setForeground(java.awt.Color.WHITE);
        hire_txt.setFocusPainted(false);

        refresh_btn.setBackground(terracotta);
        refresh_btn.setForeground(java.awt.Color.WHITE);
        refresh_btn.setFocusPainted(false);

        table_bids.setBackground(lightNudeBeige);
        table_bids.setForeground(java.awt.Color.BLACK);
        table_bids.setRowHeight(30);
        table_bids.setGridColor(terracotta);
        table_bids.setShowGrid(true);

        table_bids.getTableHeader().setBackground(terracotta);
        table_bids.getTableHeader().setForeground(java.awt.Color.BLACK);
        table_bids.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(terracotta, 2));
        jScrollPane1.getViewport().setBackground(lightNudeBeige);

        this.setLocationRelativeTo(null);
        
        String emailToShow = "Guest";
        
        if (this.client != null && this.client.getemail() != null) {
            emailToShow = this.client.getemail();
        } else {
            String savedEmail = System.getProperty("current.logged.in.email");
            if (savedEmail != null && !savedEmail.isEmpty()) {
                emailToShow = savedEmail;
            }
        }
        
        lbl_clientemail.setText("Logged in as: " + emailToShow);
        
        populateClientBidsTable(emailToShow);
        colorBidRows();
        
        // ── ALIGNMENT FIX ──
        java.awt.Color lightNudeBeige2 = new java.awt.Color(242, 230, 218);

        javax.swing.JPanel mainCard = new javax.swing.JPanel(new java.awt.BorderLayout(0, 8));
        mainCard.setBackground(lightNudeBeige2);
        mainCard.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));

        // Top: title + email
        javax.swing.JPanel topPanel = new javax.swing.JPanel(new java.awt.GridBagLayout());
        topPanel.setBackground(lightNudeBeige2);
        java.awt.GridBagConstraints tgbc = new java.awt.GridBagConstraints();
        tgbc.gridx = 0; tgbc.fill = java.awt.GridBagConstraints.HORIZONTAL; tgbc.weightx = 1.0;
        tgbc.gridy = 0; tgbc.insets = new java.awt.Insets(0, 0, 5, 0);
        heading_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topPanel.add(heading_txt, tgbc);
        tgbc.gridy = 1; tgbc.insets = new java.awt.Insets(0, 0, 0, 0);
        lbl_clientemail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topPanel.add(lbl_clientemail, tgbc);

        // Middle: table — height = header(30) + 4 rows(30each) = 150 + a little padding
        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 250));
        table_bids.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

        // Bottom: all 4 buttons in two rows
        javax.swing.JPanel bottomPanel = new javax.swing.JPanel(new java.awt.GridBagLayout());
        bottomPanel.setBackground(lightNudeBeige2);
        java.awt.GridBagConstraints bgbc = new java.awt.GridBagConstraints();
        bgbc.insets = new java.awt.Insets(8, 0, 0, 0);
        bgbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        bgbc.weightx = 1.0;

        // Row 1: Hire + Counter Offer centered
        bgbc.gridy = 0; bgbc.gridx = 0;
        javax.swing.JPanel row1 = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0));
        row1.setBackground(lightNudeBeige2);
        hire_txt.setPreferredSize(new java.awt.Dimension(110, 34));
        counter_btn.setPreferredSize(new java.awt.Dimension(130, 34));
        row1.add(hire_txt);
        row1.add(counter_btn);
        bottomPanel.add(row1, bgbc);

        // Row 2: Refresh + Back stacked in left column
        bgbc.gridy = 1;
        javax.swing.JPanel row2 = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 6));
        row2.setBackground(lightNudeBeige2);
        refresh_btn.setPreferredSize(new java.awt.Dimension(160, 34));
        btn_back.setPreferredSize(new java.awt.Dimension(160, 34));
        row2.add(refresh_btn);
        row2.add(btn_back);

        javax.swing.JPanel row2wrapper = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        row2wrapper.setBackground(lightNudeBeige2);
        row2wrapper.add(row2);
        bottomPanel.add(row2wrapper, bgbc);
        
        mainCard.add(topPanel, java.awt.BorderLayout.NORTH);
        mainCard.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        mainCard.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(mainCard, java.awt.BorderLayout.CENTER);
        this.setSize(900, 520);
        this.setLocationRelativeTo(null);
        this.revalidate();
        this.repaint();
    }
    
    
    private void colorBidRows() {
    table_bids.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            int lastCol = table.getColumnCount() - 1;
            Object statusVal = table.getValueAt(row, lastCol);
            String status = (statusVal != null) ? statusVal.toString().toLowerCase().trim() : "";

            if (isSelected) {
                setBackground(new java.awt.Color(184, 115, 81));
                setForeground(java.awt.Color.WHITE);
            } else if (status.contains("hired") || status.contains("accepted")) {
                setBackground(new java.awt.Color(198, 239, 206)); // green
                setForeground(new java.awt.Color(0, 97, 0));
            } else if (status.contains("closed") || status.contains("declined")) {
                setBackground(new java.awt.Color(255, 199, 199)); // red
                setForeground(new java.awt.Color(156, 0, 0));
            } else if (status.contains("pending")) {
                setBackground(new java.awt.Color(255, 235, 156)); // orange/yellow
                setForeground(new java.awt.Color(156, 101, 0));
            } else if (status.contains("counter")) {
                setBackground(new java.awt.Color(173, 216, 230)); // light blue for counter offers
                setForeground(new java.awt.Color(0, 70, 120));
            } else {
                setBackground(new java.awt.Color(242, 230, 218)); // beige
                setForeground(java.awt.Color.BLACK);
            }
            return this;
        }
    });
    table_bids.repaint();
}
    
    private void populateClientBidsTable(String loggedInEmail) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table_bids.getModel();
        model.setRowCount(0); 
        
        if (loggedInEmail == null || loggedInEmail.equals("Guest") || loggedInEmail.isEmpty()) {
            System.out.println("Client email missing or Guest mode. Table loading skipped.");
            return;
        }

        java.io.File file = new java.io.File("bids.txt");

        if (!file.exists()) {
            System.out.println("bids.txt file did not form!");
            return;
        }

        try {
            java.util.Scanner reader = new java.util.Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] data = line.split(",");
                System.out.println("Full Line read from file: " + line);

                if (data.length >= 6) {
                    String projectName    = data[0].trim();
                    String freelancerEmail = data[1].trim();
                    String amount          = data[2].trim();
                    String duration        = data[3].trim();
                    String proposal        = data[4].trim();
                    String status          = data[5].trim(); 

                    model.addRow(new Object[]{projectName, freelancerEmail, amount, duration,proposal, status});
                } else {
                    System.out.println("Line skip (Incomplete Data): " + line);
                }
            }
            reader.close(); 
            
            if (table_bids.getColumnModel().getColumnCount() > 0) {
            table_bids.getColumnModel().getColumn(0).setPreferredWidth(80); 
            table_bids.getColumnModel().getColumn(1).setPreferredWidth(220); 
            table_bids.getColumnModel().getColumn(2).setPreferredWidth(180);  
            table_bids.getColumnModel().getColumn(3).setPreferredWidth(150); 
            table_bids.getColumnModel().getColumn(4).setPreferredWidth(500); 
             table_bids.getColumnModel().getColumn(5).setPreferredWidth(200); 
        }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Table load error: " + e.getMessage());
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

        lbl_clientemail = new javax.swing.JLabel();
        heading_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_bids = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();
        hire_txt = new javax.swing.JButton();
        refresh_btn = new javax.swing.JButton();
        counter_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_clientemail.setText("logged in as client email: ");

        heading_txt.setText("Bids recieved on your projects");

        table_bids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Job ID", "Freelancer email", "Amount", "Duration", "Status"
            }
        ));
        jScrollPane1.setViewportView(table_bids);

        btn_back.setText("Back to dashboard");
        btn_back.addActionListener(this::btn_backActionPerformed);

        hire_txt.setText("Hire");
        hire_txt.addActionListener(this::hire_txtActionPerformed);

        refresh_btn.setText("Refresh bids");
        refresh_btn.addActionListener(this::refresh_btnActionPerformed);

        counter_btn.setText("Counter Offer");
        counter_btn.addActionListener(this::counter_btnActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_clientemail)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refresh_btn)
                            .addComponent(btn_back)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(hire_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(counter_btn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(heading_txt)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(heading_txt)
                .addGap(28, 28, 28)
                .addComponent(lbl_clientemail)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hire_txt)
                    .addComponent(counter_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(refresh_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_back)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>                        

    
    
    private void hire_txtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int selectedRow = table_bids.getSelectedRow();
    
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a bid from the table first!");
        return;
    }
    
    String jobId = table_bids.getValueAt(selectedRow, 0).toString();
    String freelancerEmail = table_bids.getValueAt(selectedRow, 1).toString();
    String currentStatus = table_bids.getValueAt(selectedRow, 5).toString();
    
    if (currentStatus.equalsIgnoreCase("Hired")) {
        javax.swing.JOptionPane.showMessageDialog(this, "This freelancer is already hired for this job!");
        return;
    }
    
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to hire " + freelancerEmail + " for Job ID: " + jobId + "?", 
            "Confirm Hiring", javax.swing.JOptionPane.YES_NO_OPTION);
            
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        updateJobStatusToFilled(jobId);
        updateBidStatusInFile(jobId, freelancerEmail, null, null, "Hired");
        javax.swing.JOptionPane.showMessageDialog(this, "Freelancer hired successfully!");
    }
    }                                        

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Client_Dashboard cd = new Client_Dashboard(this.client);
        cd.setVisible(true);
        this.dispose();
    }                                        

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        String currentEmail = lbl_clientemail.getText().replace("Logged in as: ", "").trim();
        if (!currentEmail.isEmpty() && !currentEmail.equals("Guest")) {
            populateClientBidsTable(currentEmail);

            if (table_bids.getColumnModel().getColumnCount() > 0) {
                table_bids.getColumnModel().getColumn(0).setPreferredWidth(80); 
                table_bids.getColumnModel().getColumn(1).setPreferredWidth(220); 
                table_bids.getColumnModel().getColumn(2).setPreferredWidth(180);  
                table_bids.getColumnModel().getColumn(3).setPreferredWidth(150); 
                table_bids.getColumnModel().getColumn(4).setPreferredWidth(500);  
                table_bids.getColumnModel().getColumn(5).setPreferredWidth(200);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Cannot refresh in Guest mode.");
        }
        
        populateClientBidsTable(currentEmail);
        colorBidRows();
        
    }                                           

    private void counter_btnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        int selectedRow = table_bids.getSelectedRow();
        
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a bid to make a counter offer!");
            return;
        }
        
        String jobId = table_bids.getValueAt(selectedRow, 0).toString();
        String freelancerEmail = table_bids.getValueAt(selectedRow, 1).toString();
        String currentStatus = table_bids.getValueAt(selectedRow, 5).toString(); // Status column index 5
        
        if (currentStatus.equalsIgnoreCase("Hired") || currentStatus.equalsIgnoreCase("Accepted")) {
            javax.swing.JOptionPane.showMessageDialog(this, "You cannot bargain! Project is already closed/hired.");
            return;
        }
        
        // Step 1: Input custom counter price
        String counterAmount = javax.swing.JOptionPane.showInputDialog(this, 
                "Enter your counter offer amount ($) for " + freelancerEmail + ":", 
                "Bargain Budget", javax.swing.JOptionPane.QUESTION_MESSAGE);
                
        if (counterAmount == null || counterAmount.trim().isEmpty()) return; // User cancelled
        
        // Step 2: Input custom counter duration
        String counterDuration = javax.swing.JOptionPane.showInputDialog(this, 
                "Enter proposed duration (e.g., '2 weeks' or '10 days'):", 
                "Bargain Duration", javax.swing.JOptionPane.QUESTION_MESSAGE);
                
        if (counterDuration == null || counterDuration.trim().isEmpty()) return; // User cancelled
        
        // Step 3: File Update 
        updateBidStatusInFile(jobId, freelancerEmail, counterAmount.trim(), counterDuration.trim(), "Counter (By Client)");
    }                                           

    private void updateBidStatusInFile(String jobId, String freelancerEmail, String targetAmount, String targetDuration, String newStatus) {
        java.io.File file = new java.io.File("bids.txt");
        java.util.ArrayList<String> fileLines = new java.util.ArrayList<>();
        boolean updated = false;

        if (!file.exists()) {
            javax.swing.JOptionPane.showMessageDialog(this, "bids.txt file missing!");
            return;
        }

        try (java.util.Scanner reader = new java.util.Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] data = line.split(",");

                // Exact tracking using Job ID and Freelancer Email
                if (data.length >= 6 && data[0].trim().equalsIgnoreCase(jobId) && data[1].trim().equalsIgnoreCase(freelancerEmail)) {
                    
                
                    String finalAmount = (targetAmount != null) ? targetAmount : data[2].trim();
                    String finalDuration = (targetDuration != null) ? targetDuration : data[3].trim();
                    
                    String updatedLine = data[0].trim() + ", " + 
                                         data[1].trim() + ", " + 
                                         finalAmount + ", " + 
                                         finalDuration + ", " + 
                                         data[4].trim() + ", " + 
                                         newStatus;
                    fileLines.add(updatedLine);
                    updated = true;
                } else {
                    fileLines.add(line); 
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
            return;
        }

        if (updated) {
            try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(file, false))) {
                for (String line : fileLines) {
                    writer.println(line);
                }
                javax.swing.JOptionPane.showMessageDialog(this, "Action Successful! Record status updated to: " + newStatus);

                String currentEmail = lbl_clientemail.getText().replace("Logged in as: ", "").trim();
                populateClientBidsTable(currentEmail);
                colorBidRows();

            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Could not match the bid in records.");
        }
    }
    
    private void updateJobStatusToFilled(String targetJobId) {
    java.io.File file = new java.io.File("Jobs.txt");
    java.util.ArrayList<String> fileLines = new java.util.ArrayList<>();
    boolean isUpdated = false;

    if (!file.exists()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: Jobs.txt file not found!");
        return;
    }

    try {
        java.util.Scanner reader = new java.util.Scanner(file);

        while (reader.hasNextLine()) {
            String line = reader.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] data = line.split(",");
            
            
            if (line.contains(targetJobId)) {
    String[] parts = line.split(",");
    if (parts[parts.length - 1].trim().equalsIgnoreCase("open")) {
        parts[parts.length - 1] = "closed";
        line = String.join(",", parts);
        isUpdated = true;
    }
    fileLines.add(line);
} else {
    fileLines.add(line);
}
        }
        reader.close();
        
        if (table_bids.getColumnModel().getColumnCount() > 0) {
            table_bids.getColumnModel().getColumn(0).setPreferredWidth(80); 
            table_bids.getColumnModel().getColumn(1).setPreferredWidth(220); 
            table_bids.getColumnModel().getColumn(2).setPreferredWidth(180);  
            table_bids.getColumnModel().getColumn(3).setPreferredWidth(150); 
            table_bids.getColumnModel().getColumn(4).setPreferredWidth(500);  
            table_bids.getColumnModel().getColumn(5).setPreferredWidth(200);  
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error reading Jobs file: " + e.getMessage());
        return;
    }

    if (isUpdated) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(file, false))) {
            for (String line : fileLines) {
                writer.println(line);
            }
            System.out.println("Jobs.txt updated: Job status updated.");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving updated job status: " + e.getMessage());
        }
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
        java.awt.EventQueue.invokeLater(() -> {
            System.out.println("ClientViewBids_Form ready.");
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_back;
    private javax.swing.JButton counter_btn;
    private javax.swing.JLabel heading_txt;
    private javax.swing.JButton hire_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_clientemail;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JTable table_bids;
    // End of variables declaration                   
}
