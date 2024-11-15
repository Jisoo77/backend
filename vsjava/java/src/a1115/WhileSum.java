package a1115;

public class WhileSum {
    public static void main(String[] args) {
        // 1~100까지의 합계 구하기
        // 합계 : 5050
        int a = 1;
        int sum = 0;
        while(a<=100){
            // sum = sum + a;
            // a++;
            sum = sum + a++;
        }
        System.out.print("합계 : " + sum);
    }
}
