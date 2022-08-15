package LinkedList.Queue;
import LinkedList.LinkedList;
public class Queue extends LinkedList{
  public Queue() {
    super();
  }

  public Queue(int value) {
    super(value);
  }

  public Queue(int[] arr) {

  }

  public void insert(int value) {
    super.insert(value, -1);
  }

  public int pop() {
    return super.pop(0);
  }

  public int peek() {
    return getElement(0).getVal();
  }
}
