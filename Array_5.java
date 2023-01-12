import java.util.Scanner;
public class Array_5 {
    // java program to create linkedlist using array
    public static void main(String[] args) {
        int[] linkedlist = new int[5];
        int head = -1;
        int tail = -1;
        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be inserted");
                    int element = sc.nextInt();
                    tail = insert(linkedlist, head, tail, element);
                    break;
                case 2:
                    head = delete(linkedlist, head, tail);
                    break;
                case 3:
                    display(linkedlist, head, tail);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
    // insert an element into the linkedlist
    public static int insert(int[] linkedlist, int head, int tail, int element) {
        if (tail == linkedlist.length - 1) {
            System.out.println("Linkedlist overflow");
        } else {
            if (head == -1) {
                head = 0;
            }
            tail++;
            linkedlist[tail] = element;
        }
        return tail;
    }
    // delete an element from the linkedlist
    public static int delete(int[] linkedlist, int head, int tail) {
        if (head == -1 || head > tail) {
            System.out.println("Linkedlist underflow");
        } else {
            System.out.println("Deleted element is " + linkedlist[head]);
            head++;
        }
        return head;
    }
    // display the linkedlist
    public static void display(int[] linkedlist, int head, int tail) {
        if (head == -1 || head > tail) {
            System.out.println("Linkedlist is empty");
        } else {
            System.out.println("Linkedlist is");
            for (int i = head; i <= tail; i++) {
                System.out.println(linkedlist[i]);
            }
        }
    }
}
