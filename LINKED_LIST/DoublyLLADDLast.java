package LINKED_LIST;

public class DoublyLLADDLast {
  
    // Node class
    public static class Node {
        int data;
        Node next;
        Node prev;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    // Head and tail of the linked list
    Node head;
    Node tail;
    
    // Method to add node at the beginning
 void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    // Method to add node at the end
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {  // List is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev =tail;
            tail = newNode;
        } 
    }
    
    // Display method
    void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        operationtail list = new operationtail();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        
        list.display();  // Output: 40->30->20->10->NULL
        
        list.insertAtTail(110);
        list.display();  // Output: 40->30->20->10->110->NULL
    }
}

