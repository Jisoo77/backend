package project1.ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketManager {
    private static ArrayList<Ticket> tickets;
    Scanner sc = new Scanner(System.in);

    public TicketManager(){
        tickets = new ArrayList<>();
        tickets.add(new Ticket("12/10", "20:00", "김소향, 전수미, 정영아, 허혜진"));
        tickets.add(new Ticket("12/11", "16:00", "최정원, 리사, 임정희, 최서연"));
        tickets.add(new Ticket("12/11", "20:00", "알리, 스테파니, 이아름솔, 황우림"));
    }

    public void musicalTime(){
        System.out.println("================================= 시간표 =================================");
        System.out.println("1회차 - 날짜 : " + tickets.get(0).getDate() + ", 시간 : " + tickets.get(0).getTime() + ", 캐스트 : " + tickets.get(0).getCast());
        System.out.println("2회차 - 날짜 : " + tickets.get(1).getDate() + ", 시간 : " + tickets.get(1).getTime() + ", 캐스트 : " + tickets.get(1).getCast());
        System.out.println("3회차 - 날짜 : " + tickets.get(2).getDate() + ", 시간 : " + tickets.get(2).getTime() + ", 캐스트 : " + tickets.get(2).getCast());
    }
    public void musicalReservation(){
        reservation = new ArrayList<>();
        System.out.println("=============== 예매하기 ===============");
        System.out.print("원하는 회차를 입력해주세요(예: 1회차) >> ");
        for(Ticket list : tickets){
            if (list.getId()) {
                
            }
        }
    }
}
