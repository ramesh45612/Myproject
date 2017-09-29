interface Emp{
	String workStatus ="not Started";
	String workStatus();
}

class Permanent implements Emp{
	String workStatus;
	
	@Override
	public String workStatus() {
		return workStatus;	
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
}

class Contract implements Emp{
	String workStatus;
	@Override
	public String workStatus() {
		return workStatus;	
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	

}

class Test1 implements Emp{
	String workStatus;
	@Override
	public String workStatus() {
		return workStatus;	
	}
	

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	
}


class EmpFactory{
	public  Emp getInstance(String type){
		if(type.equals("cont")) return new Contract();
		else if (type.equals("perm"))return new Permanent();
		else return new Test1();
	}
}

public class FactoryDemo {

	public static void main(String[] args) {
		EmpFactory fac = new EmpFactory();
		
		Emp e=	fac.getInstance("cont");
		e.workStatus();
		
		Emp e2=	fac.getInstance("perm");
		e2.workStatus();
		
		Emp e3 = fac.getInstance("other");
		e3.workStatus();
		
		
		
	}
}
