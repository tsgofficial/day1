class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.println(adder.add(20, 22));
        System.out.println(adder.add(5, 8));
        System.out.println(adder.add(10, 10));
    }
}
