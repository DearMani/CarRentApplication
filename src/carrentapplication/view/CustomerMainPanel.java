/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package carrentapplication.view;

/**
 *
 * @author Manidu
 */
public class CustomerMainPanel extends javax.swing.JPanel {
          private static String userName;
    /**
     * Creates new form CustomerMainPanel
     * @param userName
     */
    public CustomerMainPanel(String userName) {
        CustomerMainPanel.userName =userName;
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        carRentButton = new javax.swing.JButton();
        accounttButton = new javax.swing.JButton();
        carRentedDetailButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        carRentButton.setBackground(new java.awt.Color(102, 0, 255));
        carRentButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carRentButton.setForeground(new java.awt.Color(0, 0, 0));
        carRentButton.setText("Rent A Car");
        carRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carRentButtonActionPerformed(evt);
            }
        });

        accounttButton.setBackground(new java.awt.Color(102, 0, 255));
        accounttButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accounttButton.setForeground(new java.awt.Color(0, 0, 0));
        accounttButton.setText("Account");

        carRentedDetailButton.setBackground(new java.awt.Color(102, 0, 255));
        carRentedDetailButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carRentedDetailButton.setForeground(new java.awt.Color(0, 0, 0));
        carRentedDetailButton.setText(" Your Rented Car");
        carRentedDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carRentedDetailButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accounttButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carRentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carRentedDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(accounttButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(carRentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(carRentedDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        bodyPanel.setBackground(new java.awt.Color(0, 51, 51));
        bodyPanel.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carRentButtonActionPerformed
        rentPanel();
    }//GEN-LAST:event_carRentButtonActionPerformed

    private void carRentedDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carRentedDetailButtonActionPerformed
        rentedDetailPanel();
    }//GEN-LAST:event_carRentedDetailButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accounttButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton carRentButton;
    private javax.swing.JButton carRentedDetailButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

 private void rentPanel(){
        bodyPanel.removeAll();
        RentPanel rentPanel =new RentPanel(userName);
         rentPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
         bodyPanel.add(rentPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();  

    }
 
  private void rentedDetailPanel(){
        bodyPanel.removeAll();
        YourRentedPanel yourRentedDetailPanel =new YourRentedPanel(userName);
         yourRentedDetailPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
         bodyPanel.add(yourRentedDetailPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();  

    }
          







}
