package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discout = 0;

        if (price >= 10000) {
            discout = discout + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discout = discout + 1000;
            System.out.println("어린이, 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discout + "원"); //참이 되는 조건문 하나만 적용
        
        if (false)
            System.out.println("if문에서 실행됨"); //코드 블럭 없어도 실행 명령문이 하나만 있으면 실행됨 -> 가독성, 유지보수성 측면에서 중괄호 쓰는 것이 좋음
            System.out.println("if문에서 실행 안 됨"); // 들여쓰기 되어 있어서 조건문에 의하여 실행되는 것처럼 보이지만 해당 문장은 조건문과 무관하게 실행됨
    }
}
