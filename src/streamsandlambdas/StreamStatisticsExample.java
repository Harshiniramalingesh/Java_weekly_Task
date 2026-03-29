package streamsandlambdas;

import java.util.*;
import java.util.stream.*;
public class StreamStatisticsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new Random()
                .ints(100, 1, 1001)
                .boxed()
                .collect(Collectors.toList());
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Count  : " + stats.getCount());
        System.out.println("Sum    : " + stats.getSum());
        System.out.println("Min    : " + stats.getMin());
        System.out.println("Max    : " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}

