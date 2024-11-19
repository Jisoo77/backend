package a1119;

import java.util.Scanner;

public class Bill1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int money = scan.nextInt();

        int m50000 = money / 50000;
        int m10000 = (money % 50000) / 10000;
        int m5000 = (money % 50000 % 10000) / 5000;
        int m1000 = (money % 50000 % 10000 % 5000) / 1000;
        int m500 = (money % 50000 % 10000 % 5000 % 1000) / 500;
        int m100 = (money % 50000 % 10000 % 5000 % 1000 % 500) / 100;
        int m50 = (money % 50000 % 10000 % 5000 % 1000 % 500 % 100) / 50;
        int m10 = (money % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50) / 10;
        int m5 = (money % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10) / 5;
        int m1 = money % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 % 5;

        System.out.println("오만원권 "+m50000+"매");
        System.out.println("만원권 "+m10000+"매");
        System.out.println("오천원권 "+m5000+"매");
        System.out.println("천원권 "+m1000+"매");
        System.out.println("오백원 "+m500+"개");
        System.out.println("백원 "+m100+"개");
        System.out.println("오십원 "+m50+"개");
        System.out.println("십원 "+m10+"개");
        System.out.println("오원 "+m5+"개");
        System.out.println("일원 "+m1+"개");
       
        scan.close();
    }
}
