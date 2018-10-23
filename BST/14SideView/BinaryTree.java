import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

public class BinaryTree {
  TreeNode root;

  int height(TreeNode root) {
    if (root == null) return 0;
    return Math.max(height(root.left), height(root.right)) + 1;
  }

  void printLevelOrder(TreeNode root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      printGivenLevel(root, i);
      list.add(stack.pop());
    }
  }

  List<Integer> list = new LinkedList();
  Stack<Integer> stack = new Stack();

  void printGivenLevel(TreeNode root, int level) {
    if (root == null) return;
    if (level == 1) {
      System.out.println("val: " + root.val);
      stack.push(root.val);
    }
    else if (level > 1) {
      printGivenLevel(root.left, level - 1);
      printGivenLevel(root.right, level - 1);
    }
  }

  public List<Integer> rightSideView(TreeNode root) {

    printLevelOrder(root);
    return list;


  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.left.right = new TreeNode(5);
    tree.root.right = new TreeNode(3);
    tree.root.right.right = new TreeNode(4);

    System.out.println("list: " + Arrays.asList(tree.rightSideView(tree.root)));
  }
}
