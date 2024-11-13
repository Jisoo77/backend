package a1113;

public class ForQ1 {
    public static void main(String[] args) {
        int sum = 0;
        
        for(int i = 1; i<=100; i++){
            // System.out.println(i);
            sum += i; // sum = sum+i;
        }
        System.out.printf("1부터 100까지의 합은 %d 입니다.", sum);
    }
}
