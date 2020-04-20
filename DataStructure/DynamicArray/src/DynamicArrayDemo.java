/**
 * @Created 20 / 04 / 2020 - 9:43 AM
 * @project DynamicArray
 * @Author Hamdamboy
 */
public class DynamicArrayDemo {

    public static void main(String[] args){

        DynamicArray <Integer> dArray = new DynamicArray<Integer>();

        dArray.put(4);
        System.out.println("Size: "+ dArray.getSize());

        dArray.put(14);
        System.out.println("Size: "+ dArray.getSize());

        dArray.put(42);
        System.out.println("Size: "+ dArray.getSize());

        dArray.put(432);
        System.out.println("Size: "+ dArray.getSize());

        dArray.put(10);
        System.out.println("Size: "+ dArray.getSize());

        System.out.println("VAL: " + dArray.get(3));
    }
}
