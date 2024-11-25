package a1125.object;

public class MemberTest {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
    }
}

class Member{
    private String name;
    private String id;
    private String pasword;
    private int age;
    
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPasword() {
        return pasword;
    }
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}