package com.tongcaipay.merchant.apply.study;

import java.util.Arrays;

public class MergingSort {

    /**
     * 定义一个要排序的数组 arr[m...n]
     *
     * @param m 数组arr[]的左下标
     * @param n 数组arr[]的右下标
     */
    public static void mergeSort(int[] arr, int m, int n) {
        if (m == n) {
            //当m=n时，数组内只有一个元素

        } else {
            //1.将数组一分为二
            int center = (m + n) / 2;  //将arr1[m...n]分成arr1[m...center]和arr1[center+1...n]

            //2.将数组arr1[m...center]排序
            mergeSort(arr, m, center);

            //3.将数组arr1[center+1...n]排序
            mergeSort(arr, center + 1, n);

            //4.合并两个数组
            merge(arr, m, center, n);
        }
    }

    /**
     * 将arr1[m...center]和arr1[center+1...n]归并为一个有序数组
     */

    public static void merge(int[] arr, int m, int center, int n) {
        int[] temp = new int[n - m + 1];
        int i = m;  //左指针
        int j = center + 1;  //右指针
        int k = 0;
        int l;
        //先把较小的数移入数组
        while (i <= center && j <= n) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k = k + 1;
                i = i + 1;
            } else{
                temp[k] = arr[j];
                k = k + 1;
                j = j + 1;
            }
        }

        //把左边剩余的数移入数组
        while (i <= center) {
            temp[k] = arr[i];
            k = k + 1;
            i = i + 1;

        }

        //把右边剩余的数移入数组
        while (j <= n) {
            temp[k] = arr[j];
            k = k + 1;
            j = j + 1;

        }

        for (int k2 = 0; k2 < temp.length; k2++) {   //把temp[]里的数组复制到arr[]里
            arr[k2 + m] = temp[k2];
        }
    }


    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 8, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
