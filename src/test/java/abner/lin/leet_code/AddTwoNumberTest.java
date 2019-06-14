package abner.lin.leet_code;

import abner.lin.leet_code.add_two_number.ListNode;
import abner.lin.leet_code.add_two_number.Solution;
import junit.framework.TestCase;

public class AddTwoNumberTest extends TestCase {

    public void testA() {
        final ListNode l1 = new ListNode(2);
        final ListNode l2 = new ListNode(5);
        {
            final ListNode second = new ListNode(4);
            final ListNode third = new ListNode(3);
            l1.next = second;
            second.next = third;
        }
        {
            final ListNode second = new ListNode(6);
            final ListNode third = new ListNode(4);
            l2.next = second;
            second.next = third;
        }
        final ListNode result = Solution.getInstance().addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    public void testB() {
        final ListNode l1 = new ListNode(1);
        final ListNode l2 = new ListNode(0);
        {
            final ListNode second = new ListNode(8);
            l1.next = second;
        }

        final ListNode result = Solution.getInstance().addTwoNumbers(l1, l2);
        assertEquals(1, result.val);
        assertEquals(8, result.next.val);
    }

    public void testC() {
        final ListNode l1 = new ListNode(9);
        final ListNode l2 = new ListNode(0);
        {
            final ListNode second = new ListNode(1);
            l1.next = second;
            final ListNode third = new ListNode(6);
            second.next = third;
        }

        final ListNode result = Solution.getInstance().addTwoNumbers(l1, l2);
        assertEquals(9, result.val);
        assertEquals(1, result.next.val);
        assertEquals(6, result.next.next.val);
    }

    public void testD() {
        final ListNode l1 = new ListNode(9);
        final ListNode l2 = new ListNode(1);
        {
            final ListNode second = new ListNode(9);
            l1.next = second;
        }

        final ListNode result = Solution.getInstance().addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
    }
}
