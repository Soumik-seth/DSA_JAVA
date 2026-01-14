package LINKED_LIST.LeetCode;
public class Findthecyclelength {



    //here I am creating a node class
    public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data =data;
        
    }
    }
   // creating head of the linked list
   Node head;
   Node tail;
    // method to add node at the beginning
void insert(int data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        tail = newNode;
        return;
    }

    tail.next = newNode;
    tail = newNode;
}
     
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




    //display method
    void display(){
        Node temNode=head;
        while(temNode != null){
            System.out.print(temNode.data+"->");
            temNode=temNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
     Letcode21 list1=new Letcode21();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        
     
 





    }
}







