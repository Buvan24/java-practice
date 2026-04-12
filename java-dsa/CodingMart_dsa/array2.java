class array2 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&1)!=0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}