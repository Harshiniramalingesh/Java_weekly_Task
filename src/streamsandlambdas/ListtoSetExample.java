package streamsandlambdas;

import java.util.*;
import java.util.stream.*;

public class ListtoSetExample {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,3,2,1);

        Set<Integer> set = list.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
