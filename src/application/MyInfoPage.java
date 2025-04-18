package application;

import javax.swing.JOptionPane;

/**
 *
 * @author knovengel
 */
public class MyInfoPage extends javax.swing.JPanel {

    /**
     * Creates new form MyInfoPage
     */
    public MyInfoPage() {
        initComponents();
        nameLabel.setText("Name : "+Application.currentActiveAccount.getName());
        accountNumberLabel.setText("Account Number : "+Application.currentActiveAccount.getAccountNumber());
        accountBalanceLabel.setText("Account Balance : "+Application.currentActiveAccount.getAccountBalance());
        ageLabel.setText("Age : "+Application.currentActiveAccount.getAge());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateButton = new javax.swing.JButton();
        infoTitle = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        accountNumberLabel = new javax.swing.JLabel();
        accountBalanceLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();

        updateButton.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        updateButton.setText("Update Info");
        updateButton.setToolTipText("Update you'r Information");
        updateButton.setBorderPainted(false);
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        infoTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        infoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTitle.setText("My Info");

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIM/qsa.png"))); // NOI18N

        nameLabel.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        accountNumberLabel.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        accountNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        accountBalanceLabel.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        accountBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ageLabel.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(infoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("User clicked on Update info");
        nameLabel.setText("Name : "+Application.currentActiveAccount.getName());
        accountNumberLabel.setText("Account Number : "+Application.currentActiveAccount.getAccountNumber());
        accountBalanceLabel.setText("Account Balance : "+Application.currentActiveAccount.getAccountBalance());
        ageLabel.setText("Age : "+Application.currentActiveAccount.getAge());
        App.update(9);
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountBalanceLabel;
    private javax.swing.JLabel accountNumberLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel infoTitle;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
