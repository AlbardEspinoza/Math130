import java.util.Arrays;

public class Sort {
    public static int[] sort(int[] num) {
        for (int x = 0; x < num.length; x++) {
            for (int y = x; y < num.length; y++) {
                int smallest = num[x];
                if (smallest > num[y]) {
                    num[x] = num[y];//These two lines basically make the values swap places making the smallest number be at index 0 and the value that was at the number at index 0 be at the index the smaller number was.
                    num[y] = smallest;
                }
            }//If you initialize an array giving it the exact number of elements that will be in it you can't expand it or decrease it, example: int[] arr = new int[10], this array will have exactly 10 elements, you can't add or decrease any.
        }//Remember that if you initialize the array and you don't add elements to it the default value for the indexes without elements will be 0.
        return num;
    }

    public static void main(String[] args) {
        int[] list = {100,20,-11,2,41,111111};
        int[] answer = sort(list);
        System.out.println(Arrays.toString(answer));
        int plus = 0;
        for (int y = 0; y < 10; y++) {
            for (int x = plus; x <= y; x++) {
                System.out.print(x);
            }
            plus++;
        }
    }
}
