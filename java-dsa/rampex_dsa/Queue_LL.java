class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class Queue_M{

    Node front;
    Node rear;

    boolean isEmpty(){
        return front==null;
    }

    void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return-1;
        }
         int f=front.data;
         front=front.next;
         return f;
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return-1;
        }
        return front.data;
    }

    void display(){
        Node temp=front;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}

public class Queue_LL {
    public static void main(String[] args) {
        Queue_M obj=new Queue_M();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.display();
        System.out.println(obj.dequeue());
        System.out.println(obj.peek());
        obj.display();
    }
    
}
