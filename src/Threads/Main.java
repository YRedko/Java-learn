package Threads;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree(new Node(1.0 ,new Node<>(2.0,null,null, new AtomicBoolean()),new Node<>(2.1 ,null,null, new AtomicBoolean()), new AtomicBoolean()));

        Threads threads = new Threads(tree);

        FileWorker fileWorker = new FileWorker("fileLog", tree);

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

    }
}
