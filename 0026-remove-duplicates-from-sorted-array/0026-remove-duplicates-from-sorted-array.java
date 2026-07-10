class Solution {
    public int removeDuplicates(int[] nums) {
		int w=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[w] != nums[i]) {
					nums[w+1]=nums[i];
                    	w++;
			}
			}
		return w+1;
    }
}