public class MyStudent extends Student3 { //This code was created by Albard Espinoza. Last time I worked on this code was 11/28/17 at 7:10P.M.

    private String major;

    public MyStudent(String firstName, String lastName, int[] grades, String major) {
        super(firstName, lastName, grades);
        /*When you use "super(parameters)" you're calling a constructor from the parent class
          (with the same parameters in the same order) and you are storing the contents
          into the instance variables in the parent class.
        * That is why you don't initialize the firstName, lastName, and grades variables in
        * this class. because you store them in the parent's class instance variables.
        * Also, when you need to call a method from the parent class, but the object you created is
        * from the child class you can always call the method in the parent class(the methods
        * in the parent class are visible to the child class because of inheritance) because
        * the instance variables in the parent class have stored the contents that you need
        * to retrieve or set.*/
        this.major = major;
    }

    //This constructoe calls the first constructor.
    public MyStudent(String firstName, String lastName, int[] grades) {
        this(firstName, lastName, grades, "Biology");//TODO; Why does the major have to be set right away instead of writing major.
        /*Because you already initialized the major instance variable in
        this class.*/
        /*When you use "this()" you are calling a constructors in the same class
        * (with the same parameters in the same order).*/
    }

    //This method returns the String stored in the major instance variable.
    public String getMajor() {
        return major;
    }

    //This method sets ans stores the input String in the major instance variable.
    public void setMajor(String major) {
        this.major = major;
    }

    /*To get the average grade of the values in the grades array I just simply
    * had to initialized a local int array variable called grades and set it to
    * the grades stored in the int grades array in the superclass. After that I
    * initialized a double variable called "sum" so it could store the sum of all the
    * integers in the grades array. To add all the values up in the array I made a
    * for loop. After that I casted a double object into an integer object(so I could
    * return an integer), and finally divided that integer value by the number length
    * of the grades array and returned the answer.*/
    public int getAverageGrade() {
        int[] grades = getGrades();
        double sum = 0;
        for (int x = 0; x < grades.length; x++) {
            sum += grades[x];
        }
        return (int) sum / grades.length;//Example of casting.
    }

    /*In this method I just simply overrode the toString method in the parent class
     *by calling it with the "super" method and added a concatenation so it could
     * return all the the things the toString method in the parent class returned
     * plus the contents stored in the major instance variable in this(child class)
     * class.*/
    public String toString() {
        return super.toString() + "\nMajor: " + major;
    }

}
