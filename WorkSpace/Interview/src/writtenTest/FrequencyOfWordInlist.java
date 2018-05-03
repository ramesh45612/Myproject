package writtenTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FrequencyOfWordInlist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ram");
        list.add("ram");
        list.add("ramesh");
        list.add("ramesh");
        list.add("ramesh");
        
        System.out.println(Collections.frequency(list, "ram"));
        
        Set<String> set = new LinkedHashSet<String>(list);
        
        for (String s:set) {
            System.out.println(s+"\t\t"+Collections.frequency(list,s));
        }
    }

}
