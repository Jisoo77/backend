package a1115;

public class Study140p4 {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            int noon1 = (int)(Math.random()*6)+1;
            int noon2 = (int)(Math.random()*6)+1;
            sum = noon1+noon2;
            System.out.println(noon1+","+noon2);
            if(sum==5){
                System.out.println("눈금의 합이 5이므로 프로그램을 종료합니다.");
                break;
            }
        }

    }
}
