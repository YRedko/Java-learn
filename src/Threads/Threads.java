package Threads;

import java.util.Random;
import java.util.function.Consumer;

import static Threads.FileWorker.counter;

public class Threads implements Runnable {
    Tree tree;


    Threads(Tree tree){
        this.tree = tree;
    }

    @Override
    public void run(){
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                if(node.used.compareAndSet(false,true)){
                    //StringBuilder logStringBuilder = new StringBuilder();
                    Random rnd = new Random(System.currentTimeMillis());

                    node.label = "node "+node.num.toString()+" in process by "+Thread.currentThread().getName()+"\n";
//                    System.out.println("LabelBefore: "+node.label);
                    tree.logString.append(Thread.currentThread().getName()+" start process node "+node.num+"\n");
//                    System.out.println(Thread.currentThread().getName()+" start process node "+node.num);

                    try {
                        Thread.sleep(rnd.nextInt(5001));
                        tree.logString.append(Thread.currentThread().getName()+" finish process node "+node.num+"\n");
//                        System.out.println("   "+Thread.currentThread().getName()+" finish process node "+node.num);
                        node.label = "node "+node.num.toString()+" processed"+"\n";
                        counter++;
//                        System.out.println("LabelAfter: "+node.label);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        consumer.accept(tree.root);
        tree.root.recursionBinatyTree(consumer);
    }
}
