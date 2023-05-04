
package HomePages;

import GlobalControllers.PageController;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author egypt
 */
public class LoginUser extends javax.swing.JFrame {

    //the constructor
    public LoginUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBackground = new javax.swing.JPanel();
        loginWelcome = new javax.swing.JLabel();
        loginUser = new javax.swing.JLabel();
        loginPass = new javax.swing.JLabel();
        takeUserLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        takepassLogin = new javax.swing.JPasswordField();
        doLogIn = new javax.swing.JButton();
        doViewBackPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        loginBackground.setBackground(new java.awt.Color(186, 79, 84));

        loginWelcome.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        loginWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginWelcome.setText("Login");

        loginUser.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        loginUser.setText("username : ");

        loginPass.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        loginPass.setText("password : ");

        takeUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeUserLoginActionPerformed(evt);
            }
        });

        takepassLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takepassLoginActionPerformed(evt);
            }
        });
        takepassLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                takepassLoginKeyPressed(evt);
            }
        });

        doLogIn.setText("Okay");
        doLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doLogInActionPerformed(evt);
            }
        });

        doViewBackPage.setText("Back");
        doViewBackPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doViewBackPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginBackgroundLayout = new javax.swing.GroupLayout(loginBackground);
        loginBackground.setLayout(loginBackgroundLayout);
        loginBackgroundLayout.setHorizontalGroup(
            loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBackgroundLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(loginWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 300, Short.MAX_VALUE))
            .addGroup(loginBackgroundLayout.createSequentialGroup()
                .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginBackgroundLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginPass)
                            .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(takepassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginUser)
                                    .addComponent(takeUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(loginBackgroundLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(doLogIn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(doViewBackPage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginBackgroundLayout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(300, Short.MAX_VALUE)))
        );
        loginBackgroundLayout.setVerticalGroup(
            loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(loginWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(loginUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(takeUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(loginPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(takepassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(doLogIn)
                .addGap(16, 16, 16)
                .addComponent(doViewBackPage)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginBackgroundLayout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(333, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public   int var ;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon1.png"));
            this.setIconImage(img);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void takeUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeUserLoginActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_takeUserLoginActionPerformed

    private void takepassLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takepassLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takepassLoginActionPerformed

    private void takepassLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_takepassLoginKeyPressed
       
    }//GEN-LAST:event_takepassLoginKeyPressed

    private void doLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doLogInActionPerformed
             try {
             var = RegisterUser.verification(takeUserLogin, takepassLogin);
             if (var ==0)
             {
                 new LoginUser().setVisible(true);
             }
             
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);

        }
            this.dispose();
    }//GEN-LAST:event_doLogInActionPerformed

    private void doViewBackPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doViewBackPageActionPerformed
        this.dispose();
        HomeUser  frm = new HomeUser ();
        PageController f  = new PageController();
        f.showBackView(frm, this);
        frm.setVisible(true);
        
    }//GEN-LAST:event_doViewBackPageActionPerformed


    public static void main(String args[]) {
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doLogIn;
    private javax.swing.JButton doViewBackPage;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel loginBackground;
    private javax.swing.JLabel loginPass;
    private javax.swing.JLabel loginUser;
    private javax.swing.JLabel loginWelcome;
    public static javax.swing.JTextField takeUserLogin;
    private javax.swing.JPasswordField takepassLogin;
    // End of variables declaration//GEN-END:variables
}
