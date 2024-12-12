package a1212.Lotto;


public class Main {
    public static void main(String[] args) {
        Membership m = new Membership();
        m.MembershipGuide();

        // 로또 구매
        Purchase p = new Purchase();
        p.perchaseQuestion(m);

        Loading l = new Loading();
        l.loading();

        // 로또번호 추첨
        Lottery lt = new Lottery();

        // 랜덤으로 로또번호 생성
        lt.randomLotteryNum();

        // 당첨된 로또번호 출력
        lt.lotteryNum();

        // 딩첨 결과 출력
        lt.result(m,p); // 가입된 획원객체와 로또구매 인수로 result 메서드에 실어보냄
        
    }
}
