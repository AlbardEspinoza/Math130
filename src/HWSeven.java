public class HWSeven { //This code was created by Albard Espinoza. Last time I worked on this code was 11/28/17 at 7:10P.M.
    public static void main(String[] args) {
        int[] aa = {94, 93, 105, 93, 97, 92};
        int[] bb = {81, 73, 23, 65, 32, 56};
        MyStudent a = new MyStudent("Jim", "Sullivan", aa, "Dentist");
        //System.out.println(a.getGrades());//Array variables stores an address. Remember you have to wrap it around an array function(click light bulb) for you to be able to print an array, otherwise it will print the arrays address.
        //System.out.println(a.getFirstName() + a.getLastName());
        MyStudent b = new MyStudent("Hector", "Garcia", bb);
        System.out.println(a.toString() + "\n" + a.getAverageGrade());
        System.out.println(b.toString() + "\n" + b.getAverageGrade());
    }
}

