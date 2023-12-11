package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); -> 컴파일 오류 발생 / double을 int에 대입함
        printNumber((int) number); //명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
