class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DL{
    Node head;
    Node tail;
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
        tail=newnode;
    }
    public void add_begin(int data){
        Node newnode=new Node(data);
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    public void add_pos(int data,int pos){
        
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        DL obj=new DL();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add_begin(5);
        obj.display();
    }
}