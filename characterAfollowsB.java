import java.util.*;
public class Hello {

    public static void main(String[] args) {
        //Your Code Here
    Scanner ss=new Scanner(System.in);
    String a=ss.nextLine();
    String b=ss.next();
    String c=ss.next();
    String d="";
    d=b+c;
   // System.out.println(d);
   int li=0;
   int count=0;
   while((li=a.indexOf(d,li))!=-1)
   {
       li=a.indexOf(d,li);
       if(li!=-1)
       {
           count++;
           li++;
       }
       
   }
   System.out.println(count);
    }
}