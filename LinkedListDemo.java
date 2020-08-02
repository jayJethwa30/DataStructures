class LinkedList {
    
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void displayList() {
        Node node = head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }  

    public void addNodeAtTheBegining(int data) {
        if(head == null) {
            Node newNode = new Node(data);
            head = newNode;    
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void addNodeAtTheEnd(int data) {
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

    public void addNodeBeforeSpecifiedNode(int data, int nodeData) {
        if(head == null) {
            Node newNode = new Node(data);
            head = newNode;    
        } else if(head.data == nodeData) {
            addNodeAtTheBegining(data);
        } else {
            Node prevNode = head;
            Node nextNode = prevNode.next;
            while(nextNode.data != nodeData) {
                nextNode = nextNode.next;
                prevNode = prevNode.next;
                if(nextNode == null) { break; }
            }
            Node newNode = new Node(data);
            newNode.next = nextNode;
            prevNode.next = newNode;
        }
    }

    public void addNodeAfterSpecifiedNode(int data, int nodeData) {
        if(head == null) {
            Node newNode = new Node(data);
            head = newNode;    
        } else {
            Node node = head;
            while(node.data != nodeData) {
                node = node.next;
            }
            Node newNode = new Node(data);
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public void deleteFirstNode() {
        if(head == null) {
            System.out.println("Queue is empty.");    
        } else {
            Node node = head;
            head = node.next;
            node.next = null;
            System.out.println("Deleted node is : " + node.data);
        }
    }

    public void deleteLastNode() {
        Node prevNode = head;
        Node nextNode = head.next;

        while(nextNode.next != null) {
            nextNode = nextNode.next;
            prevNode = prevNode.next;
            if(nextNode == null) { break; }
        }
        if(nextNode != null) {
            prevNode.next = null;
            System.out.println("Deleted node is : " + nextNode.data);
        }
    }

    public void deleteNodeBeforeSpecifiedNode(int data) {
        Node prevNode = head;
        Node nextNode = head.next;

        if(head == null) {
            System.out.println("List is empty.");
        }
        if(prevNode.data == data) {
            System.out.println("No deletion.");
        } else {
            while(nextNode.next.data != data) {
                nextNode = nextNode.next;
                prevNode = prevNode.next;
                if(nextNode == null) { break; }
            }
            if(nextNode != null) {
                prevNode.next = nextNode.next;
                System.out.println("Deleted node is : " + nextNode.data);
            }
        }
    }

    public void deleteNodeAfterSpecifiedNode(int data) {
        Node prevNode = head;
        Node nextNode = head.next;

        if(head == null) {
            System.out.println("List is empty.");
        } else {
            while(prevNode.data != data) {
                prevNode = prevNode.next;
                nextNode = nextNode.next;
                if(nextNode == null) { break; }
            }
            if(nextNode != null) {
                prevNode.next = nextNode.next;
                System.out.println("Deleted node is : " + nextNode.data);
            }
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //Call methods here
    }
}