import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
    }
}

class QItem {
    Node node;
    int height;
    QItem(Node n, int d) {
        node = n;
        height = d;
    }
}

class BinaryTree {
    Node root = null;

    void printTopView() {
        if (root == null) return;

        HashSet<Integer> set = new HashSet<>();
        Queue<QItem> Q = new LinkedList<QItem>();
        Q.add(new QItem(root, 0));

        while (!Q.isEmpty()) {
            // Remove the front item and get it's details
            QItem qi = Q.remove();
            int height = qi.height;
            Node n = qi.node;

            // If this is the first node at its horizontal distance,
            // then this node is in top view
            if (!set.contains(height)) {
                set.add(height);
                System.out.println(n.data + " ");
            }

            // Enqueue left and right children of current node
            if (n.left != null) {
                Q.add(new QItem(n.left, height - 1));
            }
            if (n.right != null) {
                Q.add(new QItem(n.right, height + 1));
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        tree.printTopView();
    }
}
