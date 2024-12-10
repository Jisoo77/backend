package project1.ticket;

public class User {    
    private String name; // 예매자 이름
    private String phone; // 예매자 전화번호
    private String pass; //예매 비밀번호
    
    public User(String name, String phone, String pass) {
        this.name = name;
        this.phone = phone;
        this.pass = pass;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    @Override
    public String toString() {
        return "예매자 이름 : " + name + ", 전화번호 : " + phone + ", 비밀번호 : " + pass;
    }
}
