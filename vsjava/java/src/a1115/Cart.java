package a1115;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        // String cart;

        while (run) {
            System.out.println("=======================================================");
            System.out.println("1. 아이템 추가 | 2. 아이템 삭제 | 3. 카트 확인 | 4. 종료");
            System.out.println("=======================================================");
            System.out.print("선택> ");

            int item = Integer.parseInt(sc.nextLine());
            String cho = "";

            switch (item) {
                case 1:
                    System.out.print("추가할 아이템> ");
                    cho = sc.nextLine();
                    System.out.print(cho+"이(가) 카트에 추가되었습니다.");
                    // cart += sc.nextLine();
                    break;
                case 2:
                    System.out.print("삭제할 아이템> ");
                    cho = sc.nextLine();
                    System.out.print(cho+"이(가) 카트에서 삭제되었습니다.");
                    // cart -= sc.nextLine();
                    break;
                case 3:
                    // System.out.print("현재 카트> [" + cart +"]");
                    break;
                case 4:
                    run = false;
                    System.out.print("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
        sc.close();
    }
}
