package calc;

class Calc{
	
	//@Autowired
	CalService callService = new CalService();
	
	MathService mathService = new MathService();
	
	public int add(int a , int b){
		return callService.add(a, b);
	}
	public int sub(int a , int b){
		return callService.sub(a, b);
	}
	
	public int square(int a){
		return mathService.square(a);
	}
	
	public int cube(int a){
		return mathService.cube(a);
	}
}
