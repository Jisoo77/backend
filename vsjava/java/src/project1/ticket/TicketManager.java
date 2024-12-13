package project1.ticket;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketManager {
    protected static ArrayList<Ticket> tickets;
    protected static final Scanner sc =new Scanner(System.in);

    public void musicalAdmin() {
        tickets = new ArrayList<>();
        tickets.add(new Ticket("1회차","12/10", "20:00", "김소향, 전수미, 정영아, 허혜진"));
        tickets.add(new Ticket("2회차","12/11", "16:00", "최정원, 리사, 임정희, 최서연"));
        tickets.add(new Ticket("3회차","12/11", "20:00", "알리, 스테파니, 이아름솔, 황우림"));
    
        while (true) {
            System.out.println("\n+------- 관리자 메뉴 -------+");
            System.out.println("| 1.캐스팅 시간표           |");
            System.out.println("| 2.캐스팅 삭제             |");
            System.out.println("| 3.캐스팅 정보 수정        |");
            System.out.println("| 4.메인으로 돌아가기       |");
            System.out.println("+---------------------------+");
            System.out.print(">> ");
            
            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력하세요.");
                sc.next();
                continue;
            }
            switch (choice) {
                case 1:
                    musicalTime(); // 캐스팅
                    break;
                case 2:
                    musicalDel(); // 삭제
                    break;
                case 3:
                    musicalUpdate(); // 수정
                    break;
                case 4:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
                    break;
            }
        }
    }

    private void musicalUpdate() {
        boolean found = false;
        System.out.print("수정할 캐스팅의 회차명 : ");
        String num = sc.next();
        for(Ticket ticket : tickets){
            if (ticket.getId().equals(num)) {
                System.out.println("수정할 정보를 입력하세요");
                System.out.println("1.날짜");
                System.out.println("2.공연 시간");
                System.out.println("3.캐스트 멤버");
                System.out.print(">> ");
                int upNum = sc.nextInt();
                sc.next();
                if(ticket.getId().equals(1)){
                    System.out.print("날짜 수정 : ");
                    String upDate = sc.next();
                    ticket.setDate(upDate);
                    System.out.println(upNum + "의 날짜가 수정되었습니다.");
                }else if(ticket.getId().equals(2)){
                    System.out.print("공연 시간 수정 : ");
                    String upDate = sc.next();
                    ticket.setTime(upDate);
                    System.out.println(upNum + "의 날짜가 수정되었습니다.");
                }else if(ticket.getId().equals(3)){
                    System.out.print("캐스트 멤버 수정 : ");
                    String upDate = sc.next();
                    ticket.setCast(upDate);
                    System.out.println(upNum + "의 캐스트가 수정되었습니다.");
                }
            }else{
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
        }
    }

    private void musicalDel() {
        System.out.print("삭제하려는 회차명을 입력하세요 : ");
        String delNum = sc.next();
        boolean found = false;
        for(Ticket ticket : tickets){
            if (ticket.getId().equals(delNum)) {
                tickets.remove(ticket);
                System.out.println(delNum+"가 삭제되었습니다.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("회차가 존재하지 않습니다.");
        }
    }

    private void musicalTime() {
        for(Ticket ticket : tickets){
            System.out.println(ticket.toString());
        }
    }

    
}
