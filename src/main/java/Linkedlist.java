import java.util.*;

public class Linkedlist {

    public static void main(String[] args)
    {

        // Declaring a LinkedList
        LinkedList list = new LinkedList();

        // adding elements
        list.add("Geeks");
        list.add(4);
        list.add("Geeks");
        list.add(8);

        // printing the list
        System.out.println("The initial Linked list is : " + list);

        // offering a new element
        // adds element at tail.
        list.offer("default");
        list.offerFirst("First");
        list.offerLast("Last");

        // printing the new list
        System.out.println("LinkedList after insertion using offer() : " + list);

        LinkedList<Integer> listInt = new LinkedList<Integer>();
        LinkedList prioList = new LinkedList();

        // adding elements
        listInt.add(12);
        listInt.add(4);
        listInt.add(8);
        listInt.add(10);
        listInt.add(3);
        listInt.add(15);

        // declaring threshhold
        int thres = 10;

        // printing the list
        System.out.println("The initial Linked list is : " + listInt);

        while (!listInt.isEmpty()) {

            int t = listInt.poll();

            // adding >=10 numbers at front rest at back
            if (t >= 10)
                prioList.offerFirst(t);
            else
                //prioList.offerLast(t);
            prioList.add(t);
        }

        // The resultant list is
        System.out.println("The prioritized Linked list is : " + prioList);
    }
}
