package tree;

public class BSTinst {
    public class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;

   public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void insert(int value){
        root=insert(root,value);
    }
    private Node insert(Node node,int value){
    if(node == null){
        node= new Node(value);
        return node;
    }
    if(value <node.value){
        node.left=insert(node.left,value);

    }
    if(value > node.value){
        node.right=insert(node.right,value);
    }
    node.height=1+Math.max(height(node.left),height(node.right));
    return node;
}

// for baleced or not
public boolean isBalanced(){
   return isBalanced(root);
}
private boolean isBalanced(Node node){
 if(node == null){
        return true;
    }
    return  Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left)&& isBalanced(node.right);
}

//display
public void display(){
    display(root,"Root node : ");
}

private void display(Node node,String indent){
    if(node == null){
        return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
}