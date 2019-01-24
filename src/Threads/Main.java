package Threads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree(new Node(14,new Node<>("info",null,null, new AtomicBoolean()),new Node<>(new Object(),null,null, new AtomicBoolean()), new AtomicBoolean()));

        Threads threads = new Threads(tree.root);

        Thread thread1 = new Thread(threads);
        Thread thread2 = new Thread(threads);
        Thread thread3 = new Thread(threads);
        Thread thread4 = new Thread(threads);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

//        Consumer consumer = new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println("Info: "+o);
//            }
//        };

//        tree.traverse(consumer);
    }
}
