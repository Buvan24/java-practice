import java.util.*;
public class array3{
    public static void main(String args[]){
        int[] arr={1,2,5,7,3,8,4,1,6};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((arr[i]&1)==0 && (arr[j]&1)==0){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
                if((arr[i]&1)!=0 && (arr[j]&1)!=0){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/* even numbers are to be sorted in ascending order and odd numbers
are to be sorted in descending order 
but in in same positions

odd numbers in odd positions
even numbers in even positions */