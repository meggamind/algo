import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTree {
    Node root = null;

    void printBottomView() {
        printBottomViewRec(root);
    }

    void printBottomViewRec(Node root) {
        if (root == null) return;
        printBottomViewRec(root.left);
        printBottomViewRec(root.right);
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        tree.printBottomView();
    }
}



//      20
//   8      22
//  5  3   4  25
//   10 14
