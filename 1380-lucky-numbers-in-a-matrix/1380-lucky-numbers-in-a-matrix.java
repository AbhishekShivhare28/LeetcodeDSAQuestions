class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        ArrayList<Integer> listr = new ArrayList<>(10);
		ArrayList<Integer> listc = new ArrayList<>(10);
		ArrayList<Integer> list = new ArrayList<>(10);
	for (int i =0;i<arr.length;i++) {
			int min= Integer.MAX_VALUE;
			for (int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
			}}	
			listr.add(min);
		}
	for (int i =0;i<arr[0].length;i++) {
			int max = Integer.MIN_VALUE;
			for (int j=0;j<arr.length;j++) {
				if(arr[j][i]>max) {
					max=arr[j][i];
			}}	
			listc.add(max);
		}	
	for (int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==listr.get(i)&&arr[i][j]==listc.get(j)) 
					list.add(arr[i][j]);
			}}
            return list;
    }
}