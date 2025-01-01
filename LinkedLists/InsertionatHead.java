package LinkedLists;

public class InsertionatHead {
    //Insertion at head
    static Node insertatHead(Node head,int data){
    Node temp = new Node(data);
    temp.next = head;
    head = temp;
    return head;
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(6);
        head.next = second ;
        Node third = new Node(7);
        second.next = third;
        Node fourth = new Node(8);
        third.next = fourth;
        Node fifth = new Node(9);
        fourth.next = fifth;
        //printing the original LinkedList
        System.out.println("original Link list");
        printList(head);
        //Inserting 4 at head
        System.out.println("Inserting 4 at head");
        head = insertatHead(head,4);
        //printing the updated Linked List
       printList(head);
    }
    // method to print the link list
    static void printList(Node head){
        Node current = head ;
        while (current != null ) {
            System.out.println(current.data+ "->");
            current = current.next;
            
        }
        
    }
}
    // Node class definition
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

