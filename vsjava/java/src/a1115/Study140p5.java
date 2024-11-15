package a1115;

public class Study140p5 {
    public static void main(String[] args) {
        int sum;
        for(int x=0; x<=10; x++){
            for(int y=0; y<=10; y++){
                sum = (4*x)+(5*y);
                if(sum==60){
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}
