package abner.lin.leet_code.add_two_number;

/**
 * @author ShaoYang.Lin
 * @date 2017-12-19
 * @url https://leetcode.com/problems/add-two-numbers/description/
 */
public class Solution {

    public static Solution getInstance() {
        return new Solution();
    }

    private int add(ListNode a, ListNode b) {
        final int aNumber = a != null ? a.val : 0;
        final int bNumber = b != null ? b.val : 0;
        return aNumber + bNumber;
    }

    private void iteratorNode(ListNode node) {
        node.val %= 10;
        if (node.next != null) {
            node.next.val += 1;
            if (node.next.val >= 10) {
                iteratorNode(node.next);
            }
        } else {
            node.next = new ListNode(1);
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode currentNode = new ListNode(add(l1, l2));

        final ListNode tmpL1 = l1 != null ? l1.next : null;
        final ListNode tmpL2 = l2 != null ? l2.next : null;

        if (tmpL1 != null || tmpL2 != null) {
            currentNode.next = addTwoNumbers(tmpL1, tmpL2);
        }

        if (currentNode.val >= 10) {
            iteratorNode(currentNode);
        }

        return currentNode;
    }
}
