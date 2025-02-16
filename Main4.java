/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraycircularqueue;

/**
 *
 * @author USER
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();

        // Fails because front = -1
        try {
            q.deQueue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);

        q.display();

        int element = q.deQueue();

        if (element != -1) {
            System.out.println("Deleted Element is " + element);
        }

        q.display();

        q.enQueue(7);

        q.display();

        // Fails to enqueue because front == rear + 1
        q.enQueue(8);
        
    }
    
}
