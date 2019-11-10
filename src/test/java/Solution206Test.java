import org.junit.Test;

import static org.junit.Assert.*;

public class Solution206Test {

    @Test
    public void reverseList() {


        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);
        ListNode l13 = new ListNode(5);

        l1.next = l11;
        l11.next = l12;
        l12.next = l13;

        Solution206 solution206 = new Solution206();
        ListNode listNode = solution206.reverseList(l1);
        ListNode resultNode = listNode;
        while (resultNode!=null){
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }
    }

}