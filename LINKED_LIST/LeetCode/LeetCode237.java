package LINKED_LIST.LeetCode;

public class LeetCode237 {
    public static class Node{
          int data;
          Node next;
          Node(int data){
            this.data=data;
          }
    }
    Node head;
    Node tail;
    //insert
        void  insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }else{
        newNode.next =head;
        head = newNode;

    }}

    // delete
    void delete(int val){
    if(head== null){
        System.out.println("List is empty");
        return;

    }else if(head == tail){
        head =null;
        tail = null;
    }
    
    else{
       Node temp;
       Node n;
       temp= head;
       n=temp.next;
       while(n !=tail){
      if(n.data==val){
      temp.next=n.next;
      return;
      }else{
        temp =n;
        n=n.next;
      }
    
    }
    }}
    //display
    void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }   
    System.out.println("null");
    System.out.println();
}

    public static void main(String[] args) {
        LeetCode237 list= new LeetCode237();
         list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.delete(30);
        list.display();
    }

}
