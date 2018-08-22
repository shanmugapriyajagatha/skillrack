 public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum=0;
		int large=0,res=0;
		for(int i=0;i<n;i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    arr[i] = b / a;
		    if(arr[i]>large)
		    {
		        res=i;
		        large = arr[i];
		    }
		}
		System.out.println(res+1);

	}
}