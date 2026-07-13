class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         ArrayList<Integer>list=new ArrayList<>();
			 int l=num.length;
			 int a=k;
			 int i=l;
				while (--i>=0||a>0){
					if (i>=0)
						a+=num[i];
				list.add(a%10);
					 a/=10;	
		         }
				Collections.reverse(list);;
		            return list;
		    }
    }
