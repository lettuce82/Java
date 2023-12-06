package operator;

public class OpaeratorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a +1;
        System.out.println("a = " + a); //1

        a = a +1;
        System.out.println("a = " + a); //2
        
        // 증감 연산자
        ++a; // a = a + 1  와 동일
        System.out.println("a = " + a); //3

        ++a;
        System.out.println("a = " + a); //4

        --a; // a = a - 1  와 동일
        System.out.println("a = " + a); //3
    }
}
