// singly linked list exam

public class linked_list {

    private Node head;

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteAtHead() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteAtTail() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        // Output: 30 20 10
        list.printList();

        list.deleteAtHead();
        list.deleteAtHead();
        // Output: 10
        list.printList();

        list.insertAtTail(40);
        list.insertAtTail(50);
        // Output: 10 40 50
        list.printList();

        list.deleteAtTail();
        list.deleteAtTail();
        // Output: 10
        list.printList();
    }
}
