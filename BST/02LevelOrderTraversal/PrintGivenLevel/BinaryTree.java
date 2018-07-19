import java.util.*;

class Node {
  int data;
  Node left, right;
  Node(int d) {
    data = d;
    right = left = null;
  }
}

class BinaryTree {
  Node root = null;

  int getHeight() {
    return getHeightRec(root);
  }

  int getHeightRec(Node root) {
    if (root == null) {
      return 0;
    }
    int lHeight = getHeightRec(root.left);
    int rHeight = getHeightRec(root.right);
    return (Math.max(lHeight, rHeight) + 1);
  }

  void printLevelOrder() {
    int h = getHeight();
    for (int i = 0; i < h; i++) {
      printGivenLevel(root, i);
    }
  }

  void printGivenLevel(Node root, int level) {
    if(root == null) {
      return;
    }
    if (level == 0) {
      System.out.print(root.data + " ");
    } else if (level > 0) {
      printGivenLevel(root.left, level - 1);
      printGivenLevel(root.right, level - 1);
    }
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    System.out.println("Height: " + tree.getHeight());
    tree.printLevelOrder();
  }
}
