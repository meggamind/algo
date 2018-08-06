class Node {
  char data;
  Node left, right;
  Node(char d) {
    data = d;
  }
}

class BinaryTree {
  Node root = null;

  void printInorder() {
    printInorderRec(root);
  }

  void preOder(Node root1, Node root2, int level) {
    if (root1 == null || root2 == null) return;

    if(level%2 == 0) {
      swap(root1, root2);
    }

    preOder(root1.left, root2.right, level+1);
    preOder(root1.right, root2.left, level+1);
  }

  void swap(Node n1, Node n2) {
    char temp = n1.data;
    n1.data = n2.data;
    n2.data = temp;
  }

  void reverseAlternate() {
    preOder(root.left, root.right, 0);
  }

  void printInorderRec(Node root) {
    if (root == null) return;
    printInorderRec(root.left);
    System.out.print(root.data + " ");
    printInorderRec(root.right);
  }

  public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      tree.root = new Node('a');
      tree.root.left = new Node('b');
      tree.root.right = new Node('c');
      tree.root.left.left = new Node('d');
      tree.root.left.right = new Node('e');
      tree.root.right.left = new Node('f');
      tree.root.right.right = new Node('g');
      tree.root.left.left.left = new Node('h');
      tree.root.left.left.right = new Node('i');
      tree.root.left.right.left = new Node('j');
      tree.root.left.right.right = new Node('k');
      tree.root.right.left.left = new Node('l');
      tree.root.right.left.right = new Node('m');
      tree.root.right.right.left = new Node('n');
      tree.root.right.right.right = new Node('o');
      System.out.println("Inorder Traversal of given tree");
      tree.printInorder();
      System.out.println();

      tree.reverseAlternate();

      tree.printInorder();
      System.out.println();
  }
}
