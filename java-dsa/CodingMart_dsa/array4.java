import java.util.*;
public class array4{
    public static void main(String args[]){
        int[] arr={2,4,1,5,3,6};
        boolean flag=true;
        int target=8;
        if((arr.length&1)!=0){
            flag=false;
        }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int sum=0;
        while(i<j){
            if(arr[i]+arr[j]==target){
                sum+=arr[i]*arr[j];
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag)
        System.out.println(sum);
        else
        System.out.println("-1");
    }
}

/* the array size must be even so that it could hold pair values
all the pair in the array should be equal to target value 
e.g -> arr={2,4,1,5,3,6} target=7
the pairs are (2,5) (4,3) (1,6)
then sum=(2*5)+(4*3)+(1*6)=28
if any one pair does not there return -1  */
        


        