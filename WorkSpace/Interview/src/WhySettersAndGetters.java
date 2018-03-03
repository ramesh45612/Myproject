class PersonWithEncapsulation {

    private int age;
    private final int constant = 22 / 7;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            throw new IllegalArgumentException("Please provide valid age\t"
                    + age);
    }

    public int getConstant() {
        return constant;
    }

    /*
     * like this also we can approach constructor based 
     * PersonWithEncapsulation(int age) { if(age>0) this.age = age; else throw
     * new IllegalArgumentException("Please provide valid age\t"+age); }
     */
}

public class WhySettersAndGetters {

    public static void main(String[] args) {
        PersonWithEncapsulation ob = new PersonWithEncapsulation();
        // ob.age =10; its not possible, its not at all visible
        try {
            ob.setAge(-10);// compiles successfully @Runtime will get Exception
                           // hence we should provide only correct age
            // System.out.println(ob.getAge());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        ob.setAge(10);// 10
        System.out.println("Age\t" + ob.getAge());
        System.out
                .println("Read only we can't change(there is no setters its final,"
                        + " by default eclipse also won't provide setters) \t"
                        + ob.getConstant());

        /*
         * PersonWithEncapsulation ob1 = new PersonWithEncapsulation(-10);
         * System.out.println(ob1.getAge());
         */
    }

}
