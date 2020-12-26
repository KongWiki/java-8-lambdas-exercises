package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringExercises {

    // Question 6
    public static int countLowercaseLetters(String string) {
        long count = string.chars().filter(Character::isLowerCase).count();
        return (int) count;
//        return Exercises.replaceThisWithSolution();
    }

    // Question 7
    public static Optional<String> mostLowercaseString(List<String> strings) {
       return strings.stream().max(Comparator.comparingInt(StringExercises::countLowercaseLetters));
//        return Exercises.replaceThisWithSolution();
    }

    public static void main(String[] args) {
        String a = "this is string";
        String b = "THIS is STRING";
        String c = "THIS IS STRING";
        System.out.println(countLowercaseLetters(a));
        List<String> strs = new ArrayList<>(Arrays.asList(a, b, c));
        System.out.println(mostLowercaseString(strs));
        List<String> collect = Stream.of("a", "b", "c").map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }

}
