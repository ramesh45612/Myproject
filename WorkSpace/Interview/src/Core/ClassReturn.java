package Core;

class Test
{
	int id;
	String name;
	
	public Test(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return id+"\t"+name;
	}
	
}

public class ClassReturn {

	public static void main(String[] args) {
		Test ob = new Test(10,"Ramesh");
		System.out.println(ob);
		

	}

}
