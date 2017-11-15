public class Test {
    public static void main(String[] args) {
        Person p = new Person("Pilar", "Smith");//In this line you're creating a new person object called c, and you're storing in it values.
        //When you create a new object you're allocating memory for the values it's gonna store.
        Person z = new Person("Zachary", "Roberts");
        System.out.println("Name = " + z.getFirstName() + " " + z.getLastName());
        System.out.println("Name = " + p.getFirstName() + " " + p.getLastName());
        p.setFirstName("Linda");
        p.setLastName("Ochoa");
        System.out.println("Name = " + p.getFirstName() + " " + p.getLastName());
        System.out.println("Name = " + p);//Why does this line of code have that output?
    }
}
