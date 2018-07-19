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

  void printLevelOrder() {
      Queue<Node> queue = new LinkedList<Node>();
      queue.add(root);
      while(!queue.isEmpty()) {
          Node tempNode = queue.poll();
          System.out.println(tempNode.data + " ");

          if (tempNode.left != null){
              queue.add(tempNode.left);
          }
          if (tempNode.right != null) {
              queue.add(tempNode.right);
          }
      }
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.right.right = new Node(5);
    tree.printLevelOrder();
  }
}
