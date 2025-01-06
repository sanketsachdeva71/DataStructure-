package Queue;

public class CircularQueue {
    int size = 10;
    int arr[] = new int[size];
    int front = -1;
    int rear = -1;
boolean isEmpty(){
    return (front == -1 && rear == -1);
}       
}
