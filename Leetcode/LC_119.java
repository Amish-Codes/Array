package Leetcode;
public class LC_119 {
    public static void main(String[] args) {
        // pascal triangle leeetcode 119
        int n = 5;
        int[][] a = new int[n][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
