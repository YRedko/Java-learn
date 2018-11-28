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
    public void add(Object[] value, Object last) {
        value = Arrays.copyOf(value, value.length+1);
        value[value.length-1] = last;
    }
}
