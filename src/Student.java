public class Student { //This class was created by Albard Espinoza. 11/16/17 12:10P.M.

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
    * variable and a local variable with the same name.
    * Also, remember that you can't have a parameter variable and a local variable with the same name.*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    /*To be able to get the highest score of each student I had to write a for loop.
    * I declared a local variable "x" and I set the  value of the first index in the grades array to "x",
    * so I assumed that the first index had the highest value in the grades array. After that, the for loop just checked if any other values
    * in the array where bigger than the value stored in the variable "x", if any value was bigger the if statement
    * would set that value to "x". At the end I returned x since it had stored the highest value.*/
    public int getHighestGrade() {
        int x = grades[0];
        for (int y = 0; y < grades.length; y++) {
            if (x < grades[y]) {
                x = grades[y];
            }
        }
        return x;
    }

    /*In this method the process was almost identical to the the method getHighestGrade.
    * The only difference is that instead of storing the highest in the local variable "x"
    * I would set the lowest value in the grades array to "x".*/
    public int getLowestGrade() {
        int x = grades[0];
        for (int y = 0; y < grades.length; y++) {
            if (x > grades[y]) {
                x = grades[y];
            }
        }
        return x;
    }

    /*In this short method I declared a local variable "x" and set the value 0 to it.
    * After that I created a for loop to check the values stored in the grades array.
    * I also created an if statement so that if any value was higher than or equal to
    * 70 "x" would be go up 1 value. And at the end of the the variable x would have stored
    * the number of passing grades in the grades array.
    * */
    public int getNumberPassing() {
        int x = 0;
        for (int y = 0; y < grades.length; y++) {
            if (grades[y] >= 70) {
                x++;
            }
        }
        return x;
    }

}


//TODO; Type short comment before each method.