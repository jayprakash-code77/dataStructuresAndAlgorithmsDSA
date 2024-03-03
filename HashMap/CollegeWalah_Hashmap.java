package dataStructuresAndAlgorithmsDSA.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * CollegeWalah_Hashmap
 * // Important Features od HashMap class
 * 1) To access value we must now "key of value"
 * 2) Duplicate keys are not allowed but Duplicate values are allowed.
 * 3) Null key can also be inserted but only one. But null values can be inserted many.
 * 4) Java HashMap maintains no order.
 * // Applications of HashMap
 * 1) Problem related to frequency
 * 2) Mapping problems
 * 3) Storage optimization
 * 4) Dictionary
 * 5) Phomebook
 * 
 */
public class CollegeWalah_Hashmap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // first way
        // HashMap<String, Integer> map = new HashMap<>(); // second way

        // 1) inserting values
        map.put("Jay", 21);
        map.put("Kunal", 20);
        map.put("Deepu", 16);
        map.put("Neeraj", 22);
        map.put("Sweta", 23);

        // 2) get value of key from HashMap
        System.out.println(map.get("Kunal")); // if "kunal exists" it will return value of key.
        System.out.println(map.get("Neha")); // this will return null because the neha does not exists

        // 3) Changing/Updating value in HashMap
        map.put("Jay", 20); // this will just update the value of "Jay" but it will not add new Jay because
                            // Jay already exists in the HashMap.

        // 4) removing a pair from HashMap
        System.out.println(map.remove("Sweta")); // this will remove "Sweta" and return the value of Sweta. If key does
                                                 // not exists than it will return "null".
        System.out.println(map.remove("Rani"));

        // 5) Checking if the key is pesent OR Not
        System.out.println(map.containsKey("Deepu")); // return "true" because "Key = Deepu is present"
        System.out.println(map.containsKey("Rani")); // return "false" beacuse "Key = Rani is not present"

        // 6) Adding only if the value does not exists already
        // a)Fiest way
        map.putIfAbsent("Jay", 50); // this "Jay" will not be add nor the value of the present "Jay will be updated"
        System.out.println(map.get("Jay")); // this will return 20 .
        // b) Second way
        if (!map.containsKey("Jay")) {
            map.put("Jay", 34);
        }
        System.out.println(map.get("Jay")); // this will return 20 .

        // Get all the keys in the HashMap
        System.out.println(map.keySet());

        // Get all the values
        System.out.println(map.values());

        // Get all the Key-Value pairs
        System.out.println(map.entrySet());

        // Traversing all the entries of HashMap
        // a) First way
        System.out.println();
        for (String key : map.keySet()) {
            System.out.printf("Age of %s is %d %n", key, map.get(key));
        }
        // b) Second way
        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.printf("Age of %s is %d %n", e.getKey(), e.getValue());
        }
        // c) Third way
        System.out.println();
        for (var e : map.entrySet()) { // no need to specifie the data type of "e".
            System.out.printf("Age of %s is %d %n", e.getKey(), e.getValue());
        }
    }
}