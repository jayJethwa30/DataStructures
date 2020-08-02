class Queue {
    Node head;

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void displayQueue() {
        if(head == null) {
            System.out.println("Empty Queue.");
        } else {
            Node node = head;
            while(node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }
    }

    public void addNode(int data) {
        if(head == null) {
            Node newNode = new Node(data);
            head = newNode;    
        } else {
            Node node = head;
            while(node.next != null) {
                node = node.next;
            }
            Node newNode = new Node(data);
            node.next = newNode;
        }
    }

    public void deleteNode() {
        if(head == null) {
            System.out.println("Queue is empty.");    
        } else {
            Node node = head;
            head = node.next;
            node.next = null;
            System.out.println("Deleted node is : " + node.data);
        }
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Call methods here
    }
}