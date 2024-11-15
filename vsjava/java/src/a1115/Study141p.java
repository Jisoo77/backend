package a1115;

import java.util.Scanner;

public class Study141p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int balance = 0;
        // String menuName = "";
        // int money = 0;

        while (run) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");

            int menuName = Integer.parseInt(sc.nextLine()); // 문자로 인식해도 숫자로 변환
            
            switch (menuName) {
                case 1:
                    System.out.print("예금액> ");
                    // money = Integer.parseInt(sc.nextLine());
                    // balance = balance+money;
                    balance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.print("잔고> ");
                    System.out.println(balance);
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
