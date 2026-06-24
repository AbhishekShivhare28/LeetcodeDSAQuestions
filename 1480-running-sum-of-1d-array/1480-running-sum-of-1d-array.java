class Solution {
    public int[] runningSum(int[] nums) {
        	int []RS = new int[nums.length];
		RS[0]=nums[0];
			for(int i=0;i<nums.length-1;i++) {
			int	Sum =	(RS[i]+nums[i+1]);
				RS[i+1]=Sum;
				
			}
			
		
		
		return RS;
    }
}