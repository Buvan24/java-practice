import java.util.*;
class array5 {
    public static void main(String[] args) {
        int[] arr={1,2,-3,0,4,5};
        int[] pre=new int[arr.length];
        int[] suf=new int[arr.length];
        pre[0]=1;
        suf[arr.length-1]=1;
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]*arr[i-1];
        }
        for(int j=arr.length-2;j>=0;j--){
            suf[j]=suf[j+1]*arr[j+1];
        }
        for(int k=arr.length-1;k>=0;k--){
            arr[k]=pre[k]*suf[k];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/* In an array, except the self element remaining elements product should be allocated */