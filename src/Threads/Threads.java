package Threads;

import java.util.Random;
import java.util.function.Consumer;

public class Threads implements Runnable {
    Node root;

    Threads(Node root){
        this.root = root;
    }

    @Override
    public void run(){

        Consumer consumer = new Consumer() {

            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                if(node.used.compareAndSet(false,true)){
                    Random rnd = new Random(System.currentTimeMillis());
                    System.out.println(Thread.currentThread().getName()+" start process node "+node.num);
                    try {
                        Thread.sleep(rnd.nextInt(5001));
                        System.out.println("   "+Thread.currentThread().getName()+" finish process node "+node.num);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        consumer.accept(root);
        root.recursionBinatyTree(consumer);
    }
}
