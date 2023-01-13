public class Stack{
public class Node{
     int data;
     Node next;
     public Node(int data){
          this.data = data;
     }
}

public Node top;
public void push(int data){
     Node newNode = new Node(data);
     if(top == null){
          top = newNode;
     }else{
          newNode.next = top;
          top = newNode;
     }
}

public void pop(){
     if(top == null){
System.out.println("stack underflow");
     }else{
          top = top.next;
     }
    
}
public void display(){
     Node current = top;
      while (current != null){
          System.out.println(current.data + "");
          current = current.next;
      }
}

public static void main(String[] args) {
     Stack stack = new Stack();
     stack.push(1);
     stack.push(12);
     stack.push(45);
     stack.pop();
     stack.display();
}

}