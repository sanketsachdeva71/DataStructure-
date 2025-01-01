package LinkedLists;


public class MyLL {
 // Insertion at head 
 //static Node insertatHead(Node head ,int data){
 //Node temp = new Node(data);
 //temp.next = head;
 //head = temp;
 //return head;
 //}
    public static void main(String[] args) {
        Node head = new Node(5) ;
        
        Node second = new Node(6);
        head.next = second;
        Node third = new Node(7);
        second.next =third;
        Node fourth = new Node(8);
        third.next = fourth;
        Node fifth = new Node(9);
        fourth.next = fifth;
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
     //insertatHead(head, 4);
     
   
    }
}
 class Node {
int data;
Node next;
Node(int data){
    this.data=data;
    this.next=null;
}
    
}