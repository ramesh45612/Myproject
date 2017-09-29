abstract class Plan
{
	 double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units)
	{
		System.out.println(rate*units);
	}
	
}

class DomesticPlan extends Plan
{

	@Override
	void getRate() {
		rate=3.50;		
	}
	
}

class CommercialPlan extends Plan
{

	void getRate() {
		rate=7.50;
		}
	
}


class GetPlanFactory
{
	
	public Plan getPlan(String planType)
	{
		if(planType==null) return null;
		
		if(planType.equals("domestic")) return new DomesticPlan();
		
		if(planType.equals("commercial")) return new CommercialPlan();
		return null;
	}
}

public class Factory1 {
	public static void main(String[] args) {

		GetPlanFactory planFactory=new GetPlanFactory();
		Plan p =planFactory.getPlan("domestic");
		p.getRate();
		p.calculateBill(2);

	}

}
