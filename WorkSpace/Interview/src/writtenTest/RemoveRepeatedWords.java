package writtenTest;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedWords {
    public static void main(String[] args) {
        String s1 = "one two one two";
        String s2 = removeRepeatedWords(s1);
        System.out.println(s2);
        
        String s3 = "one two one two three";
        String s4 = removeRepeatedWords1(s3);
        System.out.println(s4);
        

    }


    //using set
    private static String removeRepeatedWords(String s1) {
        String word [] =s1.split(" ");
        Set<String> set = new LinkedHashSet<String>();
        for (int i = 0; i < word.length; i++) {
            set.add(word[i]);
        }
        
        StringBuffer sb = new StringBuffer();
        for(String s:set){
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
    
    //without using set
    private static String removeRepeatedWords1(String s3) {
        String word [] =s3.split(" ");
        for (int i = 0; i < word.length; i++) {
            for (int j = i+1; j < word.length; j++) {
                if(word[i].equals(word[j])){
                    word[i]="";
                }
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(String s:word){
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
}
