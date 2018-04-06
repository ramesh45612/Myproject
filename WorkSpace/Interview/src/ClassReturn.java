
class S
{
	int id;
	String name;
	
	public S(int id, String name) {
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
		S ob = new S(10,"Ramesh");
		System.out.println(ob);
		

	}

}
