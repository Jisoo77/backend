package a1115;

public class OddEvent {
    public static void main(String[] args) {
        // 1~20까지의 정수중 홀수의 합계, 짝수의 합계 각각 구하여 출력
        int i = 1;
        int sum1 = 0; // 짝수 합계
        int sum2 = 0; // 홀수 합계
        while (i<=20) {
            if(i%2==0){ // 짝수
                sum1 += i;
            }
            if(i%2==1){ // 홀수
                sum2 += i;
            }
            i++;
        }
        System.out.println("홀수의 합계 : "+sum2);
        System.out.println("짝수의 합계 : "+sum1);
    }
}
