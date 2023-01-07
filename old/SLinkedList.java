package old;
class SLinkedList {
     class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
          }
     }

     public Node head = null; 
     public Node tail = null; // to save newNode for next value

     public void addNode(int data) {

          Node newNode = new Node(data);

          if (head == null) {
               // head and tail is one value in first insert
               head = newNode;
          } else {
               tail.next = newNode;
          }
              tail = newNode; // the new tail is newNode
     }

     public void display() {
          if (head == null) {
               System.out.println("empty");
               return;
          }
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data);
               System.out.println(temp.next);

               temp = temp.next;
          }
     }

     public static void main(String[] args) {
          SLinkedList list = new SLinkedList();
          list.display();
          list.addNode(19);
          list.addNode(10);
          list.addNode(10);
          list.display();
     }
}