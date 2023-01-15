package Algo_Expert;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLearn {

  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  // Building a Tree
  public static class BuildTree {
    static int index = -1;

    public static Node buildTree(int[] values) {
      index++;
      if (values[index] == -1) {
        return null;
      }
      Node newNode = new Node(values[index]);
      newNode.left = buildTree(values);
      newNode.right = buildTree(values);
      return newNode;
    }

  }

  // Tree Traversals
  // Pre-Order Traversal
  // Root - > Left - > Right

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);

  }

  // In-Order Traversal
  // Left - > Root- > Right

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    preorder(root.left);
    System.out.print(root.data + " ");
    preorder(root.right);

  }

  // PostOrder Traversal
  // Left - > Right - > Root

  public static void postorder(Node root) {
    if (root == null) {
      return;
    }
    preorder(root.left);
    preorder(root.right);
    System.out.print(root.data + " ");
  }

  // levelorder Traversal
  // Print at each level
  // Queue Data structure

  public static void levelorder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);
    while (!queue.isEmpty()) {
      Node currentNode = queue.remove();
      if (currentNode == null) {
        System.out.println();
        if (queue.isEmpty()) {
          break;
        } else {
          queue.add(null);
        }

      } else {
        System.out.println(currentNode.data + " ");
        if (currentNode.left != null) {
          queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
          queue.add(currentNode.right);
        }
      }
    }

  }

  // count of Nodes

  public static int countOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodesCount = countOfNodes(root.left);
    int rightNodesCount = countOfNodes(root.right);
    return leftNodesCount + rightNodesCount + 1;

  }

  // count of Nodes

  public static int sumOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodesSum = sumOfNodes(root.left);
    int rightNodesSum = sumOfNodes(root.right);
    return leftNodesSum + rightNodesSum + root.data;

  }

  // Height of Tree

  public static int HeightOfNode(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodesHeight = HeightOfNode(root.left);
    int rightNodesHeight = HeightOfNode(root.right);
    return Math.max(leftNodesHeight, rightNodesHeight) + 1;

  }

  public static int diameterOfTree1(Node root) {
    if (root == null) {
      return 0;
    }
    int diameterOfLeftTree = diameterOfTree1(root.left);
    int diameterOfRightTree = diameterOfTree1(root.right);
    int diameterOfRoot = HeightOfNode(root.left) + HeightOfNode(root.right) + 1;
    return Math.max(Math.max(diameterOfLeftTree, diameterOfRightTree), diameterOfRoot);

  }

  static class TreeInfo {

    int height;
    int diameter;

    TreeInfo(int height, int diameter) {
      this.height = height;
      this.diameter = diameter;
    }

  }

  public static TreeInfo diameterOfTree2(Node root) {
    if (root == null) {
      return new TreeInfo(0, 0);
    }
    TreeInfo diameterOfLeftTree = diameterOfTree2(root.left);
    TreeInfo diameterOfRightTree = diameterOfTree2(root.right);
    int myHeight = Math.max(diameterOfLeftTree.height, diameterOfRightTree.height) + 1;

    int diameter1 = diameterOfLeftTree.diameter;
    int diameter2 = diameterOfRightTree.diameter;
    int diameter3 = diameterOfLeftTree.height + diameterOfRightTree.height + 1;
    int myDiameter = Math.max(Math.max(diameter1, diameter2), diameter3);
    return new TreeInfo(myHeight, myDiameter);

  }

  // Subtree of a Tree

  public static void main(String[] args) {

    int[] values = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = BuildTree.buildTree(values);
    System.out.println("Building A Tree");
    System.out.println(root.data);

    System.out.println("Preorder Traversal");
    preorder(root);

    System.out.println("\nInorder Traversal");
    inorder(root);

    System.out.println("\nPostorder Traversal");
    postorder(root);

    System.out.println("\nlevel Traversal");
    levelorder(root);

    System.out.println("\nCountOfNodes");
    System.out.println(countOfNodes(root));

    System.out.println("\nHeight of Tree");
    System.out.println(HeightOfNode(root));

    System.out.println("\nDiameter of Tree Approach 1");
    System.out.println(diameterOfTree1(root));

    System.out.println("\nDiameter of Tree Approach 2");
    System.out.println(diameterOfTree2(root).diameter);
  }

}
