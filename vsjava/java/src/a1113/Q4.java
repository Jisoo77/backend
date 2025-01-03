package a1113;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = scan.nextInt();
        System.out.print("세번째 정수를 입력하세요 : ");
        int num3 = scan.nextInt();

        int sum = num1 + num2 + num3;
        double avg = (double)sum / 3;
        
        System.out.println("합계 : "+sum);
        System.out.printf("평균 : %.1f",(float)sum/3);
        System.out.printf("평균 : %.1f",avg);
        
        scan.close();
    }
}
// 정수 세 개를 입력받아 합과 평균을 출력하는 프로그램을 작성해보자.
// (단, -2147483648 ~ 2147483647)

// 입력
// 정수 세 개가 입력된다.
// (단, -2147483648 ~ 2147483647)

// 출력
// 입력 받은 정수 세 개의 합과 평균을 줄을 바꿔 출력한다.
// 평균은 소수점 이하 둘째 자리에서 반올림하여 첫째 자리까지 출력한다.

// 입력 예시 
// 1
// 2
// 3

// 출력 예시
// 6
// 2.0