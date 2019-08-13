package com.tongcaipay.merchant.apply.study;
import java.util.Arrays;

//希尔排序算法
public class ShellSort {
    public static void sort(int[] arr) {
        // 缩小增量gap的范围
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j = j - gap;
                    }
                    arr[j] = temp;
                }
            }
        }


    public static void main(String[] args) {
        int []arr = {10,10,4,8,9,6,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
