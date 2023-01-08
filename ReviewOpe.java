public class ReviewOpe{
     class Node{
          int data;
          Node next;
          Node(int data){
               this.data = data;

          }
     }
public Node head = null;
public Node tail = null;
    public void addNode(int data){
          Node newNode = new Node(data);
          if(head == null){
               head = newNode;
          }else{
               tail.next = newNode;
          }
          tail = newNode;

     }
     void displayList(){
          if(head == null){
               System.out.println("nothing");
          }else{
               Node temp = head;
               while(temp != null){
                    System.out.println(temp.data);
                    temp = temp.next;
               }
          }
     }

     public static void main(String[] args){
          ReviewOpe Alist = new ReviewOpe();
          Alist.addNode(10);
          Alist.addNode(20);
          Alist.addNode(30);
          Alist.displayList();
     }
}



