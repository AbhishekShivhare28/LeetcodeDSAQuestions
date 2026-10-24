class Solution {
    public int findNumbers(int[] nums) {
		int count=0;
		for (int n : nums) {
			if(even(n)) {
				count++;
			}
		}
		return count;
	}
	static boolean even(int n) {
		int NOD = digit(n);// no.of digit
		return NOD%2==0;// return true or false
	}
	static int digit(int n ) {
		if (n<0)
			n=n*-1;
		if (n==0)
			n=1;
	int count=0;
	while (n > 0) {
		count++;
		n = n / 10;
		
	}
	return count;
	}

}

    
