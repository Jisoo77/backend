package a1115;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        // 구구단
        // 원하는 다늘 입력받아 구구단 수식 출력하기
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 단을 입력하세요 : ");
        int dan = scan.nextInt();

        for(int i=1; i<=9; i++){
            // System.out.println(dan + " X " + i + " = " + dan*i);
            int result = dan*i;
            System.out.println(dan + " X " + i + " = " + result);
        }
        scan.close();
    }
}
