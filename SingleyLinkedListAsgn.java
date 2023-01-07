public class SingleyLinkedListAsgn {

    class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;

        }
    }

    public Node head = null;
    public Node tail = null;

    public void display() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public void addNodebegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void removeDuplicate() {
        Node current = head;

        while (current != null) {
            Node next = current.next;
            while (next != null && next.data == current.data) {
                next = next.next;
            }
            current.next = next;
            if (next == tail && current.data == next.data) {
                tail = current;
            }
            current = next;
            tail.next = null;
        }
    }

    public void insetBefore(int after, int data) {
        Node newNode = new Node(data);
        Node temp = head, prev = null;

        if (temp != null && temp.data == after) {
            newNode.next = temp;
            head = newNode;
            return;
        }

        while (temp != null && temp.data != after) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        newNode.next = temp;
        prev.next = newNode;

    }

    public void insertAfter(int nextTo, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        while (temp != null && temp.data != nextTo) {
            temp = temp.next;

        }

        if (temp == null) {
            return;
        }
        if (temp == tail) {
            tail.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete(int data) {

        Node temp = head, prev = null;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }
        if (temp == tail) {

            tail = prev;
            tail.next = null;
        }
        prev.next = temp.next;
    }

    public void addNodeEnding(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

        } else {
            tail.next = newNode;
        }
        tail = newNode;

    }

    public static void main(String[] args) {
        SingleyLinkedListAsgn list = new SingleyLinkedListAsgn();
        int[] array = { 6, 5, 9, 9, 9, 0, 6 };
        for (int i = 0; i < 7; i++) {
            list.addNode(array[i]);
        }
        list.display();
    }
}
