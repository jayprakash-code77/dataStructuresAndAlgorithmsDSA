// package dataStructuresAndAlgorithmsDSA.AllBinarySearch_Topics;

class BinarySearch {
    public static void main(String[] args) {
        // int evenArray []={1,2,3,4,5,6};
        // int oddArray []={1,2,3,4,5,6,7};
        int reEven []={6,4,2,0,-3};
        // int revOdd []={7,6,5,4,3,2,1};
        
        int find=-3;
        int start=0;
        int end=reEven.length-1;
        int mid=(start+end)/2;  
        /* if the value of start and end is to big and if we try to add them they will become more big and it will go out of the range of int. Soto avoid that error we can use one formula of array to solve that problem 
         there the new formula of mid will be := mid = start + ((end-start)/2);
         */

        while(start<=end){

            // this will compare the value of array[mid] and find
            if(reEven[mid]==find){
                System.out.println(mid);
                return;
                // break;
            }

            // this will decide in which part of array do we have to go. 
            if(find < reEven[mid]){  // this will change for ascending and descending shorted arrays.
                start=mid+1;  // this will make the array to go to the right part of the divided array.
            }
            else {
                end=mid-1;    // this will make the array to go to the left part of the divided array.
            }


            // Updating mid value
            mid=(start+end)/2;
        }
        System.out.println(-1);
        


    }
}
