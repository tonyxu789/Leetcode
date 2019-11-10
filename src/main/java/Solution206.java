public class Solution206 {

    public ListNode reverseList(ListNode head) {
        ListNode nextP = null;
        ListNode nowP = head;
        while (nowP != null) {
            ListNode tempNext = nowP.next;
            nowP.next = nextP;
            nextP = nowP;
            nowP = tempNext;
        }
        return nextP;
    }



}
