package leetcode;

public class MergeNode {

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node( 7);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next = new Node(9);

        MergeNode mergeNode = new MergeNode();
        Node result = mergeNode.mergeSort(head);
        result.toPrint();
    }

    public Node mergeSort(Node head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        Node middle = findMiddle(head);

        Node first = mergeSort(head);
        Node second = mergeSort(middle);

        return merge(first, second);
    }

    private Node merge(Node p1, Node p2){
        Node dummy = new Node(-1);
        Node p = dummy;//指针p
        while (p1 != null && p2 != null) {
            if (p1.value < p2.value){
                p.next = p1;//
                p1 = p1.next;//p1往后挪一位
            }else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null){
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

    private Node findMiddle(Node head) {
        //快慢指针
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midHead = slow.next;
        slow.next = null;//node断开

        System.out.println("打印 node  mid " + midHead.getPrint());
        return midHead;
    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }


        String getPrint() {
            Node p = this;
            StringBuilder sb = new StringBuilder();
            while (p != null) {
                System.out.print(p.value + " ");
                sb.append(p.value +" ;");
                //System.out.println(toString());
                p = p.next;
            }
            return sb.toString();
        }
        void toPrint() {
            Node p = this;
            while (p != null) {
                System.out.print(p.value + " ");
                //System.out.println(toString());
                p = p.next;
            }
        }
    }
}
