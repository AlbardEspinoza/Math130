public class Person {//Person variable
    //Instance variables
    private String firstName;//Anything private can only be used in the same class the private variable is.
    private String lastName;

    public Person(String iFirstName, String iLastName) {
        firstName = iFirstName;
        lastName = iLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String nFirstName) {
        firstName = nFirstName;
    }

    public void setLastName(String nLastName) {
        lastName = nLastName;
    }
}
