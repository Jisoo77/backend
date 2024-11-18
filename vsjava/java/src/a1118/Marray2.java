package a1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int [3][3];
        for(int i=0; i<scores.length; i++){
            System.out.printf("학생%d의 국어, 영어, 수학 점수를 입력하세요 : ",i+1);
            for(int j=0; j<scores[i].length; j++){
                scores[i][j] = sc.nextInt();
            }
        }

        // 각 학생의 총점과 평균 계산
        int sum = 0;
        double avg = 0;
        for(int i=0; i<scores.length; i++){
            sum=0;
            for(int j=0; j<scores[i].length; j++){
                sum = sum+scores[i][j];
            }
            avg = (double)sum/scores[i].length;
            System.out.printf("학생%d의 총점, %d, 평균 : %.2f\n",i+1,sum,avg);
        }

        // 숙제 전체 총점과 전체 평균구하기
        int totalMathSum = 0;
        int t = 0;
        for(int i=0; i<scores.length; i++){
            for(int j=0; j<scores[i].length; j++){
                totalMathSum += scores[i][j];
                t++;
            }
        }
        System.out.println("전체 학생의 점수 총점 : "+totalMathSum);
        double totalMathAvg = (double)totalMathSum/t;
        System.out.println("전체 학생의 점수 평균 : "+totalMathAvg);


        sc.close();
    }
}
