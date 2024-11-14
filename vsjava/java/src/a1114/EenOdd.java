package a1114;

public class EenOdd {
    public static void main(String[] args) {
        int number = 7;
        // 조건식 ? 조건이 참일때 값 : 조건이 거짓일때 값
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);
    }
}
