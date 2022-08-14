package LinkedList;

public class LinkedListDriver {
  public static void main(String[] args) {
    LinkedList lst1 = new LinkedList();
    LinkedList lst2 = new LinkedList(2);
    
    System.out.println(lst1.isEmpty());
    lst2.insert(3, 0);
    lst2.insert(4, 1);
    lst2.print();
    System.out.println(lst2.pop(0));
    System.out.println(lst2.pop(1));
    lst2.print();
  }
}
