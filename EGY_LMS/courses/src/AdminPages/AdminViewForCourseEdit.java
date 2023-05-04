

package AdminPages;
import CoursePages.CourseController;
import GlobalControllers.PageController;
import HomePages.HomeUser;
import java.awt.Image;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class AdminViewForCourseEdit extends javax.swing.JFrame {

    
    public AdminViewForCourseEdit() {
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

        courseBackground = new javax.swing.JPanel();
        coursePrice = new javax.swing.JLabel();
        takeCoursePrice = new javax.swing.JTextField();
        courseRoom = new javax.swing.JLabel();
        takeCourseRoom = new javax.swing.JTextField();
        doCourseAdd = new javax.swing.JButton();
        doDeleteCourse = new javax.swing.JButton();
        courseWelcome = new javax.swing.JLabel();
        courseDesignLine = new javax.swing.JSeparator();
        courseEditDetails = new javax.swing.JLabel();
        courseName = new javax.swing.JLabel();
        takeCourseName = new javax.swing.JTextField();
        courseDesignList = new javax.swing.JScrollPane();
        courseViewTable = new javax.swing.JTable();
        courseBranch = new javax.swing.JLabel();
        takeCourseBranch = new javax.swing.JTextField();
        doBackView = new javax.swing.JButton();
        courseStudentCount = new javax.swing.JLabel();
        takeCourseStudentsCount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        courseBackground.setBackground(new java.awt.Color(74, 31, 61));
        courseBackground.setForeground(new java.awt.Color(153, 0, 0));

        coursePrice.setForeground(new java.awt.Color(153, 0, 0));
        coursePrice.setText("Price : ");

        courseRoom.setForeground(new java.awt.Color(153, 0, 0));
        courseRoom.setText(" Room : ");

        takeCourseRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeCourseRoomActionPerformed(evt);
            }
        });

        doCourseAdd.setBackground(new java.awt.Color(0, 102, 102));
        doCourseAdd.setForeground(new java.awt.Color(255, 255, 255));
        doCourseAdd.setText("Add");
        doCourseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doCourseAddActionPerformed(evt);
            }
        });

        doDeleteCourse.setBackground(new java.awt.Color(0, 102, 102));
        doDeleteCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        doDeleteCourse.setForeground(new java.awt.Color(255, 255, 255));
        doDeleteCourse.setText("Delete Row");
        doDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doDeleteCourseActionPerformed(evt);
            }
        });

        courseWelcome.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        courseWelcome.setForeground(new java.awt.Color(153, 0, 0));
        courseWelcome.setText("Course Information");

        courseDesignLine.setBackground(new java.awt.Color(0, 102, 102));

        courseEditDetails.setForeground(new java.awt.Color(153, 0, 0));
        courseEditDetails.setText("New Value : ");

        courseName.setForeground(new java.awt.Color(153, 0, 0));
        courseName.setText("Course Name : ");

        courseViewTable.setBackground(new java.awt.Color(0, 102, 102));
        courseViewTable.setForeground(new java.awt.Color(255, 255, 255));
        courseViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Brunch", "Room", "number Allowed", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        courseViewTable.setToolTipText("");
        courseDesignList.setViewportView(courseViewTable);

        courseBranch.setForeground(new java.awt.Color(153, 0, 0));
        courseBranch.setText("Brunch : ");

        doBackView.setBackground(new java.awt.Color(0, 102, 102));
        doBackView.setForeground(new java.awt.Color(255, 255, 255));
        doBackView.setText("Back");
        doBackView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doBackViewActionPerformed(evt);
            }
        });

        courseStudentCount.setForeground(new java.awt.Color(153, 0, 0));
        courseStudentCount.setText("The number of students allowed : ");

        javax.swing.GroupLayout courseBackgroundLayout = new javax.swing.GroupLayout(courseBackground);
        courseBackground.setLayout(courseBackgroundLayout);
        courseBackgroundLayout.setHorizontalGroup(
            courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doBackView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courseDesignList)
                    .addGroup(courseBackgroundLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(courseBackgroundLayout.createSequentialGroup()
                                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(courseBackgroundLayout.createSequentialGroup()
                                        .addComponent(courseName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(takeCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(courseBackgroundLayout.createSequentialGroup()
                                        .addComponent(courseStudentCount)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(takeCourseStudentsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coursePrice)
                                    .addComponent(courseBranch))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(takeCourseBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(takeCoursePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(courseRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(takeCourseRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(courseBackgroundLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseBackgroundLayout.createSequentialGroup()
                                        .addComponent(courseWelcome)
                                        .addGap(67, 67, 67))
                                    .addComponent(courseDesignLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(courseBackgroundLayout.createSequentialGroup()
                        .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(courseBackgroundLayout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(doCourseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(courseBackgroundLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(courseBackgroundLayout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addComponent(doDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(courseEditDetails))))
                        .addGap(172, 172, 172)))
                .addContainerGap())
        );
        courseBackgroundLayout.setVerticalGroup(
            courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(courseWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseDesignLine, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseName)
                    .addComponent(takeCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseBranch)
                    .addComponent(takeCourseBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseRoom)
                    .addComponent(takeCourseRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(courseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseStudentCount)
                    .addComponent(takeCourseStudentsCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursePrice)
                    .addComponent(takeCoursePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(doCourseAdd)
                .addGap(37, 37, 37)
                .addComponent(courseEditDetails)
                .addGap(35, 35, 35)
                .addComponent(doDeleteCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseDesignList, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doBackView)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(courseBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(courseBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CourseController ci = new CourseController() ;
        ci.RetriveCourse(courseViewTable );
    }//GEN-LAST:event_formWindowOpened

    private void doBackViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doBackViewActionPerformed
        // TODO add your handling code here:
        AdminViewHome frm = new AdminViewHome();
        PageController f = new PageController() ;
        f.showBackView(frm, this);
        
    }//GEN-LAST:event_doBackViewActionPerformed

    private void doDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doDeleteCourseActionPerformed
        try {
            CourseController.DeleteCourse(courseViewTable);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminViewForCourseEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_doDeleteCourseActionPerformed

    private void doCourseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doCourseAddActionPerformed
        CourseController.CreateCourse(courseViewTable, takeCourseName ,
            takeCourseBranch , takeCourseRoom , takeCourseStudentsCount , takeCoursePrice
        );
    }//GEN-LAST:event_doCourseAddActionPerformed

    private void takeCourseRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeCourseRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takeCourseRoomActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewForCourseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewForCourseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewForCourseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewForCourseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewForCourseEdit().setVisible(true);
            }
        });
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel courseBackground;
    private javax.swing.JLabel courseBranch;
    private javax.swing.JSeparator courseDesignLine;
    private javax.swing.JScrollPane courseDesignList;
    private javax.swing.JLabel courseEditDetails;
    private javax.swing.JLabel courseName;
    private javax.swing.JLabel coursePrice;
    private javax.swing.JLabel courseRoom;
    private javax.swing.JLabel courseStudentCount;
    private javax.swing.JTable courseViewTable;
    private javax.swing.JLabel courseWelcome;
    private javax.swing.JButton doBackView;
    private javax.swing.JButton doCourseAdd;
    private javax.swing.JButton doDeleteCourse;
    private javax.swing.JTextField takeCourseBranch;
    private javax.swing.JTextField takeCourseName;
    private javax.swing.JTextField takeCoursePrice;
    private javax.swing.JTextField takeCourseRoom;
    private javax.swing.JTextField takeCourseStudentsCount;
    // End of variables declaration//GEN-END:variables
}
