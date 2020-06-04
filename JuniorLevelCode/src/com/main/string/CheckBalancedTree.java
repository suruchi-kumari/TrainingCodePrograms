package com.main.string;

public class CheckBalancedTree {
	
	Node root; 
	  
    //Returns true if binary tree with root as root is height-balanced
    boolean isBalanced(Node root, Height height) 
    { 
        /* If tree is empty then return true */
        if (root == null) { 
            height.height = 0; 
            return true; 
        } 
  
        /* Get heights of left and right sub trees */
        Height lheight = new Height(), rheight = new Height(); 
        boolean l = isBalanced(root.left, lheight); 
        boolean r = isBalanced(root.right, rheight); 
        int lh = lheight.height, rh = rheight.height; 
  
        /* Height of current node is max of heights of 
           left and right subtrees plus 1*/
        height.height = (lh > rh ? lh : rh) + 1; 
  
        /* If difference between heights of left and right 
           subtrees is more than 2 then this node is not balanced 
           so return 0 */
        if (Math.abs(lh -rh) >= 2) 
            return false; 
  
        /* If this node is balanced and left and right subtrees 
           are balanced then return true */
        else
            return l && r; 
    } 
  
    public static void main(String args[]) 
    { 
        Height height = new Height(); 
        CheckBalancedTree tree = new CheckBalancedTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.right = new Node(6); 
        tree.root.left.left.left = new Node(7); 
        //tree.root.left.left.left.left = new Node(2); 
  
        if (tree.isBalanced(tree.root, height)) 
            System.out.println("Tree is balanced"); 
        else
            System.out.println("Tree is not balanced"); 
    } 

}
