package com.tongcaipay.merchant.apply.study;

import java.util.Arrays;

//简单选择排序
public class SelectSort {
    public static void sort(int[] arr) {
        int i,j,min;
        for (i = 0;i<arr.length;i++){
            min = i;
            for (j = i + 1;j < arr.length;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            }
        }


    public static void main(String[] args) {
        int []arr = {10,7,3,8,9,6,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
