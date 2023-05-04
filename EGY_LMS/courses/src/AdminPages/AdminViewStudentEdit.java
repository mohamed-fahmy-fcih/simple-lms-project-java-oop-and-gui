
package AdminPages;

import GlobalControllers.PageController;
import CoursePages.*;
import HomePages.*;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class AdminViewStudentEdit extends javax.swing.JFrame {

   
    public AdminViewStudentEdit() {
        initComponents();
         
 try{
            Image img = ImageIO.read(HomeUser.class.getResource("icon1.png"));
            this.setIconImage(img);
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private static GlobalControllers.Student st = new GlobalControllers.Student();
    private static PageController f = new PageController() ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountPass = new javax.swing.JLabel();
        accountsAddr = new javax.swing.JLabel();
        accountsUser = new javax.swing.JLabel();
        accountsPhone = new javax.swing.JLabel();
        takeStudentMiddleName = new javax.swing.JTextField();
        takeStudentAge = new javax.swing.JTextField();
        accountsViewList = new javax.swing.JScrollPane();
        allStudentsView = new javax.swing.JTable();
        takeStudentPhone = new javax.swing.JTextField();
        doAddAcount = new javax.swing.JButton();
        accountsWelcome = new javax.swing.JLabel();
        doDeleteAccount = new javax.swing.JButton();
        takeStudentFirstName = new javax.swing.JTextField();
        doViewBackPage = new javax.swing.JButton();
        takeStudentLastName = new javax.swing.JTextField();
        accountPass1 = new javax.swing.JLabel();
        accountsPhone1 = new javax.swing.JLabel();
        takeStudentAddress = new javax.swing.JTextField();
        courseNameList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        accountPass.setText("MiddleName");

        accountsAddr.setText("Age");

        accountsUser.setText("first Name");

        accountsPhone.setText("Phone");

        allStudentsView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Age", "Phone", "Adress", "Course Name"
            }
        ));
        allStudentsView.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                allStudentsViewPropertyChange(evt);
            }
        });
        accountsViewList.setViewportView(allStudentsView);

        doAddAcount.setText("ADD account");
        doAddAcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doAddAcountActionPerformed(evt);
            }
        });

        accountsWelcome.setBackground(new java.awt.Color(51, 255, 51));
        accountsWelcome.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        accountsWelcome.setForeground(new java.awt.Color(102, 255, 102));
        accountsWelcome.setText("Students View");

        doDeleteAccount.setText("Delete Account");
        doDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doDeleteAccountActionPerformed(evt);
            }
        });

        doViewBackPage.setText("Back");
        doViewBackPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doViewBackPageActionPerformed(evt);
            }
        });

        accountPass1.setText("Last Name");

        accountsPhone1.setText("Address");

        courseNameList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accountsAddr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(takeStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accountsUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(takeStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountsPhone, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takeStudentMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(takeStudentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountPass1)
                            .addComponent(accountsPhone1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takeStudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(takeStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accountsViewList, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(doViewBackPage))
                            .addComponent(doAddAcount, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountsWelcome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(courseNameList, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountsWelcome)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takeStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsUser)
                    .addComponent(accountPass)
                    .addComponent(takeStudentMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountPass1)
                    .addComponent(takeStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(courseNameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(accountsAddr)
                        .addComponent(accountsPhone)
                        .addComponent(takeStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(takeStudentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountsPhone1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(takeStudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doAddAcount)
                    .addComponent(doDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountsViewList, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doViewBackPage)
                        .addGap(53, 53, 53))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doAddAcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doAddAcountActionPerformed
               st.createStudent(courseNameList , allStudentsView , takeStudentAddress  , takeStudentPhone,
                        takeStudentAge, takeStudentFirstName, takeStudentLastName, takeStudentMiddleName);

    }//GEN-LAST:event_doAddAcountActionPerformed

    private void doDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doDeleteAccountActionPerformed

               st.deleteingStudent(allStudentsView );

    }//GEN-LAST:event_doDeleteAccountActionPerformed

    private void doViewBackPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doViewBackPageActionPerformed

        AdminViewHome  frm = new AdminViewHome ();
        f.showBackView(frm, this);
    }//GEN-LAST:event_doViewBackPageActionPerformed

    private void allStudentsViewPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_allStudentsViewPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_allStudentsViewPropertyChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        courseNameList.removeAllItems();
        st.getStudent(courseNameList, allStudentsView);


    }//GEN-LAST:event_formWindowOpened

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewStudentEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountPass;
    private javax.swing.JLabel accountPass1;
    private javax.swing.JLabel accountsAddr;
    private javax.swing.JLabel accountsPhone;
    private javax.swing.JLabel accountsPhone1;
    private javax.swing.JLabel accountsUser;
    private javax.swing.JScrollPane accountsViewList;
    private javax.swing.JLabel accountsWelcome;
    private javax.swing.JTable allStudentsView;
    private javax.swing.JComboBox<String> courseNameList;
    private javax.swing.JButton doAddAcount;
    private javax.swing.JButton doDeleteAccount;
    private javax.swing.JButton doViewBackPage;
    private javax.swing.JTextField takeStudentAddress;
    private javax.swing.JTextField takeStudentAge;
    private javax.swing.JTextField takeStudentFirstName;
    private javax.swing.JTextField takeStudentLastName;
    private javax.swing.JTextField takeStudentMiddleName;
    private javax.swing.JTextField takeStudentPhone;
    // End of variables declaration//GEN-END:variables
}
