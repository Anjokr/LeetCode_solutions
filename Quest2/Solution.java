public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remnant = 0;
        int l1Size = 0;
        int l2Size = 0;

        // initializing new linkedList to return
        ListNode nodeCurrent = null;
        ListNode start = nodeCurrent;

        while (l1.next != null || l2.next != null) {
            // sum of unit value
            int total = 0;
            if (l1.next == null) {
                total = 0 + l2.val + remnant;
                l2Size++;
                l2 = l2.next;
            } else if (l2.next == null) {
                total = l1.val + 0 + remnant;
                l1Size++;
                l1 = l1.next;
            } else {
                total = l1.val + l2.val + remnant;
                l1Size++;
                l2Size++;
                l1 = l1.next;
                l2 = l2.next;
            }

            if (nodeCurrent == null) {
                nodeCurrent = new ListNode(total % 10);
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
