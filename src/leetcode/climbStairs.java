package leetcode;

public class climbStairs {


    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n ==2){
            return n;
        }
        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        for ( int i = 3; i <= n; i++ ){
            memo[i] = memo[i - 1] + memo[i -2];
        }

        return memo[n-1];
    }
}
