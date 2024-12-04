package a1204.Hak3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // 학생수를 입력
        System.out.print("학생 수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine(); //개행문자소비

        // 학생 배열 생성
        // Student[] students = new Student[n];

        // 학생 정보 입력
        for(int i=0; i<n; i++){
            System.out.print("학생 이름 : ");
            String name = sc.nextLine();
            System.out.print("학생 나이 : ");
            int age = sc.nextInt();
            System.out.print("학생 학번 : ");
            int studentId = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, age, studentId));
        }
        // 삽입정렬
        // Collections.sort(students);

        // 정렬된 결과 출력
        // System.out.println("정렬된 학생 목록 : ");
        // for(Student student : students){
        //     System.out.println(student);
        // }

        Collections.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());
        students.forEach(s -> System.out.println(s));
        System.out.println();
        Collections.sort(students, (s1, s2) -> s1.getName() .compareTo(s2.getName()));
        students.forEach(s -> System.out.println(s));


        sc.close();
    }
}

class Student implements Comparable<Student>{
    // Student 클래스가 Comparable<Student> 인터페이스 구현
    private String name;
    private int age;
    private int studentId;
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }

    // compareTo 메서드를 오버라이드하여 정렬기준을 정의함
    // @Override
    // public int compareTo(Student o) {
    //     return this.name.compareTo(o.name);
    // }

    // 나이순
    @Override
    public int compareTo(Student o) {
        // 나이를 기준으로 정렬하려면 int 사용 못함
        // 숫자는 참조변수로 변환해야함
        return Integer.compare(this.age, o.age);
    }
}