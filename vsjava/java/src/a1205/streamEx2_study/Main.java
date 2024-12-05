package a1205.streamEx2_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader john = new Trader("John", "New York");
        Trader jane = new Trader("Jane", "London");
        Trader mark = new Trader("Mark", "New York");
        Trader emily = new Trader("Emily", "London");
        List<Transaction> transactions = Arrays.asList(
            new Transaction(john, 2020, 1200),
            new Transaction(jane, 2019, 800),
            new Transaction(mark, 2021, 1500),
            new Transaction(emily, 2020, 700),
            new Transaction(john, 2019, 950),
            new Transaction(jane, 2020, 600)
        );

        // 2020년에 발생한 모든 트랜잭션을 찾아 금액 기준으로 내림차순 정렬하시오.
        practice1(transactions);
        // 모든 거래자의 이름을 중복 없이 알파벳 순으로 정렬하여 출력하시오.
        practice2(transactions);
        // 뉴욕(New York)에 거주하는 모든 거래자의 이름을 정렬하여 출력하시오.
        practice3(transactions);
        // 트랜잭션의 최소 금액을 찾아라.
        practice4(transactions);
        // 모든 거래가 발생한 도시를 중복 없이 출력하시오.
        practice5(transactions);
        // 런던(London)에 거주하는 거래자가 하나라도 있는지 확인하시오.
        // 모든 트랜잭션의 총합을 구하시오.
        // 최댓값을 가진 트랜잭션을 출력하시오.
        // 모든 거래자의 이름을 연결하여 하나의 문자열로 반환하시오. (예: "Emily,Jane,John,Mark")
        // 2019년에 발생한 트랜잭션의 평균 금액을 계산하시오.

    }

    // 모든 거래가 발생한 도시를 중복 없이 출력하시오.
    private static void practice5(List<Transaction> transactions) {
        List<String> result = transactions.stream()
            .map((tran) -> tran.getTrader().getCity())
            .distinct()
            .collect(Collectors.toList());
        System.out.println(result);
    }

    // 트랜잭션의 최소 금액을 찾아라.
    private static void practice4(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));
        System.out.println(result.get().getValue());
    }

    // 뉴욕(New York)에 거주하는 모든 거래자의 이름을 정렬하여 출력하시오.
    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> "New York".equalsIgnoreCase(trader.getCity()))
            .sorted(Comparator.comparing(Trader::getName))
            .collect(Collectors.toList());
        System.out.println(result);
    }

    // 모든 거래자의 이름을 중복 없이 알파벳 순으로 정렬하여 출력하시오.
    private static void practice2(List<Transaction> transactions) {
        String result = transactions.stream()
            .map(Transaction::getTrader)
            .map(Trader::getName)
            .distinct()
            .sorted()
            .collect(Collectors.joining(","));
        System.out.println(result);
    }

    // 2020년에 발생한 모든 트랜잭션을 찾아 금액 기준으로 내림차순 정렬하시오.
    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(transaction -> 2020 == transaction.getYear())
            .sorted(Comparator.comparing(Transaction::getValue).reversed())
            .collect(Collectors.toList());
        System.out.println(result);
    }
}
