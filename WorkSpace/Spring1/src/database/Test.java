package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student
{
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}


public class Test {
	public static void main(String[] args) {
		List<Student> ob= new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(10);
		s1.setName("Ten");
		
		Student s2= new Student();
		s2.setId(20);
		s2.setName("Twenty");
		
		ob.add(s1);
		ob.add(s2);
		
		System.out.println(ob);
		
		for(Student s:ob)
		{
			System.out.println(s.getId()+"\t"+s.getName());
		}
		
		Iterator<Student> it=ob.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getId());
		}
		
		
		ArrayList a=new ArrayList();
		a.add("1");
		a.add("2");
		System.out.println(a);
		
		
	}

}
