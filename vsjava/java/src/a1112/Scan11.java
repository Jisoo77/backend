package a1112;

import java.util.Scanner;

public class Scan11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("실수를 입력하세요 : ");
		float num = scan.nextFloat();
        System.out.printf("출력 실수 : %.2f",num);

        scan.close();
    }   
}

// 실수(float) 한 개를 입력받아 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력하시오.

// 입력
// 실수 한 개가 입력된다.

// 출력
// 입력한 실수를 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력한다.

// 입력 예시 
// 1.59254

// 출력 예시
// 1.59

// 도움말
// float num = scan.nextFloat(); 를 통해 실수값을 입력받을 수 있다.

// float으로 변수를 선언한 경우 %.2f로 출력하면,
// 소수점 3째 자리에서 반올림 하여 2째 자리까지 출력할 수 있다.
// printf(“%.2f”,f);