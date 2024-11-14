package a1114;

import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째숫자를 입력하세요.");
        int num1 = scan.nextInt();
        System.out.print("두번째숫자를 입력하세요.");
        int num2 = scan.nextInt();
        System.out.print("세번째숫자를 입력하세요.");
        int num3 = scan.nextInt();

        int max = num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        System.out.println("가장 큰 숫자는 " + max + "입니다.");

        // if(num1>num2 && num1>num3){
        //     System.out.println("가장 큰 숫자는 "+num1+"입니다.");
        // }else if(num2>num1 && num2>num3){
        //     System.out.println("가장 큰 숫자는 "+num2+"입니다.");
        // }else if(num3>num1 && num3>num2){
        //     System.out.println("가장 큰 숫자는 "+num3+"입니다.");
        // }else{
        //     System.out.println("같은 숫자를 입력하셨습니다.");
        // }

    }
}
// 세 개의 정수를 입력받아, 그 중에서 가장 큰 숫자를 출력하는 프로그램을 작성하세요.

// 출력 예시: "가장 큰 숫자는 X입니다."