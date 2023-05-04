package AdminPages;
import GlobalControllers.PageController;
import CoursePages.*;
import HomePages.HomeUser;
import HomePages.RegisterUser;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.imageio.ImageIO;

public class AdminViewCreateAccount extends javax.swing.JFrame {

    
    
    public AdminViewCreateAccount() {
        initComponents();         
        try{
            Image img = ImageIO.read(HomeUser.class.getResource("icon1.png"));
            this.setIconImage(img);
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountsBackground = new javax.swing.JPanel();
        accountsViewList = new javax.swing.JScrollPane();
        allAccountsView = new javax.swing.JTable();
        accountsWelcome = new javax.swing.JLabel();
        takeAccountUser = new javax.swing.JTextField();
        accountPass = new javax.swing.JLabel();
        accountsAddr = new javax.swing.JLabel();
        accountsUser = new javax.swing.JLabel();
        accountsPhone = new javax.swing.JLabel();
        takeAccountPass = new javax.swing.JTextField();
        takeAccountAddr = new javax.swing.JTextField();
        takeAccountPhone = new javax.swing.JTextField();
        doAddAcount = new javax.swing.JButton();
        doDeleteAccount = new javax.swing.JButton();
        doViewBackPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        accountsBackground.setBackground(new java.awt.Color(144, 67, 121));

        allAccountsView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Password", "Type", "Address"
            }
        ));
        accountsViewList.setViewportView(allAccountsView);

        accountsWelcome.setBackground(new java.awt.Color(51, 255, 51));
        accountsWelcome.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        accountsWelcome.setForeground(new java.awt.Color(102, 255, 102));
        accountsWelcome.setText("Accounts View");

        accountPass.setText("Password");

        accountsAddr.setText("Address");

        accountsUser.setText("UserName");

        accountsPhone.setText("Type");

        takeAccountPhone.setText("Admin");

        doAddAcount.setText("ADD account");
        doAddAcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doAddAcountActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout accountsBackgroundLayout = new javax.swing.GroupLayout(accountsBackground);
        accountsBackground.setLayout(accountsBackgroundLayout);
        accountsBackgroundLayout.setHorizontalGroup(
            accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountsBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountsBackgroundLayout.createSequentialGroup()
                        .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(accountsBackgroundLayout.createSequentialGroup()
                                .addComponent(accountsAddr)
                                .addGap(18, 18, 18)
                                .addComponent(takeAccountAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accountsPhone))
                            .addGroup(accountsBackgroundLayout.createSequentialGroup()
                                .addComponent(accountsUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(takeAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(accountPass)))
                        .addGap(18, 18, 18)
                        .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takeAccountPass, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(takeAccountPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(accountsBackgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accountsBackgroundLayout.createSequentialGroup()
                                .addComponent(accountsViewList, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(doViewBackPage))
                            .addComponent(doAddAcount, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(accountsBackgroundLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountsBackgroundLayout.createSequentialGroup()
                        .addComponent(accountsWelcome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(accountsBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        accountsBackgroundLayout.setVerticalGroup(
            accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountsBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountsWelcome)
                .addGap(65, 65, 65)
                .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takeAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsUser)
                    .addComponent(accountPass)
                    .addComponent(takeAccountPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountsAddr)
                    .addComponent(accountsPhone)
                    .addComponent(takeAccountAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takeAccountPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doAddAcount)
                    .addComponent(doDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(accountsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountsBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountsViewList, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountsBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doViewBackPage)
                        .addGap(53, 53, 53))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountsBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountsBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doAddAcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doAddAcountActionPerformed
try {
            RegisterUser.createAccount(allAccountsView , takeAccountUser, takeAccountPass, takeAccountPhone , takeAccountAddr);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminViewCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminViewCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_doAddAcountActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            RegisterUser.retrieveUserDetails(allAccountsView );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminViewCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void doDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doDeleteAccountActionPerformed

        try {
            RegisterUser.deleteUserDetails(allAccountsView);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminViewCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminViewCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_doDeleteAccountActionPerformed

    private void doViewBackPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doViewBackPageActionPerformed

         AdminViewHome mainView = new AdminViewHome();
        PageController useView = new PageController();
        useView.showBackView(mainView , this);
    }//GEN-LAST:event_doViewBackPageActionPerformed
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewCreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountPass;
    private javax.swing.JLabel accountsAddr;
    private javax.swing.JPanel accountsBackground;
    private javax.swing.JLabel accountsPhone;
    private javax.swing.JLabel accountsUser;
    private javax.swing.JScrollPane accountsViewList;
    private javax.swing.JLabel accountsWelcome;
    private javax.swing.JTable allAccountsView;
    private javax.swing.JButton doAddAcount;
    private javax.swing.JButton doDeleteAccount;
    private javax.swing.JButton doViewBackPage;
    private javax.swing.JTextField takeAccountAddr;
    private javax.swing.JTextField takeAccountPass;
    private javax.swing.JTextField takeAccountPhone;
    private javax.swing.JTextField takeAccountUser;
    // End of variables declaration//GEN-END:variables
}
