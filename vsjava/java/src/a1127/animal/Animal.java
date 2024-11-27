package a1127.animal;

abstract class Animal {
    
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 추상메서드
    // abstract void info();
    abstract void sound();
    abstract void move();
    
    // 공통정보 출력
    public void info(){
        System.out.println(this.getClass().getSimpleName() + " : " + name + ", 나이 : " + age);
    }
    // this.getClass().getSimpleName() : 현재 객체의 클래스정보의 클래스명 반환

}

class Dog extends Animal{    
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("소리 : 멍멍");
    }

    @Override
    void move() {
        System.out.println("이동방식 : 네 발로 걷는다.");
    }
}

class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("소리 : 짹짹");
    }

    @Override
    void move() {
        System.out.println("이동방식 : 날개로 날아간다.");
    }
}

class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("소리 : ...");
    }

    @Override
    void move() {
        System.out.println("이동방식 : 지느러미를 이용해 헤엄친다.");
    }
}