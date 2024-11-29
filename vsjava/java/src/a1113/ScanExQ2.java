package a1113;

import java.util.Scanner;

public class ScanExQ2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = scan.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = scan.nextInt();

        System.out.printf("%d + %d = %d\n",num1, num2,(num1 + num2));
        System.out.printf("%d - %d = %d\n",num1, num2,(num1 - num2));
        System.out.printf("%d * %d = %d\n",num1, num2,(num1 * num2));
        System.out.printf("%d / %d = %d\n",num1, num2,(num1 / num2));
        System.out.printf("%d %% %d = %d\n",num1, num2,(num1 % num2));
        scan.close();
    }
}
