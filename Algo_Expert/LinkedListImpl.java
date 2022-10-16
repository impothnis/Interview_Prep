package Algo_Expert;

public class LinkedListImpl {

  int size;

  LinkedListImpl() {
    this.size = 0;
  }

  Node head;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  // Add First
  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;

  }

  // Add Last
  public void addLast(int data) {
    // Create New Node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = newNode;
      return;
    }

    Node currentNode = head;
    // Travese until you find node.next = null
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }

    currentNode.next = newNode;
  }

  public void printList() {
    if (head == null) {
      System.out.print("List is empty");
      return;
    }

    Node currentNode = head;
    // Travese until you find last Node
    while (currentNode != null) {
      System.out.print(currentNode.data + " -> ");
      currentNode = currentNode.next;
    }
    System.out.print("NULL ");
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.print("List is empty");
      return;
    }

    head = head.next;
    size--;
  }

  public void deleteLast() {
    if (head == null) {
      System.out.print("List is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
    }
    Node secondLastNode = head;
    Node lastNode = head.next;
    // Travese until you find last Node
    while (lastNode.next != null) {
      lastNode.next = lastNode.next;
      secondLastNode = secondLastNode.next;
    }

    secondLastNode.next = null;

  }

  // O(n) || O(1)
  public void removeDuplicates() {

    Node currentNode = head;
    while (currentNode != null) {
      Node nextDistinctNode = currentNode.next;
      while (nextDistinctNode != null && currentNode.data == nextDistinctNode.data) {
        nextDistinctNode = nextDistinctNode.next;
      }
      currentNode.next = nextDistinctNode;
      currentNode = nextDistinctNode;
    }

  }

  public static void main(String[] args) {
    LinkedListImpl ll = new LinkedListImpl();

    ll.addFirst(6);
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(4);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(1);
    ll.addFirst(1);
    ll.addFirst(1);
    ll.addFirst(1);
    ll.printList();
    ll.removeDuplicates();
    System.out.println("After removing duplicates");
    ll.printList();

  }

}
