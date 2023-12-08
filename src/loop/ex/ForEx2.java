package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        // 여러개 변수를 초기화 및 증감 가능 하지만 int num 은 for 외부에 따로 선언하는 게 나음
        // ㄴ 증감식이 되는 카운터 변수를 초기화 하는 자리이기 때문
        for (int num = 2, count = 1; count <= 10; count++) {
            System.out.println(num * count);
        }
    }
}
