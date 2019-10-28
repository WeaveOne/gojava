package com.willvi.guava;


import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangwei
 * @date 2019/10/25 11:30
 */
public class OrderingDemo {
    @Data
    @AllArgsConstructor
    static class Person {
        String name;
        int age;
    }
    public static void main(String[] args) {
        List<Person> strings = Lists.newArrayList();
        strings.add(new Person("ww", 1));
        strings.add(new Person("w",7));
        strings.add(new Person("wwww",2));
        Ordering<Person> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Person, Comparable>() {
            @Nullable
            @Override
            public Comparable apply(@Nullable Person person) {
                return person.age;
            }
        });
        List<Person> people = ordering.sortedCopy(strings);
        System.out.println(people);
    }
}
