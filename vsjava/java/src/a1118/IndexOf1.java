package a1118;

public class IndexOf1 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        // 인덱스번호 3번에 '프로그래밍' 발견되므로 3을 반환
        System.out.println(location);
        String substring = subject.substring(location);
        // 인덱스번호 3번부터 끝까지 문자열 추출해서 substring 변수에 넣기
        System.out.println(substring);

        location = subject.indexOf("자바");
        if(location != -1){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련 없는 책이군요.");
        }
        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
