package com.study.thread.pool;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

        public static void main(String[] args) {
            List<String> list = Arrays.asList("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");

            Map<String, List<String>> groups = list.stream().
                    collect(Collectors.groupingBy(s -> s.substring(0,1), Collectors.toList()));
            System.out.println(groups);
        }
}
