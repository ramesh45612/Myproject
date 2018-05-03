package writtenTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharInString {
   
    public static void main(String[] args) {
        
        String s="banana";
        char ch[] = s.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < ch.length; i++) {
            list.add(ch[i]);
        }
        System.out.println(list);
        System.out.println(Collections.frequency(list, "a"));
        

    }

}
