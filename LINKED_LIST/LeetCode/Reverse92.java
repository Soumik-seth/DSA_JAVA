public class Reverse92 {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head == null && head.next ==null){
                return head;
            }
        ListNode temp=head;
        while(temp.val!=left){
            temp=temp.next;
        };
        ListNode firstNode=temp;

        ListNode prev =null;
        ListNode pre=head;
        ListNode next;
        while(pre.val != left){
            prev=pre;
            pre=pre.next;
            next=pre;
        }
        ListNode lastNode=pre;
        while(pre !=right){
            next=pre.next;
            pre.next=prev;
            prev=pre;
            pre=next;
        }
        firstNode.next=prev;
        lastNode.next=pre;
        return head;
        
    }
}
