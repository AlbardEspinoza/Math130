public class Person {
    //Instance variables
    private String firstName;//Anything private can only be used in the same class the private variable is.
    private String lastName;//You need the instance variables so all the methods can acces the value.

    public Person(String iFirstName, String iLastName) {//The name of the constructor method and the class have to be identical.
        firstName = iFirstName;//The constructor method is the first one to be accessed when an object is created of this class, it stores the value in the private instance variables which are visible to the whole class.
        lastName = iLastName;
    }

    public String getFirstName() {
        return firstName;//It returns the value set stored in the instance variable.
    }//The 'get' methods are the accessors.

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String nFirstName) {
        firstName = nFirstName;
    }//The set methods are the mutator.
    //It changes the value stored in the instance variable to whatever value it receives.
    public void setLastName(String nLastName) {
        lastName = nLastName;
    }
}
//TODO; finish comments of the accessors and mutator methods