import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class DynamicEmp
{

	private int empId;
	private String empName;
	private DynamicAddress address;			// one to one relationship
	private List<DynamicAddress> maddr;		//one to many relationship
	
	public int getEmpId() {
		return empId;
	}
	public DynamicAddress getAddress() {
		return address;
	}
	public void setAddress(DynamicAddress address) {
		this.address = address;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<DynamicAddress> getMaddr() {
		return maddr;
	}
	public void setMaddr(List<DynamicAddress> maddr) {
		this.maddr = maddr;
	}
	
	
}

class DynamicAddress
{
	private int doorNo;
	private String city;
	private String state;
	private String label;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}



public class Dynamic {
	public static void main(String[] args)  throws Exception  {
		ApplicationContext container =new ClassPathXmlApplicationContext("dynamic.xml");
		DynamicEmp emp=(DynamicEmp)container.getBean("emp");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter employee details \nEmp Id");
		emp.setEmpId(Integer.parseInt(br.readLine()));
		System.out.println("Emp Name");
		emp.setEmpName(br.readLine());
		
		DynamicAddress address=(DynamicAddress)container.getBean("address");
		System.out.println("Enter Door Number");
		address.setDoorNo(Integer.parseInt(br.readLine()));
		System.out.println("Enter City");
		address.setCity(br.readLine());
		System.out.println("Enter State");
		address.setState(br.readLine());
		
		System.out.println("Employee Details are Below");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getAddress().getDoorNo());
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getState());
		//end one to one relationship end
		
		System.out.println("End of one to one relationship");
		
		
		DynamicAddress perm=(DynamicAddress)container.getBean("perm");
		System.out.println("permanent addressEnter Door Number");
		perm.setDoorNo(Integer.parseInt(br.readLine()));
		System.out.println("Enter City");
		perm.setCity(br.readLine());
		System.out.println("Enter State");
		perm.setState(br.readLine());
		
		DynamicAddress temp=(DynamicAddress)container.getBean("temp");
		System.out.println("Temporary addressEnter Door Number");
		temp.setDoorNo(Integer.parseInt(br.readLine()));
		System.out.println("Enter City");
		temp.setCity(br.readLine());
		System.out.println("Enter State");
		temp.setState(br.readLine());
		
		
		List<DynamicAddress> list =emp.getMaddr();
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		
		for(DynamicAddress ob:list)
		{
			System.out.println(ob.getLabel());
			System.out.println(ob.getDoorNo());
			System.out.println(ob.getCity());
			System.out.println(ob.getState());
		}
		
		
	}

}
 