package a1202.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {
    private ArrayList<BookDTO> blist;
    Scanner sc = new Scanner(System.in);
    public BookDAO(){
        blist = new ArrayList<BookDTO>();
        BookDTO b1 = new BookDTO(0, "Java Programming", "Author A", 2020);
        BookDTO b2 = new BookDTO(1, "Python Basics", "Author B", 2019);
        BookDTO b3 = new BookDTO(0, "Data Structures", "Author C", 2018);
        blist.add(b1);
        blist.add(b2);
        blist.add(b3);
    }

    private void addBook(BookDTO b) {
        blist.add(b);
    }
    
    private void delete(int index) {
        blist.remove(index);
    }

    private BookDTO searchBook(int index) {
        return blist.get(index);
    }

    private void updateBook(int index, BookDTO b) {
        blist.set(index, b);
    }

    public void addBook() {
        BookDTO b = new BookDTO();
        b.setId(blist.size());
        System.out.println("<도서 추가하기>");
        System.out.print("제목 : ");
        b.setTitle(sc.next());
        System.out.print("저자 : ");
        b.setAuthor(sc.next());
        System.out.print("출판연도 : ");
        b.setYear(sc.nextInt());

        addBook(b);
        System.out.println("도서가 추가되었습니다.");
    }

    public void deleteBook() {
        System.out.println("<도서 정보 삭제>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 도서가 없습니다.");
        }else{
            String name = blist.get(index).getTitle();
            delete(index);
            System.out.println(name + "도서 정보를 삭제했습니다.");
        }
    }
    
    private int searchIndex() {
        int index = -1;
        System.out.println("도서 제목을 입력하세요.");
        System.out.print(">> ");
        String name = sc.next();
        for(int i=0; i<blist.size(); i++){
            if(blist.get(i).getTitle().equals(name)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void searchBook() {
        System.out.println("<도서 정보 보기>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 도서가 없습니다.");
        }else{
            System.out.println("제목 \t\t\t\t 저자 \t\t\t\t 출판연도\n" + "----------------------------------");
            BookDTO b = searchBook(index);
            System.out.println(b);
        }
    }

    public void updateBook() {
        System.out.println("<도서 정보 수정>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 도서가 없습니다.");
        }else{
            BookDTO b = new BookDTO();
            b.setId(blist.get(index).getId());
            b.setTitle(blist.get(index).getTitle());
            b.setAuthor(blist.get(index).getAuthor());
            b.setYear(blist.get(index).getYear());
            System.out.println("<" + blist.get(index).getTitle() + "도서의 정보 수정");
            System.out.println("도서 제목 : ");
            b.setTitle(sc.next());
            System.out.println("도서 저자 : ");
            b.setAuthor(sc.next());
            System.out.println("출판 연도 : ");
            b.setYear(sc.nextInt());
            updateBook(index,b);
        }
    }

    public void PrintAll() {
        System.out.println("제목\t 저자\t 출판연도\n" + "----------------------------------");
        for(int i=0; i<blist.size();i++){
            System.out.println(blist.get(i).toString());
        }
    }
}
