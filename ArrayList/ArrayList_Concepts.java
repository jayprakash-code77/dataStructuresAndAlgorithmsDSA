package dataStructuresAndAlgorithmsDSA.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Concepts {
   public static void main(String[] args) {
        
    /*All properties and differences of ArrayList:-
     * 1) ArrayList have Variable size
     * 2) Data stored in non-continuous form
     * 3) ArrayList can store only Objects
     * ArrayList is created inside Heap
    */

   //  Defining the ArrayList
   ArrayList<Integer> nameList= new ArrayList<>(); // For integer
   ArrayList<String> nameStrng=new ArrayList<String>();

   //  Operations on ArrayList
      // 1) Adding the element to ArrayList
         nameList.add(4); // this will add elements behind
         nameList.add(9);
         nameList.add(72);
         nameList.add(71);
      // printing the whole list
         System.out.println(nameList);
      // get the element :- nameList.get(index of element that we need);
         int element=nameList.get(1);
         System.out.println(element);
      // Add element in between the ArrayList
         nameList.add(1,2); // this will add the element at the index where we want.
         System.out.println(nameList);
      // Set the element 
         nameList.set(2, 7);
         System.out.println(nameList);
      // delete element
         nameList.remove(3);
         System.out.println(nameList);
      // check the size of ArrayList
         int size=nameList.size();
         System.out.println(size);
      //  loops on ArrayList
         for(int i=0;i<nameList.size();i++){
            System.out.print(nameList.get(i)+" ");
         }
         System.out.println();
      // sorting is accending order
         Collections.sort(nameList);
         System.out.println(nameList);

         
         
   } 
}
