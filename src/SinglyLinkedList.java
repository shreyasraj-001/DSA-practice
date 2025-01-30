// Insert at the end of the list
// merge two sorted ListNode
//Reverse the node
//remove duplicate
//remove key from the given list
//Insert in sorted list
//serach the key



import java.util.List;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    ListNode head;

    // Insert at the end of the list
   public void insert(int data) {
       ListNode newNode = new ListNode(data);
       if (head == null) {
           head = newNode;
       } else {
           ListNode current = head;
           while (current.next != null) {
               current = current.next;
           }
           current.next = newNode;
       }
   }

    // Delete a node by value


    // merge two sorted ListNode
    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
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



//Reverse the node
    public void reverse(){
        ListNode prev= null;
        ListNode current =head;
        ListNode next = null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
//remove duplicate

   public void removeDuplicate(){
        if(head==null){
            return;
        }
        ListNode current=head;

        while (current !=null && current.next!=null){
            if (current.data==current.next.data){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
   }
//remove key from the given list

    public void removeKey(int key){
        ListNode current =head;
        ListNode temp =null;
//        if(current!=null && current.data==key){
//            head= current.next;
////            return;
//        }
        while(current!=null && current.data!=key){
            temp =current;
            current=current.next;
        }
        if (current==null) {return;}

        temp.next = current.next;
    }

//   Insert in sorted list

    public ListNode insertInSortedList(int value){
        ListNode newNode =new ListNode(value);
            if (head==null){
                return newNode;
            }

            ListNode current=head;
            ListNode temp =null;

            while (current!=null &&current.data< newNode.data){
                temp = current;
                current = current.next;
            }

            newNode.next=current;
            temp.next=newNode;
            return head;
        }

    //serach the key

    public void search(int key){
        ListNode current=head;
        int index=1;
        while (current!=null) {
            if (current.data == key) {
                System.out.println(key + " found at position " + index);
            }
            current = current.next;
            index++;
        }
    }

    // Display the list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.head = new ListNode(10);
        ListNode sec = new ListNode(12);
        ListNode three = new ListNode(15);
        ListNode four = new ListNode(18);
        ListNode fiv = new ListNode(18);

        list.head.next=sec;
        sec.next = three;
        three.next=four;
        four.next=fiv;
        // Insert elements
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);

        // Display the list
        System.out.println("Linked List:");


        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.head = new ListNode(1); // Initialize list2.head
        ListNode tsec = new ListNode(20);
        ListNode tthird = new ListNode(30);
        ListNode tfouth = new ListNode(40);

        list2.head.next = tsec;
        tsec.next = tthird;
        tthird.next = tfouth;

        SinglyLinkedList result = new SinglyLinkedList();

        result.head = merge(list.head, list2.head);

        result.display();
//        list.reverse();
//        list.removeDuplicate();
//        list.insertInSortedList(17);
//        list.removeKey(18);
//        list.search(15);
//        list.search(18);
//        list.display();


        // Delete an element

    }
}
