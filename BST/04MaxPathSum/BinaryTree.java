class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Res {
    int val;
}

class BinaryTree {
    Node root = null;
    int val = Integer.MIN_VALUE;

    int findMaxSum() {
        return findMaxSum(root);
    }

    int findMaxSum(Node root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(root, res);
        return res.val;
    }

    /*
    10 ->   lMax = findMaxSum(2, 0)
    2  ->   lMax = findMaxSum(20, 0) = 20
            rMax = findMaxSum(1, 0) = 1
    20  ->  lMax = 0
            rMax = 0
            max_single = 20
    */

    int findMaxUtil(Node node, Res res) {
        if (node == null) return 0;
        int l = findMaxUtil(node.left, res);
        int r = findMaxUtil(node.right, res);

        int max_single = Math.max(Math.max(l, r) + node.data, node.data);
        int max_top = Math.max(max_single, l + r + node.data);
        System.out.println("max_single: " + max_single + ", max_top: " + max_top);
        res.val = Math.max(res.val, max_top);
        return max_single;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
        System.out.println("maximum path sum is: " + tree.findMaxSum());
    }
}

//       10
//   2     10
// 20  1     -25
//          3   4
