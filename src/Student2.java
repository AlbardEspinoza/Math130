public class Student2 extends Person2 { //The extend keyword means this class is extending the person2 class, so it can inherit all its methods, this means this class has or "can use" all the methods from the parent class without you having to write them all again.
    private String major;

    public Student2(String firstName, String lastName, String major) {
        super(firstName, lastName);//This line of code is calling the constructor in the parent class(with the same parameter types, in the same order and same type), it basically initializes the methods in the parent class in this class.
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + " \nMajor = " + major;//The super.toString() is calling a method in the parent class.
    }/*Method overriding, its basically adding a little bit more code to the method.
    You are basically taking advantage that you already have a method that you need to start or complete another method, and you just add a whatever extra code you need to finish it.*/
    //super.toString is calling the method in the parent class.

}