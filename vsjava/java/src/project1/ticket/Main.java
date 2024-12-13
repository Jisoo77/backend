package project1.ticket;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    protected static ArrayList<Ticket> tickets;
    protected static ArrayList<User> users;
    protected static ArrayList<Ticket> reservation;
    protected static final Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        // TicketManager tm = new TicketManager();
        System.out.println();
        System.out.println(
            "#       # ##### #       #  #        #           #       #       # ##### ####      #      ##\n" + 
            " #     #    #    #     #  # #       #          # #       #     #    #   #   #    # #     ##\n" + 
            "  #   #     #     #   #  #####      #         #####       #   #     #   #    #  #####    ##\n" +
            "   # #      #      # #  #     #     #        #     #       # #      #   #   #  #     #\n" +
            "    #     #####     #  #       #    ####### #       #       #     ##### ####  #       #  ##\n"
        );
        System.out.println("뮤지컬 <프리다> 예매 진행을 시작합니다.");
        System.out.println();
        TicketManager tm = new TicketManager();

        tickets = new ArrayList<>();
        tickets.add(new Ticket("1회차","12/10", "20:00", "김소향, 전수미, 정영아, 허혜진"));
        tickets.add(new Ticket("2회차","12/11", "16:00", "최정원, 리사, 임정희, 최서연"));
        tickets.add(new Ticket("3회차","12/11", "20:00", "알리, 스테파니, 이아름솔, 황우림"));
        
        boolean run = true;
        while (run) {
            System.out.println("\n============== MENU ==============");
            System.out.println("1.캐스팅 시간표 보기");
            System.out.println("2.공연 예매하기");
            System.out.println("3.예매내역 확인하기");
            System.out.println("4.예매 취소하기");
            System.out.println("5.관리자메뉴");
            System.out.println("6.종료하기");
            System.out.print(">> ");
            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
                sc.next();
                continue;
            }
            switch (choice) {
                case 1:
                    musicalTime(); // 캐스팅 시간표 보기
                    break;
                case 2:
                    musicalReservation(); // 예매하기
                    break;
                case 3:
                    musicalCheck(); // 확인하기
                    break;
                case 4:
                    musicalCancle(); // 취소하기
                    break;
                case 5:
                    if(!musicalAdminPw()){
                        System.out.println("비밀번호가 틀렸습니다.");
                        break;
                    }
                    tm.musicalAdmin(); // 관리자메뉴
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
                }
            }
            
            // System.out.println("예매를 마칩니다.");
        }
    
    private static boolean musicalAdminPw() { // 관리자메뉴 비번
        Scanner sc = new Scanner(System.in);
        System.out.println("관리자 비밀번호를 입력하세요");
        System.out.print(">> ");
        String adminPw = sc.next();
        // sc.nextLine();
        return "1234".equals(adminPw);
    }

    public static void musicalTime(){
        System.out.println("================================= 시간표 =================================");
        System.out.println(tickets.get(0).getId() + ", 날짜 : " + tickets.get(0).getDate() + ", 시간 : " + tickets.get(0).getTime() + ", 캐스트 : " + tickets.get(0).getCast());
        System.out.println(tickets.get(1).getId() + ", 날짜 : " + tickets.get(1).getDate() + ", 시간 : " + tickets.get(1).getTime() + ", 캐스트 : " + tickets.get(1).getCast());
        System.out.println(tickets.get(2).getId() + ", 날짜 : " + tickets.get(2).getDate() + ", 시간 : " + tickets.get(2).getTime() + ", 캐스트 : " + tickets.get(2).getCast());
    }
    public static void musicalReservation(){
        System.out.println("=============== 예매하기 ===============");
        System.out.println("원하는 회차를 입력해주세요(예: 1회차)");
        System.out.print(">> ");
        String select = sc.nextLine();
        sc.nextLine();
        boolean res = false;
        for(Ticket ticket : tickets){
            if (ticket.getId().equals(select)) {
                res = true;
                break;
            }else{
                System.out.println("회차를 확인해주세요.");
            }
        }
        if(res){
            System.out.print("예매자 이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print("전화번호를 입력하세요 : ");
            String phone = sc.nextLine();
            System.out.print("비밀번호를 설정해주세요 : ");
            String pass = sc.nextLine();
            sc.nextLine();
            users.add(new User(name, phone, pass));
            reservation.addAll(reservation);
            System.out.println("예매가 완료되었습니다.");
        }
    }

    private static void musicalCheck() {
        System.out.print("예매자분 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        boolean run = false;
        for(User user : users){
            if(user.getName().equals(userName)){
                System.out.print("비밀번호를 입력하세요 : ");
                int userPass = sc.nextInt();
                sc.nextLine();
                if(user.getPass().equals(userPass)){
                    run = true;
                    System.out.println("예매자 이름 : " + user.getName() + "님의 예매 회차 : " + reservation);
                }else{
                    System.out.println("비밀번호를 확인해주세요.");
                }
            }else{
                System.out.println("이름을 확인해주세요.");
                return;
            }
        }
        if (!run) {
            System.out.println("정보가 존재하지 않습니다.");
            return;
        }

    }

    public static void musicalCancle() {
        System.out.println("=============== 취소하기 ===============");
        System.out.println("취소하는 회차를 입력해주세요(예: 1회차)");
        System.out.print(">> ");
        String select = sc.nextLine();
        sc.nextLine();
        boolean res = false;
        for(Ticket ticket : tickets){
            if (ticket.getId().equals(select)) {
                tickets.remove(ticket);
                break;
            }
        }
        if(!res){
            System.out.println("찾는 회차가 없습니다.");
        }
    }

}
