public class Person2 {
    private String firstName;
    private String lastName;

    public Person2(String firstName, String lastName) {
        this.firstName = firstName;/*Remember private instance variables can only be accessed by methods in the same class.
        Also, instance variables aren't always private sometimes they're protected and that preserves encapsulation.*/
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //You won't get a compiler error if you name the methods and the instance variable the same, but it's considered poor coding.

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "First name = " + firstName + " Last name = " + lastName;
    }
}
