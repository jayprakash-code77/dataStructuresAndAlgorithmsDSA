package dataStructuresAndAlgorithmsDSA.Shorting;

public class Selection_Short {

public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int arr[]={7,8,3,3,1,2};
        
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int swap=arr[i];
            arr[i]=arr[small];
            arr[small]=swap;
        }
        printArray(arr);
    }
}
