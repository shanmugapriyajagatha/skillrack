import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=in.nextInt();
		int len=s.length();
		String arr[]=new String[len/n];
		String emp="";
		int k=0;
		for(int i=0;i<len;i=i+n)
		{
		    if(i%2==1)
		    {
		        arr[k]=(new StringBuffer(s.substring(i,i+n)).reverse()).toString();
		        k++;
		    }
		    else{
    		    arr[k]=s.substring(i,i+n);
    		    k++;
		    }
		}
		for(int j=0;j<n;j++)
		{
    		for(int i=0;i<k;i++)
    		{
    		    String str=arr[i];
    		    emp+=str.substring(j,j+1);
    		}
		}
		System.out.println(emp);
		

	}
}