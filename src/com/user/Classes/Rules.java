/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.db;

/**
 *
 * @author star
 */
public class Rules {
    public static boolean isInteger(String s){
        try{
            int a=Integer.parseInt(s);
            return true;            
        }catch(Exception ex){
            return false;
        }
    }
    public static boolean isDouble(String s){
        if(s.matches("^\\d+(\\.\\d{2})?$")){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isEmail(String s){
        if(s.matches("^\\w+@\\w+\\.\\w{2,3}(\\.\\w{2,3})?$")){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean isMobile(String s){
        if(s.matches("^\\d{10}$")){
            return true;
        }else{
            return false;
        }
        
    }
}
