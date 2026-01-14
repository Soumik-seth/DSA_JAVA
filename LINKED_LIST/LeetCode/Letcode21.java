package LINKED_LIST.LeetCode;

public class Letcode21 {


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




// merge two sorted array

public static Letcode21 marge(Letcode21 List1,Letcode21 List2){
    Node f=List1.head;
    Node s=List2.head;
    Letcode21 ans =new Letcode21();
    while(f !=null &&  s !=null){
        if(f.data<s.data){
        ans.insert(f.data);
        f=f.next;}else{
            ans.insert(s.data);
            s=s.next;
        }
    }

    while(f!=null){
        ans.insert(f.data);
        f=f.next;
    }

        while(s!=null){
        ans.insert(s.data);
        s=s.next;
    }
    return ans ;
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
        
     
     Letcode21 list2=new Letcode21();
           list2.insert(1);
        list2.insert(2);
                list2.insert(9);
                        list2.insert(14);



                       Letcode21 ans= Letcode21.marge(list1,list2);
                 
                   ans.display();





    }
}





