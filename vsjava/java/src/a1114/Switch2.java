package a1114;

public class Switch2 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*4)+8;
        // System.out.println(num);

        switch (num) {
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의합니다.");
                break;
            case 10:
                System.out.println("업무를 봅니다.");
                break;
            default:
                System.out.println("외근을 합니다.");
        }
    }
}
