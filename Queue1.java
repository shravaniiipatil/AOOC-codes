
import java.util.Scanner;

class Queue1 {

    int size;
    int[] queue;
    int front, rear;

    Queue1(int s) {
        size = s;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int ele) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            queue[++rear] = ele;
            System.out.println("Element added to queue: " + ele);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Removed element: " + queue[front]);
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int queueSize = s.nextInt();
        Queue1 q1 = new Queue1(queueSize);

        while (true) {
            System.out.println("\n1. ENQUEUE ");
            System.out.println("2. DEQUEUE ");
            System.out.println("3. DISPLAY QUEUE ");
            System.out.println("4. EXIT ");
            System.out.print("Enter Your Option: ");

            int opt = s.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter the value to be added to the queue: ");
                    int val = s.nextInt();
                    q1.enqueue(val);
                    break;

                case 2:
                    q1.dequeue();
                    break;

                case 3:
                    q1.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 4.");
            }
        }
    }
}
