import org.junit.Test;

import static org.junit.Assert.*;

public class Solution83Test {

    @Test
    public void deleteDuplicates() {

        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);
        ListNode l13 = new ListNode(5);

        l1.next = l11;
        l11.next = l12;
        l12.next = l13;

        Solution83 solution83 = new Solution83();
        ListNode listNode = solution83.deleteDuplicates(l1);
        ListNode resultNode = listNode;
        while (resultNode!=null){
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }
    }
}