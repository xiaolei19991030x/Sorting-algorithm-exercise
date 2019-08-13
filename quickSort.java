package com.tongcaipay.merchant.apply.study;

import java.util.Arrays;

public class quickSort {
    /**
     * 定义一个要排序的数组 arr[low...high]
     * @param low  数组arr[]的左下标
     * @param high 数组arr[]的右下标
     */

    /*对数组arr[low...high]进行排序*/
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            //对数组进行分割，取出下次分割的基准标号
            int index = getIndex(arr, low, high);  //算出枢轴值index


            quickSort(arr, low, index - 1);   //对index左侧对数组进行递归切割
            quickSort(arr, index + 1, high);    //对index右侧对数组进行递归切割

        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        int temp = arr[low];  //用数组的第一个作为基准数据
        while (low < high) {
            //当队尾元素大于等于temp时，下标high向前移动
            while (low < high && arr[high] >= temp) {
                high--;
            }
            //当队尾元素小于temp时，将其赋值给low
            arr[low] = arr[high];

            //当队首元素小于等于temp时，下标low向后移动
            while (low < high && arr[low] <= temp) {
                low++;
            }
            //当队首元素大于temp时，将其赋值给high
            arr[high] = arr[low];
        }

        arr[high] = arr[low] = temp;  //此时high = low
        return high; // 返回tmp的正确位置
        //return low;

    }

    public static void main(String[] args) {
        int arr[] = {23, 58, 13, 10, 57, 62, 106, 78,95,85};
        System.out.println("排序前："+Arrays.toString(arr)+" ");
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后："+Arrays.toString(arr)+" ");
    }
}
