package com.example.ms.cybernet.ingress.controller;

import org.apache.commons.lang3.stream.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyStream {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("azn", "", "eur", "", "tl", "lari");

        int b = myFilter(strList, x -> !x.isEmpty()).size(); // 1

        long a = strList.stream().filter(x -> !x.isEmpty()).count(); // 2

    }


    public static <T> List<T> myFilter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

}
