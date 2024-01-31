package dataStructuresAndAlgorithmsDSA.LinkList;

import java.util.LinkedList;;
public class LinkList_UsingCollections {
    public static void main(String[] args) {
        // making the object of LinkList
        LinkedList<String> list = new LinkedList<>();

        // add first 
        list.addFirst("a");
        list.addFirst("is ");

        // add last
        list.addLast("List");

        // print 
        System.out.println(list);

        // default "add method"
        list.add("defaultA_add");  // this will always add the elements in the last of the "LinkedList".
        System.out.println(list);

        // finding the "size of list"
        System.out.println(list.size());

        // print the element at  the perticular index Using "get() function"
        System.out.println(list.get(0));

        // printing the whole list 
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        // removeFirst() method
        list.removeFirst(); // this will delete the first value of LinkedList
        System.out.println(list +" this is removeFirst");

        // removeLast() method
        list.removeLast(); // this will delete the last value of LinkedList
        System.out.println(list +" This is removeLast");

        // using default remove() method

        // list.remove(1);  // this will remove the value of index that is passed.
        list.remove();  // this will remove the first value always.
        System.out.println(list +" This is remove default"); 
        
    }
}
