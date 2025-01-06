package LinkedLists;
 class Node {
int data;
Node next;
Node(int data){
    this.data = data;
    this.next=null;
}
    
}
public class MiddleElement {
    static void display(Node head){
    if (head == null) {
        System.out.println("Linked List is Empty");
    } 
    Node temp = head;
    while(temp !=null) {
        System.out.println(temp.data +"->");
        temp=temp.next;
    }
    
    }
    static void findMiddleElement(Node head){
        Node fastPointer = head;
        Node slowPointer = head;
        while (fastPointer!=null&& fastPointer.next!=null ) // For odd and Even respectivelly
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        //Slowpointer points to middle element
        System.out.println(slowPointer.data);
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(6);
        head.next =second;
        Node third = new Node(7);
        second.next= third;
        Node fourth = new Node(8);
        third.next = fourth;
        Node fifth = new Node(9);
        fourth.next = fifth;
      System.out.println("original link list");
      display(head);
      
      System.out.println("display the middle element");
      findMiddleElement(head);
      //display(head);
    }
}
