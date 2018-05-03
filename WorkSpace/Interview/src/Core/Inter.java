package Core;

interface in1
{	
	String name="ramesh";
}


public class Inter  implements in1 {
	public static void main(String[] args) {
	    /*name ="you can't change";
	   above meaning is in1.name="you can't change";
	    */
	    String name ="you can change - its different type";
		System.out.println(name);
	}

}
