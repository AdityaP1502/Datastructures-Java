package LinkedList;

public class LinkedList<T> {
  private boolean empty;
  private Node<T> head;
  private Node<T> tail;
  private int length = 0;

  public LinkedList() {
    empty = true;
  }

  public LinkedList(T value) {
    empty = false;

    Node<T> newNode = new Node<T>(value);
    head = newNode;
    tail = newNode;

    length++;
  }

  public LinkedList(T arr[]) {
    empty = false;
  }

  public boolean isEmpty() {
    return empty;
  }

  public Node<T> getElement(int idx) {
    int pos = 0;
    Node<T> currNode = head;

    while (pos < idx) {
      pos++;
      currNode = currNode.getNext();
    }

    // currNode is the node at index idx
    return currNode;
  }
  public void insert(T value, int idx) throws IndexOutOfBoundsException{
    if (isEmpty()) {
      if (idx != 0) {
        throw new IndexOutOfBoundsException("Non valid insert position. Can only insert at idx = 0 for empty list");
      }
      head = new Node<T>(value);
      return;
    }

    if (idx > length - 1 || idx < -1) {
      throw new IndexOutOfBoundsException("Non valid insert position");
    }

    length++;
    Node<T> newNode = new Node<T>(value);

    // Insert as a new head
    if (idx == 0) {
      newNode.setNext(head);
      head = newNode;
      return;
    }

    // Insert as a new tail
    if (idx == -1) {
      tail.setNext(newNode);
      tail = newNode;
      return;
    }

    Node<T> currNode = getElement(idx - 1);

    // Exit currNode at pos = idx - 1
    // Insert new node in between idx - 1 and idx
    newNode.setNext(currNode.getNext());
    currNode.setNext(newNode);
  }

  public T pop(int idx) {
    if (idx >= length - 1 || idx < 0) {
      throw new IndexOutOfBoundsException("Non valid insert position");
    }

    // Delete head 
    Node<T> temp;

    if (idx == 0) {
      temp = head;
      head = head.getNext();
      return temp.getVal();
    }

    Node<T> currNode = getElement(idx - 1);
    temp = currNode.getNext(); 

    if (idx == length - 1) {
      // If idx == length - 1, then temp = tail
      tail = currNode;
      currNode.setNext(null);
      return temp.getVal();
    }

    currNode.setNext(temp.getNext());
    return temp.getVal();
  }
  
  public void print() {
    Node<T> currNode = head;
    while (currNode != null) {
      System.out.print(currNode.getVal() + " ");
      currNode = currNode.getNext();
    }
    System.out.println("");
  }
}
