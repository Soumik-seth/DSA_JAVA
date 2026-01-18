
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
     // finding the lenght  of cycle of  a linked list 
public  int len(Node head){

    Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
            Node temp =slow;
            int length=0;
           do{
           temp=temp.next;
        length++;
           }while(temp != slow);
   return length;
            }

        }
        return 0;}


///find the the where cycle is starting 

     public Node cyl(Node head){
  int length=0;
   Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
           length=len(slow);
           break;
            }

        }
        // find start 
        Node f=head;
        Node s=head;
        while(length >0){
            s=s.next;
            length --;
        }
        while(f != s){
            f=f.next;
            s=s.next;

        }
        return f;
       

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
     Letcode21 list1=new Letcode21();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        
     
 





    }
}







