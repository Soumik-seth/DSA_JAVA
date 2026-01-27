public class reorder143 {
    public static void main(String[] args) {
        /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // mid
    public  ListNode mid( ListNode head){
         ListNode fast =head;
          ListNode slow =head;
          while (fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
          }
          return slow;
    }
    // reverse
        public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode pre=head;
        ListNode next;
        while( pre != null){
            next=pre.next;
            pre.next=prev;
            prev=pre;
            pre=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode hf=head;
        ListNode mid=mid(head);
        ListNode hs=reverse(mid);
        while(hf !=null && hs !=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null){
            hf.next=null;
            
        }

    }
}
    }
}
