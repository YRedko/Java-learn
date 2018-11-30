package arrayOfObjectsPlus1;

import java.util.Arrays;

public class MyCoolList implements Iterable {
    Object[] value;
    @Override
    public void arrayTravers(Object[] value) {
        for(int i = 0; i < value.length; i++){
            System.out.println("Value: "+value[i]);
        }
    }
    public void add(Object[] objects, Object last) {
        //value = Arrays.copyOf(value, value.length+1);
        //value[value.length-1] = last;
        Object[] newArr = new Object[objects.length+1];
        newArr = Arrays.copyOf(objects, objects.length+1);
        newArr[objects.length] = last;
        objects = newArr;//this.value
        for(int i  =0; i < objects.length; i++){
            System.out.println(objects[i]);
        }
    }
}
