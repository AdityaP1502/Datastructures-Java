package LinkedList;

public class LinkedList {
  private boolean empty;
  private Node head;
  private Node tail;
  private int length = 0;

  public LinkedList() {
    empty = true;
  }

  public LinkedList(int value) {
    empty = false;

    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;

    length++;
  }

  public LinkedList(int arr[]) {
    empty = false;
  }

  public boolean isEmpty() {
    return empty;
  }

  public void insert(int value, int idx) throws IndexOutOfBoundsException{
    if (idx > length - 1 || idx < -1) {
      throw new IndexOutOfBoundsException("Non valid insert position");
    }

    length++;
    Node newNode = new Node(value);

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

    int pos = 0;
    Node currNode = head;
    while (pos < idx - 1) {
      pos++;
      currNode = head.getNext(); // Read node at idx = pos
    }

    // Exit currNode at pos = idx - 1
    // Insert new node in between idx - 1 and idx
    newNode.setNext(currNode.getNext());
    currNode.setNext(newNode);
  }

  public int pop(int idx) {
    if (idx > length - 1 || idx < 0) {
      throw new IndexOutOfBoundsException("Non valid insert position");
    }

    // Delete head 
    Node temp;

    if (idx == 0) {
      temp = head;
      head = head.getNext();
      return temp.getVal();
    }

    int pos = 0;
    Node currNode = head;

    while (pos < idx - 1) {
      pos++;
      currNode = currNode.getNext();
    }

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
    Node currNode = head;
    while (currNode != null) {
      System.out.println(currNode.getVal());
      currNode = currNode.getNext();
    }
  }
}
