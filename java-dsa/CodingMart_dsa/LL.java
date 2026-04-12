import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class LL {
    Node head=null;
    Node tail=null;
    public void insert_begin(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        LL obj=new LL();
        obj.insert_begin(10);
        obj.display();
    }
}
