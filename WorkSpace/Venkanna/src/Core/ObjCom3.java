package Core;

class One1
{
	Two obj2;
	One1(Two obj2)
	{
	this.obj2=obj2;				
	}
	
	double cube(double x)
	{
		double result=x*obj2.square(x);
		return result;
	}
	
}

class Two
{
	Three obj3;
	Two(Three obj3)
	{
		this.obj3=obj3;
	}
	
	double square(double x)
	{
		double result=x*obj3.get(x);
		return result;
		
	}
}

class Three
{
	double get (double x)
	
	{
		return x;
	}
	
}
public class ObjCom3 {
	
	public static void main(String[] args) {
	
		Three obj3 =new Three();
		Two obj2= new Two(obj3);
		One1 obj1=new One1(obj2);
		double result=obj1.cube(5);
		System.out.println("cube of 5=\t"+result);
		
		result=obj2.square(6);
		System.out.println("Square of 6=\t"+result);
		
	}

}
