import java.util.Arrays;

public class HWSix {
    public static void main(String[] args) {
        int[] a = {90, 34, 22};
        Student b = new Student("Josh", "Andrews", a);
        int[] c = {95, 67, 49};
        Student d = new Student("Jorge", "Gonzales", c);
        System.out.println("Name: " + b.getFirstName() + " " + b.getLastName() + "\nHighest score: " + Arrays.toString(b.getGrades()) + "\nLowest score: " + b.getLowestGrade());
    }
}
