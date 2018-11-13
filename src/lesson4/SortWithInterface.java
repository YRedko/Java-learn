package lesson4;

public class SortWithInterface {
    void sortArr(Object[] arr, Сompare comp){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (comp.compare(arr[j - 1], arr[j])) {
                    Object temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
