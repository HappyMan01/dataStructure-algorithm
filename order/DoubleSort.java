package com.happyman.order;

/**
 *  // 冒泡排序父子度O(n2)
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-06-01 15:30
 * @since 0.1.0
 **/
public class DoubleSort {
    // 冒泡排序，a表示数组，n表示数组大小
    public static void bubbleSort(int[] arr, int n) {
        if (n <= 1) return;
            for (int i = 0; i < n; ++i) {
                boolean isSwapped = false;
                for (int j = 0; j < n - 1; j++) {
                   if(arr[j] > arr[j+1]) {
                       int tmp = arr[j];
                       arr[j] = arr[j + 1];
                       arr[j + 1] = tmp;
                       isSwapped = true;
                   }
                }
            }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2,6};
        bubbleSort(arr,arr.length);
        System.out.println(arr);
    }
}
