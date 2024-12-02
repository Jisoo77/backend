package a1202.Exception1;

public class Exception3 {
    public static void main(String[] args) {
        // 숫자 형식 오류
        String str = "abc";
        try {
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 올바르지 않습니다." + e.getMessage());
        }
    }
}
