class Node {
    int data;
    Node left, right;
    Node (int d) {
        data = d;
        left = right = null;
    }
}
class BinaryTree {
    Node root;

    int minimumDepth() {
        return minimumDepthRec(root);
    }

    int minimumDepthRec(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return minimumDepthRec(root.right) + 1;
        if (root.right == null)
            return minimumDepthRec(root.left) + 1;

        return (Math.min(
            minimumDepthRec(root.left),
            minimumDepthRec(root.right)) + 1);
     }

     public static void main(String[] args) {
         BinaryTree tree = new BinaryTree();
         tree.root = new Node(1);
         tree.root.left = new Node(2);
         tree.root.right = new Node(3);
         tree.root.left.left = new Node(4);
         tree.root.left.right = new Node(5);

         System.out.println("Min depth of the tree is: " + tree.minimumDepth());

     }
}
