package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {

    public static void main(String[] args) {

        findMinMax(
                Stream.of(2, 9, 5, 4, 8, 1, 3),
                Integer::compareTo,
                (min, max) ->
                        System.out.println("min: " + min + " / max: " + max)
        );

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        if (stream == null){
            throw new NullPointerException();
        }
        Iterator<? extends T> iterator = stream.iterator();
        if (!iterator.hasNext()) {
            minMaxConsumer.accept(null, null);
            return;
        }
        T min = iterator.next();
        T max = iterator.next();
        while (iterator.hasNext()){
            T element = iterator.next();
            min = order.compare(element, min) < 0 ? element : min;
            max = order.compare(element, max) > 0 ? element : max;
        }
        minMaxConsumer.accept(min, max);
    }
}
