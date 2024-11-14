package a1114;

import java.util.Scanner;

public class Study2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = scan.nextInt();

        String result = year % 400 == 0 ? "윤년이 아닙니다." : year % 100 == 0 ? "윤년입니다." : year % 4 == 0 ? "윤년입니다." : "윤년이 아닙니다.";
        System.out.println(result);
        scan.close();
    }
}
