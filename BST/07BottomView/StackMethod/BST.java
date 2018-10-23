import java.util.*;

class Node {
  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
    right = left = null;
  }
}


class BST {

  Node root = null;

  void printBottomView() {
      Stack<Node> s1 = new Stack<>();
      s1.push(root);
      while(!s1.empty())
        System.out.println(dfs(s1));

  }

  int dfs(Stack<Node> s) {
    while (true) {
      Node node = s.pop();
      if (node.right != null) s.push(node.right);
      if (node.left != null) s.push(node.left);
      if (node.right == null && node.left == null) return node.data;
    }
  }


  public static void main(String[] args) {
    BST tree = new BST();
    tree.root = new Node(20);
    tree.root.left = new Node(8);
    tree.root.right = new Node(22);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(3);
    tree.root.right.left = new Node(4);
    tree.root.right.right = new Node(25);
    tree.root.left.right.left = new Node(10);
    tree.root.left.right.right = new Node(14);

    tree.printBottomView();
  }
}

//      20
//   8      22
//  5  3   4  25
//   10 14

//
//
// s1 - 20
//
// s1 - null
// s - 3, 22
