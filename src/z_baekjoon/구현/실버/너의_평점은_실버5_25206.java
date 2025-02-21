package z_baekjoon.구현.실버;

import java.util.Scanner;

public class 너의_평점은_실버5_25206 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 20;
        String[] strArray = new String[N];
        for (int i = 0; i < N; i++) {
            strArray[i] = scan.nextLine();
        }

        double weightedSum = 0.0;
        double totalCredits = 0.0;

        for (String x : strArray) {
            String[] array = x.split(" ");
            String grade = array[2];
            double credit = Double.parseDouble(array[1]);

            if (!grade.equals("P")) {
                double gradeValue = getGradeValue(grade);
                weightedSum += credit * gradeValue;
                totalCredits += credit;
            }
        }

        double answer = weightedSum / totalCredits;
        System.out.printf("%.6f\n", answer);
    }

    public static double getGradeValue(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0.0;
            default: return 0.0;
        }
    }
}
