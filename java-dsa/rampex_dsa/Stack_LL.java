class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class Stack_M{
    Node top;

    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

    void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        if(isEmpty()){
              System.out.println("Stack is UnderFlow");
              return -1;
        }
         int t=  top.data;
        top=top.next;
        return t;
    }

    int peek(){
         if(isEmpty()){
              System.out.println("Stack is UnderFlow");
              return -1;
        }
        return top.data;
    }

    void display(){
         if(isEmpty()){
              System.out.println("Stack is UnderFlow");
              return;
        }
        Node temp=top;
        while (temp!=null) {
            System.out.print(temp.data+" " );
            temp=temp.next;
        }
        System.out.println();
    }

}
public class Stack_LL {
    public static void main(String[] args) {
        Stack_M obj=new Stack_M();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.display();
        System.out.println(obj.pop());
        obj.display();
        System.out.println(obj.peek());
    }
}
