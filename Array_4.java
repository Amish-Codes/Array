import java.util.Scanner;
public class Array_4 {
    // java program to create queue using array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int size = sc.nextInt();
        int[] queue = new int[size];
        int front = -1;
        int rear = -1;
        int choice;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be enqueued");
                    int element = sc.nextInt();
                    rear = enqueue(queue, front, rear, element);
                    break;
                case 2:
                    front = dequeue(queue, front, rear);
                    break;
                case 3:
                    peek(queue, front, rear);
                    break;
                case 4:
                    display(queue, front, rear);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
    // enqueue an element into the queue
    public static int enqueue(int[] queue, int front, int rear, int element) {
        if (rear == queue.length - 1) {
            System.out.println("Queue overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
        }
        return rear;
    }
    // dequeue an element from the queue
    public static int dequeue(int[] queue, int front, int rear) {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow");
        } else {
            System.out.println("The dequeued element is " + queue[front]);
            front++;
        }
        return front;
    }
    // peek an element from the queue
    public static void peek(int[] queue, int front, int rear) {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow");
        } else {
            System.out.println("The peeked element is " + queue[front]);
        }
    }
    // display the queue
    public static void display(int[] queue, int front, int rear) {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow");
        } else {
            System.out.println("The elements in the queue are");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
