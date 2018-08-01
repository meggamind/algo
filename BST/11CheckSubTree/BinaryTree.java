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

  boolean areIndenical(Node root1, Node root2) {
    if(root1 == null && root2 == null) return true;
    if(root1 == null || root2 == null) return false;

    return (root1.data == root2.data
            && areIndenical(root1.left, root2.left)
            && areIndenical(root1.right, root2.right)
    );
  }

  boolean isSubTree(Node n1, Node n2) {
    if (n1 == null) return false;
    if (n2 == null) return true;

    if(areIndenical(n1, n2)) return true;

    return isSubTree(n1.left, n2) || isSubTree(n1.right, n2);
  }


  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    BinaryTree tree1 = new BinaryTree();
    tree1.root = new Node(26);
    tree1.root.right = new Node(3);
    tree1.root.right.right = new Node(3);
    tree1.root.left = new Node(10);
    tree1.root.left.left = new Node(4);
    tree1.root.left.left.right = new Node(30);
    tree1.root.left.right = new Node(6);


    BinaryTree tree2 = new BinaryTree();
    tree2.root = new Node(10);
    tree2.root.right = new Node(6);
    tree2.root.left = new Node(4);
    tree2.root.left.right = new Node(30);

    System.out.println("Subtree: " + tree.isSubTree(tree1.root, tree2.root));
  }
}
