package a1120.class1;

public class PersonEx {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동",25,"남자");
        System.out.println("이름 : "+person1.name);
        System.out.println("나이 : "+person1.age);
        System.out.println("성별 : "+person1.gender);
    }
}
