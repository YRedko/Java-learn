package collections;

import java.util.*;

public class Subscriber {

    public int phoneNumber;

    Subscriber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return phoneNumber == that.phoneNumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(phoneNumber);
    }

    public static void show(Collection<Subscriber> list){
        for(Subscriber item: list){
            System.out.println(item.phoneNumber);
        }
    }

    public Set<Subscriber> union(Set<Subscriber> set1, Set<Subscriber> set2){
        System.out.println("Union: ");
        set1.addAll(set2);
        show(set1);
        return set1;
    }

    public Set<Subscriber> intersection(Set<Subscriber> set1, Set<Subscriber> set2){
        set1.retainAll(set2);
        System.out.println("Intersection: ");
        show(set1);
        return set1;
    }
    public Set<Subscriber> difference(Set<Subscriber> set1, Set<Subscriber> set2){
        set1.removeAll(set2);
        System.out.println("Difference: ");
        show(set1);
        return set1;
    }
    public Set<Subscriber> symmetricDifference(Set<Subscriber> set1, Set<Subscriber> set2){
        Set<Subscriber> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        set1.retainAll(set2);
        set3.removeAll(set1);
        System.out.println("Symmetric difference: ");
        show(set3);
        return set3;
    }

}
