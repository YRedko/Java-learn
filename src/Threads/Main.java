package Threads;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree(new Node(1.0 ,new Node<>(2.0,null,null, new AtomicBoolean()),new Node<>(2.1 ,null,null, new AtomicBoolean()), new AtomicBoolean()));

        StringBuilder builder = new StringBuilder();
        Threads threads = new Threads(tree.root);

//        FileWorker fileWorker = new FileWorker();
//        Runnable runnable = () -> {
//
//        };
        FileWorker fileWorker = new FileWorker("fileLog", tree.root);

        Thread thread1 = new Thread(threads);
        Thread thread2 = new Thread(threads);
        Thread thread3 = new Thread(threads);
        Thread thread4 = new Thread(threads);
        Thread threadFile = new Thread(fileWorker);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        threadFile.start();

//        Consumer consumer = new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println("Info: "+o);
//            }
//        };

//        tree.traverse(consumer);
    }
}
