package a1114;

import java.util.Scanner;

public class Study1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int mon = scan.nextInt();

        switch(mon){
            case 3:
            case 4:
            case 5:
                System.out.println("봄 이네요");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름 이네요");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을 이네요");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울 이네요");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }

        switch(mon){
            case 3,4,5 -> System.out.println("봄 이네요");
            case 6,7,8 -> System.out.println("여름 이네요");
            case 9,10,11 -> System.out.println("가을 이네요");
            case 12,1,2 -> System.out.println("겨울 이네요");

            default -> System.out.println("잘못 입력하셨습니다.");
        }
        scan.close();
    }
}
