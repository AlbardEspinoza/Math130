public class Person {
    //Instance variables
    private String firstName;//Anything private can only be used in the same class the private variable is.
    private String lastName;

    public Person(String iFirstName, String iLastName) {//The name of the constructor method and the class have to be identical.
        firstName = iFirstName;
        lastName = iLastName;
    }

    public String getFirstName() {
        return firstName;
    }//The 'get' methods are the accessors, meaning they let the

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String nFirstName) {
        firstName = nFirstName;
    }//The set methods are the mutator.

    public void setLastName(String nLastName) {
        lastName = nLastName;
    }
}
//TODO; finish comments of the accessors and mutator methods