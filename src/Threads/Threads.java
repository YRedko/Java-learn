package Threads;

import java.util.Random;
import java.util.function.Consumer;

public class Threads implements Runnable {
    Node root;
    static String str;

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
                    //str = Thread.currentThread().getName()+" start process node "+node.num;

                    node.label = "node "+node.num.toString()+" in process by "+Thread.currentThread().getName()+"\n";
//                    System.out.println("LabelBefore: "+node.label);
//                    System.out.println(Thread.currentThread().getName()+" start process node "+node.num);

                    try {
                        Thread.sleep(rnd.nextInt(5001));
//                        System.out.println("   "+Thread.currentThread().getName()+" finish process node "+node.num);
                        node.label = "node "+node.num.toString()+" processed"+"\n";
//                        System.out.println("LabelAfter: "+node.label);
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
