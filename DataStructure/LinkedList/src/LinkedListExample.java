import java.util.LinkedList;

/**
 * @Created 22 / 04 / 2020 - 9:52 AM
 * @project LinkedList
 * @Author Hamdamboy
 */
public class LinkedListExample  {
    public static void main(String [] args){

        /*** Linked List declaration*/

        LinkedList<String> linkedList = new LinkedList<String>();

        /**
         * 1. Add element
         * 2. Remove element
         * 3. Get/Set
         *
         * 1. add(String value) is used for adding the elements to the linked list.
         *
         * Reference:
         * https://www.quora.com/What-is-a-LinkedList-in-Java
         * https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
         * **/

        linkedList.add("Hamdamboy");
        linkedList.add("Urunov");
        linkedList.add("Babam");
        linkedList.add("Anojonim");
        linkedList.add("Assim");
        linkedList.add("Shahzoda");
        linkedList.add("Hotam");

        /** Display linked List Content*/
        System.out.println("Linked List Content: " + linkedList);

        /** Add 1 st and last item.*/
        linkedList.addFirst("First item");
        linkedList.addLast("Last item");

        System.out.println("LinkedList content after addition " + linkedList);

        /**This is how to get and set Values*/
        Object firstvar = linkedList.get(0);
        System.out.println("First element: " + firstvar);
        linkedList.set(0, "Changed first item");
        Object firstvar2 = linkedList.get(0);
        System.out.println("First element after update by set method:" + firstvar2);

        /*Remove first and last element*/
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedList);

        /*Add to Position and remove from a position*/
        linkedList.add(0, "Newly added item: Sadulla");
        linkedList.remove(2);
        System.out.println("Final Content: "+ linkedList);
    }


}
