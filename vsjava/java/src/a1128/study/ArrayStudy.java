package a1128.study;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Charlie");
        list.add("Bob");

        while (true) {
            
            if(name.equalsIgnoreCase("Alice")){
                System.out.println("'Alice'가 목록에 존재합니다."); break; 
            }
            if(name.equalsIgnoreCase("Charlie")){
                System.out.println("'Charlie'가 목록에 존재합니다."); break; 
            }
            if(name.equalsIgnoreCase("Bob")){
                System.out.println("'Bob'이 목록에 존재합니다."); break; 
            }
            if (name.equalsIgnoreCase("exit")){
                break; 
            }else{
                System.out.println("목록에 없습니다.");
                break; 
            }
            
        }

        sc.close();
    }
}

// class Student{
//     String name;
// }