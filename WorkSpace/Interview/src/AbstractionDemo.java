
/*
 * way -1 using abstract classes
 * abstract class Phone{
    abstract void call();
    abstract void camera();
}

class Samsung extends Phone{

    @Override
    void call() {
        System.out.println("calling - Samsung");
    }

    @Override
    void camera() {
        System.out.println("Camera implementaion form Samsung");
    }

    @Override
    public String toString() {
        return "Samsung []";
    }
    
    
}

class Motorola extends Phone{
    @Override
    void call() {
        System.out.println("calling - Motorola");
    }

    @Override
    void camera() {
        System.out.println("Camera implementaion form Motorola");
    }

    @Override
    public String toString() {
        return "Motorola []";
    }
    
    
}
*/

// way -2 usin interfaces
interface  Phone{
      void call();
      void camera();
}

class Samsung implements Phone{

    @Override
    public void call() {
        System.out.println("calling - Samsung");
    }

    @Override
    public void camera() {
        System.out.println("Camera implementaion form Samsung");
    }

    @Override
    public String toString() {
        return "Samsung []";
    }
    
    
}

class Motorola implements Phone{
    @Override
   public  void call() {
        System.out.println("calling - Motorola");
    }

    @Override
    public void camera() {
        System.out.println("Camera implementaion form Motorola");
    }

    @Override
    public String toString() {
        return "Motorola []";
    }
    
    
}


class Repair{
    boolean repaired;
    
    
    public boolean isRepaired() {
        return repaired;
    }

    public void setRepaired(boolean repaired) {
        this.repaired = repaired;
    }


    public void repair(Phone phone){
      System.out.println("repairing\t"+phone);
      
          if(repaired){
          phone.call();
          phone.camera();
          }
          else
              System.out.println("Repair is in progress");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Phone mySamsung = new Samsung();
       /* mySamsung.call();
        mySamsung.camera();
*/        
        Phone myMoto = new Motorola();
/*        myMoto.call();
        myMoto.camera();
*/        
        
        Repair mysamsungRepair = new Repair();
        mysamsungRepair.setRepaired(true);
        mysamsungRepair.repair(mySamsung);
        
        
        Repair myMotoRepair = new Repair();
      //  myMotoRepair.setRepaired(false);
        myMotoRepair.repair(myMoto);
    }

}
