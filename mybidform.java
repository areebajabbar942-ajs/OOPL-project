/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author A
 */
public class mybidsform extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(mybidsform.class.getName());

    /**
     * Creates new form mybidsform
     */
    private Freelancer freelancer;
    public mybidsform(Freelancer freelancer) {
        initComponents();
        this.freelancer = freelancer;
        java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
        this.getContentPane().setBackground(lightNudeBeige);

        java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
        heading_txt.setText("YOUR APPLIED BIDS");
        heading_txt.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
        heading_txt.setForeground(coffeeBrown);
        heading_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        appliedbids.setForeground(coffeeBrown);
        lbl_useremail.setForeground(coffeeBrown);
        
        lbl_useremail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_useremail.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

        java.awt.Color btnColor = new java.awt.Color(184, 115, 81);
        java.awt.Color whiteText = java.awt.Color.WHITE;

        btn_back.setBackground(btnColor);
        btn_back.setForeground(whiteText);
        btn_back.setFocusPainted(false);

        table_bids.setBackground(new java.awt.Color(242, 230, 218));
        table_bids.setOpaque(true);
        table_bids.setRowHeight(30);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(242, 230, 218));
        jScrollPane1.setBackground(new java.awt.Color(242, 230, 218));

        table_bids.getTableHeader().setOpaque(false);
        table_bids.getTableHeader().setBackground(new java.awt.Color(54, 43, 36));
        table_bids.setForeground(java.awt.Color.BLACK);
        table_bids.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));

        table_bids.setBackground(lightNudeBeige);
        table_bids.setRowHeight(30);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(btnColor, 2));
        table_bids.setGridColor(btnColor);
        table_bids.setShowGrid(true);

        this.setLocationRelativeTo(null);

        if (this.freelancer != null) {
            String emailToDisplay = this.freelancer.getemail();
            if (emailToDisplay != null && !emailToDisplay.isEmpty()) {
                lbl_useremail.setText("Logged in as freelancer, email: " + emailToDisplay);
            } else {
                lbl_useremail.setText("Logged in as: N/A");
            }
        } else {
            lbl_useremail.setText("Logged in as: Guest");
        }

        populateBidsTable();
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
        topPanel.add(lbl_useremail, tgbc);

        // Middle: table
        table_bids.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(620, 145));
        mainCard.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        // Bottom panel
        javax.swing.JPanel bottomPanel = new javax.swing.JPanel(new java.awt.GridBagLayout());
        bottomPanel.setBackground(lightNudeBeige2);
        bottomPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        java.awt.GridBagConstraints bgbc = new java.awt.GridBagConstraints();
        bgbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        bgbc.weightx = 1.0;

        // Row 1: Accept + Decline centered
        bgbc.gridy = 0; bgbc.gridx = 0;
        bgbc.insets = new java.awt.Insets(0, 0, 12, 0);
        javax.swing.JPanel actionRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0));
        actionRow.setBackground(lightNudeBeige2);
        java.awt.Color btnColor2 = new java.awt.Color(184, 115, 81);
        btn_accept.setBackground(btnColor2);
        btn_accept.setForeground(java.awt.Color.WHITE);
        btn_accept.setFocusPainted(false);
        btn_decline.setBackground(btnColor2);
        btn_decline.setForeground(java.awt.Color.WHITE);
        btn_decline.setFocusPainted(false);
        btn_accept.setPreferredSize(new java.awt.Dimension(110, 36));
        btn_decline.setPreferredSize(new java.awt.Dimension(110, 36));
        actionRow.add(btn_accept);
        actionRow.add(btn_decline);
        bottomPanel.add(actionRow, bgbc);

        // Row 2: Back button left
        bgbc.gridy = 1;
        bgbc.insets = new java.awt.Insets(0, 0, 0, 0);
        javax.swing.JPanel backRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        backRow.setBackground(lightNudeBeige2);
        btn_back.setPreferredSize(new java.awt.Dimension(150, 34));
        backRow.add(btn_back);
        bottomPanel.add(backRow, bgbc);

        mainCard.add(topPanel, java.awt.BorderLayout.NORTH);
        mainCard.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(mainCard, java.awt.BorderLayout.CENTER);
        this.setSize(680, 420);
        this.setLocationRelativeTo(null);
        this.revalidate();
        this.repaint();
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

            // Status is last column (index 3)
            Object statusVal = table.getValueAt(row, 3);
            String status = (statusVal != null) ? statusVal.toString().toLowerCase().trim() : "";

            if (isSelected) {
                setBackground(new java.awt.Color(184, 115, 81)); // terracotta
                setForeground(java.awt.Color.WHITE);
            } else if (status.contains("hired") || status.contains("accepted")) {
                setBackground(new java.awt.Color(198, 239, 206)); // green
                setForeground(new java.awt.Color(0, 97, 0));
            } else if (status.contains("declined") || status.contains("rejected") || status.contains("closed")) {
                setBackground(new java.awt.Color(255, 199, 199)); // red
                setForeground(new java.awt.Color(156, 0, 0));
            } else if (status.contains("counter")) {
                setBackground(new java.awt.Color(173, 216, 230)); // light blue
                setForeground(new java.awt.Color(0, 70, 120));
            } else if (status.contains("pending")) {
                setBackground(new java.awt.Color(255, 235, 156)); // yellow/orange
                setForeground(new java.awt.Color(156, 101, 0));
            } else {
                setBackground(new java.awt.Color(242, 230, 218)); // default beige
                setForeground(java.awt.Color.BLACK);
            }
            return this;
        }
    });
    table_bids.repaint();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        appliedbids = new javax.swing.JLabel();
        heading_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_bids = new javax.swing.JTable();
        lbl_useremail = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_accept = new javax.swing.JButton();
        btn_decline = new javax.swing.JButton();

        appliedbids.setText("My Applied Bids");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading_txt.setText("                  Your Applied Bids");

        table_bids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Job ID", "Bid Amount", "Duration", "Status"
            }
        ));
        jScrollPane1.setViewportView(table_bids);

        lbl_useremail.setText("Logged in as freelancer email:  ");

        btn_back.setText("Back to Dashboard");
        btn_back.addActionListener(this::btn_backActionPerformed);

        btn_accept.setText("Accept");
        btn_accept.addActionListener(this::btn_acceptActionPerformed);

        btn_decline.setText("Decline");
        btn_decline.addActionListener(this::btn_declineActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbl_useremail))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(heading_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_accept)
                                .addGap(32, 32, 32)
                                .addComponent(btn_decline)))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(heading_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_useremail)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back)
                    .addComponent(btn_accept)
                    .addComponent(btn_decline))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>                        

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {                                         
        freelance_dashboard freelance_dashboardScreen = new freelance_dashboard(this.freelancer);
        freelance_dashboardScreen.setVisible(true);
        this.dispose();
    }                                        

    private void btn_acceptActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int selectedRow = table_bids.getSelectedRow();
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a bid first!");
        return;
    }

    String status = table_bids.getValueAt(selectedRow, 3).toString();
    if (!status.toLowerCase().contains("counter")) {
        javax.swing.JOptionPane.showMessageDialog(this, "You can only accept a Counter Offer!");
        return;
    }

    String jobId = table_bids.getValueAt(selectedRow, 0).toString();
    updateMyBidStatus(jobId, "Accepted");
    javax.swing.JOptionPane.showMessageDialog(this, "You accepted the counter offer! Client will be notified.");
    populateBidsTable();
    colorBidRows();
    }                                          

    private void btn_declineActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        int selectedRow = table_bids.getSelectedRow();
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a bid first!");
        return;
    }

    String jobId = table_bids.getValueAt(selectedRow, 0).toString();
    updateMyBidStatus(jobId, "Declined");
    javax.swing.JOptionPane.showMessageDialog(this, "Bid declined.");
    populateBidsTable();
    colorBidRows();
    }                                           

    
    private void updateMyBidStatus(String jobId, String newStatus) {
    java.io.File file = new java.io.File("bids.txt");
    java.util.ArrayList<String> fileLines = new java.util.ArrayList<>();

    try (java.util.Scanner reader = new java.util.Scanner(file)) {
        while (reader.hasNextLine()) {
            String line = reader.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] data = line.split(",");
            if (data.length >= 6 &&
                data[0].trim().equals(jobId) &&
                data[1].trim().equalsIgnoreCase(freelancer.getemail())) {
                // Update status only
                line = data[0].trim() + "," + data[1].trim() + "," +
                       data[2].trim() + "," + data[3].trim() + "," +
                       data[4].trim() + "," + newStatus;
            }
            fileLines.add(line);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(file, false))) {
        for (String line : fileLines) writer.println(line);
    } catch (Exception e) {
        System.out.println("Save error: " + e.getMessage());
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
            
            System.out.println("My Bids Form loaded successfully from dashboard!");
       });
    }
    
    private void populateBidsTable() {
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table_bids.getModel();
        model.setRowCount(0); 


        if (this.freelancer == null) {
            return;
        }

        String loggedInUserEmail = this.freelancer.getemail().trim();
        java.io.File file = new java.io.File("bids.txt");


        if (!file.exists()) {
            return;
        }

        try {

            java.util.Scanner reader = new java.util.Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (line.isEmpty()) continue;


                String[] data = line.split(",");


                if (data.length >= 6 && data[1].trim().equalsIgnoreCase(loggedInUserEmail)) {

                    String projectName = data[0];
                    String amount = data[2];
                    String duration = data[3];
                    String status = data[5];
                     if (status.toLowerCase().contains("counter")) {
                            amount = amount + " (Counter)";
                     }
                       
                    model.addRow(new Object[]{projectName, amount, duration, status});
                }
            }
            reader.close(); 

            if (table_bids.getColumnModel().getColumnCount() > 0) {
                table_bids.getColumnModel().getColumn(0).setPreferredWidth(100); 
                table_bids.getColumnModel().getColumn(1).setPreferredWidth(100); 
                table_bids.getColumnModel().getColumn(2).setPreferredWidth(100); 
                table_bids.getColumnModel().getColumn(3).setPreferredWidth(100); 
            }

        } 
        catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Table load error: " + e.getMessage());
        }
}

    // Variables declaration - do not modify                     
    private javax.swing.JLabel appliedbids;
    private javax.swing.JButton btn_accept;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_decline;
    private javax.swing.JLabel heading_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_useremail;
    private javax.swing.JTable table_bids;
    // End of variables declaration                   
}
