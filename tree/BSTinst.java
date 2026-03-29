package tree;

public class BSTinst {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        
        // Update height after insertion
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    // Check if the tree is balanced
    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 
                && isBalanced(node.left) 
                && isBalanced(node.right);
    }

    // --- NEW ADDITIONS ---

    // Search for a value
    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {
        if (node == null) return false;
        if (node.value == value) return true;
        
        return value < node.value 
            ? search(node.left, value) 
            : search(node.right, value);
    }

    // In-order Traversal (Gives sorted output for BST)
    public void inOrder() {
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    // Display with Indentation
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + "-> " + node.value);
        display(node.left, indent + "   l");
        display(node.right, indent + "   r");
    }

    // Main method for testing
    public static void main(String[] args) {
        BSTinst tree = new BSTinst();
        int[] nums = { 15, 10, 20, 5, 12, 18, 25 };

        for (int num : nums) {
            tree.insert(num);
        }

        System.out.println("Tree Structure:");
        tree.display();
        
        tree.inOrder();
        
        System.out.println("Is Balanced? " + tree.isBalanced());
        System.out.println("Contains 12? " + tree.search(12));
        System.out.println("Contains 100? " + tree.search(100));
    }
}