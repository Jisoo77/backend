package project1.ticket;

import java.time.Instant;

public class Ticket {
    private String date; // 공연 날짜
    private String time; // 공연 시간
    private String cast; // 해당 회차 캐스팅
    private String reservation; // 예매하기
    private String chek; // 예매내역 체크
    private String cancle; // 예매 취소
    private String name; // 예매자 이름
    private String phone; // 예매자 전화번호
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Ticket(String date, String time, String cast) {
        this.date = date;
        this.time = time;
        this.cast = cast;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getCast() {
        return cast;
    }
    public void setCast(String cast) {
        this.cast = cast;
    }
    public String getReservation() {
        return reservation;
    }
    public void setReservation(String reservation) {
        this.reservation = reservation;
    }
    public String getChek() {
        return chek;
    }
    public void setChek(String chek) {
        this.chek = chek;
    }
    public String getCancle() {
        return cancle;
    }
    public void setCancle(String cancle) {
        this.cancle = cancle;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}