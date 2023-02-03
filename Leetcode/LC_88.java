package Leetcode;

import java.util.Arrays;

public class LC_88 {
   public static void main(String[] args) {
    int[] b = {2 , 6 , 7};
    int[] a = new int[2 * b.length];
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    merge(a , b);
   }
   public static void merge(int[] a, int[] b) {
        for(int i = 0 ; i < b.length ; i++){
            a[i + b.length] = b[i];
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
   } 
}
