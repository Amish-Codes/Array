class Array_1 {
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(average(a));
        traverse(a);
        System.out.println();
        reverse(a);
        System.out.println();
        copy(a);
        System.out.println();
        System.out.println(even(a));
        System.out.println(odd(a));
        System.out.println(secondMax(a));
        System.out.println(secondMin(a));
        System.out.println(thirdMax(a));
        System.out.println(thirdMin(a));
        System.out.println(middle(a));
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int product(int[] a) {
        int product = 1;
        for (int i = 0; i < a.length; i++) {
            product *= a[i];
        }
        return product;
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void traverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }

    public static void reverse(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    public static void copy(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            System.out.print(b[i]);
        }

    }
    public static int even(int[] a) {
        int even = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int odd(int[] a) {
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    public static int secondMax(int[] a) {
        int max = a[0];
        int secondMax = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            }
        }
        return secondMax;
    }

    public static int secondMin(int[] a) {
        int min = a[0];
        int secondMin = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            }
        }
        return secondMin;
    }

    public static int thirdMax(int[] a) {
        int max = a[0];
        int secondMax = a[0];
        int thirdMax = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = a[i];
            }
        }
        return thirdMax;
    }

    public static int thirdMin(int[] a) {
        int min = a[0];
        int secondMin = a[0];
        int thirdMin = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                thirdMin = secondMin;
                secondMin = min;
                min = a[i];
            }
        }
        return thirdMin;
    }

    public static int middle(int[] a) {
        int middle = a.length / 2;
        return middle;
    }
}