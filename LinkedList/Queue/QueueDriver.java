package LinkedList.Queue;

public class QueueDriver {
  public static void main(String[] args) {
    Queue queue1 = new Queue(3);
    queue1.insert(1);
    queue1.insert(4);
    queue1.insert(6);
    queue1.print();
    System.out.println(2);
  }
}
