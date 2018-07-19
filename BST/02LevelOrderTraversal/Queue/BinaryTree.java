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

  

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.right.right = new Node(5);
  }
}
