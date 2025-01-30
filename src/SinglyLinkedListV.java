//ListNode = Node (Here we use Node as the class name);
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class SinglyLinkedListV{
    Node head;

    //Display the List
    public void display(){
        Node current = head;
        while(current!=null) {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    // Count the List of Nodes
    public int count(){
        if (head==null) return 0;
        Node current =head;
        int len =0;
        while(current!=null){
            len++;
            current=current.next;
        }
        return len;
    }

    //Insert at Beginning of List
    public void insertF(int val){
        Node newNode= new Node(val);
        newNode.next=head;
        head=newNode;
    }

//    Insert at the end of List

    public void insertEnd(int value){
        Node newNode = new Node(value);
        if (head==null) {
            head=newNode;
            // return;
        }
        Node current = head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }
//Insert at position

    public void insertPos(int value, int pos){
        Node newNode = new Node(value);
        if(pos==1){
            newNode.next=head;
            head=newNode;
        }else {
            Node prev = head;       /*previous at the heador starting */
            int count =1;
            while (count<pos-1){    /*if count < position -1*/
                prev =prev.next;   /*point to next of position-1*/
                count++;
            }
            Node current= prev.next;
            newNode.next=current;
            prev.next=newNode;
        }
    }

//Delete from First

public Node deleteFirst() {
    if (head == null) {
        return null;
    }
    Node current = head;
    head = head.next;
//    current.next = null;
    return current;
}


    // merge two sorted ListNode
    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = null;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        // Handle remaining elements (unchanged)
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }


    public static void main (String[] args) {
        /* code */
        SinglyLinkedListV obj = new SinglyLinkedListV();
        obj.head= new Node(10);
        Node sec = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);


        obj.head.next = sec;
        sec.next=third;
        third.next=fourth;

        obj.insertF(05);
        obj.insertEnd(50);

        obj.insertPos(15,3);
        obj.insertPos(1,1);

//        obj.deleteFirst();

        System.out.print("Linked List: ");
        obj.display();
        System.out.print("Linked List: "+ obj.count());
        obj.deleteFirst();
        System.out.println("\nLinked List Delete from First: "+ obj.deleteFirst().data);

    }
}