package a1115;

public class GuguAll {
    public static void main(String[] args) {
        for(int i = 1; i<=9; i++){
            for(int k = 2; k<=9; k++){
                int result = k*i;
                System.out.print(k + " X " + i + " = " + result);
                System.out.print("\t"); // 탭공백
            }
            System.out.println();
        }
    }
}
