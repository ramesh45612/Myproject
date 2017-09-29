import java.util.ArrayList;
import java.util.List;

class Overloading
{
public void show(Object o){System.out.println("Object");}
protected void show(Integer a){System.out.println("Integer");}
void show(String a){System.out.println("String");}
public void show(int a){System.out.println("int");}
private static final int show(char a){return 123;}
//private also we can define but we can't access outside
public void show(ArrayList a){System.out.println(" ArrayList");}
public void show(List l){System.out.println("List");}

}

public class OverloadingDemo {
public static void main(String[] args) {
Overloading ob=new Overloading();
ob.show(new Object());//In case of show(Object o) is not avail it will not execute show(String s)
ob.show(new Integer(1));//incase of show(Integer a) isn't there move to one up that is show(Object o)and if show(Object o) is not there then show(int a) will executed
ob.show("abc");//In case of show(String a) is not avail it will execute show (Object o)
ob.show(1);//In case of show(int a) is not avail show(Integer a) will execute
List list= new ArrayList();
ob.show(list);//show(List l) will be executed if show(list) isn't avail then move to one up that is show(Object o) and this method will be executed 

}
}
