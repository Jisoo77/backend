package a1129.book;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        boolean flag = true;
        while (flag) {
            System.out.println("\n도서검색 시스템에 오신 것을 환영합니다.");
            System.out.println("1.대출 가능한 도서 보기");
            System.out.println("2.도서 대출하기");
            System.out.println("3.대출한 도서 보기");
            System.out.println("4.도서 추가하기");
            System.out.println("5.도서 삭제하기");
            System.out.println("6.도서 정보 수정하기");
            System.out.println("7.도서 내용 보기");
            System.out.println("8.종료");
            System.out.print("원하는 작업을 선택하세요 >> ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("대출 가능한 도서");
                    manager.allLibrary();
                    break;
                case 2:
                    System.out.println("도서 대출하기");
                    System.out.println("대출하려는 도서의 이름을 입력하세요 : ");
                    String libraryName = sc.nextLine();
                    if (manager.booklocation(libraryName)) {
                        System.out.println("도서가 성공적으로 대출되었습니다.");
                    }else{
                        System.out.println("도서가 대출 가능하지 않거나 존재하지 않습니다.");
                    }
                    break;
                default:
                    break;
            }


        }
    }
}
