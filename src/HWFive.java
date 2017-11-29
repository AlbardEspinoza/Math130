import java.util.Scanner;

public class HWFive {//This code was created by Albard Espinoza. The last time I worked on this code was 11/07/17 at 7:34P.M.

    //I'm going to use a "for loop" to be able to compute the difference of the whole array.
    public static int getDifference(int[] array) {
        int smallest = array[0];
        int largest = array[0];//Can two variables be assigned the same array value?
        for (int x = 0; x < array.length; x++) {
            if (smallest > array[x]) {//TODO; learn the rules of if, else if, else.
                smallest = array[x];
            }
            if (largest < array[x]) {
                largest = array[x];
            }
        }
        return largest - smallest;
    }

    //I'm going to use the "char.At()" method to be able to extract the char that I want to be tested in the boolean statement.
    public static int getNumberUpperCase(String str) {//In this method you can create another variable called x because it's "outside" of the scope of the previous method.
        int sum = 0;
        for (int x = 0; x < str.length(); x++) {//TODO; learn string methods with parentheses .lenght(), .charAt().
            if (str.charAt(x) >= 'A' && str.charAt(x) <= 'Z') {
                sum++;
            }
        }
        return sum;
    }

    //To make the code look "cleaner" I'm going to call the method "getNumberUpperCase" to compute the sum, that way I don;t have to re-write the hole method again.
    public static int getNumberOfUpperCase(String[] arrStr) {
        int sum = 0;
        for (int x = 0; x < arrStr.length; x++) {
            String word = arrStr[x];
            sum += getNumberUpperCase(word);
        }
        return sum;
    }

    //I had a little bit of trouble creating this method since every time I ran it it gave the correct answer for row 0, but not for 1 and 2.
    //Then I realized that the value for total didn't reset back to 0 when the for loop ended it just kept adding up the other rows with the previous rows value.
    //So I just added a line that made value of total reset back to 0 after the for loop ended.
    public static double[] computeRowSums(double[][] arrDouble) {
        double[] rowSums = new double[arrDouble.length];
        double total = 0.0;
        for (int rows = 0; rows < arrDouble.length; rows++) {
            for (int col = 0; col < arrDouble[rows].length; col++) {
                total += arrDouble[rows][col];
            }
            rowSums[rows] = total;
            total = 0;
        }
        return rowSums;
    }

    public static void main(String[] args) {
        int[] arrOne = {99, 11, 200, -15, 10001, 99, -23451, 2};
        int[] arrTwo = {18, 18, 18};

        System.out.print("The difference between the largest values in arrOne: ");
        System.out.println(getDifference(arrOne));
        System.out.print("The difference between the largest values in arrTwo: ");
        System.out.println(getDifference(arrTwo));
        System.out.println();

        String entry;
        String repeat;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a string: ");
            entry = in.next();
            System.out.print("# of upper-case characters in " + entry + " = ");
            System.out.println(getNumberUpperCase(entry) + "\n");
            System.out.println("Do you want to enter another string?");
            System.out.println("Enter y or Y for yes or any other value for no");
            repeat = in.next();
        } while (repeat.equalsIgnoreCase("y"));

        String[] list = {"catHouse", "b23ookS", "ST34ourz", "MAdiS**N"};
        System.out.print("\nThe number of upper-case characters in the list array: ");
        System.out.println(getNumberOfUpperCase(list));

        double[][] arrD = {{0.0, 88.2, -12323.23, 7662.342},
                {0.0, 0.0}, {-2123.0232, 23323.001, -8.0, -7.0, 16.0}};

        double[] sums = computeRowSums(arrD);
        System.out.println("\nRow Sums for arrD: ");
        for (int i = 0; i < arrD.length; i++) {
            System.out.println("sum of row " + i + " = " + sums[i]);
        }
    }
}