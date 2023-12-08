package baekJoon.cond.cond;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (B + C >= 60) {
            A = A + ((B + C) / 60); //초과된 분을 시로 바꿔 그 값이 반영된 시
            B = (B + C) % 60; //분 추가
            if (A >= 24) { //초과된 분을 시로 바꿔 그 값이 합해진 시
                A = A % 24; //시 추가
            }
        } else {
            B = B + C;
        }
        System.out.println(A + " " + B);
    }
}
