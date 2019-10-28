package com.willvi.guava;

import com.google.common.collect.*;

/**
 * @author wangwei
 * @date 2019/10/25 14:45
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutableSet set = ImmutableSet.builder().add(1,2,3).build();
        ImmutableSet.copyOf(new Integer[]{1,2,3});
        ImmutableSet.of(12,3,4,5);
        Multiset<Integer> multiset = HashMultiset.create();
        multiset.add(1);
        multiset.add(2);
        multiset.add(1);
        System.out.println(multiset.count(1));
    }
}
