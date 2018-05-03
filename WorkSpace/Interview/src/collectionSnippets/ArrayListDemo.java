package collectionSnippets;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        System.out.println(list.size());//0
        
        list.add("ok");
        System.out.println(list.size());//1
    }

}
 