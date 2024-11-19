package a1119;

import java.util.Scanner;

public class Array03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int n = sc.nextInt();
        System.out.println(n+"개의 배열 요소를 입력하세요");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // 합계와 평균
        int sum=0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double)sum/n;
        
        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.2f\n", avg);

        sc.close();
    }
}
