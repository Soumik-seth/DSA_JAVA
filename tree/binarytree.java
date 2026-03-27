package ee;

import java.util.Scanner;

public class binarytree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        binarytree tree=new binarytree();
        tree.populate(scanner);
        tree.display();
    }

private  static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
private Node root;
public void populate(Scanner scanner){
    System.out.println("Enter the data for root node");
    int  data=scanner.nextInt();
    root=new Node(data);
    populate(scanner,root);
}

private  void populate(Scanner scanner,Node node){
System.out.println("Do you want to enter left child for "+node.data+"true/false");
Boolean leftdata=scanner.nextBoolean();
if(leftdata){
    int data=scanner.nextInt();
    node.left=new Node(data);
    populate(scanner,node.left);
}
//for right data
    System.out.println("Do you want to enter right child for "+node.data+"true/false");
    Boolean rightdata=scanner.nextBoolean();
    if(rightdata){
        int data=scanner.nextInt();
        node.right=new Node(data);
        populate(scanner,node.right);
    }

}
public void display(){
    display(root," ");

}
private void display(Node node,String indent){
    if(node == null){
        return;
    }
    System.out.println(indent + node.data);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
}
}