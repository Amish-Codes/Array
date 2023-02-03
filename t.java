public class t {
    public static void main(String[] args) {
        // remove and print duplicate elements from an sorted array
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        int j = 0;
        int i = 1;
        while (i < a.length) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
            i++;
        }
        for (int k = 0; k <= j; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
