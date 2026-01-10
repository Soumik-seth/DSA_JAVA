package LINKED_LIST;
public class DeleteInCirculerLL {
    

public static class Node{
    int data;
    Node next;
   
    Node(int data){
     this.data=data;
    }
}

Node head;
Node tail;
void insert(int data){
Node newNode=new Node(data);
if(head == null){
    head=newNode;
    tail=newNode;
    return;
}else{
    tail.next=newNode;
    newNode.next=head;
    tail=newNode;
}

}
/// for delete any node 
void Delete(int val){
    if(head == null){
        System.out.println("List is empty");
        return;
    }else if(head == tail){
        head =null;
        tail= null;
        return;
    }else{
     Node temp;
     Node n;
      temp=head;
      n=temp.next;
      while(n != head){
        if(n.data == val){
            temp.next=n.next;
            return;
        }else{
            temp=n;
            n=n.next;
        }
      }
    }

}

void display(){
    Node temp=head;
    do{
        if(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }while(temp!=head);
  System.out.println();
}

public static void main(String[] args) {
    DeleteInCirculerLL list=new DeleteInCirculerLL();
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);
    list.display();
    list.Delete(20);
    list.display();
}

}
