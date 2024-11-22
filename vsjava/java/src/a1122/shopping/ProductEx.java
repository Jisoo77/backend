package a1122.shopping;

public class ProductEx {
    public static void main(String[] args) {
        Product laptop = new Product("노트북",1200000, 10);
        Product desktop = new Product("데스크톱", -1000000, -5);
        
        // System.out.println("제품명 : " + laptop.getName());
        // System.out.println("가격 : " + laptop.getPrice());
        // System.out.println("재고: " + laptop.getStock());
        System.out.println(laptop.toStr());
        System.out.println(desktop.toStr());
        
        // 가격수정
        // laptop.setPrice(-500); // 세터로 가격수정
        System.out.println("수정된 가격 : " + laptop.getPrice());

        // 재고추가
        laptop.addStock(5);

        laptop.sellProduct(8); 
    }
}
