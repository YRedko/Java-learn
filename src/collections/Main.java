package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Subscriber subscriber1 = new Subscriber(21);
        Subscriber subscriber2 = new Subscriber(10);
        Subscriber subscriber3 = new Subscriber(10);
        Subscriber subscriber4 = new Subscriber(24);

        Set<Subscriber> set1 = new HashSet<>();
        set1.add(subscriber1);
        set1.add(subscriber2);

        Set<Subscriber> set2 = new HashSet<>();
        set2.add(subscriber3);
        set2.add(subscriber4);

//        subscriber1.union(set1, set2);
//        subscriber1.intersection(set1, set2);
//        subscriber1.difference(set1,set2);
//        subscriber1.symmetricDifference(set1, set2);
    }

}
