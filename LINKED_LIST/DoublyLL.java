package LINKED_LIST;

public class DoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

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

    void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }
    // prevoius node print karne ke liye
    void displayReverse() {
    Node tempNode = tail;
    System.out.print("NULL");
    while (tempNode != null) {
        System.out.print("<-" + tempNode.data);
        tempNode = tempNode.prev;
    }
    System.out.println();
}

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
        list.displayReverse();
    }
}
