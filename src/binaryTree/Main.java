package binaryTree;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree(new Node(14,new Node<>("info",null,null),new Node<>(new Object(),null,null)));
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("Info: "+o);
            }
        };
        tree.traverse(consumer);
    }
}
