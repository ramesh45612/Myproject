class Fruit{
	
	private String name;
	private String color;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	private Fruit(FruitBuilder fr)
	{
	this.name= fr.name;
	this.color=fr.color;
	}
	
// Builder
public static class FruitBuilder {
	public FruitBuilder() {
		// TODO Auto-generated constructor stub
	}
    String name, color;
    FruitBuilder setName(String name) { 
    	this.name     = name;
    	return this; }
    FruitBuilder setColor(String color)    
    { this.color    = color;    return this; }
    Fruit build() {
        return new Fruit(this); // Pass in the builder
    }
}

public static void main(String[] args) {
	Fruit fr = new FruitBuilder().build();
	
}
}

public class BuilderDemo {
	public static void main(String[] args) {



	}

}
