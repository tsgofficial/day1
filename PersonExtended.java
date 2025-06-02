public class PersonExtended extends Person {
    private String email;

    public PersonExtended(String name, int age, String email) {
        super(name, age);
        setEmail(email);
    }

    public void greet() {
        System.out.println("Hello, I'm " + getName() + ", age " + getAge() + ", email " + email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email.");
        }
    }
}
