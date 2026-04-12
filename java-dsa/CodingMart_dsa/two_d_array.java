public class two_d_array{
    public static void main(String args[]){
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8}
        };
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=0;
            System.out.print("Row "+(i+1)+":");
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}