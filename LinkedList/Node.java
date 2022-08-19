package LinkedList;

public class Node<T> {
  private T val;
  private Node<T> next;

  public Node(T val) {
    this.val = val;
  }

  public Node(T val, Node<T> next) {
    this.val = val;
    this.next = next;
  }

  // Getter and setter
  public Node<T> getNext() {
    return next;
  }

  public T getVal() {
    return val;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public void setVal(T val) {
    this.val = val;
  }
}
