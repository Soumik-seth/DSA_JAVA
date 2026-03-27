public class BST{

public class Node{
    int data;
    int height;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }

 public int getvalue(){
        return data;
    }
}
public Node root;
public int  height(Node node){
    if(node == null){
        return -1;
    }
    return node.height;
}

public boolean isEmpty(){
    return root == null;}
    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node,String details){
        if(node== null){
            return;
        }
        System.out.println(details+node.getvalue());
        display(node.left,"Left child of"+node.getvalue()+":");
        display(node.right,"right child of"+node.getvalue()+":");
    }


}