package cond.ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 70;
        String grade;

        if (score < 60) {
            grade = "F";
        } else if (score < 70) {
            grade = "D";
        } else if (score < 80) {
            grade = "C";
        } else if (score < 90) {
            grade = "B";
        } else {
            grade = "A";
        }
        System.out.println("학점은 " + grade + "입니다.");
    }
}

