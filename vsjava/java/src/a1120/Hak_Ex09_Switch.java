package a1120;

import java.util.Scanner;

public class Hak_Ex09_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // boolean run = true;

        int studentNum = 0;
        int[] scores = null;
        
        System.out.println("------------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("------------------------------------------------------");
        
        System.out.print("선택> ");
        int selectNo = Integer.parseInt(scan.nextLine());
        switch (selectNo) {
            case 1:
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scan.nextLine());
                scores = new int[studentNum];
            case 2:
                System.out.println("------------------------------------------------------");
                System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
                System.out.println("------------------------------------------------------");
                
                System.out.print("선택> ");
                for(int i=0; i<scores.length; i++){
                    System.out.print("scores["+i+"]> ");
                    scores[i]=Integer.parseInt(scan.nextLine());
                }
            case 3:
                System.out.println("------------------------------------------------------");
                System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
                System.out.println("------------------------------------------------------");
                
                System.out.print("선택> ");
                for(int i=0; i<scores.length; i++){
                    System.out.println("scores["+i+"]: " + scores[i]);
                }
            case 4:
                System.out.println("------------------------------------------------------");
                System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
                System.out.println("------------------------------------------------------");
                
                System.out.print("선택> ");
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i=0; i<scores.length; i++){
                    max = (max<scores[i]) ? scores[i] : max;
                    sum = sum + scores[i];
                }
                avg = (double) sum / studentNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            case 5:
                System.out.println("------------------------------------------------------");
                System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
                System.out.println("------------------------------------------------------");
                
                System.out.print("선택> ");
                System.out.println("프로그램 종료");
                break;
            default: System.out.println("유효하지 않은 선택입니다. 다시 시도해주세요.");
                break;
        }
        // System.out.println("프로그램 종료");
        

        scan.close();
    }
}
