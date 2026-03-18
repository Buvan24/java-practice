class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class D_LL_Methods {
    Node head;

    // Insert at end
    void insert_end(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at beginning
    void insert_begin(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at position
    void insert_pos(int pos, int data) {
        if (pos == 1) {
            insert_begin(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;   // FIXED
        }

        temp.next = newNode;
    }

    // Delete from beginning
    void del_begin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete from end
    void del_end() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Delete at position
    void del_pos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 1) {
            del_begin();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        if (temp.next == null) { // last node
            temp.prev.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class D_LL {
    public static void main(String[] args) {

        D_LL_Methods obj = new D_LL_Methods();

        obj.insert_end(10);
        obj.insert_end(20);
        obj.insert_end(30);
        obj.insert_begin(5);

        obj.display();   // 5->10->20->30->null

        obj.insert_pos(3, 15);
        obj.display();   // 5->10->15->20->30->null

        obj.del_begin();
        obj.display();   // 10->15->20->30->null

        obj.del_end();
        obj.display();   // 10->15->20->null

        obj.del_pos(2);
        obj.display();   // 10->20->null
    }
}