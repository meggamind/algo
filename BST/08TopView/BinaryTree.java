import java.util.*;

// Now all we need to do the level order traversal just to ensure that we will
// visit the top most node at level before we visit any other node at that level.
class Node {
    int data;
    Node left, right;
    Node(int d ) {
      data = d;
      left = right = null;
    }
}

class QItem {
  Node node;
  int height;
  QItem(Node n, int h) {
    node = n;
    height = h;
  }
}

class BinaryTree {
  Node root = null;

  TreeMap<Integer, Integer> ht = new TreeMap<>();;

  void printTopView() {
    Queue<QItem> queue = new LinkedList<QItem>();
    queue.add(new QItem(root, 0));

    while(!queue.isEmpty()) {
      QItem item = queue.remove();
      int level = item.height;
      Node n = item.node;

      if (ht.containsKey(level)) {
      } else {
        System.out.println(n.data + " ");
        ht.put(level, n.data);
      }

      if (n.left != null ) {
        queue.add(new QItem(n.left, level - 1));
      }

      if (n.right != null ) {
        queue.add(new QItem(n.right, level + 1));
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
