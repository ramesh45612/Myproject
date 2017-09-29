import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
ArrayList al = new ArrayList();
al.add("1");
al.add("2");
al.add("3");
al.add("2");
al.add("4");
al.add("4");
System.out.println("List\t"+al);	
ArrayList temp = new ArrayList();
Iterator<String> it=al.iterator();
while(it.hasNext())
{
	String i=it.next();
	if(!temp.contains(i)) temp.add(i);

	}
	System.out.println("List Without Duplicates"+temp);
	
}
	
}
