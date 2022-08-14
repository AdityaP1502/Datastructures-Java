package LinkedList.Stack;

import LinkedList.LinkedList;

public class Stack extends LinkedList{
  public Stack() {
    super();
  }

  public Stack(int value) {
    super(value);
  }

  public Stack(int[] arr) {
    for (int i : arr) insert(i);
  }

  public void insert(int value) {
    super.insert(value, 0);
  }

  public int pop() {
    return super.pop(0);
  }
}
