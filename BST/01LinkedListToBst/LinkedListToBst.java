class LinkedListToBst {

    static LNode head;

    class LNode {
        int data;
        LNode next, prev;

        Lnode(int d) {
            data = d;
            next = prev = null;
        }
    }

    /* A Binary Tree Node */
    class TNode {
        int data;
        Tnode left, right;

        TNode(int d) {
            data = d;
            left = right = null;
        }
    }

    TNode sortedListtoBST() {
        int n = coutNodes(head);

        return sortedListToBstRec(n);
    }

    TNode sortedListToBstRec(int n) {
        if (n  <= 0) {
            return null;
        }

        // Recursively constructs the left subtree
        TNode left = new sortedListtoBST(n / 2);
        /* head_ref noew refers to moddle node,
        make middle node as root of BST
        */
        Tnode root = new Tnode(head.data);
        root.left = left;

        head = head.next;
        root.right = sortedListtoBST(n - n/2 -1);
        return root;
    }

    int countNodes(Lnode head) {
        int count = 0;
        Lnode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
