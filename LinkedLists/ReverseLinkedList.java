package LinkedLists;

public class ReverseLinkedList {
//Defining Node Class
static class Node{
    int data; 
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;

    }
}

//method to reverse the linked list
static Node ReverseLL(Node head){
Node prev = null;
Node next = null;
Node currentNode = head;
while (currentNode !=null) {
    next = currentNode.next;
    currentNode.next=prev;
    prev = currentNode;
    currentNode = next;
}
//head = prev;
return prev;
}
static void display(Node head){
if (head == null) {
    System.out.println("link list is empty");
    return;
}
Node current = head;
while (current != null) {
    System.out.print(current.data + " -> ");
    current = current.next;
}
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
        //Rverse link list 
        head = ReverseLL(head);
        System.out.println(" reversed link list ");
        display(head);
}
}
