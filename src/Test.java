public class Test {
    public static void main(String[] args) {
        Person p = new Person("Pilar", "Smith");
        System.out.println("Name = " + p.getFirstName() + " " + p.getLastName());
        p.setFirstName("Linda");
        p.setLastName("Ochoa");
        System.out.println("Name = " + p.getFirstName() + " " + p.getLastName());
    }
}
