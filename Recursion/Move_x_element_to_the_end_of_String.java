// package Recursion;

public class Move_x_element_to_the_end_of_String {

public static void moveAllX_ToLast(String str, int idx, char element,int count,String newString){

    // base case
    if(idx==str.length()){
        for(int i=0;i<count;i++){
            newString += element;
        }
        System.out.println(newString);
        return;
    }

    char currchar=str.charAt(idx);
    if(currchar==element){
        count++;
        moveAllX_ToLast(str, idx+1, element, count,newString);
    }else{
        newString += currchar;
        moveAllX_ToLast(str, idx+1, element, count,newString);

    }
}
    public static void main(String[] args) {
        moveAllX_ToLast("jaypppmaurpypa", 0, 'p', 0, "");
    }
}
