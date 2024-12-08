package project1.ticket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManager tm = new TicketManager();
        System.out.println("뮤지컬 <프리다> 예매 진행을 시작합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        while (true) {
            System.out.println("\n============== MENU ==============");
            System.out.println("1.캐스팅 시간표 보기");
            System.out.println("2.공연 예매하기");
            System.out.println("3.예매내역 확인하기");
            System.out.println("4.예매 취소하기");
            System.out.print(">> ");
            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
                sc.next();
                continue;
            }
            switch (choice) {
                case 1:
                    tm.musicalTime(); // 캐스팅 시간표 보기
                    break;
                case 2:
                    tm.musicalReservation(); // 예매하기
                    break;
                case 3;
                    tm.musicalCheck();
                    break;
                case 4;
                    tm.musicalCancle();
                    break;
                default:
                    break;
            }
        }
        
        // System.out.println("예매를 마칩니다.");
    }
}
