package a1113;

import java.util.Scanner;

public class ForQ3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 단을 입력하세요 : ");

        int num = scan.nextInt();
                
        for(int i = 1; i<=9; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
        scan.close();
    }
}
