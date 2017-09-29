

public class AbstractEnum {

	enum Test
	{
		CAT{public void makeNoise(){System.out.println("mavoooooooooo");}},
		DOG{public void makeNoise(){System.out.println("Bowwwwwwwwwww");}};
		//enum can have abstract method and constants must implement that abstract method
		public abstract void makeNoise();
				
	}
		
	public static void main(String[] args) {
		System.out.println(Test.CAT);
		Test.CAT.makeNoise();
		Test.DOG.makeNoise();

	}

}
