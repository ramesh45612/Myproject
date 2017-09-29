import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Begin
{	
	String name;
	
	public Begin(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String ...a){
	
		Resource resource = new ClassPathResource("begin.xml");
		BeanFactory beanfactory=new XmlBeanFactory(resource);
		
		Begin begin1=(Begin)beanfactory.getBean("begin");
		System.out.println("value of bean \t"+begin1.getName());
				
		Begin begin2=beanfactory.getBean(Begin.class);
		System.out.println(begin2.getName());		
		
		//System.out.println(container.containsBean("abc"));//false
		System.out.println("containsBean\t"+beanfactory.containsBean("begin")); //true
		System.out.println("isSingleTon\t"+beanfactory.isSingleton("begin"));
		System.out.println("isPrototype\t"+beanfactory.isPrototype("begin"));

		
		//not avail below methods in beanfactory
		//System.out.println("beanDefinitionCount\t"+container.getBeanDefinitionCount());
		/*String s[]=container.getBeanDefinitionNames();
		for(String s1:s) System.out.println(s1);
	*/	
		
		
		String b[]={"begin.xml","first.xml"};
		ApplicationContext applicationcontext1= new ClassPathXmlApplicationContext(b);
		String s2[]=applicationcontext1.getBeanDefinitionNames();
		for(String s1:s2) System.out.println(s1);
			
		ApplicationContext applicationcontext2= new ClassPathXmlApplicationContext("begin.xml");
		
		
	//To know how many bean definitions are created
	String s[]=applicationcontext2.getBeanDefinitionNames();
	for(String s1:s) System.out.println(s1);
	
	
	 // create an  object way 1
	 Begin begin3=(Begin)applicationcontext1.getBean("be gin");
	System.out.println(begin3.getName());
		
	//create an object way 2
	Begin begin4=applicationcontext1.getBean(Begin.class);
	System.out.println("value"+begin4.getName());

	//System.out.println(container.containsBean("abc"));//false
	System.out.println("containsBean\t"+applicationcontext1.containsBean("begin")); //true
	System.out.println("conainsBeanDefinition\t"+applicationcontext1.containsBeanDefinition("begin"));//true
	System.out.println("isSingleTon\t"+applicationcontext1.isSingleton("begin"));
	System.out.println("isPrototype\t"+applicationcontext1.isPrototype("begin"));
	System.out.println("beanDefinitionCount\t"+applicationcontext1.getBeanDefinitionCount());

	}
	
}