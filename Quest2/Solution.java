public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // initializing new linkedList to return
        ListNode start = new ListNode(0);
        ListNode nodeCurrent = start;
        ListNode l1Head = l1;
        ListNode l2Head = l2;
        int remnant = 0;

        while (l1Head != null || l2Head != null) {
            int unit1 = 0;
            if(l1Head != null) {
                unit1 = l1Head.val;
            }

            int unit2 = 0;
            if(l2Head != null) {
                unit2 = l2Head.val;
            }

            // sum of unit value
            
            int total = unit1 + unit2 + remnant;
            remnant = total/10;
            nodeCurrent.next = new ListNode(total % 10);
            nodeCurrent = nodeCurrent.next;
            if(l1Head != null) l1Head = l1Head.next;
            if(l2Head != null) l2Head = l2Head.next; 

        }
        if(remnant > 0) {
            nodeCurrent.next = new ListNode(remnant);
        }
        
        return start.next;
    }
}
