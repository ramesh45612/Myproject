
package Core;

class Animal {
    public void speak() {
    }

    public String getType() {
        return "Generic animal";
    }
}

class Cat extends Animal {
    @Override
    public void speak() { // This is a good override.
        System.out.println("Meow.");
    }

    @Override
    public String getType() { // Compile-time error due to mistyped name.
        return "Cat";
    }
}


public class AnnotationExample {

		public static void main(String[] args) {
	

	}

}
