package source;

public class Emp {

	private int id;
	private String name;
	private double sal;
	
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public int hashCode() {

		//System.out.println(name.hashCode());
	return name.hashCode();
	
	}

	@Override
	public boolean equals(Object ob) {
	
		Emp e =(Emp)ob;
		
		boolean b=false;
		
		if(e.id==this.id&&e.name.equals(this.name)) b=true;
		return b;
		
	}
	
}
