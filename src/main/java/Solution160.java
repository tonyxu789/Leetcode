public class Solution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode current = headA;
        while (current != null){
            ListNode b = headB;
            while (b != null){
                if(current == b){
                    return current;
                }else{
                    b = b.next;
                }
            }
            current = current.next;
        }

        return null;
    }
}
