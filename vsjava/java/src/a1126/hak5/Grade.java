package a1126.hak5;

public class Grade extends Student {
    private int score;

    public int getScore() {
        return score;
    }

    public Grade(String name, String studentId, int score) {
        super(name, studentId); // 부모 클래스의 생성자 호출
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + ", 성적 : " + score + ", 성적평가 : " + evaluateGrade();
    }

    private String evaluateGrade() {
        if(score>=90){
            return "A";
        }else if(score>=80){
            return "B";
        }else if(score>=70){
            return "C";
        }else if(score>=600){
            return "D";
        }else{
            return "F";
        }
    }
    
}
