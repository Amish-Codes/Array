package Leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class LC_136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i)) 
                set.remove(i);
            else {
                set.add(i);
            }    
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        LC_136 obj = new LC_136();
        System.out.println(obj.singleNumber(a));
    }
}
