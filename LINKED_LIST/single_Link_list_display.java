package LINKED_LIST;

public class single_Link_list_display {
public static class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
  
    }


}
Node head ;
void insert(int data){
    Node newNode = new Node(data);
    if(head ==  null){
        head = newNode;
        return;
    }
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
}
void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }   
    System.out.println("null");
}
    public static void main(String[] args) {
        single_Link_list_display list = new single_Link_list_display();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }

}