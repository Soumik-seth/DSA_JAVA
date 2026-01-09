package LINKED_LIST;

public class CirculerLinkList {
    Node head;
    Node tail;
    public static class Node{
     int data;
     Node next;
     Node(int data){
        this.data=data;
     }

    }

    void insert(int data){
        Node newNode= new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }
    void display(){
        Node temp=head;
 do{
    if(temp !=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
 }while(temp!=head);

    }
    public static void main(String[] args) {
        CirculerLinkList list=new CirculerLinkList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
