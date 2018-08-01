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


  Node removeNodesNotInPathGreaterThan(int k) {
    return removeRec(root, k);
  }

  Node removeRec(Node root, int sum) {
    if (root == null) return null;

    root.left = removeRec(root.left, sum - root.data);
    root.right = removeRec(root.right, sum - root.data);

    if (root.left == null && root.right == null) {
      if (root.data < sum) {
        root = null;
      }
    }
    return root;
  }

  // for print traversal
  public void print(Node root) {
      if (root == null)
          return;

      print(root.left);
      System.out.print(root.data + " ");
      print(root.right);
  }


  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    tree.root.left.left.left = new Node(8);
    tree.root.left.left.right = new Node(9);
    tree.root.left.right.left = new Node(12);
    tree.root.right.right.left = new Node(10);
    tree.root.right.right.left.right = new Node(11);
    tree.root.left.left.right.left = new Node(13);
    tree.root.left.left.right.right = new Node(14);
    tree.root.left.left.right.right.left = new Node(15);

    Node tempRoot = tree.removeNodesNotInPathGreaterThan(45);
    tree.print(tempRoot);
    System.out.println("");

    BinaryTree tree2 = new BinaryTree();
    tree2.root = new Node(1);
    tree2.root.left = new Node(2);
    tree2.root.right = new Node(3);
    tree2.root.left.left = new Node(7);
    tree2.root.left.right = new Node(8);

    Node tempRoot2 = tree2.removeNodesNotInPathGreaterThan(5);
    tree2.print(tempRoot2);
  }
}
