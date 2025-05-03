package day28;

	       class Node {
			    int data;
			    Node next;

			    public Node(int data) {
			        this.data = data;
			        this.next = null;
			    }
			}

			class SinglyLinkedList {
			    public Node head;

			    // Insert at the end
			    public void insert(int data) {
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
			    }
			    // Delete a node
			    public void delete(int key) {
			        if (head == null) return;
			        if (head.data == key) {
			            head = head.next;
			            return;
			        }
			        Node temp = head;
			        while (temp.next != null && temp.next.data != key) {
			            temp = temp.next;
			        }
			        if (temp.next != null) {
			            temp.next = temp.next.next;
			        }
			    }

			   

			    // Display the list
			    public void display() {
			        Node temp = head;
			        while (temp != null) {
			            System.out.print(temp.data + " -> ");
			            temp = temp.next;
			        }
			        System.out.println("null");
			    }

			    public static void main(String[] args) {
			        SinglyLinkedList list = new SinglyLinkedList();
			        list.insert(10);
			        list.insert(20);
			        list.insert(30);
			        list.display(); // Output: 10 -> 20 -> 30 -> null
			        list.delete(20);
			        list.display(); // Output: 10 -> 30 -> null
			    }
			}
		




