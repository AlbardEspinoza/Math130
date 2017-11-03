import java.util.ArrayList;//You need to import this utility to be able to create array lists.

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("4");
        list.add("7");
        for (int kk = 2; kk < 6; kk++) {
            list.add(list.get(kk - 1) + list.get(kk - 2));
        }

        list.add(0, "E");
        list.add(0, "Z");
        list.add(0, "V");

        for (int kk = 2; kk < 6; kk++) {
            list.set(kk, list.get(kk - 2) + list.get(kk));
        }
        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }
}
