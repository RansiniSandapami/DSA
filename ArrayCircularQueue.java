/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraycircularqueue;

/**
 *
 * @author USER
 */
public class ArrayCircularQueue {
     int SIZE = 5; // Size of Circular Queue
    int front, rear;
    int items[] = new int[SIZE];

    // Constructor to initialize the queue
    public ArrayCircularQueue() {
        front = -1;
        rear = -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (front == 0 && rear == SIZE - 1) || front == rear + 1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Adding an element
    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;

            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted: " + element);
        }
    }

    // Removing an element
    public int deQueue() {
        int element;

        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        } else {
            element = items[front];

            if (front == rear) {  // Queue has only one element
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % SIZE;
            }
            return element;
        }
    }

    // Display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        int i;
        System.out.print("Items: [");

        for (i = front; i != rear; i = (i + 1) % SIZE)
            System.out.print(items[i] + " ");

        System.out.println(items[i] + "]");

        System.out.print("Indexes: ");
        for (i = front; i != rear; i = (i + 1) % SIZE) {
            System.out.print(i + " ");
        }
        System.out.println(i); // Print the last index
    }
}
    
    
    
   

