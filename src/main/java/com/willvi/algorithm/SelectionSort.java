package com.willvi.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : SelectionSort
 * @Description : 选择排序
 * @Author : WillVi
 * @Date : 2019/3/26 11:02
 * @Version : 1.0
 */
public class SelectionSort {

    public List<Integer> sort(List<Integer> list){
        List<Integer> sortedList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer small = findSmall(list);
            sortedList.add(small);
            list.remove(small);
        }
        return sortedList;
    }

    private Integer findSmall(List<Integer> arr){
        Integer min = arr.get(0);
        for (Integer integer : arr) {
            if (integer < min){
                min = integer;
            }
        }
        return min;
    }

    public static void main(String[] args) {
    }
}
