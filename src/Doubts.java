public class Doubts {
    public static void main(String[] args) {//TODO; test your doubts about allocating memory in this class, remember string fred willis use the method in the student class to get his last name and see what happens, then create an object from the student class and use the same methods to get his last name and compare it to the roberts string variable.
        int[] x = new int[4];
        x[0] = 1;
        x[1] = 2;


        System.out.println(x[3]);

        //Array initializer:
        int[] y = {2, 3, 4, 5, 6};
        y[0] = 4;//Changing the value at index 0 from 2 to 4.

        for (int n = 0; n < 100; n++) {
            System.out.println(n);
        }

        int z = 0;
        while (z < 10) {
            System.out.println(z);
            z++;
        }

        System.out.println(z);
        /*Remember that in a loop when a value makes the statement false the loop ends and the variable gets stored with the
         value that made the loop false. After the loop ends the the program runs the next immediate line of code.*/

        Student2 test = new Student2("James", "Raymond", "Physics");
        System.out.println(test.getFirstName());//Since you extended the Student2 class extends the Person2 class the child class can use all it's methods.
        System.out.println(test.toString());
        Circle2 m = new Circle2(12);//This line is allocating memory in the Circle2 class.
        System.out.println(m);//TODO; Remember why this line executes the toString method without calling it.
        Circle2 l = new Circle2(m.getRadius());
        /*To assign the value of variable from a "method class" you use the getMethod
        to extract the value and assign it to the new method. You can't just put the
        variable name in the parameters because it's a char and you need a double in
        able for the program to accept it or run it.
         */
        l.setRadius(2);
        Circle2 s = new Circle2(9);
        /*Remember that the variable name and variable name + .toString
        * are equivalent statements since the System.out.println() function
        * knows that it that whatever is returning from the class has to be
        * converted to a string so it can be printed so it automatically calls
        * the toString method even when the variable name is typed alone in the
        * System.out.println function.*/
        System.out.println(m);
        System.out.println(m.toString());

    }
}
