class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] one = new int[100];
        int[] two = new int[100];

        // insert node numbers to array
        toList(one, l1);
        toList(two, l2);

        int value1 = mix(one);
        int value2 = mix(two);

        int total = value1 + value2;
        int count = countDigits(total);
        int[] totalDigits = new int[count];
        int indT = 0;
        while (total > 0) {
            totalDigits[indT] = total % 10;
            total /= 10;
            indT++;
        }

        ListNode nodeCurrent = null;
        ListNode start = nodeCurrent;
        for (int i = 0; i < totalDigits.length; i++) {
            if (nodeCurrent == null) {
                nodeCurrent = new ListNode(totalDigits[i]);
                start = nodeCurrent;
            } else {
                nodeCurrent.next = new ListNode(totalDigits[i]);
                nodeCurrent = nodeCurrent.next;
            }
        }
        return start;
    }

    public void toList(int[] array, ListNode linkedNodes) {
        int ind = 0; // list index
        int ind10 = 1; // number index
        ListNode node = linkedNodes;
        while (node.next != null) {
            array[ind] = node.val * ind10;
            ind++;
            ind10 *= 10;
            node = node.next;
        }
        array[ind] = node.val * ind10;
    }

    public int countDigits(int total) {
        if(total == 0) {
            return 1;
        }
        int count = 0;
        while (total != 0) {
            total /= 10;
            count++;
        }
        return count;
    }

    public int mix(int[] one) {
        int sum = 0;
        for (int num : one) {
            sum += num;
        }
        return sum;
    }
}