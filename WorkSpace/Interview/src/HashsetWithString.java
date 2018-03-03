import java.util.HashSet;


public class HashsetWithString {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("ram");
        hs.add(new String("ram"));
        System.out.println(hs.size());
    }

}
