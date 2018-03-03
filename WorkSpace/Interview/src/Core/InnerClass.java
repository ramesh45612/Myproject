package Core;

import java.io.*;

class BankAccount
{
	private double bal;
	public BankAccount(double b) {
		bal=b;
	}
	
	void contact(double r) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Password");
		String pass=br.readLine();
		//System.out.println(rate);
		if(pass.equals("ram"))
		{
		
			Interest in =new Interest(r);
			in.calculaterInterest();
			
		}
		else
		{
			System.out.println("You are not authorized to do this action");
		}
	}

private class Interest
{
	private double rate;
	Interest(double rate)
	
	{
		this.rate=rate;
	}
	
	void calculaterInterest()
	{
		double interest=(bal*rate)/100;;
		bal+=interest;
		System.out.println("Curent Balance is "+bal);
	}
}
}

public class InnerClass {

	public static void main(String[] args)  throws Exception{
	
		BankAccount ob = new BankAccount(10000);
		System.out.println("welcomeeeeeeeeeeeeee");
		ob.contact(9.5);
		}

}
