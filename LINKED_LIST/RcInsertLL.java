
package LINKED_LIST;

public class RcInsertLL {

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

//Recursive insert node 
public  void he(int val,int indx){
    head=rcll(head, val, indx);
}

public Node  rcll(Node node,int val,int indx){
     if(indx == 0){
        Node temp=new Node(val);
        temp.next=node;
        return temp;

     }
    node.next=rcll(node.next,val,indx-1);
    return node;

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
     RcInsertLL list=new RcInsertLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
        list.he(100,2);
        list.display();
    }
}


