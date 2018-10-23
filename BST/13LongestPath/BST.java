import java.util.*;

class Node {
  int data;
  Node right;
  Node left;

  public Node(int val) {
    this.data = val;
    right = left = null;
  }
}

class BST {
  Node root = null;

  int maxDepth() {
    return maxDepthRec(root);
  }

  int maxDepthRec(Node root) {
    if (root == null) return 0;
    int lDepth = maxDepthRec(root.left);
    int rDepth = maxDepthRec(root.right);
    return Math.max(lDepth, rDepth) + 1;
  }

  public static void main(String[] args) {
    BST tree = new BST();
    tree.root = new Node(20);
    tree.root.left = new Node(8);
    tree.root.right = new Node(22);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(3);
    tree.root.right.left = new Node(4);
    tree.root.right.right = new Node(25);
    tree.root.left.right.left = new Node(10);
    tree.root.left.right.right = new Node(14);

    tree.findLongestPath();

  }
}
