import org.junit.Test;

import static org.junit.Assert.*;

public class Solution203Test {

    @Test
    public void removeElements() {

        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);
        ListNode l13 = new ListNode(5);

        l1.next = l11;
        l11.next = l12;
        l12.next = l13;

        Solution203 solution203 = new Solution203();
        ListNode listNode = solution203.removeElements(l1,3);
        ListNode resultNode = listNode;
        while (resultNode!=null){
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }
    }
}