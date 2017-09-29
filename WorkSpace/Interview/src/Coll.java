

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Coll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Collection<Integer> ob= new ArrayList<Integer>();
	//ob.add("sankoji"); it only accepts int only
	ob.add(1);
	ob.add(2);
	ob.add(4);
	System.out.println(ob);

/*
 * () --> functions
{}--> definitions
[] --> for Array	
<> -->generics
in case if you want add 3 in between  2 and 4 then use index, Collection doesn't have index
list work with index change it from Collection to List

*/	
	
	

	Map<String, Integer> map= new HashMap();
	map.put("Ramesh", 1234567890);
	map.put("Loss", 123459876);
	System.out.println(map);
	

	}

}
