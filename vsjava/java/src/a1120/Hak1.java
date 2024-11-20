package a1120;

public class Hak1 {
    public static void main(String[] args) {
        int[][] array = {
            {95,86},
            {83,92,96},
            {78,83,93,87,88}
        };

        int sum = 0;
        double avg = 0;
        int t = 0;
        for(int i=0; i<array.length; i++){
            for(int k=0; k<array[i].length;k++){
                // System.out.println("array["+i+"]["+k+"]"+array[i][k]);
                sum += array[i][k];
                t++;
            }
        }
        avg = (double)sum / t;
        System.out.println("전체 합 : " + sum);
        System.out.println("전체 평균 : " + avg);
    }
}
