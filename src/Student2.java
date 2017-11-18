public class Student2 extends Person2 { //The extend keyword means this class is extending the person2 class, so it can inherit all its methods.
    private String major;

    public Student2(String firstName, String lastName, String major) {
        super(firstName, lastName);//This line of code is calling the constructor in the parent graph.
        this.major = major;
    }

    public String toString() {
        return super.toString() + " \nMajor = " + major;
    }/*Method overriding, its basically adding a little bit more code to the method.
    You are basically taking advantage that you already have a method that you need to start or complete another method, and you just add a whatever extra code you need to finish it.*/
    //super.toString is calling the method in the parent graph.

}