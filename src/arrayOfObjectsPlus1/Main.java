package arrayOfObjectsPlus1;

public class Main {
    public static void main(String[] args) {
        String first = "23df";
        String second = "nc3";
        String third = "d10f";
        System.out.println("Third: "+third);
        MyCoolList<String> arr = new MyCoolList();
        arr.value = new String[]{first, second};
        arr.arrayTravers(arr.value);
        arr.add(third);
        System.out.println("---");
        arr.arrayTravers(arr.value);
    }
}
