package LinkedList.Stack;

import LinkedList.LinkedList;

public class Stack<T> extends LinkedList<T>{
  public Stack() {
    super();
  }

  public Stack(T value) {
    super(value);
  }

  public Stack(T[] arr) {
    for (T i : arr) insert(i);
  }

  public void insert(T value) {
    super.insert(value, 0);
  }

  public T pop() {
    return super.pop(0);
  }

  public T peek() {
    return getElement(0).getVal();
  }
}
