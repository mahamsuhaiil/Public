package com.company.leetCode;
//working
public class convertSortedArrayToBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(int[] nums,int start, int end){
        if(start > end) return null;
        int midpoint =start + (end - start) / 2;
        Node root = new Node(nums[midpoint]);
        root.left = insert(nums, 0, midpoint-1);
        root.right = insert(nums, midpoint+1, nums.length-1);
        return root;
    }

    public static void print(Node tree){
        if(tree == null){
            return;
        }
        System.out.print(tree.data+ " ");
        print(tree.left);
        print(tree.right);
    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        Node tree = insert(nums,0, nums.length-1);
        print(tree);
    }
}
