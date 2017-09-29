public class Arithmetic {
public static void main(String[] args) {
        int a, b, add, sub, mul;

        System.out.println("Welcome to Arithmetic Operations");
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        Operations ob = new Operations();
        add = ob.add(a, b);
        sub = ob.sub(a, b);
        mul = ob.mul(a, b);

        System.out.println("Addition is\t" + add);
        System.out.println("Subtraction is \t" + sub);
        System.out.println("Multipication is\t" + mul);

    }

}
