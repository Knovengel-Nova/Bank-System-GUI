/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package application;

import javax.swing.JOptionPane;

/**
 *
 * @author knovengel
 */
public class WithdrawPage extends javax.swing.JPanel {

    /**
     * Creates new form WithdrawPage
     */
    public WithdrawPage() {
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

        withdrawTitle = new javax.swing.JLabel();
        amountTitle = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        withdrawButton = new javax.swing.JButton();

        withdrawTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        withdrawTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        withdrawTitle.setText("Withdraw");

        amountTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        amountTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountTitle.setText("Amount");

        amountTextField.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        amountTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amountTextField.setToolTipText("Enter Amount to be Withdrawn.");

        withdrawButton.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        withdrawButton.setText("Withdraw");
        withdrawButton.setToolTipText("Withdraw the Given Amount");
        withdrawButton.setBorderPainted(false);
        withdrawButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(amountTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(amountTextField))
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(withdrawTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(amountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:
        double amount = Double.parseDouble(amountTextField.getText());
        Application.currentActiveAccount.withdraw(amount);
        if(Application.currentActiveAccount.getAccountBalance()>= amount){
            String msg = "Account Debited by "+amount;
            System.out.println(msg);
            App.update(3);
            JOptionPane.showMessageDialog(null, msg, "Withdraw", JOptionPane.WARNING_MESSAGE);
        }else{
            System.out.println("Not enough funds");
            JOptionPane.showMessageDialog(null, "Not enough Funds", "Withdraw", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTextField;
    private javax.swing.JLabel amountTitle;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawTitle;
    // End of variables declaration//GEN-END:variables
}
