import org.junit.Test;

import static org.junit.Assert.*;

public class Solution160Test {

    @Test
    public void getIntersectionNode() {

        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);
        ListNode l13 = new ListNode(5);

        l1.next = l11;
        l11.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(3);

        l2.next = l21;
        l21.next = l12;

        Solution160 solution160 = new Solution160();
        ListNode listNode = solution160.getIntersectionNode(l1,l2);
        ListNode resultNode = listNode;
        while (resultNode!=null){
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }
    }
}