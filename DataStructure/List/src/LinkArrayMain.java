import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Created 23 / 04 / 2020 - 9:31 AM
 * @project ProjectList
 * @Author Hamdamboy
 */
public class LinkArrayMain {

    public static void main(String []args){

        /***
         *  List interface: Collection interface which allow u to add an element, sort it, find the size.
         *
         *  List (interface_)
         *     _ Array List
         *     _ Linked List
         *     _ Vector
         *     _ Stack
         *
         * **/

        /**
         *  List
         *    create element
         *    adding  element
         * **/

        // Arraylist with default constructor
        List<Integer> listelement = new ArrayList<Integer>();
            listelement.add(2);
            listelement.add(5);
            listelement.add(6);
        System.out.println("listelement: " + listelement);

        //Arraylist with default capacity
        List<Integer> integersListWithInnitialCapacity = new ArrayList<Integer>(Arrays.asList(10, 4, 5, 3323, 23, 32, 32, 4));
        System.out.println("interList: " +integersListWithInnitialCapacity);
        integersListWithInnitialCapacity.clear();
        System.out.println("Clean: " +integersListWithInnitialCapacity);

        // Checking Existnce of List elements
        List<Integer> integerListWithOtherCollection = new ArrayList<Integer>(Arrays.asList(11, 2, 4, 55));

        System.out.println("contains 3 "+integerListWithOtherCollection.contains(2));
        System.out.println("contains 8 " + integerListWithOtherCollection.contains(8));

        /**Iterator*/
        //Iterate using iterator
        Iterator<Integer> integerListWithOtherCollectionItr = integerListWithOtherCollection.iterator();
        System.out.println("Using Iterator");
        while (integerListWithOtherCollectionItr.hasNext())
            System.out.println(integerListWithOtherCollectionItr.next());
        System.out.println("Using forEach");
        // Iterate usign forEach()
        integerListWithOtherCollection.forEach(System.out::println);

    }
}
/** Resource:
 * https://examples.javacodegeeks.com/java-list-example/
 **/