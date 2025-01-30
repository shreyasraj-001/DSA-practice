package DoublyLinked;
class ListNode{
    int data;
    ListNode next;
    ListNode prev;

    public ListNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLinkedList{
    ListNode head;
    ListNode tail;

    // Insert at head

    public void insertBeg(int data){
        ListNode newNode = new ListNode(data);

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    // Insert at End

    public void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if (head==null) head=newNode;
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        newNode.prev=current;

    }

    // Insert at Position

    public void insertPos(int value, int pos){
        ListNode newNode = new ListNode(value);

        if (pos==1){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        int count=1;
        ListNode current =head;
        while(count<pos-1){
            current=current.next;
            count++;
        }
        current.next.prev=newNode;
        newNode.next=current.next;
        newNode.prev=current;
        current.next=newNode;
    }


// Display reverse


    public void displayrev(){
        ListNode current =tail;
        while(current!=null){
            System.out.print(current.data+" ");

            current=current.prev;
        }
        System.out.print(" ");
    }


    // Display function

    public void display(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }


    public static void main (String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.head = new ListNode(10);
        ListNode a =new ListNode(20);
        ListNode b =new ListNode(30);
        ListNode c =new ListNode(40);
        dll.tail = new ListNode(50);


        dll.head.prev=null;
        dll.head.next=a;
        a.prev=dll.head;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=dll.tail;
        dll.tail.prev=c;
        dll.tail.next=null;

        // dll.insertBeg(05);
        // dll.insertEnd(55);
        // dll.displayrev();

        dll.insertPos(35,4);
        dll.display();
    }
}
