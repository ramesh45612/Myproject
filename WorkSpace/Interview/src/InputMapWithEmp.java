import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class InputMapWithEmp {
	public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer,Emp> hm = new HashMap();
		hm.put(1, new Emp(30,"Sankoji"));
		hm.put(2, new Emp(29,"Ramesh"));
		hm.put(3, new Emp(1,"Anvi"));
		hm.put(4, new Emp(28,"sankoji"));
		System.out.println("Enter Id to Get the details");
		Integer input=Integer.parseInt(br.readLine()); 
		if(hm.containsKey(input))
		System.out.println(input+"\t"+hm.get(input).name+"\t"+hm.get(input).age);
		else
			System.out.println("invalid Id, Please check and try again");
		
		System.out.println("Check the names are equal or not");
		System.out.println("1st Emp id");
		Integer input1=Integer.parseInt(br.readLine());
		System.out.println("2nd Emp id");
		Integer input2=Integer.parseInt(br.readLine());
		
		if((hm.get(input1).name).equalsIgnoreCase(hm.get(input2).name)) System.out.println("Both names are equal");
		
		else System.out.println("names are not match");
	}

}
