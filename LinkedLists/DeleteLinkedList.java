package LinkedLists;

public class DeleteLinkedList {
    // Node class
    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    // function to delete the entire linkedlist
    static Node deleteCompleteLL(Node head){
        head = null;
        System.out.println("linked list deleted sucessfully");
        return head;

    }
    // Function to delete a node from the head of the linked list
    static Node deletefromHead(Node head){
        if (head == null) {
            System.out.println("The linked list is already empty.");
            return null;
        }
        System.out.println("deleting node with data "+ head.data);
        return head.next;// Move the head pointer to the next node
    }
    // Method to delete the last node
    static Node deletefromEnd(Node head){
        if (head == null) {
            System.out.println("The list is empty.");
            return null;
        }
       //if there is only one node 
       if (head.next == null) { 
        return null;
        
       }
       // Traverse to the second last node
       Node current = head;
       while ((current.next != null && current.next.next != null)) {
        current = current.next;
        
       }
        // Set the second last node's next to null, effectively deleting the last node
        current.next = null;
        return head;

    }
    //function to display the linked list 
    static void display(Node head){
      if (head == null){
        System.out.println("Linked List is empty");
        return;
      }
    Node temp = head;
    while (temp != null) {
        System.out.println(temp.data+" -> ");
        temp = temp.next;
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
        // display the linked list
        System.out.println("original linked list");
        display(head);
         //delete node at the head
         head = deletefromHead(head);
         // Display the linked list after deleting the head node
        System.out.println("Linked list after deleting the head:");
        display(head);
        //delete last node 
        head = deletefromEnd(head);
        System.out.println("linked list after dleteing the last node ");
        display(head);
        // delete the linked list
        head = deleteCompleteLL(head);
        // Attempt to display the linked list after deletion
        display(head);
        

        
    }

}
