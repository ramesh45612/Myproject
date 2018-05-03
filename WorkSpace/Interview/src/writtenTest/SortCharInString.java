package writtenTest;


/*sort character in string
 * @Author : Ramesh
 * 
 * */
import java.util.Arrays;

public class SortCharInString {
    public static void main(String[] args) {
        String s="badcd";
        //way -1 
        String sorted= sortCharacterInString(s);
        System.out.println(sorted);
        
        
        //way -2 without using util.Arrays
        String s1="bdcaae";
        String sorted1 = sortCharacterInString2(s1);
        System.out.println(sorted1);
    }


    private static String sortCharacterInString(String input) {
        char [] ch = input.toCharArray();
        Arrays.sort(ch);
        String s1= new String(ch);
        return s1;
    }
    
    private static String sortCharacterInString2(String input) {
        char [] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]>ch[j]){
                    char swap;
                    swap =ch[i];
                    ch[i]= ch[j];
                    ch[j] = swap;
                }
            }
        }
        return new String(ch);
    }
}
