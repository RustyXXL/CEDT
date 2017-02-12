/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rustyxxl.cedt;

import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author RustyXXL
 */
public class CEDT {

    /**
     * @param args the command line arguments
     */
    HashMap<Integer, String> Characters = new HashMap();
    
    Locale loc = Locale.getDefault();
    ResourceBundle locstr = ResourceBundle.getBundle("Resources/Languages/Strings", loc);
    
    public static void main(String[] args) {
        MainForm form = new net.rustyxxl.cedt.MainForm();
        form.setVisible(true);
    }
    
}
