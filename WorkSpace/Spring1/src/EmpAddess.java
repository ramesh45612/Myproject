import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//to show has a relationship


class EmpJ
{
	private int empId;
	private String empName;
	private List <AddressJ> address;
	
	public List<AddressJ> getAddress() {
		return address;
	}
	public void setAddress(List<AddressJ> address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
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
	
	
}

class AddressJ
{
	private int doorNo;
	private String city;
	private String state;
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

public class EmpAddess {

	public static void main(String[] args) {
	ApplicationContext container =new ClassPathXmlApplicationContext("empaddress.xml");
	EmpJ emp=(EmpJ)container.getBean("emp");
	System.out.println(emp.getEmpId());
System.out.println(emp.getEmpName());
List<AddressJ> ob=emp.getAddress();
for(AddressJ ob1:ob)
{
	System.out.println(ob1.getDoorNo());
	System.out.println(ob1.getCity());
	System.out.println(ob1.getState());
}



	
}

}
