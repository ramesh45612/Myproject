package Core;

abstract class Bike {
    String label = "Bike";

    Bike() {
        System.out.println("Bike Constructor");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear - Bike");
    }
}

class Honda extends Bike {

     //String label ="HOnda";
    Honda() {
        System.out.println("Honda  Constructor");
    }

    @Override
    void run() {
        System.out.println("Runnig from Honda\t" + label);

    }

}

public class AbstractDemo2 {
    public static void main(String[] args) {

        Bike ob = new Honda();
        ob.run();
        ob.changeGear();

    }

}