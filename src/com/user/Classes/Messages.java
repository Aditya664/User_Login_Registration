/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.db;

import javax.swing.JOptionPane;

/**
 *
 * @author star
 */
public class Messages {
    public static void showInfo(String msg,String title){
        JOptionPane.showMessageDialog(null, msg,title,JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showError(String msg,String title){
        JOptionPane.showMessageDialog(null, msg,title,JOptionPane.ERROR_MESSAGE);
    }
    public static void showWarning(String msg,String title){
        JOptionPane.showMessageDialog(null, msg,title,JOptionPane.WARNING_MESSAGE);
    }
    public static int showConfirm(String msg,String title){        
        //0 => YES
        //1 => NO
        return JOptionPane.showConfirmDialog(null, msg,title,JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
    }
}
