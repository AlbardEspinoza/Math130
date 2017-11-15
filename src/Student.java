public class Student { //This code was created by Albard Espinoza. //TODO; write the last time you worked on this code

    /*Instance variables are the ones that make the value(s) of the variable received
    visible to the whole class.*/
    private String firstName;
    private String lastName;
    private int[] grades;

    /*The constructor method is the first one to be accessed when an object referring to
    * the same class as the constructor is created. The constructor sets the instance variable(s) to
    * the value that it receives(if any) and now all the methods in the class can access
    * or "view" the same value.*/
    public Student(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getFirstName(){return firstName;}

}
