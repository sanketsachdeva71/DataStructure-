package Queue;
class MyQueue {
final int size = 10;
int arr[] = new int[size];
int front = -1;
int rear = -1;

boolean isEmpty() {
    return front == -1 && rear == -1;
}

//boolean isEmpty(){
//return front ==-1 && rear ==-1;
//}
int peek(){
if(this.isEmpty())
{
    System.out.println("Empty Queue at front");
    return -1;
}
return arr[front];
}
// Insertion and Enqueue happens at rear its FIFO
void enqueue(int data){ 
  // when Queue is Empty
    if(this.isEmpty()){
        
        front = 0; // Initialize front when the first element is added
    }
    // When Queue is full
    if(rear==size-1){
        System.out.println(" Queue is full, Cannot Enqueue");
        return;
    }
     rear = rear +1;
     arr[rear]=data;
     System.out.println("enqued "+data);
}
// Deletion and dequeue happens at front its FIFO 
int dequeue(){
    if(this.isEmpty())
{
    System.out.println("Empty Queue nothing to Dequeue");
    return -1;
}
int x = arr[front];
 if(front == rear){  
    // Deleting only the one element in the queue 
     front = -1;
     rear = -1;
    
 }
    else{
    front ++;
    }

    return x;
}
}

public class QueueArray {
    public static void main(String[] args) {
      MyQueue queue = new MyQueue();
      

        // Initial state checks
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Peek element: " + queue.peek());
        
        // Test enqueue and dequeue operations
        System.out.println("Dequeue element: " + queue.dequeue());
        queue.enqueue(7);
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Peek element: " + queue.peek());
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Peek element after dequeue: " + queue.peek());
    }
}
