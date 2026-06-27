class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int []arr = new int[nums.length];
        for (int i=0;i<nums.length;i++){
             int count=0;
            for(int j=nums.length-1;j>=0;j--){
                if (nums[i]>nums[j]&& i!=j){
                   count++;
                }
                arr[i]=count;
            }
        }
        return arr;
    }
}