package collectionSnippets;

final class ImmutableEmp {

    static int count = 0;

    private final String name;

    public ImmutableEmp(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public ImmutableEmp setName(String name) {
        if (this.name.equals(name))
            return this;
        else
            return new ImmutableEmp(name);
    }

    @Override
    public String toString() {
        return "ImmutableEmp [name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ImmutableEmp))
            return false;
        ImmutableEmp e = (ImmutableEmp) obj;
        return e.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class Test {

    public static void main(String[] args) {
        ImmutableEmp ob = new ImmutableEmp("Sankoji");
        System.out.println(ob);

        ImmutableEmp ob1 = ob.setName("Sankoji");
        System.out.println(ob1);

        ImmutableEmp ob2 = new ImmutableEmp("Sankoji");
        System.out.println(ob2);

        System.out.println(ob.hashCode());

        System.out.println(ob1.hashCode());

        System.out.println(ob2.hashCode());

        System.out.println("no of objects created\t" + ImmutableEmp.count);

    }
}
