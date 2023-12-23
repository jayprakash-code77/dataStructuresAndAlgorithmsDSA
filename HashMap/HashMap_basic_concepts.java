package dataStructuresAndAlgorithmsDSA.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_basic_concepts {
    public static void main(String[] args) {
        /*
         * HashMap always have the unique "key" and it may have the same value.
         * HashMap is used for the pair values.
         * HashMap is an un-ordered data structure.
         * If we insert some key which is already present is the map than it will not be add it will be just "Updated".
         *  if the key is new which is not present in the map than that key will be added.
         * ALWAYS USE HASHMAP IF YOU WANT TO CALULATE THE Frequency in the ARRAY.
         * 
         */
        
        //  Making the "HashMap" object :->>> HashMap <data type of key> <data type of value> reference_nameOfObj = new HashMap<>(); 
        HashMap <String , Integer> nameOfObj = new HashMap<>();

        // Insertion in HashMap
        nameOfObj.put("Germany", 70);
        nameOfObj.put("India", 120 );
        nameOfObj.put("US", 30);

        // Printing all value 
        System.out.println(nameOfObj);


        // Search OR Look up >>>>>>>>>>>>>>>>>>>

        /* 
        // name.containsKey(name of key); ->>> if the key exists than it will return "true" else it will return "false".

        if(nameOfObj.containsKey("India")) {
            System.out.println("key is present in the map.");
        } else {
            System.out.println("key is not present in the map.");
        }
        */

        /* 
        // .get(); function
        System.out.println(nameOfObj.get("US")); // key "US" exists >> this will print value of "US"(30)
        System.out.println(nameOfObj.get("Japan")); // key doesn't exists >> this print "null" because the key is not present

        */




        // Iterate on the HashMap using "for-each-loop".
        // Important LINE :- Map.Enrty <dataTypeOfKey , dataTypeOfValue> : entrySet().

        // printing the values through "entryset()"
        /* 
        for (Map.Entry <String , Integer> nameOfIterator : nameOfObj.entrySet()) {
            System.out.print(nameOfIterator.getKey()+" ");
            System.out.println(nameOfIterator.getValue());
        }
        */

        // printing the values through "keySet()"
        /* 
        Set<String> keys = nameOfObj.keySet();
        for (String key : keys) {
            System.out.print(key+" "); // this will print "key"
            System.out.println(nameOfObj.get(key)); // this will print " key value"
        }
        */



        // Remove pair from HashMap
        /* 
        nameOfObj.remove("US");   // "US"  pair removed
        System.out.println(nameOfObj);  
        */








    }
}
