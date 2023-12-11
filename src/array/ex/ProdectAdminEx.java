package array.ex;

import java.util.Scanner;

public class ProdectAdminEx {
    public static void main(String[] args) {
        int maxProdeucts = 10;
        String[] productNames = new String[maxProdeucts]; //상품 이름을 저장할 String 배열
        int[] productPrices = new int[maxProdeucts]; //상품 가격을 저장할 int 배열
        int productCount = 0; //현재 등록된 상품의 개수를 저장할 int 변수

        Scanner scanner = new Scanner(System.in); //사용자 입력을 받기 위한 Scanner 객체
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount >= maxProdeucts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
        }
    }
}
