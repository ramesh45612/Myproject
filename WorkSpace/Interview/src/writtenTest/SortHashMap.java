package writtenTest;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class SortHashMap {
    public static void main(String[] args) {
        
        HashMap hm = new HashMap();
        hm.put("k1", "v1");
        hm.put("k2", "v2");
        hm.put("k3", "v3");
        
        Set s = hm.keySet();
        
        /*Collections.sort(s); //not applicable for set
*/    
    s= new TreeSet<>(s);
    
    System.out.println(s);
    
   
    }

}
