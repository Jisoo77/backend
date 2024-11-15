package a1114;

import java.util.Scanner;

public class Qifelse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int mon = scan.nextInt();

        if (mon>=3 && mon<=5) {
            System.out.println("봄입니다.");
        }else if(mon>=6 && mon<=8){
            System.out.println("여름입니다.");
        }else if(mon>=9 && mon<=11){
            System.out.println("가을입니다.");
        }else if(mon==12 || mon==1 || mon==2){
            System.out.println("겨울입니다.");
        }else{
            System.out.println("잘못 입력하였습니다.");
        }

        scan.close();
    }
}
