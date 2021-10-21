/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.db;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author star
 */
public class Utility {
    public static void executeApp(String appname)
    {
         try {
            Runtime obj=Runtime.getRuntime();
            //obj.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            obj.exec("rundll32 SHELL32.DLL,ShellExec_RunDLL "+appname);
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex.toString());
        }

    }
}
