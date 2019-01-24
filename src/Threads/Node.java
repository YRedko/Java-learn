package Threads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Node<T> {

    T num;
    Node left;
    Node right;
    AtomicBoolean used;

    Node(T num, Node left, Node right, AtomicBoolean used){
        this.num = num;
        this.left = left;
        this.right = right;
        this.used = used;
    }

    public void recursionBinatyTree(Consumer consumer){
        if (left!=null) {
            consumer.accept(left);
            left.recursionBinatyTree(consumer);
        }
        if (right!=null) {
            consumer.accept(right);
            right.recursionBinatyTree(consumer);
        }
    }
}
