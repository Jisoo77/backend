package a1120.class1;

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.company = "현대";
        car1.model = "제네시스";
        car1.color= "검정";
        car1.maxSpeed = 250;
        car1.speed = 70;

        System.out.println("car1을 소개합니다.");
        System.out.println("제작 회사 : " + car1.company);
        System.out.println("모델명 : " + car1.model);
        System.out.println("색상 : " + car1.color);
        System.out.println("최고속도 : " + car1.maxSpeed);
        System.out.println("현재속도 : " + car1.speed);

        car1.speed = 60;
        System.out.println("수정된 속도 : " + car1.speed);
        System.out.println();

        Car myCar2 = new Car("기아","투싼","쥐색",220,65);
        System.out.println("myCar2를 소개합니다.");
        System.out.println("제작 회사 : " + myCar2.company);
        System.out.println("모델명 : " + myCar2.model);
        System.out.println("색상 : " + myCar2.color);
        System.out.println("최고속도 : " + myCar2.maxSpeed);
        System.out.println("현재속도 : " + myCar2.speed);
        
    }
}
