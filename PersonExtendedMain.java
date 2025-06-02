public class PersonExtendedMain {
    public static void main(String[] args) {
        PersonExtended p1 = new PersonExtended("Sara", 22, "sara@example.com");
        PersonExtended p2 = new PersonExtended("Tom", 30, "tomexample.com"); // Invalid email

        System.out.println(p1.getName() + " | Age: " + p1.getAge() + " | Email: " + p1.getEmail());
        System.out.println(p2.getName() + " | Age: " + p2.getAge() + " | Email: " + p2.getEmail());

        p2.setEmail("tom@domain.com");
        System.out.println("Updated Email for Tom: " + p2.getEmail());
    }

}
