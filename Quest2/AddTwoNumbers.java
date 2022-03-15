public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node0 = new ListNode(0);
        //ListNode node1 = new ListNode(4);
        //ListNode node2 = new ListNode(3);
        //node0.next=node1;
        //node1.next=node2;

        ListNode node3 = new ListNode(0);
        //ListNode node4 = new ListNode(6);
        //ListNode node5 = new ListNode(4);
        //node3.next=node4;
        //node4.next=node5;
 
        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(node0, node3);
        System.out.println(result.val);
       
    }
}