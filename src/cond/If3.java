package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        //1. 참이 되게 하는 조건을 검사했는데도 남은 조건문으로 불필요하게 검사하게됨.
        //2. 조건식의 중복 구간을 조건식마다 중복적으로 검사하게 됨

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (8 <= age && age <= 13) {
            System.out.println("초등학생");
        }
        if (14 <= age && age <= 16) {
            System.out.println("중학생");
        }
        if (17 <= age && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}
