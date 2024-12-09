package a1209.arrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "S001"));
        students.add(new Student("Bob", 22, "S002"));
        students.add(new Student("Charlie", 19, "S003"));

        Student s1 = new Student();
        s1.setName("Tom");
        s1.setAge(22);
        s1.setStudentId("s004");
        students.add(s1);
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run) {
            System.out.println("\n============== 학생 관리 프로그램 ==============");
            System.out.println("1.학생 추가하기");
            System.out.println("2.학생들 리스트 보기");
            System.out.println("3.학생 수정");
            System.out.println("4.학생 삭제");
            System.out.println("5.Exit");
            System.out.print(">> ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    // 학생을 입력받아 넣고 리스트에 추가
                    System.out.print("추가할 학생 이름을 작성하세요 : ");
                    String n = sc.nextLine();
                    System.out.print("추가할 학생의 나이를 입력하세요 : ");
                    int a = sc.nextInt(); // 숫자 입력시에 20\n(개행문자) 따라들어감. 
                    sc.nextLine(); // next()나 nextInt() 같은 메서드가 입력버퍼에 남긴 \n을 제거하는데 쓰임
                    System.out.print("추가할 학생의 학번을 입력하세요 : ");
                    String id = sc.nextLine();
                    students.add(new Student(n, a, id));
                    System.out.println("\n학생 추가를 성공하였습니다.");
                    // Student s2 = new Student();
                    // System.out.print("추가할 학생 이름을 작성하세요 : ");
                    // s2.setName(sc.nextLine());
                    // System.out.print("추가할 학생의 나이를 입력하세요 : ");
                    // s2.setAge(sc.nextInt());
                    // System.out.print("추가할 학생의 학번을 입력하세요 : ");
                    // s2.setStudentId(sc.nextLine());
                    // students.add(s2);
                    // System.out.println("학생 추가를 성공하였습니다.");
                    break;
                case 2:
                    // 학생 리스트 보여주기
                    if(students.isEmpty()){ // 학생리스트가 없으면
                        System.out.println("보여줄 학생 리스트가 없습니다.");
                    }else{
                        for(Student student : students){
                            System.out.println(student);
                        }
                    }
                    break; // 현재의 반복문만 빠져나감
                case 3:
                    System.out.print("업데이트할 학생 id를 입력하세요 : ");
                    String updateId = sc.nextLine();
                    boolean found = false;
                    for(Student student : students){
                        if(student.getStudentId().equalsIgnoreCase(updateId)){
                            System.out.print("새로운 이름 : ");
                            student.setName(sc.nextLine());
                            System.out.print("새로운 나이 : ");
                            student.setAge(sc.nextInt());
                            sc.nextLine(); // Consume newline
                            System.out.println("학생 수정 성공");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                    break;
                case 4:
                    System.out.print("삭제할 학생 id를 입력하세요 : ");
                    String deleteId = sc.nextLine();
                    found = false;
                    for(Student student : students){
                        if(student.getStudentId().equalsIgnoreCase(deleteId)){
                            students.remove(student);
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                    break;
                case 5:
                    // exit
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    // System.exit(0);
                    // return; // 현재메서드(main메서드) 전체를 종료, 호출된 곳으로 제어를 반환
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력되었습니다. 다시 입력해주세요.");
            }
        }
    }
}
