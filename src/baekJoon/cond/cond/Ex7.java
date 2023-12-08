package baekJoon.cond.cond;

import java.util.Scanner;

import static java.lang.Math.max;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int price = 0;
        int max = 0;

        if (num1 < 7 && num2 < 7 & num3 < 7) {
            if (num1 == num2 && num2 == num3) {
                price = 10000 + num1 * 1000;
            } else if (num1 != num2 && num2 != num3 && num3 != num1) {
                max = max(num1, num2);
                max = max(max, num3);
                price = max * 100;
            } else if (num1 == num2 && num1 != num3) {
                price = 1000 + num1 * 100;
            } else if (num2 == num3 && num2 != num1) {
                price = 1000 + num2 * 100;
            } else if (num1 == num3 && num3 != num2) {
                price = 1000 + num3 * 100;
            }System.out.println(price);
        }
    }
}
