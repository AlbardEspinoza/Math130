public class Student3 { //This code was overwritten by Albard Espinoza. Last time i worked on this code was 11/28/12 at 7:10P.M.
    private String firstName;
    private String lastName;
    private int[] grades;

    // Constructor
    public Student3(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    // Mutator Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Accessor Methods
    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public int[] getGrades() {
        return grades;
    }

    // Calculate the highest grade
    public int getHighestGrade() {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (max < grades[i]) {
                max = grades[i];
            }
        }
        return max;
    }

    // Calculate the lowest grade
    public int getLowestGrade() {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (min > grades[i]) {
                min = grades[i];
            }
        }
        return min;
    }


    public int getNumberPassing() {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 70) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        return "Name = " + firstName + " " + lastName;
    }

}

