class sum{
	public static void main(String[] args) {
		int [] arr ={ 1,2,3,4};
		int [] arr2 ={7,4,5,6,5};
		int op=0;
		
		
		for (int i : arr2) {
			int sum=0;
			int cnt=0;
			int sum1=0;
			for (int j : arr) {
				sum=i-j;
				cnt++;
				if(cnt==3)
				{
					sum1+=sum;
					System.out.println(sum1);
				}
				
			}
		}


	}
}