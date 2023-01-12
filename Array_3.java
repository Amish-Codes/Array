// java program to create stack using array

import java.util.Scanner;

public class Array_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size = sc.nextInt();
        int[] stack = new int[size];
        int top = -1;
        int choice;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed");
                    int element = sc.nextInt();
                    top = push(stack, top, element);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    peek(stack, top);
                    break;
                case 4:
                    display(stack, top);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    // push an element into the stack
    public static int push(int[] stack, int top, int element) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            stack[top] = element;
        }
        return top;
    }

    // pop an element from the stack
    public static int pop(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("The popped element is " + stack[top]);
            top--;
        }
        return top;
    }

    // peek an element from the stack
    public static void peek(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("The peeked element is " + stack[top]);
        }
    }

    // display the stack
    public static void display(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("The stack is ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
   }
}
