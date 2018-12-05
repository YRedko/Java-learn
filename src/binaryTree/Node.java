package binaryTree;

import java.util.function.Consumer;

public class Node<T> {
    private int num;
    private T left;
    private T right;
    Node(int num, T left, T right){
        this.num = num;
        this.left = left;
        this.right = right;
    }
    public void recursionBinatyTree(T node, Consumer consumer){
        if (this.left!=null) recursionBinatyTree(this.left, consumer);
        if (this.right!=null) recursionBinatyTree(this.right, consumer);
        consumer.accept(this.num);
    }
}
