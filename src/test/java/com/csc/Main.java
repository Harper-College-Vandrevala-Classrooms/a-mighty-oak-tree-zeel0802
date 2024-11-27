package com.csc;

public class Main {
    public static void main(String[] args) {
        // Create Squirrel objects
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        // Create nodes for each Squirrel
        OakTree.Node rootNode = new OakTree.Node(cheeks);
        OakTree.Node leftNode = new OakTree.Node(squeaks);
        OakTree.Node rightNode = new OakTree.Node(fluffybutt);

        // Build the tree
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);

        // Create the tree and set the root
        OakTree tree = new OakTree();
        tree.setRoot(rootNode);

        // Pre-order traversal of the tree
        System.out.println("Pre-order Traversal:");
        tree.preOrderTraversal(tree.getRoot());
    }
}
