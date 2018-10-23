class Node {
  int val;
  Node next;
  Node(int val) {
    this.val = val;
    next = null;
  }
}

class LinkedList {


  Node head;

  void printList(Node node) {
    while (node != null) {
      System.out.print(node.val + " ");
      node = node.next;
    }
    System.out.println();
  }

  Node reverse(Node node) {
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null ) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

  Node reverse2(Node node) {
    return reverseRec(node, null);
  }

  Node reverseRec(Node curr, Node prev) {
    if (curr.next == null) {
      head = curr;
      curr.next = prev;
      return head;
    }
    Node next = curr.next;
    curr.next = prev;
    reverseRec(next, curr);
    return head;
  }

  public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.head = new Node(85);
      list.head.next = new Node(15);
      list.head.next.next = new Node(4);
      list.head.next.next.next = new Node(20);

      list.printList(list.head);
      Node revHead = list.reverse(list.head);
      list.printList(revHead);

      Node node2 = list.reverse2(revHead);
      list.printList(node2);
  }
}
