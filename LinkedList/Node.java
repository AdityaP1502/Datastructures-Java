package LinkedList;

public class Node {
  private int val;
  private Node next;

  public Node(int val) {
    this.val = val;
  }

  public Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }

  // Getter and setter
  public Node getNext() {
    return next;
  }

  public int getVal() {
    return val;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setVal(int val) {
    this.val = val;
  }
}
