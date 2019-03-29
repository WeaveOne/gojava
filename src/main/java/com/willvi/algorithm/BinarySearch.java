package com.willvi.algorithm;

/**
 * @ClassName : BinarySearch
 * @Description : 二分查找
 * @Author : WillVi
 * @Date : 2019/3/26 11:52
 * @Version : 1.0
 */
public class BinarySearch {

    public int search(int[] items, int item) {
        int low = 0;
        int high = items.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int guess = items[mid];
            if (guess == item){
                return mid;
            }else if (guess < item){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] items = new int[]{1,2,3,4,5,6,7,8,9,10};
        int search = new BinarySearch().search(items, 11);
        System.out.println(search);
    }
}
