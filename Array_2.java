public class Array_2 {
    public static void main(String[] args) {
            
            int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};

            insert(a, 5, 0);
            System.out.println();
            delete(a, 6);
            System.out.println();
            insertAtBeginning(a, 11);
            System.out.println();
            insertAtEnd(a, 12);
            System.out.println();
            deleteAtBeginning(a);
            System.out.println();
            deleteAtEnd(a);
    }

    // insert elements into an array
    public static void insert(int[] a, int index, int value) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        b[index] = value;
        for (int i = index + 1; i < b.length; i++) {
            b[i] = a[i - 1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
    
    // delete elements from an array
    public static void delete(int[] a, int index) {
        int[] b = new int[a.length - 1];
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        for (int i = index; i < b.length; i++) {
            b[i] = a[i + 1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    // insert at the beginning
    public static void insertAtBeginning(int[] a, int value) {
        int[] b = new int[a.length + 1];
        b[0] = value;
        for (int i = 1; i < b.length; i++) {
            b[i] = a[i - 1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    // insert at the end
    public static void insertAtEnd(int[] a, int value) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = value;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    // delete at the beginning
    public static void deleteAtBeginning(int[] a) {
        int[] b = new int[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i + 1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    // delete at the end
    public static void deleteAtEnd(int[] a) {
        int[] b = new int[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}