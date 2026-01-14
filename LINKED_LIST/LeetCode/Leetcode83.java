package LINKED_LIST.LeetCode;

public class Leetcode83 {


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
    void  insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next =head;
        head = newNode;

    }



// remove duplicate from sorted ll 

public  void sorted(){
    Node temp=head;
    if(temp==null){
        System.out.println("List is empty");
    }
    else{
        while(temp.next !=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
    }

}

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
     Leetcode83 list=new Leetcode83();
        list.insert(10);
        list.insert(10);
        list.insert(30);
        list.insert(40);

        list.display();
        list.sorted();
        list.display();
    }
}



