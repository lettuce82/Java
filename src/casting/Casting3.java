package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        //long maxIntOver = 2147483648; -> int 최고값 넘어가기 때문에 대입 X
        long maxIntOver = 2147483648L;
        int intValue = 0;
        
        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);
        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting = " + intValue); //int의 최소값으로 나옴
    }
}
