package a1205;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"넷","둘","셋","하나"};

        //배열 세서 스트림 생성
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.println(e + " "));
        System.out.println();
        Stream<String> stream2 = Arrays.stream(arr,1,3);
        stream2.forEach(e -> System.out.println(e + " "));
        // 1,3 시작인덱스와 끝인덱스 1부터 3까지

    }
}