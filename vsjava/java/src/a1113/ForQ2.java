package a1113;

import java.util.Scanner;

public class ForQ2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int num = scan.nextInt();
        int sum = 0;
        
        for(int i = 1; i<=num; i++){
            sum += i; // sum = sum+i;
        }
        System.out.printf("1부터 %d까지의 합은 %d 입니다.", num, sum);

        scan.close();
    }
}
