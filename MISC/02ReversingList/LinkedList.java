class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
    next = null;
  }
}

class LinkedList {
  Node head = null;

  void print(Node node) {
    while (node != null) {
      System.out.print(node.val + " ");
      node = node.next;
    }
    System.out.println();
  }

  Node reverse(Node node) {
    return reverseRec(node, null);
  }

  Node reverseRec(Node curr, Node prev) {
    if (curr == null) {
      return prev;
    }
    Node next = curr.next;
    curr.next = prev;
    return reverseRec(next, curr);
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.head = new Node(85);
    list.head.next = new Node(15);
    list.head.next.next = new Node(4);
    list.head.next.next.next = new Node(20);

    list.print(list.head);
    Node newRev = list.reverse(list.head);
    list.print(newRev);

  }
}
