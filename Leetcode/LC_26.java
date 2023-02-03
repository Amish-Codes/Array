package Leetcode;

public class LC_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
		    return nums.length;
	int j = 0;
	int i = 1;
	while (i < nums.length) {
		if (nums[i] != nums[j]) {
			j++;
			nums[j] = nums[i];
		}
       i++;
	}
	return j + 1;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2};
        LC_26 obj = new LC_26();
        System.out.println(obj.removeDuplicates(a));
    }
}