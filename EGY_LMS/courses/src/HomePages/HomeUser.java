
package HomePages;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class HomeUser extends javax.swing.JFrame {

 
    public HomeUser() {
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

        desingBackground = new javax.swing.JPanel();
        desingRightSide = new javax.swing.JPanel();
        homeTitle = new javax.swing.JLabel();
        titleLogin = new javax.swing.JLabel();
        alreadyAccount = new javax.swing.JButton();
        exitState = new javax.swing.JButton();
        desingLeftSide = new javax.swing.JPanel();
        homePageIcon = new javax.swing.JLabel();
        titleEgyLMS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desingRightSide.setBackground(new java.awt.Color(186, 79, 84));

        homeTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        homeTitle.setText("WELCOME");

        titleLogin.setText("Sign-In :");

        alreadyAccount.setText("Enter User Credential");
        alreadyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alreadyAccountActionPerformed(evt);
            }
        });

        exitState.setBackground(new java.awt.Color(255, 255, 255));
        exitState.setForeground(new java.awt.Color(255, 0, 0));
        exitState.setText("GoodBye");
        exitState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout desingRightSideLayout = new javax.swing.GroupLayout(desingRightSide);
        desingRightSide.setLayout(desingRightSideLayout);
        desingRightSideLayout.setHorizontalGroup(
            desingRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desingRightSideLayout.createSequentialGroup()
                .addGroup(desingRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desingRightSideLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(homeTitle))
                    .addGroup(desingRightSideLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(desingRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alreadyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(desingRightSideLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(titleLogin)))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desingRightSideLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitState)
                .addGap(27, 27, 27))
        );
        desingRightSideLayout.setVerticalGroup(
            desingRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desingRightSideLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(homeTitle)
                .addGap(41, 41, 41)
                .addComponent(titleLogin)
                .addGap(18, 18, 18)
                .addComponent(alreadyAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitState)
                .addGap(18, 18, 18))
        );

        desingLeftSide.setBackground(new java.awt.Color(74, 31, 61));

        homePageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePages/iconEarth.png"))); // NOI18N

        titleEgyLMS.setBackground(new java.awt.Color(0, 0, 0));
        titleEgyLMS.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        titleEgyLMS.setForeground(new java.awt.Color(0, 0, 0));
        titleEgyLMS.setText("EGY LMS");

        javax.swing.GroupLayout desingLeftSideLayout = new javax.swing.GroupLayout(desingLeftSide);
        desingLeftSide.setLayout(desingLeftSideLayout);
        desingLeftSideLayout.setHorizontalGroup(
            desingLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desingLeftSideLayout.createSequentialGroup()
                .addGroup(desingLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desingLeftSideLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(homePageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desingLeftSideLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(titleEgyLMS)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        desingLeftSideLayout.setVerticalGroup(
            desingLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desingLeftSideLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(homePageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleEgyLMS)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desingBackgroundLayout = new javax.swing.GroupLayout(desingBackground);
        desingBackground.setLayout(desingBackgroundLayout);
        desingBackgroundLayout.setHorizontalGroup(
            desingBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desingBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desingLeftSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desingRightSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        desingBackgroundLayout.setVerticalGroup(
            desingBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desingBackgroundLayout.createSequentialGroup()
                .addGroup(desingBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desingLeftSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desingRightSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desingBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desingBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alreadyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alreadyAccountActionPerformed
        this.dispose();
        LoginUser sign = new LoginUser();
        sign.setVisible(true);

    }//GEN-LAST:event_alreadyAccountActionPerformed

    private void exitStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitStateActionPerformed

            System.exit(0);
    }//GEN-LAST:event_exitStateActionPerformed
 
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUser().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alreadyAccount;
    private javax.swing.JPanel desingBackground;
    private javax.swing.JPanel desingLeftSide;
    private javax.swing.JPanel desingRightSide;
    private javax.swing.JButton exitState;
    private javax.swing.JLabel homePageIcon;
    private javax.swing.JLabel homeTitle;
    private javax.swing.JLabel titleEgyLMS;
    private javax.swing.JLabel titleLogin;
    // End of variables declaration//GEN-END:variables
}
