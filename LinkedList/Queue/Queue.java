package LinkedList.Queue;
import LinkedList.LinkedList;
public class Queue<T> extends LinkedList<T>{
  public Queue() {
    super();
  }

  public Queue(T value) {
    super(value);

  }

  public Queue(T[] arr) {
    for (T i : arr) insert(i);
  }

  public void insert(T value) {
    super.insert(value, -1);
  }

  public T pop() {
    return super.pop(0);
  }

  public T peek() {
    return getElement(0).getVal();
  }
}
