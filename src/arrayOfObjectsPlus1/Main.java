package arrayOfObjectsPlus1;

public class Main {
    public static void main(String[] args) {
        Object first = new Object();
        Object second = new Object();
        Object third = new Object();
        MyCoolList arr = new MyCoolList();
        arr.value = new Object[]{first, second};
        arr.arrayTravers(arr.value);
        arr.add(arr.value, third);
        System.out.println("---");
        arr.arrayTravers(arr.value);
    }

}
