
//compare object content
public class CompareOb {
	String name;
	public CompareOb(String name) {
		this.name=name;}
		
	public boolean equals(CompareOb t) {
		boolean b=false;
		if(this.name.equals(t.name)) b =true;
		else b=false;
		return b;
	}
		public static void main(String[] args) {
		
			CompareOb t1= new CompareOb("sankoji");
			CompareOb  t2=new CompareOb("sankoji");
			System.out.println(t1.equals(t2));
			
	}

}
