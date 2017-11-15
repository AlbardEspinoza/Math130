import java.util.Arrays;

public class Math130Grade {


    public static void main(String[] args) {
        final int[] exams = {86, 87};
        final int[] hw = {30, 30, 30, 40};
        final int[] quizzes = {17, 18, 28, 21, 21, 23, 14, 15, 23, 20, 10};

        // Replace the zeros with your scores
        int[] examScores = {76, 74}; //
        int[] hwScores = {28, 30, 30, 37};
        int[] quizScores = {13, 17, 26, 18, 14, 19, 13, 15, 16, 25, 10};


        // Compute Exam Points

        double examPoints = 0.0;
        for (int i = 0; i < exams.length; i++) {
            examPoints += 1.0 * examScores[i] / exams[i];
        }
        examPoints = examPoints / exams.length * 450;  // average of exam percentages
        System.out.println("Exam points (450 possible): " + examPoints);

        double hwPoints = 0.0;
        for (int i = 0; i < hw.length; i++) {
            hwPoints += 1.0 * hwScores[i] / hw[i];
        }
        hwPoints = hwPoints / hw.length * 100;  // average of HW percentages
        System.out.println("HW Points (100 possible): " + hwPoints);


        double[] quizPercentages = new double[quizScores.length];
        for (int i = 0; i < quizzes.length; i++) {
            quizPercentages[i] = 1.0 * quizScores[i] / quizzes[i];
        }
        Arrays.sort(quizPercentages);  // sort the quizzes

        double quizPoints = 0.0;
        for (int i = 4; i < quizzes.length; i++) {
            quizPoints += quizPercentages[i];
        }
        quizPoints = quizPoints / (quizzes.length - 4) * 150;  // average of quiz percentages
        System.out.println("Quiz Points (150 possible): " + quizPoints);

        double percentage = (examPoints + hwPoints + quizPoints) / 700;
        System.out.println("Percentage of points :" + percentage * 100);
    }

}

