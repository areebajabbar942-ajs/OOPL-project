/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template


    private Freelancer freelancer;
/**
 *
 * @author abeeh
 */
public class ViewJob_Form extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewJob_Form.class.getName());

    /**
     * Creates new form ViewJob_Form
     */
    private Freelancer freelancer;
    public ViewJob_Form(Freelancer freelancer) {
        initComponents();
        this.setSize(800, 700);
        this.setLocationRelativeTo(null);
        this.freelancer = freelancer;
        
        java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
        java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
        java.awt.Color terracotta = new java.awt.Color(184, 115, 81); // Register form wala color

        this.getContentPane().setBackground(lightNudeBeige);

        jLabel1.setText("VIEW JOBS");
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
        jLabel1.setForeground(coffeeBrown);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // Center align

        btn_apply.setBackground(terracotta);
        btn_apply.setForeground(java.awt.Color.WHITE);
        btn_apply.setFocusPainted(false);

        Refresh_btn.setBackground(terracotta);
        Refresh_btn.setForeground(java.awt.Color.WHITE);
        Refresh_btn.setFocusPainted(false);

        BackToFreelancer_btn.setBackground(terracotta);
        BackToFreelancer_btn.setForeground(java.awt.Color.WHITE);
        BackToFreelancer_btn.setFocusPainted(false);

        JobView_table.setBackground(lightNudeBeige);
        JobView_table.setForeground(java.awt.Color.BLACK);
        JobView_table.setRowHeight(30);
        JobView_table.setGridColor(terracotta); // Grid lines terracotta
        JobView_table.setShowGrid(true);

        JobView_table.getTableHeader().setBackground(terracotta);
        JobView_table.getTableHeader().setForeground(java.awt.Color.BLACK);
        JobView_table.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(terracotta, 2));
        jScrollPane1.getViewport().setBackground(lightNudeBeige);

        this.setLocationRelativeTo(null);
            populateJobsTable();
            colorTableRows();

        try {
            FileManagement fm = new FileManagement("Jobs.txt");

            String[] columnNames = {"Job ID", "Title ", "Description", "Budget", "Client Name", "Deadline", "Status"};
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames, 0);// FileManagement wale method ko yeh model bhejlein taake data bhar jaye
            fm.loadJobsToTable(model);

            JobView_table.setModel(model);

            JobView_table.getColumnModel().getColumn(0).setPreferredWidth(70);   
            JobView_table.getColumnModel().getColumn(1).setPreferredWidth(300);  
            JobView_table.getColumnModel().getColumn(2).setPreferredWidth(550);  
            JobView_table.getColumnModel().getColumn(3).setPreferredWidth(120);  
            JobView_table.getColumnModel().getColumn(4).setPreferredWidth(150);
            JobView_table.getColumnModel().getColumn(5).setPreferredWidth(130);

        } catch (Exception e) {
            System.out.println("Error initializing table: " + e.getMessage());
        }
        
        // ── ALIGNMENT FIX ──
        java.awt.Color lightNudeBeige2 = new java.awt.Color(242, 230, 218);

        javax.swing.JPanel mainCard = new javax.swing.JPanel(new java.awt.BorderLayout(0, 8));
        mainCard.setBackground(lightNudeBeige2);
        mainCard.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));

        // Top: title
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainCard.add(jLabel1, java.awt.BorderLayout.NORTH);

        // Middle: table
        JobView_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        mainCard.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        // Bottom panel
        javax.swing.JPanel bottomPanel = new javax.swing.JPanel(new java.awt.GridBagLayout());
        bottomPanel.setBackground(lightNudeBeige2);
        bottomPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        java.awt.GridBagConstraints bgbc = new java.awt.GridBagConstraints();
        bgbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        bgbc.weightx = 1.0;

        // Row 1: Apply centered
        bgbc.gridy = 0; bgbc.gridx = 0;
        bgbc.insets = new java.awt.Insets(0, 0, 15, 0);
        javax.swing.JPanel applyRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        applyRow.setBackground(lightNudeBeige2);
        btn_apply.setPreferredSize(new java.awt.Dimension(200, 36));
        applyRow.add(btn_apply);
        bottomPanel.add(applyRow, bgbc);
        
        bgbc.gridy = 1;
        bgbc.insets = new java.awt.Insets(0, 0, 0, 0);
        javax.swing.JPanel leftCol = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 6));
        leftCol.setBackground(lightNudeBeige2);
        Refresh_btn.setPreferredSize(new java.awt.Dimension(200, 34));
        BackToFreelancer_btn.setPreferredSize(new java.awt.Dimension(220, 34));
        leftCol.add(Refresh_btn);
        leftCol.add(BackToFreelancer_btn);
        javax.swing.JPanel leftWrapper = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        leftWrapper.setBackground(lightNudeBeige2);
        leftWrapper.add(leftCol);
        bottomPanel.add(leftWrapper, bgbc);

        mainCard.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(mainCard, java.awt.BorderLayout.CENTER);
        this.setSize(950, 450);
        this.setLocationRelativeTo(null);
        this.revalidate();
        this.repaint();
    }
    
    private void colorTableRows() {
    JobView_table.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Get last column (Status)
            int lastCol = table.getColumnCount() - 1;
            Object statusVal = table.getValueAt(row, lastCol);
            String status = (statusVal != null) ? statusVal.toString().toLowerCase().trim() : "";

            if (isSelected) {
                setBackground(new java.awt.Color(184, 115, 81)); // terracotta when selected
                setForeground(java.awt.Color.WHITE);
            } else if (status.contains("hired") || status.contains("accepted")) {
                setBackground(new java.awt.Color(198, 239, 206)); // green
                setForeground(new java.awt.Color(0, 97, 0));
            } else if (status.contains("closed")) {
                setBackground(new java.awt.Color(255, 199, 199)); // red
                setForeground(new java.awt.Color(156, 0, 0));
            } else if (status.contains("open") || status.contains("pending")) {
                setBackground(new java.awt.Color(255, 235, 156)); // orange/yellow
                setForeground(new java.awt.Color(156, 101, 0));
            } else {
                setBackground(new java.awt.Color(242, 230, 218)); // default beige
                setForeground(java.awt.Color.BLACK);
            }
            return this;
        }
    });
    JobView_table.repaint();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        JobView_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Refresh_btn = new javax.swing.JButton();
        BackToFreelancer_btn = new javax.swing.JButton();
        btn_apply = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JobView_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Job ID", "Title ", "Description", "Budget", "Client Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(JobView_table);
        if (JobView_table.getColumnModel().getColumnCount() > 0) {
            JobView_table.getColumnModel().getColumn(0).setPreferredWidth(65);
            JobView_table.getColumnModel().getColumn(1).setPreferredWidth(200);
            JobView_table.getColumnModel().getColumn(2).setPreferredWidth(250);
            JobView_table.getColumnModel().getColumn(3).setPreferredWidth(70);
            JobView_table.getColumnModel().getColumn(4).setPreferredWidth(160);
        }

        jLabel1.setText("                   VIEW JOBS");

        Refresh_btn.setText("Refresh Jobs");
        Refresh_btn.addActionListener(this::Refresh_btnActionPerformed);

        BackToFreelancer_btn.setText("Back to Freelancer Dashboard");
        BackToFreelancer_btn.addActionListener(this::BackToFreelancer_btnActionPerformed);

        btn_apply.setText("Apply for Selected Job");
        btn_apply.addActionListener(this::btn_applyActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(btn_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Refresh_btn)
                                    .addComponent(BackToFreelancer_btn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 365, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Refresh_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackToFreelancer_btn)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void populateJobsTable() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) JobView_table.getModel();
        model.setRowCount(0);
        java.io.File file = new java.io.File("Jobs.txt");
        if (!file.exists()) {
        return;
        }
        
        try {
      
        java.util.Scanner reader = new java.util.Scanner(file);

        while (reader.hasNextLine()) {
            String line = reader.nextLine().trim();
            if (line.isEmpty()) continue;

            
            String[] data = line.split(",");
            System.out.println("Full Line: " + line);

            for (int i = 0; i < data.length; i++) {
                System.out.println("Index " + i + ": " + data[i]);
            }

            
            if (data.length >= 7) {
                String JobId = data[0].trim();
                String title = data[1].trim();
                String desc = data[2].trim();
                String budget = data[3].trim();
                String Client_Name = data[4].trim();
                String deadline = data[5].trim();
                String Status = data[6].trim();

                
                model.addRow(new Object[]{JobId, title, desc, budget, Client_Name,deadline, Status});
            }
        }
     
        reader.close();
        }
            catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "error in loading job" + e.getMessage());
        }
   }
    
    
    private void Refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
         populateJobsTable(); 
         colorTableRows(); 
    
        if (JobView_table.getColumnModel().getColumnCount() > 0) {
            JobView_table.getColumnModel().getColumn(0).setPreferredWidth(70);   
            JobView_table.getColumnModel().getColumn(1).setPreferredWidth(220);  
            JobView_table.getColumnModel().getColumn(2).setPreferredWidth(250);  
            JobView_table.getColumnModel().getColumn(3).setPreferredWidth(120);  
            JobView_table.getColumnModel().getColumn(4).setPreferredWidth(150);
            JobView_table.getColumnModel().getColumn(5).setPreferredWidth(130);
        }
    }                                           

    private void BackToFreelancer_btnActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
        freelance_dashboard fd= new freelance_dashboard(this.freelancer);
        fd.setVisible(true);
        this.dispose();
    
    }                                                    

    private void btn_applyActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
        // This must exist in btn_applyActionPerformed AFTER freelancer.getAppliedJobs().add(appliedJob)

        int selectedRow = JobView_table.getSelectedRow();
        if(selectedRow == -1){
           javax.swing.JOptionPane.showMessageDialog(this, "Please select a job from the table first to apply!");
           return;
        }


        int statusColumnIndex = -1;
        for (int i = 0; i < JobView_table.getColumnCount(); i++) {
            if (JobView_table.getColumnName(i).trim().equalsIgnoreCase("Status")) {
                statusColumnIndex = i;
                break;
            }
        }


        if (statusColumnIndex == -1) {
            statusColumnIndex = 4; 
        }


        Object statusObj = JobView_table.getValueAt(selectedRow, statusColumnIndex);
        String jobStatus = (statusObj != null) ? statusObj.toString().toLowerCase().trim() : "";


        if (jobStatus.contains("closed") || jobStatus.contains("hired")) {

            javax.swing.JOptionPane.showMessageDialog(this, 
                "This job is already Hired or Closed! You cannot place a bid on it.", 
                "Action Denied", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }


        String selectedJobId =
    JobView_table.getValueAt(selectedRow, 0).toString();

        String jobTitle =
        JobView_table.getValueAt(selectedRow, 1).toString();

        String appliedJob =
        "Job ID: " + selectedJobId +
        " | Title: " + jobTitle +
        " | Status: Applied";

        freelancer.getAppliedJobs().add(appliedJob);
        try {
    java.io.FileWriter fw = new java.io.FileWriter("applied_jobs.txt", true);
    fw.write(freelancer.getemail() + "," + appliedJob + "\n");
    fw.close();
    System.out.println("Saved to applied_jobs.txt: " + appliedJob); // debug
} catch (Exception e) {
    System.out.println("Error saving applied job: " + e.getMessage());
}
      
        Placebid placeBidForm =
        new Placebid(this.freelancer, selectedJobId);

        placeBidForm.setVisible(true);

        this.dispose();

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
            System.out.println("ViewJob_Form ready.");
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton BackToFreelancer_btn;
    private javax.swing.JTable JobView_table;
    private javax.swing.JButton Refresh_btn;
    private javax.swing.JButton btn_apply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
