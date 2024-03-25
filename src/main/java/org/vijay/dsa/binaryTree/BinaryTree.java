package org.vijay.dsa.binaryTree;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class BinaryTree {

    private static TreeNode root;

    private static class TreeNode {
        private int data;
        private TreeNode leftNode;
        private TreeNode rightNode;

        public TreeNode (int data) {
            this.data = data;
        }
    }

    public boolean isLeafNode(TreeNode node) {
        return node.leftNode == null && node.rightNode == null;
    }

    public static void createBinaryTree () {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root = node1;
        node1.leftNode = node2;
        node1.rightNode = node3;
        node2.leftNode = node4;
        node2.rightNode = node5;
    }

    public static void preOrderRecursive(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        preOrderRecursive(node.leftNode);
        preOrderRecursive(node.rightNode);
    }

    public static void preOrderIterative (TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data + " ");
            if (temp.rightNode != null) {
                stack.push(temp.rightNode);
            }
            if (temp.leftNode != null) {
                stack.push(temp.leftNode);
            }
        }
    }

    public static void inOrderRecursive (TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderRecursive(node.leftNode);
        System.out.println(node.data);
        inOrderRecursive(node.rightNode);
    }

    public void inOrderIterative (TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.leftNode;
            } else {
                temp = stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.rightNode;
            }
        }
    }

    public static void main(String[] args) {

        createBinaryTree();
        System.out.println("Preorder Recursive");
        preOrderRecursive(root);

        System.out.println("Preorder Iterative");
        preOrderIterative(root);

        System.out.println("Inorder Recursive");
        inOrderRecursive(root);

    }

}
