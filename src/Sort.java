import java.util.Arrays;

public class Sort {
    public static int[] sort(int[] num) {
        for (int x = 0; x < num.length; x++) {
            for (int y = x; y < num.length; y++) {
                int smallest = num[x];
                if (smallest > num[y]) {
                    num[x] = num[y];//These two lines basically make the values swap places making the smaller be at index 0 and the value that was at the index 0 be at
                    num[y] = smallest;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] list = {5,4,3,2,1};
        int[] answer = sort(list);
        System.out.println(Arrays.toString(answer));
        int plus = 0;
        for (int y = 0; y < 10; y++) {
            for (int x = plus; x <= y; x++) {
                System.out.println(x);
            }
            plus++;
        }
    }
}
