package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddSolution {

    /**
     * String 相加
     * 415. Add Strings
     * 进位用 / 运算符
     * 余数 用 % 运算符
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        if (num1 == null || num1.equals("0")) {
            return num2;
        }
        if (num2 == null || num2.equals("0")) {
            return num1;
        }
        int count_num1 = num1.length() - 1;
        int count_num2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int last_head = 0;
        while (count_num1 >= 0 || count_num2 >= 0) {
            int temp = 0;
            if (last_head == 1) {
                temp++;
            }
            if (count_num1 >= 0) {
                temp += num1.charAt(count_num1) - '0';
                count_num1--;
            }
            if (count_num2 >= 0) {
                temp += (num2.charAt(count_num2) - '0');
                count_num2--;
            }
            if (temp / 10 == 1) {
                sb.append(temp % 10);
                last_head = 1;
            } else {
                sb.append(temp % 10);
                last_head = 0;
            }
        }
        if (last_head == 1) {
            sb.append(1);
        }
        System.out.println(sb.toString());
        return sb.reverse().toString();
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    /**
     * LeetCode 2
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;

        ListNode carry = new ListNode(0);
        ListNode head = carry;//指针迭代
        int temp = 0;
        while (first!= null || second != null || temp != 0){
            if (first != null){
                temp += first.val;
                first = first.next;
            }
            if (second != null) {
                temp += second.val;
                second = second.next;
            }
            head.next= new ListNode(temp % 10);
            head = head.next;
            temp = temp / 10;
        }

        return carry.next;
    }


}
