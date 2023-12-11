package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
    }

    public static void checkAge(int age) {
        if (age < 10) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; //return 을 만나면 해당 메서드를 빠져 나감.
        }
        System.out.println(age + "살, 입자아세요.");
    }
}
