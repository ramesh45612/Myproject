package Core;


class Parent1{
    
    private Child1 child;
}

class Child1{
    private Parent1 parent;
    
    public void method1(){
        System.out.println("From Method1");
    }
}

class Parent2{
    
    private Child2 child;

    public Parent2(Child2 child) {
        this.child = child;
    }
    
}


class Child2{
    private Parent2 parent;
    public Child2(Parent2 parent) {
        this.parent = parent;
    }

    public void method1(){
        System.out.println("From Method1 child2");
    }
}



public class CircularDependancy {

    public static void main(String[] args) {
        Child1 child = new Child1();
        child.method1();  //from method1
        
        Parent2 par2 = null;
        Child2 child2 = null;
        
        par2= new Parent2(child2);
        child2 = new Child2(par2);
        child2.method1(); //from method1 child2
         
        /*Parent par3= new Parent2(child3); //child3 can't resolve to a type 
        Child2 child3 = new Child2(par2);*/
        
    }
}
