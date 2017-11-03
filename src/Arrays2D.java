public class Arrays2D {

    public static int computeLargest(int[][] arr) {
        int largest = arr[0][0];//Remember that the first set of "[]" refers to the row,
        for (int row = 0; row < arr.length; row++) {//and the second "[]" refers to the column in the array.
            for (int col = 0; col < arr[row].length; col++) {
                if (largest < arr[row][col]) {
                    largest = arr[row][col];
                }
            }
        }
        return largest;
    }

    public static int computeSum(int[][] arr2){
        int sum = 0;
        for(int row = 0; row < arr2.length; row++){
            for(int col = 0; col < arr2[row].length; col++){
                sum += arr2[row][col];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = {{23, 12, 13, 24, 2, 3, 4, 1, 2}, {2, -4, 5, 10, 90}, {3, 1265, 23, 45, 24}, {12, 23, 45}};
        int total = computeSum(array);
        System.out.println(total);
        int maximum = computeLargest(array);
        System.out.println(maximum);
        int[][] arrInt = new int[598][460];
        System.out.println(arrInt[459].length);
        System.out.println(arrInt.length);
        System.out.println(arrInt[0].length);
    }
}
