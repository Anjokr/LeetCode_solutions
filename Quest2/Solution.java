public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remnant = 0;
        int l1Size = 0;
        int l2Size = 0;

        // initializing new linkedList to return
        ListNode nodeCurrent = null;
        ListNode start = nodeCurrent;
        ListNode l1Head = l1;
        ListNode l2Head = l2;

        while (l1Head.next != null || l2Head.next != null) {
            // sum of unit value
            int total = 0;
            if (l1Head.next == null) {
                total = 0 + l2Head.val + remnant;
                //l2Size++;
                
                l2Head = l2Head.next;
            } else if (l2Head.next == null) {
                total = l1Head.val + 0 + remnant;
                //l1Size++;
                
                l1Head = l1Head.next;
            } else {
                total = l1Head.val + l2Head.val + remnant;
                //l1Size++;
                //l2Size++;
                remnant = total/10;
                l1Head = l1Head.next;
                l2Head = l2Head.next;
            }
            remnant = total/10;
            if (nodeCurrent == null) {
                nodeCurrent = new ListNode(total % 10);
                start = nodeCurrent;
                remnant = total / 10;
            } else {
                nodeCurrent.next = new ListNode(total % 10);
                nodeCurrent = nodeCurrent.next;
            }
            //go to next node(value)

        }

        if(l1Size > l2Size) {
            nodeCurrent.next = new ListNode((l1.val + remnant) % 10);
            nodeCurrent = nodeCurrent.next;
            remnant = (l1.val + remnant) / 10;
            nodeCurrent.val = remnant;
        } else if (l1Size < l2Size) {
            nodeCurrent.next = new ListNode((l2.val + remnant) % 10);
            nodeCurrent = nodeCurrent.next;
            remnant = (l2.val + remnant) / 10;
            nodeCurrent = new ListNode(remnant);
        } else {
            if(remnant != 0) {
                nodeCurrent.next = new ListNode(remnant);
            }
        }

        return start;
    }
}
