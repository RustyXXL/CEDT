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
    
    // String playerid
    // Integer id
    // String char_name
    // Integer level
    // Integer rank
    // Integer guild
    // Boolean isAlive
    // String killerName
    HashMap<Integer, String> characters = new HashMap();
    
    // Integer char_id
    // Integer stat_type
    // Integer stat_id
    // Float stat_value
    HashMap<Integer, Float> character_stats = new HashMap();
    
    // String class
    // String map
    // Integer id
    // doubleprecision x
    // doubleprecision y
    // doubleprecision z
    // doubleprecision sx
    // doubleprecision sy
    // doubleprecision sz
    // doubleprecision rx
    // doubleprecision ry
    // doubleprecision rz
    // doubleprecision rw
    HashMap<Integer, String> actor_position = new HashMap();
    
    // Integer object_id
    // Integer instance_id
    // Integer health_id
    // Integer template_id
    // doubleprecision health_percentage
    HashMap<Integer, String> buildable_health  = new HashMap();
    
    // Integer object_id
    // Integer instance_id
    // String class
    // blob transform1
    // blob transform2
    // Integer pillar_foundation
    HashMap<Integer, String> building_instances  = new HashMap();
    
    // Integer object_id
    // Integer owner_id
    HashMap<Integer, String> buildings  = new HashMap();
    
    // Integer guildId
    // String name
    // String messageOfTheDay
    // Integer owner
    HashMap<Integer, String> guilds  = new HashMap();
    
    // Integer guildOne
    // Integer guildTwo
    // Integer status
    // datetime date     (TODO: Check sqlite3 datetime datatype and find best match in java)
    // String history
    HashMap<Integer, String> diplomacy  = new HashMap();
    
    // Integer item_id
    // Integer owner_id
    // Integer inv_type
    // Integer template_id
    // blob data
    HashMap<Integer, String> item_inventory  = new HashMap();
    
    // Integer item_id
    // Integer owner_id
    // Integer inv_type
    // String name
    // blob value
    HashMap<Integer, String> item_properties  = new HashMap();
    
    // Integer object_id
    // String name
    // blob value
    HashMap<Integer, byte[]> properities  = new HashMap();
    
    // Integer user
    // Boolean online
    HashMap<Integer, Boolean> account  = new HashMap();
    
    // String name
    // String value
    HashMap<Integer, Boolean> dw_settings  = new HashMap();
    
    // Integer eventId
    // String eventMessage
    // String date
    // datetime value
    // Integer guild
    HashMap<Integer, Boolean> events  = new HashMap();
    
    // String name
    // Integer value
    HashMap<Integer, Boolean> sequences  = new HashMap();
    
    // String name
    // String seq
    HashMap<Integer, Boolean> sqlite_sequences  = new HashMap();
    
    Locale loc = Locale.getDefault();
    ResourceBundle locstr = ResourceBundle.getBundle("Resources/Languages/Strings", loc);
    
    public static void main(String[] args) {
        MainForm form = new net.rustyxxl.cedt.MainForm();
        form.setVisible(true);
    }
    
}
