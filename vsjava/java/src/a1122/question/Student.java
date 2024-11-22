package a1122.question;

public class Student {
    private String name;
    private int studentId;
    private int language;
    private int english;
    private int math;
    
    public Student(String name, int studentId, int language, int english, int math) {
        this.name = name;
        this.studentId = studentId;
        this.language = language;
        this.english = english;
        this.math = math;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getLanguage() {
        return language;
    }
    public void setLanguage(int language) {
        if(language<0){
            this.language = 0;
        }else{
            this.language += language;
        }
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public String toStr() {
        return String.format("학생 이름 : %s, 학번 : %d, 국어 점수 : %d, 영어 점수 : %d, 수학 점수 : %d", name, studentId, language, english, math);
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