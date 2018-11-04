import java.util.*;


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
      this.val = val;
      left = right = null;
    }
}

class Solution {
    TreeNode root = null;

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return list;

        while(root != null || !stack.empty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) break;
            root = root.right;
        }
        return root.val;
    }

    public boolean validateBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int oldVal = -1;
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && pre.val >= root.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.root = new TreeNode(8);
        sol.root.left = new TreeNode(3);
        sol.root.right = new TreeNode(10);
        sol.root.right.right = new TreeNode(14);
        sol.root.right.right.left = new TreeNode(13);
        sol.root.left.left = new TreeNode(1);
        sol.root.left.right = new TreeNode(6);
        sol.root.left.right.left = new TreeNode(4);
        sol.root.left.right.right = new TreeNode(7);

        System.out.println("sol: " + Arrays.asList(sol.inOrderTraversal(sol.root)));
        System.out.println("sol: " + sol.kthSmallest(sol.root, 4));
        System.out.println("sol: " + sol.validateBST(sol.root));
    }
}



  //         8
  //    3         10
  // 1     6         14
  //     4   7    13
