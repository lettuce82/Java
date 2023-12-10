package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int row = 0; row < students.length; row++) {
            System.out.println(row + 1 + "번 학생의 성적을 입력하세요: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(subjects[i] + "점수: ");
                students[row][i] = scanner.nextInt();
            }
        }

        for (int row = 0; row < students.length; row++) {
            int sum = 0;
            for (int column = 0; column < students[row].length; column++) {
                sum += students[row][column];
            }
            double average = 0;
            average = (double) sum / subjects.length;
            System.out.println(row + 1 + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
