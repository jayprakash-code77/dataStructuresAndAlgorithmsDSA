package dataStructuresAndAlgorithmsDSA.Shorting_Algorithms;

class Bubble_Short {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={7,8,3,1,2};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int check=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=check;
        //         }
        //     }
        // }
        // printArray(arr);


        
        // My logic
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        printArray(arr);
    }
}
