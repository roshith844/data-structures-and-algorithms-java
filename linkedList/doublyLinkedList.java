package linkedList;
public class doublyLinkedList {
     class Node {
          int data;
          Node next;
          Node prev;

          Node(int data) {
               this.data = data;

          }
     }

     public Node head;
     public Node tail;

     public void delete(int data) {
          Node temp = head, pre = null;
          if (temp != null && temp.data == data) {
               head = temp.next;
               head.prev = null;
               return;
          }
          while (temp != null && temp.data != data) {
               pre = temp;
               temp = temp.next;
          }
          if (temp == null) {
               return;
          }
          if (temp == tail) {
               pre.next = null;
               tail = pre;
               return;
          }
          pre.next = temp.next;
          Node n = temp.next;
          n.prev = pre;

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
               newNode.next = null;
               newNode.prev = tail;
               tail = newNode;
               return;
          }
          newNode.next = temp.next;
          temp.next = newNode;
          newNode.prev = temp;
     }

     public void addNodeEnding(int data) {

          Node newNode = new Node(data);
          if (head == null) {
               head = newNode;

          } else {
               tail.next = newNode;
               newNode.prev = tail;
          }
     }

     public void addNodebegining(int data) {

          Node newNode = new Node(data);
          if (head == null) {
               head = newNode;

          } else {
               newNode.next = head;
               head.prev = newNode;
               head = newNode;
          }
     }

     public void addNOde(int data) {
          Node newNode = new Node(data);
          if (head == null) {
               head = newNode;
          } else {
               tail.next = newNode;
               newNode.prev = tail;
          }
          tail = newNode;
     }

     public void display() {
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data);
               temp = temp.next;
          }
     }

     public void displayReverse() {
          Node temp = tail;
          while (temp != null) {
               System.out.println(temp.data);
               temp = temp.prev;
          }
     }

     public static void main(String[] args) {
          doublyLinkedList list = new doublyLinkedList();
          list.addNOde(2);
          list.addNOde(6);
          list.addNOde(8);
          list.addNOde(3);
          list.addNOde(9);
          list.displayReverse();

     }
}
