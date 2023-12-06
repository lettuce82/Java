package cond.ex;

public class CondEx2 {
    public static void main(String[] args) {
        int distance = 105;
        String tspt;

        if (distance <= 1) {
            tspt = "도보";
        } else if (distance <= 10) {
            tspt = "자전거";
        } else if (distance <= 100) {
            tspt = "자동차";
        } else {
            tspt = "비행기";
        }
        System.out.println(tspt + "를 이용하세요.");
    }
}

