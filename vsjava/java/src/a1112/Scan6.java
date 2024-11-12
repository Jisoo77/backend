package a1112;

import java.util.Scanner;

public class Scan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("a 값 입력: ");
		String a = scanner.nextLine();
				
		System.out.print("b 값 입력: ");
		String b = scanner.next();

        System.out.println(a);
        System.out.println(b);
 
    }   
}