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

    int getMinDepth(){
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()) {
            Node tempNode = queue.poll();
            if (tempNode.left == null && tempNode.right == null) {
                return depth;
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
            depth++;
        }
        return 0;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("min Depth: " + tree.getMinDepth());
    }
}
