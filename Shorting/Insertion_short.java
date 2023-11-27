package dataStructuresAndAlgorithmsDSA.Shorting;

public class Insertion_short {

public static void ptinyArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" "); 
    }
}

    public static void main(String[] args) {
        int [] arr={2,9,4,7,4};

        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current< arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
            // System.out.println(arr[j+1]);
            
        }
        ptinyArray(arr);
    }
}

