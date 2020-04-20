import java.util.Arrays;

/**
 * @Created 20 / 04 / 2020 - 9:33 AM
 * @project DynamicArray
 * @Author Hamdamboy
 */


public class DynamicArray <T> {

    //int [] data; // simple declaration
    Object [] data; // Dynamic array declaration and (<T>) type
    int size;

    public DynamicArray(){
        size =0;
        data = new Object[size];
    }

    public T get(int index){
        return (T) data[index];
    }

    public int getSize(){

        return data.length;
    }

    public void put(int element){
        ensureCapacity(size+1);
        data[size++] = element;
    }


    public void ensureCapacity(int minCapacity){
        int oldCapacity = data.length;
        if(minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if(newCapacity < minCapacity){ // delete
                newCapacity = minCapacity;
            }

            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
