public class sp {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    // insert
    node head;
  
    void insert(int data){
    node newNode=new node(data);
  if(head==null){
  head=newNode;
  return;
  }
    node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
}
void display(){
    node temp=head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("NULL");
}

    public static void main(String[] args) {
        sp list=new sp();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

    }
}
