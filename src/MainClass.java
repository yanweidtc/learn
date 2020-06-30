import leetcode.AddSolution;
import leetcode.MergeSort;

public class MainClass {

    public static void main(String[] args) {

        //leetcode88
/*        int[] num1 = new int[]{1, 3, 4, 5, 7,9,12,13,14, 17, 18,19, 0,0,0,0,0,0,0,0};
        int[] num2 = new int[]{2,4, 6, 8, 9, 10, 14,15};
        num1 = new int[]{0};
        num2 = new int[]{1};
        //MergeSort.mergeNewSort(num1, num1.length - 1, num2, num2.length);
        MergeSort.mergeNewSort(num1, 0, num2, 1);*/

        //leetcode 415
/*        String result = AddSolution.addStrings("122345", "7757");
        System.out.println("  result continue : " + result);*/

        //leetcode 2
        AddSolution.ListNode l1 = new AddSolution.ListNode(4);
        l1.next = new AddSolution.ListNode(4);
        l1.next.next = new AddSolution.ListNode(5);

        AddSolution.ListNode l2 = new AddSolution.ListNode(5);
        l2.next = new AddSolution.ListNode(6);
        l2.next.next = new AddSolution.ListNode(4);
        AddSolution.addTwoNumbers(l1,l2);

    }
}
