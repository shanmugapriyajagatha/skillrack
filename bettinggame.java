import java.util.*;
public class Hello {
    public static void main(String[] args) {
        //Your Code Here
        Scanner ss=new Scanner(System.in);
        String s=ss.nextLine();
        int a=ss.nextInt();
        int b=ss.nextInt();
        String[] c=s.split(" ");
        int o=0;int e=0;
        for(int i=0;i<c.length;i++)
        {
            int f=Integer.parseInt(c[i]);
            if(f%2==0)
            e++;
            else
            o++;
        }
        int x=(o*a)-(e*b);
        System.out.println(" "+x);
      }
}  