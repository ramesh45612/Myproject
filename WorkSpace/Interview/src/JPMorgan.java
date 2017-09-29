import java.util.ArrayList;
import java.util.List;


class One
{
public void show(ArrayList a){System.out.println(" Array List");}
public void show(List l){System.out.println("List");}
}
public class JPMorgan {

	public static void main(String[] args) {
	One ob=new One();
	List list= new ArrayList();
	ob.show(list); //List

	}

}
