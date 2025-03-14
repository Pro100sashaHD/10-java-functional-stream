package com.example.task02;

import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Task02Main {

    public static void main(String[] args) {
        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);
    }

    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n > 16){
            throw new IllegalArgumentException();
        }
        return IntStream.iterate(0, i -> i + 1).map(g -> GrayCode(g % (int)Math.pow(2, n)));
    }

    public static int GrayCode(int g){
        return g ^ (g >> 1);
    }

}
