package Algo_Expert;

import java.util.ArrayList;

public class BinarySearchTree {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }

    public static Node insertToTree(Node root, int value) {
      if (root == null) {
        root = new Node(value);
        return root;
      }
      if (root.data > value) {
        // Left Subtree
        root.left = insertToTree(root.left, value);
      } else {
        // Right Subtree
        root.right = insertToTree(root.right, value);
      }
      return root;

    }

    public static boolean search(Node root, int key) {

      if (root == null) {
        return false;
      }
      if (root.data == key) {
        return true;
      }
      if (root.data > key) {
        // Left Subtree
        return search(root.left, key);
      } else {
        return search(root.right, key);
      }

    }

    public static void inorderTraversal(Node root) {
      if (root == null) {
        return;
      }
      inorderTraversal(root.left);
      System.out.println(root.data + " ");
      inorderTraversal(root.right);
    }

    public static Node deleteNode(Node root, int value) {
      if (root == null) {
        return null;
      }
      if (root.data > value) {
        root.left = deleteNode(root.left, value);
      } else if (root.data < value) {
        root.right = deleteNode(root.right, value);
      } else {
        // root.value == value
        // Check if it has child nodes or not
        // Case 1 - Leaf Node or node with no child
        if (root.left == null && root.right == null) {
          return null;
        }
        // case 2 - Node with single child
        if (root.left == null) {
          return root.right;
        }

        if (root.right == null) {
          return root.left;
        }

        // Case 3 - Node with 2 child
        // First find inorder successor
        Node inorderSuccessor = inOrderSuccesor(root.right);
        root.data = inorderSuccessor.data;
        deleteNode(root.right, value);
      }
      return root;
    }

    public static Node inOrderSuccesor(Node root) {
      while (root.left != null) {
        root = root.left;
      }
      return root;
    }

    public static void printInRange(Node root, int x, int y) {
      if (root == null) {
        return;
      }

      if (root.data >= x && root.data <= y) {
        printInRange(root.left, x, y);
        System.out.println(root.data + " ");
        printInRange(root.right, x, y);
      } else if (root.data >= y) {
        printInRange(root.left, x, y);
      } else {
        printInRange(root.right, x, y);

      }

    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> list) {
      // Base Condition
      if (root == null) {
        return;
      }
      // Step 1 : Adding the root
      list.add(root.data);
      // If leaf Node then print the path
      if (root.left == null && root.right == null) {
        printPath(list);
      } else {
        // First Print the left side
        printRootToLeaf(root.left, list);
        // Print the Right side
        printRootToLeaf(root.right, list);
      }
      // Remove the last node from Path List
      list.remove(list.size() - 1);
    }

    private static void printPath(ArrayList<Integer> list) {
      for (Integer integer : list) {
        System.out.print(integer + " ->");

      }
      System.out.println();
    }

    public static void main(String[] args) {
      // int[] values = { 5, 1, 3, 4, 2, 7 };
      int[] values = { 8, 5, 3, 1, 4, 6, 7, 10, 11, 14 };
      Node root = null;
      for (int value : values) {
        root = insertToTree(root, value);
      }
      System.out.println("Inorder Tree traversal ");
      inorderTraversal(root);

      System.out.println("Searching BS Tree  ");
      System.out.println(search(root, 9));

      // System.out.println("Deleting a Node in BS Tree ");
      // deleteNode(root, 4);
      // inorderTraversal(root);

      // System.out.println("Deleting a Node in BS Tree ");
      // deleteNode(root, 1);
      // inorderTraversal(root);

      // System.out.println("Deleting a Node in BS Tree ");
      // deleteNode(root, 5);
      // inorderTraversal(root);

      System.out.println("Printing a Path in BS Tree  ");
      printInRange(root, 1, 5);

      System.out.println("Printing a Root to Leaf Path in BS Tree  ");
      printRootToLeaf(root, new ArrayList<Integer>());

    }

  }
}