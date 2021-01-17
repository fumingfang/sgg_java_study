package com.atguigu.exer;

/**
 * @Author 扶明方
 * @Date 2021/1/17 18:16
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-345, 34, 76, 234, -13, 0, 678, 98, 45, 0};

        int low = 0;
        int high = arr.length - 1;
        //快速排序
        quickSort(arr, low, high);

        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int pivot = arr[low];//基准数据
        int originLow = low;
        int originHigh = high;
        while (low < high) {
            //先让high指针从右向左走，直到找到比基准数据小的
            while (arr[high] >= pivot && low < high) {
                high--;
            }
            //然后low指针从左向右走，直到找到比基准数据大的
            while (arr[low] <= pivot && low < high) {
                low++;
            }
            //如果满足条件交换数据
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        //此时low和high在同一位置，将基准数据与low和high位置相等的数据交换
        int temp = arr[low];
        arr[low] = pivot;
        arr[originLow] = temp;
        //递归调用左半数组
        quickSort(arr, originLow, low - 1);
        //递归调用右半数组
        quickSort(arr, low + 1, originHigh);
    }
}
