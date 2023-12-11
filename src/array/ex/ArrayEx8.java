package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int count = scanner.nextInt();

        int[][] students = new int[count][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int row = 0; row < count; row++) {
            System.out.println(row + 1 + "번 학생의 성적을 입력하세요: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(subjects[i] + "점수: ");
                students[row][i] = scanner.nextInt();
            }
        }

        for (int row = 0; row < count; row++) {
            int sum = 0;
            for (int column = 0; column < count; column++) {
                sum += students[row][column];
            }
            double average = 0;
            average = (double) sum / subjects.length;
            System.out.println(row + 1 + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
