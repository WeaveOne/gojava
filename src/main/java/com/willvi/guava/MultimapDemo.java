package com.willvi.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.List;

/**
 * @author wangwei
 * @date 2019/10/21 11:19
 */
public class MultimapDemo {
    public static void main(String[] args) {
        ListMultimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("willvi", "ww");
        multimap.put("willvi", "ww1");
        for (String firstName : multimap.keySet()) {
            List<String> lastNames = multimap.get(firstName);
            System.out.println(firstName + ": " + lastNames);
        }
    }
}
