package com.xiablog.algorithm;

import java.util.Arrays;

/**
 * <p>
 * Description:归并排序
 * 思路：将数组递归折半，直至每组1个
 *      然后两两归并，创建一个
 * </p>
 *
 * @author bh.xia
 * @date 2020/6/9 10:50
 */
public class MergeSortAlg {

    static public void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            //折半成两个小集合，分别进行递归
            int mid = (start + end) / 2;
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            //把两个有序小集合，归并成一个大集合
            merge(array,start,mid,end);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        //开辟额外大集合，设置指针
        int[] tempArray = new int[end - start + 1];
        int p1=start,p2=mid+1,p=0;
        //比较两个小集合的元素，依次放入大集合
        while (p1 <= mid && p2 <= end) {
                if (array[p1] <= array[p2]) {
                    tempArray[p++] = array[p1++];
                } else {
                    tempArray[p++] = array[p2++];
                }
        }
                //左侧小集合还有剩余，依次放入大集合尾部
                while (p1 <= mid) {
                    tempArray[p++] = array[p1++];
                }
                while (p2 <= end) {
                    tempArray[p++] = array[p2++];
                }
                //把大集合的元素复制回原数组
                for (int i = 0; i < tempArray.length; i++) {
                    array[i + start] = tempArray[i];
                }
    }

    public static void main(String[] args) {
        int[] array = {6, 23, 24, 78, 54, 22, 7, 35, 72, 11, 22};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println("over");
    }
}
