 class Stack{
    int arr[];
    int size;
    int top;

    Stack(int size){
        this.size=size;
        arr=new int [size];
        top=-1;
    }

    boolean isFull(){
        if(top==size-1) return true;
        return false;
    }
    
    boolean isEmpty(){
         if (top==-1) return true;
        return false;
    }

    void push(int data){
        if(isFull()){
            System.out.println("Stack is OverFlow");
            return;
        }
        arr[++top]=data;
    }

    int pop(){
        if (isEmpty()) {
            System.out.println("Stack is UnderFlow");
            return -1;
        }    
        return arr[top--];
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is UnderFlow");
            return -1;
        }
        return arr[top];
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is UnderFlow");
            return ;
        }
        for(int i=top;i>=0;i--){
            System.out.print( arr[i] +" ");
        }
        System.out.println();
    }

} 
public class Stack_arr {
     public static void main(String[] args) {
        Stack obj=new Stack(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        //obj.push(60);
        obj.display();
        System.out.println(obj.pop());
        
        System.out.println(obj.peek());
        obj.display();
     }
}
