
class CloneObject implements Cloneable
{
	protected void show(){
		System.out.println("Protected");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}


public class CloneDemo  {
	
	public static void main(String[] args) throws Exception{
	
		CloneObject ob = new CloneObject();
		ob.show();
		CloneObject ob2=(CloneObject)ob.clone();
		ob2.show();

	}
	

}
