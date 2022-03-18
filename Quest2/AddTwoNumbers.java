public class AddTwoNumbers {
    public static void main(String[] args) {
        // 9
        ListNode node0 = new ListNode(9);

        //1999999999
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=node9;
        node9.next=node10;
 
        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(node0, node1);
        System.out.println(result.val);
       
    }
}