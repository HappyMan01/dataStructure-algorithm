package com.happyman.order;

import java.util.Arrays;

/**
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-06-02 10:20
 * @since 0.1.0
 **/
public class InsertionSort {
    public static int[] insertSort(int[] sourceArray) {
        // 默认0位置是已排区间,我们从1开始比较,从后向前扫描位置插入数据
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >=0 ; j--) {
               if(arr[j] > tmp) {
                   // 数据往后移
                   arr[j+1] = arr[j];
               }
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int[] ints = insertSort(arr);
        System.out.println();
    }
}
