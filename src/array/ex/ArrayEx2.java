package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int row = 0; row < numbers.length; row++) {
            numbers[row] = scanner.nextInt();
        }

        for (int row = 0; row < numbers.length; row++) {
            System.out.print(numbers[row]);
            if (row < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
