package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해 주세요: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}
