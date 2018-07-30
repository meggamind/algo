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

    boolean canRepresentBST(int pre[], int n) {
        Stack<Integer> s = new Stack<Integer>();
        int root = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // If we find a node who is on right side and smaller than root, return false
            if (pre[i] < root) {
                return false;
            }

            while(!s.empty() && s.peek() < pre[i]) {
                root = s.peek();
                s.pop();
            }
            s.push(pre[i]);
        }
        return true;
    }

    // i = 0
    // pre = 1
    // s = [1]
    // --------
    // i = 1
    // pre = 2
    // 1 < 2
    // root = 2
    // s = [2]
    // --------
    // i = 2;
    // pre = 4
    // 4 < 2
    // 2 < 4
    // root = 4
    // s = [4]
    // --------
    // i = 3
    // pre = 5
    // 5 < 4;
    // 4 < 5
    // root = 4
    // s = [5]
    // --------
    // i = 4
    // pre = 3
    // 3 < 5




    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] pre1 = new int[]{40, 30, 35, 80, 100};
        int n1 = pre1.length;
        int[] pre2 = new int[]{40, 30, 35, 20, 80, 100};
        int n2 = pre2.length;
        int[] pre3 = new int[]{1, 2, 4, 5, 3};
        int n3 = pre3.length;
        System.out.println("pre1: " + tree.canRepresentBST(pre1, n1));
        System.out.println("pre2: " + tree.canRepresentBST(pre2, n2));
        System.out.println("pre3: " + tree.canRepresentBST(pre3, n3));
    }
}
