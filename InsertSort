package com.tongcaipay.merchant.apply.study;
//直接插入排序
public class InsertSort {
    private void sort(int[] arr) {
        int i,j;
        for (i = 1;i<arr.length;i++){
            int temp = arr[i];   //temp是要插入的数
            for(j=i-1;j>=0 && arr[j]>temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;  //插入到正确位置
            print(arr,i);
        }
        printResult(arr);
    }

    private void printResult(int[] arr){
        System.out.print("最终排序结果：");
        for(int j=0;j<arr.length;j++){
            System.out.print(" "+arr[j]);
        }
        System.out.println();
    }

    private void print(int[] arr, int i) {
        System.out.print("第" + i + "次：");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {3,1,5,7,2,4,9,6};
        new InsertSort().sort(arr);

    }
}
