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

  public Node findLca(int n1, int n2) {
    return findLcaRec(root, n1, n2);
  }

  public Node findLcaRec(Node root, int n1, int n2) {
    while (root != null) {
      if (n1 < root.data && n2 < root.data ) {
        root = root.left;
      }
      else if (n1 > root.data && n2 > root.data) {
        root = root.right;
      }
      else {
        break;
      }
    }
    return root;
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(20);
    tree.root.left = new Node(8);
    tree.root.right = new Node(22);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(12);
    tree.root.left.right.left = new Node(10);
    tree.root.left.right.right = new Node(14);

    Node nodeLCA = tree.findLca(10, 4);
    System.out.println("LCA: " + nodeLCA.data);

    Node nodeLCA2 = tree.findLca(10, 14);
    System.out.println("LCA: " + nodeLCA2.data);

    Node nodeLCA3 = tree.findLca(14, 8);
    System.out.println("LCA: " + nodeLCA3.data);

    Node nodeLCA4 = tree.findLca(10, 22);
    System.out.println("LCA: " + nodeLCA4.data);
  }
}
