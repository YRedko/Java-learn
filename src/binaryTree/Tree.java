package binaryTree;

import java.util.function.Consumer;

public class Tree {
    private Node root;
    Tree(Node root){
        this.root = root;
    }
    void traverse(Consumer consumer){
        root.recursionBinatyTree(root, consumer);
    }
}
