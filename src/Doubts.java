public class Doubts {
    public static void main(String[] args) {//TODO; test your doubts about allocating memory in this class, remember string fred willlis use the method in the student class to get his last name and see what happens, then create an object from the student class and use the same methods to get his last name and compare it to the roberts string variable.
        int[] x = new int[4];
        x[0] = 1;
        x[1] = 2;


        System.out.println(x[3]);

        //Array initializer:
        int[] y = {2, 3, 4, 5, 6};
        y[0] = 4;//Changing the value at index 0 to 4.

        for(int n = 0; n < 100; n++){
            System.out.println(n);
        }

        int z = 0;
        while(z < 10){
            System.out.println(z);
            z++;
        }

        System.out.println(z);
        /*Remember that in a loop when a value makes the statement false the loop ends and the variable gets stored with the
         value that made the loop false. After the loop ends the the program runs the next immediate line of code.*/

    }
}
