package Core;

class Shape
{

	void draw(){
	System.out.println("From Shape");	
	}
}

class Circle extends Shape
{
	void draw(){
		System.out.println("From Circle");	
		}
}

class Triangle extends Shape
{
	void draw(){
		System.out.println("From Triangle");	
		}
	
}
public class DependancyInj {
public static void main(String[] args) {
Circle type1=new Circle();
Shape type2=new Triangle();
type1.draw();
type2.draw();
	}

}
