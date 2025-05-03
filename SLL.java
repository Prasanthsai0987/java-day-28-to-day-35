package day28;
import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLL { // Represents the Linked List
    Node head;

    public Node insert(int key, int pos, Node head) {
        Node newnode = new Node(key);

        // If inserting at the head (position 1)
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return head;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bound");
            return head;
        }

        // Insert the node
        newnode.next = temp.next;
        temp.next = newnode;

        return head;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        SLL list = new SLL();
        Node head = null;

        head = list.insert(10, 1, head); // Insert 10 at position 1
        head = list.insert(20, 2, head); // Insert 20 at position 2
        head = list.insert(30, 1, head); // Insert 30 at head (position 1)

        list.printList(head); // Print the linked list
    }
}
