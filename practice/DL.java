public class DL {
    public  static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
        }
    }


    Node head;
    // insert 
    public void  insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return;

    }

    //display
    public void display(){
        Node temp=head;
        while (temp.next !=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print(temp.data+"->NULL");
    }

    public static void main(String[] args) {
        DL list=new DL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}
