package a1129.book;

import java.util.ArrayList;

// 책 관리
public class LibraryManager {
    private ArrayList<Library> librarys; // 책들
    private ArrayList<Library> booklocation; // 도서 위치

    public LibraryManager(){
        librarys = new ArrayList<>();
        booklocation = new ArrayList<>();
        
        librarys.add(new Library("이것이 자바다", "신용권", "A구역", "979-11-6921-229-8"));
        librarys.add(new Library("처음만난 리액트", "이인제", "B구역", "979-11-6921-169-7"));
        librarys.add(new Library("웹표준의 정석", "고경희", "C구역", "979-11-6303-622-7"));
    }

    public void allLibrary() {
        System.out.println("대출 가능한 도서 보기");
        for(Library library : librarys){
            if (library.isAvailable()) {
                System.out.println(library);
            }
        }
    }

    public boolean booklocation(String name) {
        for(Library library : librarys){
            if (library.getTitle().equalsIgnoreCase(name) && library.isAvailable()) {
                library.book();
                booklocation.add(library);
                return true;
            }
        }
    }
}
