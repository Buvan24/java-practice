public class spiralMatrix {
    public static void main(String args[]){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
            {13,14,15}
        };
        int t=0;
        int l=0;
        int r=arr[0].length-1;
        int b=arr.length-1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                System.out.print(arr[t][i]+" ");
            }
            t++;
            for(int i=t;i<=b;i++){
                System.out.print(arr[i][r]+" ");
            }
            r--;
            if(t<=b){
            for(int i=r;i>=l;i--){
                System.out.print(arr[b][i]+" ");
            }
            b--;
            }
            
            if(l<=r){
                for(int i=b;i>=t;i--){
                    System.out.print(arr[i][l]+" ");
                }
            l++;
            }
            
        }
    }
}
