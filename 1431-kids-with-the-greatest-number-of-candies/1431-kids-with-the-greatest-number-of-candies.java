class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> List =new ArrayList<>(10);
       int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
            max=candies[i];
             }
        for(int i=0;i<candies.length;i++){
            if (extraCandies+candies[i]>= max)
                List.add(true);
            else
                List.add(false);
             }
             return List;
    }
}