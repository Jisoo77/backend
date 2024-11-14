package a1114;

public class Q2 {
    public static void main(String[] args) {
        int age = 15;
        String ages = (age <= 12) ? "어린이" : (age >=13 || age <=19) ? "청소년" : "성인";
        System.out.println(ages);
    }
}
