/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package carrentapplication.view;
import carrentapplication.controller.CustomerController;
import carrentapplication.dto.CustomerDto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import  javax.swing.table.DefaultTableModel;


/**
 *
 * @author Manidu
 */
public class CustomerPanel extends javax.swing.JPanel {
        private CustomerController customerController;
    /**
     * Creates new form CustomerPanel
     */
    public CustomerPanel() {
        customerController =new CustomerController();
        initComponents();
        clearText();
        loadAllCustomers();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        phoneNumberLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameLabel1 = new javax.swing.JLabel();
        nameTextField1 = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        PhoneNumberTextField2 = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        ageLabel1 = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        customerTable.setBackground(new java.awt.Color(204, 255, 204));
        customerTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        customerTable.setForeground(new java.awt.Color(0, 0, 0));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberLabel.setText("Cont_Num");

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("CustID");

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setText("Last Name");

        lastnameTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastnameTextField.setForeground(new java.awt.Color(0, 0, 0));

        idTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idTextField.setForeground(new java.awt.Color(0, 0, 0));

        addressTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(0, 0, 0));

        updateButton.setBackground(new java.awt.Color(0, 153, 153));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        saveButton1.setBackground(new java.awt.Color(0, 153, 153));
        saveButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton1.setForeground(new java.awt.Color(0, 0, 0));
        saveButton1.setText("Save");

        deleteButton.setBackground(new java.awt.Color(0, 153, 153));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        nameLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel1.setText("First Name");

        nameTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameTextField1.setForeground(new java.awt.Color(0, 0, 0));

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 0, 0));
        addressLabel.setText("Address");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("Email");

        emailTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(0, 0, 0));

        PhoneNumberTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PhoneNumberTextField2.setForeground(new java.awt.Color(0, 0, 0));

        ageTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageTextField.setForeground(new java.awt.Color(0, 0, 0));

        ageLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ageLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel1.setText("Age");

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 0, 0));
        genderLabel.setText("Gender");

        genderTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genderTextField.setForeground(new java.awt.Color(0, 0, 0));

        jComboBox1.setBackground(new java.awt.Color(255, 204, 102));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 2, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(128, 128, 128)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTextField1)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PhoneNumberTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveButton1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(updateButton)
                        .addGap(48, 48, 48)
                        .addComponent(deleteButton)))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton1)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         genderTextField.setText(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
      seachCustomer();
    }//GEN-LAST:event_customerTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateCustomer();
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PhoneNumberTextField2;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel ageLabel1;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JButton saveButton1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables


    private void clearText(){
          idTextField.setText("");
          nameTextField1.setText("");
          lastnameTextField.setText("");
          ageTextField.setText("");
          addressTextField.setText("");
          PhoneNumberTextField2.setText("");
          emailTextField.setText("");
          genderTextField.setText("");
    }
    
    
    private void loadAllCustomers(){
        
        try {
            
            String columns[] ={"Cust Id" ,"Cust Fname","Con_Num","Email","Address"};
          DefaultTableModel dtm =new DefaultTableModel(columns,0){
                @Override
                 public boolean isCellEditable(int row, int column){
                        return false;
                 }
          } ;
          
          customerTable.setModel(dtm);
          ArrayList<CustomerDto> customerdtos =customerController.getAllCustomers();
          
          for(CustomerDto customerdto : customerdtos){
                 Object[] customerData ={customerdto.getId(),customerdto.getFirstName(),customerdto.getPhoneNumber(),customerdto.getEmail(),customerdto.getAddress()};
                 dtm.addRow(customerData);
          }
            
        } catch (Exception e) {
            
        //    Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, e);
              JOptionPane.showConfirmDialog(this, e.getMessage());
        }
          
          
    }
    
    private void seachCustomer(){
        try {
                String custId = customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString();
                CustomerDto searchcustomerDto =customerController.getCustomer(custId);
                idTextField.setText(String.valueOf(searchcustomerDto.getId()));
                nameTextField1.setText(searchcustomerDto.getFirstName());
                lastnameTextField.setText(searchcustomerDto.getLastName());
                PhoneNumberTextField2.setText(searchcustomerDto.getPhoneNumber());
                emailTextField.setText(searchcustomerDto.getEmail());
                addressTextField.setText(searchcustomerDto.getAddress());
                ageTextField.setText(String.valueOf(searchcustomerDto.getAge()));
                genderTextField.setText(searchcustomerDto.getGenderType());
                   
                
        } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e.getMessage());
        }
    
        
    }
    
    private void addCustomer(){
           CustomerDto customerDto =new CustomerDto(nameTextField1.getText(),
                   lastnameTextField.getText(),
                   Integer.valueOf(ageTextField.getText()),
                   addressTextField.getText(),
                   PhoneNumberTextField2.getText(),
                   emailTextField.getText(),
                   genderTextField.getText());
           
    }
    
  private void deleteCustomer(){
          try {
              String  custId =idTextField.getText();
              
              boolean result =customerController.deleteCustomer(custId);
              if(result){
                  JOptionPane.showMessageDialog(this,"delete successfully");
                  clearText();
                    loadAllCustomers();
                    
              }   else {
                   JOptionPane.showMessageDialog(this,"doesnot delete");

              }
       
          } catch (Exception ex) {
          
              JOptionPane.showConfirmDialog(this, ex.getMessage());
           
          }
    
      }
  
  
       private void updateCustomer(){
          try {
              
              CustomerDto customerDto =new CustomerDto(Integer.valueOf(idTextField.getText()),
                      nameTextField1.getText(),
                   lastnameTextField.getText(),
                   Integer.valueOf(ageTextField.getText()),
                   addressTextField.getText(),
                   PhoneNumberTextField2.getText(),
                   emailTextField.getText(),
                   genderTextField.getText());
                
              
              boolean result =customerController.updateCustomer(customerDto);
              if(result ==true){
                  JOptionPane.showMessageDialog(this,"update successfully");
                  clearText();
                  loadAllCustomers();
              }   else {
                   JOptionPane.showMessageDialog(this,"doesnot update");
                   clearText();
                   loadAllCustomers();
              }
              
         
          } catch (Exception ex) {
          
              JOptionPane.showConfirmDialog(this, ex.getMessage());
           
          }
    
      }
  
}




