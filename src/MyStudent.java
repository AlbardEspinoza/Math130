public class MyStudent extends Student3 { //This code was created by Albard Espinoza. Last time I worked on this code was 11/28/17 at 7:10P.M.

    private String major;

    public MyStudent(String firstName, String lastName, int[] grades, String major) {
        super(firstName, lastName, grades);
        this.major = major;
    }

    public MyStudent(String firstName, String lastName, int[] grades) {
        this(firstName, lastName, grades, "Biology");//TODO; Why does tha major have to be set right away instead of writing major.
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAverageGrade() {
        int[] grades = getGrades();
        double sum = 0;
        for (int x = 0; x < grades.length; x++) {
            sum += grades[x];
        }
        return (int) sum / grades.length;//Example of casting.
    }

    public String toString() {
        return super.toString() + "\nMajor: " + major;
    }

}
