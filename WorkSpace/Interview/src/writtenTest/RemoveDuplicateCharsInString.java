package writtenTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsInString {

    public static void main(String[] args) {
        String s1 = "abacd";
        String s2=removeDuplicates(s1);
        System.out.println(s2);
        
        String s3= "ababcdde";
        String s4= removeDuplicates1(s3);
        System.out.println(s4);
        
    }

    
    //Using Set

    private static String removeDuplicates(String input) {
        char [] ch = input.toCharArray();
        Set<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c1:set){
            sb.append(c1);
        }
        return sb.toString();
    }

    //without using set
    private static String removeDuplicates1(String input) {
        String result ="";
        for (int i = 0; i < input.length(); i++) {
            if(!result.contains(String.valueOf(input.charAt(i)))){
                result+=String.valueOf(input.charAt(i));
            }
        }
        return result;
    }
}