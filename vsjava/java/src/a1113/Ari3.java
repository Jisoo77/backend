package a1113;


public class Ari3 {
    public static void main(String[] args) {
        int apple = 1;
        double totalPieces = apple*10;
        int number = 7;
        double result = totalPieces-number;
        System.out.println("10조각에서 남은 양 : "+result);
        System.out.println("사과 1개에서 남은 양 : "+result/10.0);

        // // BigDecimal 사용
        // import java.math.BigDecimal;

        // public class BigDecimalExample {
        //     public static void main(String[] args) {
        //         BigDecimal a = new BigDecimal("0.1");
        //         BigDecimal b = new BigDecimal("0.2");
        //         BigDecimal sum = a.add(b);

        //         System.out.println("0.1 + 0.2 using BigDecimal = " + sum);
        //     }
        // }
    }
}
