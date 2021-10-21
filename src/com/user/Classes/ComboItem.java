/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.Classes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author star
 */
public class ComboItem {
    public String displayField;
    public String returnField;
    public Map<String,Object> data=new HashMap<>(); //Interface=Sub class object
    //data.put(key,value)

    @Override
    public String toString() {
        return displayField;
    }
    
    
}
