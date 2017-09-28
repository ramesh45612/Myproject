class Person{
	
	private String firstName;
	
	//way -1
	Person(PersonBuilder build){
		this.firstName = build._firstName;
	}
	public String getFirstName() {
		return firstName;
	}

	//way2
	Person(BuilderInside build){
		this.firstName = build.firstName;
		
	}
	//way3
	private Person(String firstName){
		this.firstName  = firstName;
	}
	
	//way2 class
	public static class BuilderInside{
		private String firstName;

		public BuilderInside setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		Person build(){
			return new Person(this);
		}
	}
	//way3 class
	public static class SimpleBuilder{
		private String firstName;

		public SimpleBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		Person build(){
			return new Person(firstName);
		}
		
	}
}
////way1  separate class outside
 class PersonBuilder{
	String _firstName;
	
	public PersonBuilder set_firstName(String _firstName) {
		this._firstName = _firstName;
		return this;
	}
	Person build(){
		return new Person(this);
	}
}

public class PersonDemo {
	public static void main(String[] args) {
		Person sankoji= new PersonBuilder().set_firstName("Ram").build();
		System.out.println(sankoji.getFirstName());
		
		//above expanded way1
		PersonBuilder builder = new PersonBuilder();
		builder.set_firstName("firstName");
		Person ram = builder.build();
		System.out.println(ram.getFirstName());
		
		Person p1= new Person.BuilderInside().setFirstName("nice first").build();
		System.out.println(p1.getFirstName());
		
		//above expanded
		 Person.BuilderInside p = new Person.BuilderInside();
		 p.setFirstName("Inside");
		 Person per = p.build();
		
		System.out.println(per.getFirstName());
		
		Person simple = new Person.SimpleBuilder().setFirstName("Simple").build();
		System.out.println(simple.getFirstName());
		
	}
}
