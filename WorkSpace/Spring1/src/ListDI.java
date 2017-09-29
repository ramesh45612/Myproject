import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Question
{
	private int id;
	private String name;
	private List <Answer> ans;
	public Question(int id, String name, List<Answer> ans) {
		this.id = id;
		this.name = name;
		this.ans = ans;
	}
	
	public void dis()
	{
		System.out.println(id +"\t"+name);
		System.out.println("answers are");
		Iterator itr =ans.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
}

class Answer
{
	private int id;
	private String name;
	private String by;
	public Answer(int id, String name, String by) {
		this.id = id;
		this.name = name;
		this.by = by;
	}
	
	public String toString()
	{
		return id+"\t"+name+"\t"+by;
	}
	
}
public class ListDI {
	public static void main(String[] args) {
	ApplicationContext container=new ClassPathXmlApplicationContext("travel1.xml");
	Question q =(Question)container.getBean("question");
	q.dis();
	
	}

}

