import org.junit.Test;

import static org.junit.Assert.*;

public class Solution21Test {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);

        ListNode l2 = new ListNode(2);
        ListNode l21 = new ListNode(4);

        l1.next = l11;
        l11.next = l12;

        l2.next = l21;

        Solution21 solution21 = new Solution21();
        ListNode listNode = solution21.mergeTwoLists(l1, l2);
        ListNode resultNode = listNode;
        while (resultNode!=null){
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }

    }

    @Test
    public void mergeTwoLists2() {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);

        ListNode l2 = new ListNode(2);
        ListNode l21 = new ListNode(4);

        l1.next = l11;
        l11.next = l12;

        l2.next = l21;

        Solution21 solution21 = new Solution21();
        ListNode listNode = solution21.mergeTwoLists(l1, l2);
        ListNode resultNode = listNode;
        while (resultNode!=null){
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }

    }
}