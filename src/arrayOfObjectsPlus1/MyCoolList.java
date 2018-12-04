package arrayOfObjectsPlus1;

import java.util.Arrays;

public class MyCoolList<T> implements Iterable<T> {
    T[] value;
    @Override
    public void arrayTravers(T[] value) {
        for(int i = 0; i < value.length; i++){
            System.out.println("Value: "+value[i]);
        }
    }
    public void add(T last) {
        this.value = Arrays.copyOf(this.value, value.length+1);
        this.value[value.length-1] = last;
        /*
        T[] newArr = new T[this.value.length+1];
        newArr = Arrays.copyOf(this.value, this.value.length+1);
        newArr[this.value.length] = last;
        this.value = newArr;//this.value
        */
        /*for(int i  =0; i < objects.length; i++){
            System.out.println(objects[i]);
        }*/
    }
}

