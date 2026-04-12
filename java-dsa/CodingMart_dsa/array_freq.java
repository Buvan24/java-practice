import java.util.*;
class array_freq {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,5,2};
        int[] f=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            index=indexof(arr[i],arr);
            f[index]++;
        }
        for(int i=0;i<arr.length;i++){
            if(f[i]!=0){
                System.out.println(arr[i]+"->"+f[i]);
            }
        }
    }
    
    public static int indexof(int num,int[] arr){
        for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            return i;
        }
        }
        return -1;
    }
}

/* Frequency of elements in an array using two pointers*/