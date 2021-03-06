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

    boolean isFullTree() {
        return isFullTreeRec(root);
    }

    boolean isFullTreeRec(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
            return (isFullTreeRec(root.left) && isFullTreeRec(root.right));
        }
        return false;
    }


    public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      tree.root = new Node(10);
      tree.root.left = new Node(20);
      tree.root.right = new Node(30);
      tree.root.left.right = new Node(40);
      tree.root.left.left = new Node(50);
      tree.root.right.left = new Node(60);
      tree.root.left.left.left = new Node(80);
      tree.root.right.right = new Node(70);
      tree.root.left.left.right = new Node(90);
      tree.root.left.right.left = new Node(80);
      tree.root.left.right.right = new Node(90);
      tree.root.right.left.left = new Node(80);
      tree.root.right.left.right = new Node(90);
      tree.root.right.right.left = new Node(80);
      tree.root.right.right.right = new Node(90);
      System.out.println("Tree: " + tree.isFullTree());
    }
}
