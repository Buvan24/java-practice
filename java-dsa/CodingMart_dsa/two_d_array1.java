public class two_d_array1{
    public static void main(String args[]){
        int[][] arr={
            {1,2,3},
            {6,7,8},
            {11,12,13},
            {16,17,18}
        };
        for(int row=0;row<arr.length;row++){
            int i=row;
            int j=0;
            while(i>=0 && j<arr[0].length){
                System.out.print(arr[i][j]+" ");
                i--;
                j++;
            }
        }
        for(int col=1;col<arr[0].length;col++){
            int i=arr.length-1;
            int j=col;
            while(i>=0 && j<arr[0].length){
                System.out.print(arr[i][j]+" ");
                i--;
                j++;
            }
        }
    }
}

/* Diagonal printing of elements in an array
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20

output: 1 6 2 11 7 3 16 12 9 5 17 13 10 18 14 19 15 20
 */