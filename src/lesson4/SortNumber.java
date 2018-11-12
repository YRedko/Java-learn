package lesson4;

import java.util.Arrays;

public class SortNumber extends Sort {
    int number;

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
    @Override
    boolean moreThan(Object a, Object b){
        if((Integer)a > (Integer) b){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String []args){
        SortNumber num1 = new SortNumber();
        SortNumber num2 = new SortNumber();
        SortNumber num3 = new SortNumber();
        num1.number = 3;
        num2.number = 2;
        num3.number = 4;
        Object[] arr = {num1.number, num2.number, num3.number};
        SortNumber a = new SortNumber();
        a.sortArr(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
