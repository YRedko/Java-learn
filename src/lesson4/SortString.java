package lesson4;

public class SortString extends Sort{
    String string;
    @Override
    void sortArr(Object[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (moreThan(arr[j - 1], arr[j])) {
                    Object temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    boolean moreThan(Object a, Object b){
        if (a.toString().compareTo(b.toString()) > 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String []args){
        SortString str1 = new SortString();
        SortString str2 = new SortString();
        str1.string = "acb";
        str2.string = "abc";
        SortString[] arr = {str1, str2};
        SortString a = new SortString();
        a.sortArr(arr);
        System.out.println(arr[0].string);
    }
}
