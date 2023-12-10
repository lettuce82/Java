package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        System.out.println(count + "개의 정수를 입력하세요: ");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minNumber, maxNumber;
        minNumber = maxNumber = numbers[0];
        for (int i = 0; i < count; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 숫자: " + minNumber);
        System.out.println("가장 큰 숫자: " + maxNumber);
    }
}
