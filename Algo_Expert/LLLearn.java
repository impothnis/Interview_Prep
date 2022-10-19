package Algo_Expert;

public class LLLearn {
  Node head;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Insert - From Front
  public void inserFromFront(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    } else {
      newNode.next = head;
      head = newNode;
    }

  }

  // Insert - From End

  public void inserAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    } else {
      Node currentNode = head;
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
    }

  }

  // Delete at the start

  public void deleteFromFront() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    } else {
      head = head.next;
    }

  }

  // Delete at the start
  // Insert - From Front
  public void deleteFromEnd() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    } else {
      Node secondLast = head;
      Node last = head.next;
      while (last.next != null) {
        last = last.next;
        secondLast = secondLast.next;
      }
      secondLast.next = null;

    }

  }

  // Delete at the start
  // Insert - From Front
  public void printList() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    } else {
      Node curNode = head;
      while (curNode != null) {
        System.out.println(curNode.data + "->");
        curNode = curNode.next;
      }
    }

  }

  // Delete at the start
  // Insert - From Front
  public void removeDuplicates() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    } else {
      Node curNode = head;
      Node nextDistinctNode = head.next;
      while (nextDistinctNode != null && curNode.data == nextDistinctNode.data) {
        nextDistinctNode = nextDistinctNode.next;
      }
      curNode.next = nextDistinctNode;
      curNode = nextDistinctNode;
    }

  }

}
