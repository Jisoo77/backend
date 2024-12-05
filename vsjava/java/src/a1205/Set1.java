package a1205;

import java.util.*;

// 자바 컬렉션
// 다수의 데이터를 쉽고 효과적으로 처리
// List
// Map
// Set

public class Set1 {
    public static void main(String[] args) {
        // 객체선언
        Set<String> set = new HashSet<String>();
        // 데이터 삽입
        set.add("apple");
        set.add("banana");
        set.add("pyopyo");
        set.add("kiwi");
        System.out.println();
        for(String e : set){
            System.out.println(e);
        }
        System.out.println();
        // 데이터삭제
        set.remove("apple");
        set.add("orange");
        set.add("orange"); // 중복요소 저장 안됨
        for(String e : set){
            System.out.println(e);
        }

        Iterator<String> iterSet = set.iterator();
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next() + " ");
        }
        System.out.println();
        System.out.println(set);

        System.out.println(set.contains("orange"));
        
        // 전체 데이터 삭제
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
