package binaryTree;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree(new Node(14,new Node<>(5,null,null),new Node<>(10,null,null)));
        /*tree.root = new Node();
        tree.root.num = 14;
        tree.root.left = new Node();
        tree.root.right = new Node();
        tree.root.left.num = 5;
        tree.root.right.num = 7;
        tree.root.right.right = null;
        tree.root.right.left = null;
        tree.root.left.right = null;
        tree.root.left.left = null;*/
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("Info: "+o);
            }
        };
        tree.traverse(consumer);
    }
}
