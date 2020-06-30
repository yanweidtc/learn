package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class SubSequence {

    public static void main(String[] args) {
        String input1 = "abc";
        String input2 = "ahbgdc";

        isSubsequenceDirect(input1, input2);
    }


    /**
     * leetcode 392
     * 392. 判断子序列
     * 双指针
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequenceDirect(String s, String t) {
        if (s == null || t == null){
            return  false;
        }
        if (s.length() > t.length()){
            return false;
        }
        int fast = 0;
        int slow = 0;
        while (fast < s.length() && slow < t.length()){
            char fastOne = s.charAt(fast); //快指针
            char slowOne = t.charAt(slow);//慢指针
            if (fastOne == slowOne ) {
                fast++;
                slow++;
            }else {
                slow++;
            }
        }
        if (fast == s.length()){
            return true;
        }else {
            return false;
        }
    }
}
