class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LL_Methods{
    Node head;
    void insert(int data){
    Node newNode=new Node(data);
    
    if(head==null)head=newNode;
    
    else {
        Node temp=head;
        while(temp.next!=null)temp=temp.next;
        temp.next=newNode;
    }

    }

    void insert_begin(int data){
        if(head==null){
            insert(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insert_pos(int pos,int data){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void delete(){
        if(head==null){
            System.out.println("LL empty");
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;

    }
    void delete_b(){
         if(head==null){
            System.out.println("LL empty");
            return;
        }
        Node temp=head;
         head=temp.next;
    }

    void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
    }
    System.out.print(temp.data+"->null");
    System.out.println();
}
}
public class LL{
    public static void main(String args[]){
        LL_Methods obj=new LL_Methods();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert_begin(5);
        obj.display();
        obj.insert_pos(3, 25);
        obj.delete();
        obj.display();
        obj.delete_b();
        obj.display();

    }
}