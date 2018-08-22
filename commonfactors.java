import java.util.Arrays;
import java.util.Scanner;

public class Sample_gcd 
{
	public static int count=0;
	private static Scanner r;
	public static  int find_Gcd(int n,int m)
	{
		int gcd=0,i;
		for( i=2;i<=n && i<=m;++i)
		{
			if(n % i==0 && m % i==0)
			{
                gcd = i;
                count++;
			}
			
		}
		System.out.println(count);
		return 0;
	}
public static void main(String[] args)
{
	r = new Scanner(System.in);
	int n=r.nextInt();
	int m[]=new int[n];
	for(int i=0;i<n;i++)
	{
		m[i]=r.nextInt();
	}
	Arrays.sort(m);
	int d=m[0];
	for(int i=0;i<n;i++)
	{
	d=find_Gcd(m[1],d);
	return ;
	}
	
}
	
}
