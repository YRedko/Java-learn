package binaryTree;

import java.util.function.Consumer;

public class Node {
    int num;
    Node left;
    Node right;
    public void recursionBinatyTree(Node node, Consumer consumer){
        if (node.left!=null) recursionBinatyTree(node.left, consumer);
        if (node.right!=null) recursionBinatyTree(node.right, consumer);
        consumer.accept(node.num);
    }
}
