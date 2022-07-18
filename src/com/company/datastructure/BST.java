package com.company.datastructure;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        int[] values = {5,1,2,3,7};
        Node root = null;
        for (int i = 0; i < values.length ; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
    }
}
