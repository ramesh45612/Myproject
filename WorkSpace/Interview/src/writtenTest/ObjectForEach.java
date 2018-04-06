package writtenTest;

import java.util.Collection;
import java.util.LinkedList;

public class ObjectForEach {
    
    public static Collection get(){
        Collection s = new LinkedList();
        s.add("B");
        s.add("C");
        s.add("A");
        
        return s;
    }
    public static void main(String[] args) {

for(Object ob :get()){
    System.out.println(ob);//BCA
}
        
    }

}
