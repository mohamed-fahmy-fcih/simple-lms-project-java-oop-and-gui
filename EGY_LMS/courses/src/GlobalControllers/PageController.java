/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalControllers;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class PageController {
    
    private static boolean showPage ;
   //the deafult constructor
    public PageController() {
        
    }
    //the second constructor
    public PageController(boolean st) {
        showPage = st ;
    }
    
    public void showBackView(JFrame pageViewSecond , JFrame pageViewFirst){
        pageViewSecond.setVisible(showPage);
        pageViewSecond.setLocationRelativeTo(null);
        pageViewFirst.dispose();
    }
    
    //deleting all content in text filed 
    //any textFieild must be like arr of strings
    public void deleteTextField(JTextField[] jt ){
        for(int i = 0 ; i < jt.length ; i++){
            jt[i].setText("");
        }
    }
}
