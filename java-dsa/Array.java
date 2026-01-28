//create 
//insert 
//delete 
//set 
//get 
//search


class Array{

    private int[] arr;
    private int size;
    private int capacity;
    
    public Array(int capacity){
        this.capacity=capacity;
        size=0;
        arr=new int [capacity]; 
    }
    
        public boolean insert(int index,int element){
            if(size>=capacity || index<0|| index>size){
               System.out.println("invalid index or array is full");
               return false;
            }
            for(int i=size;i>index;i--){
                arr[i]=arr[i-1];
            }
            arr[index]=element;
            size++;
            return true;
        }    
        public boolean delete(int index){
            if(index<0 ||index >=size){
                System.out.println("invalid index");
                return false;
            }
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            return true;
        }

    public boolean set(int index,int element){
        if(index<0 || index >=size  ){
                System.out.println(" invalid index");            
                return false;
       }
       arr[index]=element;
       return true;
    }

    public int get(int index){
        if(index<0 || index >=size){
            return -1;
        }
        return arr[index];
    }
    public int search(int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    public int get_size(){
        return size;
    }

    public int get_capacity(){
        return capacity;
    } 

    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Array arr=new Array(5);
        arr.insert(0, 10);
        arr.insert(0, 8);
        arr.insert(0, 7);
        arr.insert(0, 4);
        arr.insert(0,2);
        arr.display();
        arr.delete(2);

        arr.insert(0,87494);


        arr.display();
          arr.set(2,6);
            arr.display();

            System.out.println(arr.get(2));

            System.out.println(arr.search(6));

            System.out.println(arr.get_size());
            System.out.println(arr.get_capacity());

    }
}
