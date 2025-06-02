public class HelloOOP {
    public static void main(String[] args) {
        Person p = new Person("Alex", 25);
        p.greet();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}
