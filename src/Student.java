public class Student { //This code was created by Albard Espinoza. //TODO; write the last time you worked on this code

    /*Instance variables are the ones that make the value(s) of the variable received
    visible to the whole class.*/
    private String firstName;
    private String lastName;
    private int[] grades;

    /*The constructor method is the first one to be accessed when an object referring to
    * the same class as the constructor is created. The constructor sets the instance variable(s) to
    * the value that it receives and now all the methods in the class can access
    * or "view" the same value.*/
    public Student(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    /*You don't need a parameter in the get methods because you're simply "returning" a
    * value stored in the variable that called the method, also when the user calls the
    * method to get the value it does'nt "send" any data over to the method so it's
    * ambiguous to have a parameter since you're not gonna store anything in it/*/
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getGrades() {
        return grades;
    }

    /*Remember the "this.firstName" refers to the instance variable, the
    * "firstName" that is being stored into "this.firstName" refers to the
    * variable in the method's parameter. Remember that you can't have a parameter
    * variable and a local variable with the same name.*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getHighestGrade() {
        int x = grades[0];
        for (int y = 0; y < grades.length; y++) {
            if (x < grades[y]) {
                x = grades[y];
            }
        }
        return x;
    }

    public int getLowestGrade() {
        int x = grades[0];
        for (int y = 0; y < grades.length; y++) {
            if (x > grades[y]) {
                x = grades[y];
            }
        }
        return x;
    }

    public int[] getNumberPassing() {//TODO; tell the professor that you changed the method header because the method has to return an int[] not an int.
        int[] x = new int[grades.length];
        for (int y = 0; y < grades.length; y++) {
            if (grades[y] >= 70) {
                x[y] = grades[y];
            }
        }
        return x;
    }

}


//TODO; Type short comment before each method.