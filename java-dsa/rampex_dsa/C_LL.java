class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class C_LL_Methods{
    Node head;

    void insert_End(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }

    void insert_begin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        head=newNode;
    }

    void insert_pos(int pos,int data){
        if(pos==1){
            insert_begin(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1;i++){
                temp=temp.next;
        if(temp==head){
            System.out.println("Invalid pos");
            return;
        }
    }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void delete_End(){
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }
    void delete_Begin(){
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
    }
    void delete_pos(int pos){
        if(pos==1){
            delete_Begin();
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
            if(temp==head || temp.next==head){
                System.out.println("Invalid position");
                return;
            }
        }
        temp.next=temp.next.next;

    }

    void display(){
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data+"->(head)"+head);
    }
}
class C_LL{
    public static void main(String[] args) {
        C_LL_Methods obj=new C_LL_Methods();
        obj.insert_End(10);
        obj.insert_End(20);
        obj.insert_End(30);
        obj.insert_End(40);
        obj.insert_End(50);
       // obj.display();
     //   obj.insert_begin(5);
       // obj.display();
       // obj.delete_End();
      //  obj.display();
      //  obj.delete_Begin();
      //  obj.display();
        obj.insert_pos(5,100);
        obj.display();
        obj.delete_pos(5);
        obj.display();
    }
}