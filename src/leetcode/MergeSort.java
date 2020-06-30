package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class MergeSort {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int capacity = m + n;
        int num1_position = m ; //遍历 nums1 指针
        int num2_count = 0;
        for (int i = 0; i <  n; i++) {
            System.out.println("遍历 第 " + i + "次");
            int num2_element = nums2[n -1 - num2_count];// num2 从后往前取元素
            int position = num1_position - i; // nums1 的指针位置
            int num1__element = nums1[position - 1];
            if (num2_element >= num1__element) {
                position = m - i;
                nums1[position] = num2_element;//指定位置赋值
                num1_position = position;
                m++;//num1 元素容量加一
                num2_count++;
                System.out.println(num2_element + "  position : " + position + " num2_count : " + num2_count + " ");
            }else {
                num1_position--;
                System.out.println(num2_element + "  position continue : " + position);
                continue;
            }
        }
    }

    public static void mergeNewSort(int[] nums1, int m, int[] nums2, int n) {
        /**
         * leetCode 88题 傻逼答案
         */
        int position_first = m - 1;
        int position_second = n - 1;
        int total_position = m + n -1;
        int count_time = 0;
        if (nums2 == null || nums2.length ==0){
            position_first = -1;
            position_second = -1;
        }

        while (position_first >=0 || position_second >=0){
            System.out.println("遍历 第 " + count_time + "次");
            System.out.println("total Position " + total_position + "位置");
            int element_first = nums1[position_first];
            int element_second = nums2[position_second];
            if (element_second >= element_first){
                //nums1[position_first] = element_second;
                nums1[total_position] = element_second;
                total_position --;
                nums1[total_position] = element_first;
                total_position --;
                System.out.println("num2 元素 position" + position_second + " value:" + element_second + "插入 num1 position" + position_first);
                position_first--;
                position_second--;
                if (nums2[position_second] > nums1[total_position +1]){
                    nums1[total_position + 1] = nums2[position_second];
                    nums2[position_second] = element_first;
                }
            }else {
                nums1[total_position] = nums1[position_first];
                position_first--;
                total_position--;
                System.out.println("num2 元素 position" + position_second + " value:" + element_second + "重新 循环 num1 : position" + position_first);
            }

            if(position_second == 0 ){
                count_time++;
                System.out.println("遍历 第 " + count_time + "次");
                System.out.println(Arrays.toString(nums1));
                break;
            }

            if (position_first == -1){
                break;
            }
            count_time++;
            System.out.println(Arrays.toString(nums1));
        }
    }
}
