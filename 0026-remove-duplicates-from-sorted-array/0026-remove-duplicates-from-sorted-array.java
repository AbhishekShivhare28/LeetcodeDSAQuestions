class Solution {
    public int removeDuplicates(int[] nums) {
		int w=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] != nums[i-1]) {
					w++;
					nums[w]=nums[i];
			}
			}
		return w+1;
    }
}