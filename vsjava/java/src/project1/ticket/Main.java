package project1.ticket;

public class Main {
    public static void main(String[] args) {
        System.out.println("예매 진행을 시작합니다.");
        Menu menu = MainMenu.getInstance();
        while (menu != null) {
            menu.print();
            menu = menu.next();
        }
        System.out.println("예매를 마칩니다.");
    }
}
