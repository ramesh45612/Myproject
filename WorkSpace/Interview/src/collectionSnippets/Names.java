package collectionSnippets;

import java.util.HashMap;
import java.util.Map;

public class Names {

    Map<String,String> map = new HashMap<String,String>();
    public void name(){
        map.put("one", "one");
    }
    public int size(){
        return map.size();
    }
    public static void main(String[] args) {
        Names ob = new Names();
        System.out.println(ob.size());//0
        
        HashMap m = new HashMap();
        System.out.println(m.size());//0

    }

}
