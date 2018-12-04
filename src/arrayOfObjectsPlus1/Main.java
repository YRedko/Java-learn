package arrayOfObjectsPlus1;

public class Main {
    public static void main(String[] args) {
        Object first = new Object();
        Object second = new Object();
        Object third = new Object();
        System.out.println("Third: "+third);
        MyCoolList arr = new MyCoolList();
        arr.value = new Object[]{first, second};
        MyCoolList arr2 = new MyCoolList();
        arr2.value = new Object[]{first, second, third};
        arr.arrayTravers(arr.value);
        arr.add(third);
        System.out.println("---");
        arr.arrayTravers(arr.value);
    }
}
