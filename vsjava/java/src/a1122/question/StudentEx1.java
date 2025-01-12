package a1122.question;

public class StudentEx1 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20231234, 90, 85, 92);

        System.out.println(student1.toStr());

        student1.setLanguage(+5);
        System.out.println("수정된 국어 점수 : " + student1.getLanguage());

        System.out.println("평균 점수 : " + (student1.getLanguage()+student1.getEnglish()+student1.getMath()) / 3);
    }
}
// 문제 1: 학생 클래스 만들기
// 문제 설명:

// 학생의 이름, 학번, 세 과목의 점수를 저장하는 Student 클래스를 생성하세요.
// 각 변수에 대한 private 접근 제한자를 사용하여 정보를 보호하고, getter와 setter 메소드를 통해 값을 조회하고 변경하도록 하세요.
// 생성자를 이용하여 학생 정보를 초기화하고, 평균 점수를 계산하는 메소드를 추가하세요.

// 학생 객체 생성
// Student student1 = new Student("홍길동", 20231234, 90, 85, 92);
// 학생 정보 출력
// 학생 국어 점수 수정 95
// 평균 점수 출력해보세요