public class HWSix { //This class class was created by Albard Espinoza. 11/16/17 12:10P.M.
    public static void main(String[] args) {
        int[] a = {90, 34, 22};
        Student b = new Student("Josh", "Andrews", a);
        int[] c = {95, 70, 49};
        Student d = new Student("Jorge", "Gonzales", c);
        System.out.println("Name: " + b.getFirstName() + " " + b.getLastName() + "\nHighest Score: " + b.getHighestGrade() + "\nLowest Score: " + b.getLowestGrade() + "\nPassing Scores: " + b.getNumberPassing());
        System.out.println("\nName: " + d.getFirstName() + " " + d.getLastName() + "\nHighest Score: " + d.getHighestGrade() + "\nLowest Score: " + d.getLowestGrade() + "\nPassing Scores: " + d.getNumberPassing());
        b.setFirstName("Carmen");
        b.setLastName("Garcia");
        d.setFirstName("David");
        d.setLastName("Williams");
        System.out.println("\nName: " + b.getFirstName() + " " + b.getLastName() + "\nHighest Score: " + b.getHighestGrade() + "\nLowest Score: " + b.getLowestGrade() + "\nPassing Scores: " + b.getNumberPassing());
        System.out.println("\nName: " + d.getFirstName() + " " + d.getLastName() + "\nHighest Score: " + d.getHighestGrade() + "\nLowest Score: " + d.getLowestGrade() + "\nPassing Scores: " + d.getNumberPassing());
        //The command "\n" tells java to place the next data in a new line.
    }
}
