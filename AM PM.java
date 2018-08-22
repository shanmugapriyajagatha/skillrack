import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner ss=new Scanner(System.in);
		String a=ss.next();
		String ar[]=a.split(":");
		int min=(Integer.parseInt(ar[0])*60)+(Integer.parseInt(ar[1]));
		if((min==0)||(min>0)&&(min<720)||(min==1440))
		{
		System.out.println("AM");
		}
		else if((min==720)||(min<1440))
		System.out.println("PM");
		else
		System.out.println("INVALIDINPUT");

	}
}