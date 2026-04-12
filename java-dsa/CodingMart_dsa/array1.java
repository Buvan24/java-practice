class array1 {
    public static void main(String[] args) {
        int[] arr={5,0,6,7,3,2,1,0,3};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
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