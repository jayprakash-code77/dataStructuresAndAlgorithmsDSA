package dataStructuresAndAlgorithmsDSA.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class HashSet_basic_concepts {

    public static void main(String[] args) {

        /*
         * Set does not accept the duplicate values.
         * Set will not add or return the value in the order we added them.
         */

        // Creating the HashSet
        // first way
        HashSet<Integer> set = new HashSet<>();
        // second way
        Set<Integer> s = new HashSet<>();

        // Insert >>> set.add();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(1); // this will not be added because, the duplicate of this already exits in the
                    // set

        // Search >>> set.contains();
        boolean a = set.contains(1);
        System.out.println(a);

        // Delete >>> set.remove();
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("This set does not contain 1.");
        }

        // size of set >>> set.size();
        System.out.println("Size of the set is " + set.size());

        // Print all Elements
        System.out.println(set);

        // To travel on the whole set we have to import and use "Iterator".
        // Iterator 1) Making Iterator >> Iterator name = name.iterator();

        Iterator<Integer> name = set.iterator(); // "name" is pointing to the null value at first
        // name.next();
        /* name.next(); */ // now "name" will point to the first value.

        // name.hasNext(); // This will "return false" if the set contains the next
        // value else it will "return true".
        /* name.hasNext(); */

        // Now Iterate
        while (name.hasNext()) {
            System.out.print(name.next() + " ");
        }

    }
}
