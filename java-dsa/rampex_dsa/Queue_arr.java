class Queue{
    int arr[];
    int size;
    int front;
    int rear;
    Queue(int size){
        this.size=size;
        front =-1;
        rear=-1;
        arr=new int[size];
    }
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }                   

    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue overflow");
            return;
        }
        if(isEmpty()){
            arr[++rear]=data;
            front++;
            return;
        }
        arr[++rear]=data;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[front++];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[front];

    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return ;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
public class Queue_arr {
    public static void main(String[] args) {
        Queue obj=new Queue(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        
        System.out.println(obj.dequeue());
        System.out.println(obj.peek());
        obj.display();
    }
}
