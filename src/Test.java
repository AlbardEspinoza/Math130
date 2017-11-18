public class Test {
    public static void main(String[] args) {
        Person p = new Person("Pilar", "Smith");//In this line you're creating a new person object called c, and you're storing in it values.
        //When you create a new object you're allocating memory for the values it's gonna store in that class..
        Person z = new Person("Zachary", "Roberts");
        System.out.println("Name = " + z.getFirstName() + " " + z.getLastName());
        System.out.println("Name = " + p.getFirstName() + " " + p.getLastName());
        p.setFirstName("Linda");
        p.setLastName("Ochoa");
        System.out.println("Name = " + p.getFirstName() + " " + p.getLastName());
        System.out.println("Name = " + p);//Why does this line of code have that output?

        Student2 m = new Student2("Raymond ", "Martinez", "Physics");/*Here is an example of how you created a Student 2 object
        and since the Student 2 class extends the Person2 class it inherits all its methods. So when you create an object from the Student2 class your basically getting all the
        all the data methods and code from the Person2 class.*/
        System.out.println(m.toString());
    }
}
