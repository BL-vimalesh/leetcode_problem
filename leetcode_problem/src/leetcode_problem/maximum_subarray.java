package leetcode_problem;

public class maximum_subarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int current_num =nums[0];
        int max_num = nums[0];
        for(int i=1;i<nums.length;i++) {
        	current_num = Math.max(nums[i], current_num+nums[i]);
        	
        	max_num = Math.max(max_num, current_num);
        }
        System.out.println(max_num);
	}}
