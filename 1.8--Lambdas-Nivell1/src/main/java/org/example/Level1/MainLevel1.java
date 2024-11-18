package org.example.Level1;

import org.example.Level1.Bussiness.CalcPi;
import org.example.Level1.Bussiness.StringReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainLevel1 {
    public static void main(String[] args) {

        System.out.println("----------Exercise 1----------");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Marco");
        strings.add("Polo");
        strings.add("Oscar");
        strings.add("Pepe");
        strings.add("Lila");
        strings.add("Bang");
        strings.add("Bongo");

        List<String> resultEx1 = getStringsWithO(strings);
        resultEx1.forEach(System.out::println);

        System.out.println("\n----------Exercise 2----------");
        strings.add("BangBingBong");
        strings.add("MongoBongo");
        List<String> resultEx2 = getStringsWithO5(strings);
        resultEx2.forEach(System.out::println);

        System.out.println("\n----------Exercise 3----------");
       ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        months.forEach(month -> System.out.println(month));

        System.out.println("\n----------Exercise 4----------");
        String[] months_arr = new String[]{"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        List<String> monthsRef = Arrays.asList(months_arr);
        monthsRef.forEach(System.out::println);

        System.out.println("\n----------Exercise 5----------");
        CalcPi piInstance = () -> 3.1415;
        System.out.println("Pi value: " + piInstance.getPiValue());

        System.out.println("\n----------Exercise 6----------");
        List<Object> stringList = new ArrayList<>();
        stringList.add("Mar");
        stringList.add(1);
        stringList.add("Polo");
        stringList.add(12);
        stringList.add("Ungombo");
        stringList.add(1234);

        List<Object> sortedList = sortList(stringList);
        sortedList.forEach(System.out::println);

        System.out.println("\n----------Exercise 7----------");
        sortedList = sortListZA(stringList);
        sortedList.forEach(System.out::println);

        System.out.println("\n----------Exercise 8----------");
        StringReverse reverser = s -> new StringBuilder(s).reverse().toString();
        String str = "Hello World";
        System.out.println("String: " + str);
        String result = reverser.reverse(str);
        System.out.println("Reversed string: " + result);
    }

    private static List<String> getStringsWithO(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o") || s.contains("O")).toList();
    }

    private static List<String> getStringsWithO5(List<String> strings) {
        return strings.stream()
                .filter(s -> (s.contains("o") || s.contains("O")) && s.length() > 5).toList();
    }

    private static List<Object> sortList(List<Object> list) {
        List<String> strings = list.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        return new ArrayList<>(strings);
    }
    private static List<Object> sortListZA(List<Object> list) {
        List<String> strings = list.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        return new ArrayList<>(strings);
    }
}
