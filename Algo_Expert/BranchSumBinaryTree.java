package Algo_Expert;

import java.util.ArrayList;

public class BranchSumBinaryTree {

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

    public static void inorderTraversal(Node root) {
      if (root == null) {
        return;
      }
      inorderTraversal(root.left);
      System.out.println(root.data + " ");
      inorderTraversal(root.right);
    }

    public static void branchSum(Node root, ArrayList<Integer> list) {

      branchSumHelper(root, 0, list);
      System.out.println(list);
    }

    public static void branchSumHelper(Node root, int runningSum, ArrayList<Integer> sumList) {
      if (root == null)
        return;

      runningSum += root.data;
      if (root.left == null && root.right == null) {
        sumList.add(runningSum);
        return;
      }
      branchSumHelper(root.left, runningSum, sumList);
      branchSumHelper(root.right, runningSum, sumList);

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

      System.out.println("Printing a Root to Leaf Path in BS Tree  ");
      branchSum(root, new ArrayList<Integer>());

    }

  }
}