import java.util.Arrays;

public class EdP {
    public static int[] sort(int[] num) {//Remember if an array is empty the default value at the indexes is going to be 0.
        int smallest = num[0];
        int[] list = new int[num.length];
        //int plus = 0;
        for (int x = 0; x < num.length; x++) {
            for (int y = x/*plus*/; y < num.length; y++) {
                if (smallest > num[y]) {
                    list[x] = num[y];
                    smallest = num[y];
                    //you have to put and if else statement here
                }
                //plus++;
                //Smallest has to reset to num[something]
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] lists = {-17, 10040, 23};
        int[] answer = sort(lists);
        System.out.println(Arrays.toString(answer));
        int[] test = new int[4];
        System.out.println(Arrays.toString(test));
    }
}
//FINISHED VERSION OF THIS PROJECT IS SORT CLASS