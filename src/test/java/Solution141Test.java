import org.junit.Test;

import static org.junit.Assert.*;

public class Solution141Test {

    @Test
    public void hasCycle() {

        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);
        ListNode l13 = new ListNode(5);

        l1.next = l11;
        l11.next = l12;
        l12.next = l13;
        l13.next = l12;

        Solution141 solution141 = new Solution141();
        boolean output = solution141.hasCycle(l1);
        System.out.println(output);
    }
}