package a1115;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 개수를 입력하시오 : ");

        // 1,2번
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 3. n번 반복하여 n개의 정수를 입력받는다.
        for (int i = 0; i < n; i++) {
            System.out.print(i+1+"번째 숫자를 입력하시오 : ");
            // 4. 입력받은 n개의 정수를 배열 arr에 저장한다.
            arr[i] = sc.nextInt();
        }

        // 5. 배열 arr을 반복하여 max와 i번째 요소를 비교한다.
        int max = Integer.MIN_VALUE; // int타입의 최소값 : -21억XXX
        // int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i]+" ");
            if(max < arr[i]){
                // 6. 두 요소 중 더 큰 요소를 변수max에 대입한다.
                max = arr[i];
            }
        }
        // 7. 반복이 끝나고 변수 max를 출력한다.
        System.out.println("최대값 : "+max);
        sc.close();
    }
}
// 첫째 줄에 입력할 개수 N을 입력받고,
// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
// N개의 정수 중, 최댓값을 구하여 출력하시오.
// (입력예시)
// 5
// 90 60 70 100 55
// (출력예시)
// 최댓값 : 100

// (순서도)
// 1. 정수 하나를 입력받는다.
// 2. 입력받은 정수를 n에 대입한다.
// 3. n번 반복하여 n개의 정수를 입력받는다.
// 4. 입력받은 n개의 정수를 배열 arr에 저장한다.
// 5. 배열 arr을 반복하여 max와 i번째 요소를 비교한다.
// 6. 두 요소 중 더 큰 요소를 변수max에 대입한다.
// 7. 반복이 끝나고 변수 max를 출력한다.