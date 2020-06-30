package leetcode;

public class ReverseNumSolution {


    public static void main(String[] args) {
        getReverseNum(321);
    }

    /**
     * LeetCode 7
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
     * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     * 获取一个数值的反转值
     * @param x
     * @return
     */
    public static int getReverseNum(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x /10;
        }
        return result;
    }
}
