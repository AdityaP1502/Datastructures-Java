package LinkedList;

public class LinkedListDriver {
  public static void main(String[] args) {
    LinkedList<String> lst1 = new LinkedList<String>();
    LinkedList<Integer> lst2 = new LinkedList<Integer>(2);
    
    System.out.println(lst1.isEmpty());
    lst2.insert(3, 0);
    lst2.insert(4, 1);
    lst2.print();
    System.out.println(lst2.pop(0));
    System.out.println(lst2.pop(1));
    lst2.print();
    lst1.insert("Adit", 0);
    lst1.print();
  }
}
