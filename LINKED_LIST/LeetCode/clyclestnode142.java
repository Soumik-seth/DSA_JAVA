package LINKED_LIST.LeetCode;

public class clyclestnode142 {
        public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data =data;
        
    }
    }

Node head;
Node tail;
public  boolean len(){

    Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;}



        public  boolean cyl(){
            

        }

}
