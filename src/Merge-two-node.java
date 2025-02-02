import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Utility method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" -> null");
    }
    
    // Method to merge two sorted linked lists and skip common elements.
    public static Node mergeWithoutCommon(Node l1, Node l2) {
        // Dummy node to simplify list creation
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = new Node(l1.data);
                tail = tail.next;
                l1 = l1.next;
            } else if (l1.data > l2.data) {
                tail.next = new Node(l2.data);
                tail = tail.next;
                l2 = l2.next;
            } else {
                // Both nodes have the same value, skip them
                    tail.next=new Node(l1.data);
                    tail=tail.next;
                    l1 = l1.next;
                    l2 = l2.next;
                }
            
        }
        
        // Append the remaining nodes from l1 (if any)
        while (l1 != null) {
            tail.next = new Node(l1.data);
            tail = tail.next;
            l1 = l1.next;
        }
        
        // Append the remaining nodes from l2 (if any)
        while (l2 != null) {
            tail.next = new Node(l2.data);
            tail = tail.next;
            l2 = l2.next;
        }
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
        // Create first linked list: 1 -> 2 -> 3 -> 7 -> 9 -> null
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(3);
        l1.next.next.next = new Node(7);
        l1.next.next.next.next = new Node(9);
        
        // Create second linked list: 5 -> 6 -> 7 -> 9 -> 15 -> null
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(7);
        l2.next.next.next = new Node(9);
        l2.next.next.next.next = new Node(15);
        
        System.out.println("List 1:");
        printList(l1);
        
        System.out.println("List 2:");
        printList(l2);
        
        // Merge the two lists skipping the common values (7 and 9 in this case)
        Node merged = mergeWithoutCommon(l1, l2);
        
        System.out.println("Merged list without common values:");
        printList(merged);
    }
}
