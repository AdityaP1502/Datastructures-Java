package LinkedList.Stack;

public class StackDriver {
  public static void main(String[] args) {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack(2);

    stack2.insert(2);
    stack2.insert(3);
    stack2.print();
    System.out.println(stack2.pop());
    System.out.println(stack1.isEmpty());
  }
}
