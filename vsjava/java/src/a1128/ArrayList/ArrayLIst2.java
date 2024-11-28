package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayLIst2 {
    public static void main(String[] args) {
        // 특정위치에 삽입가능
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // 삽입
        list.add(1, 15);
        // 인덱스번호 1번에 15삽입
        // 출력
        System.out.println("ArrayList : " + list);
        
    }
}
