package LinkedList.Stack;

public class StackDriver {
  public static void main(String[] args) {
    Stack<String> stack1 = new Stack<String>();
    Stack<Integer> stack2 = new Stack<Integer>(2);

    stack2.insert(2);
    stack2.insert(3);
    stack2.print();
    System.out.println(stack2.pop());
    System.out.println(stack1.isEmpty());
    stack1.insert("Adit");
    stack1.print();
  }
}
