import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		String s=r.nextLine();
		String []n=s.split("[A-Z|a-z]");
		String []o=s.split("[0|1|2|3|4|5|6|7|8|9|-]");
		String p="";
		for(int i=0;i<o.length;i++)
		   {
		       if(o[i]!=" ")
		       {
		           p=o[i];
		         // System.out.println(p);
		       }
		   }
		int a=Integer.parseInt(n[0]);
		int b=Integer.parseInt(n[1]);
		if(p.equals("A") || p.equals("a"))
		   System.out.print(a+b);
		if(p.equals("D") || p.equals("d"))
		   System.out.print(a/b);
		if(p.equals("m") || p.equals("M"))
		   System.out.print(a*b);
		if(p.equals("s") || p.equals("S"))
		   System.out.print(a-b);