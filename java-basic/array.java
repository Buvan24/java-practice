import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        int[] a=new int[b];
        for (int i=0;i<b;i++){
            a[i]=scan.nextInt();
        }
        for (int i=0;i<b;i++){
        System.out.println(a[i]);}
        int mid=b/2;
        System.out.println(mid+1);
    }
}