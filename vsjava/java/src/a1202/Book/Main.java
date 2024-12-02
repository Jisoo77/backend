package a1202.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookDAO test = new BookDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 정보 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 정보 수정");
            System.out.println("5. 도서 목록 조회");
            System.out.println("0. 종료");
            System.out.print(">> ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                choice = -1;
            }

            if(choice == 1){
                test.addBook();
            }else if(choice == 2){
                test.deleteBook();
            }else if(choice == 3){
                test.searchBook();
            }else if(choice == 4){
                test.updateBook();
            }else if(choice == 5){
                test.PrintAll();
            }else if(choice == 0){
                System.out.println("종료합니다.");
                sc.close();
                System.exit(0);
            }
        }
    }
}
