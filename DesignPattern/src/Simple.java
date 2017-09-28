/*builder example*/
public class Simple {

private final String firstName;

public String getFirstName() {
	return firstName;
}

//way -1  constructor params as fields
private Simple(String firstName) {
	this.firstName = firstName;
}

public static class SimpleBuilder{
	private String _firstName;
	
	public SimpleBuilder setFirstName(String _firstName) {
		this._firstName = _firstName;
		return this;
	}
	Simple build(){
		return new Simple(_firstName);
	}
}
//way2 constructor param as builder
private Simple(Builder build){
	this.firstName = build._firstName;
	
}

public static class Builder{
	private String _firstName;
	
	public Builder set_firstName(String _firstName) {
		this._firstName = _firstName;
		return this;
	}

	Simple build(){
		return new Simple(this);
	}
}

//main
public static void main(String[] args) {
	Simple way1 = new SimpleBuilder().setFirstName("Venky").build();
	System.out.println(way1.getFirstName());
	
	Simple way2 = new Builder().set_firstName("ram").build();
	System.out.println(way2.getFirstName());
}

}
