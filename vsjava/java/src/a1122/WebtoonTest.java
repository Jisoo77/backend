package a1122;

public class WebtoonTest {
    public static void main(String[] args) {
        Webtoon w1 = new Webtoon("나 혼자만 레벨업업", "판타지", "추공님");
        Webtoon w2 = new Webtoon("스위트 집", "스릴러", "칸비님");
        Webtoon w3 = new Webtoon("이태원 클래식", "드라마", "광진님");

        Webtoon[] webtoons = {w1, w2, w3};
        // Webtoon 배열에 여러개의 객체 한 번에 저장
        // 배열타입 Webtoon을 지정되면, 이 배열은 Webtoon 객체 저장 가능
        for(int i=0; i<webtoons.length; i++){
            // System.out.println(webtoons[i]);
            // System.out.println("제목: " + webtoons[i].getTitle());
            // System.out.println("장르: " + webtoons[i].getGenre());
            // System.out.println("작가: " + webtoons[i].getAuthor());
            System.out.println(webtoons[i].toStr());
        }
        System.out.printf("웹툰 객체의 총수 : %d", Webtoon.getCount());
        // System.out.println("웹툰 객체의 총수 : " + Webtoon.getCount());

    }
    }
    class Webtoon{
        private String title; // 제목
        private String genre; // 장르
        private String author; // 저자
        private static int count = 0; // 생성된 웹툰 객체수
    
        // public String getTitle() {
        //     return title;
        // }
    
        // public String getGenre() {
        //     return genre;
        // }
    
        // public String getAuthor() {
        //     return author;
        // }
    
        public static int getCount() {
            return count;
        }
    
        public String toStr() {
            return String.format("Webtoon{제목:%s, 장르:%s, 저자: %s}" , title, genre, author);
        }
    
        public Webtoon(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        Webtoon.count++; // 매 객체 생성시, 그 갯수를 기록
    }
}
