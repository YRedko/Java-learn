package binaryTree;

import java.util.function.Consumer;

public class Node<T> {
    private T num;
    private Node left;
    private Node right;
    Node(T num, Node left, Node right){
        this.num = num;
        this.left = left;
        this.right = right;
    }
    public void recursionBinatyTree(Node node, Consumer consumer){
        if (node.left!=null) recursionBinatyTree(node.left, consumer);
        if (node.right!=null) recursionBinatyTree(node.right, consumer);
        consumer.accept(node.num);
    }
}
