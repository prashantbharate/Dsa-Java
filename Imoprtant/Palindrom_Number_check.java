//Enter code here
import java.util.*;
class Palindrom_Number_check
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int rev=0,temp=0;
        int number=n;
        
         while(number != 0)
        {
            temp=number%10;
            rev=rev*10+temp;
            number=number/10;
        }
       // System.out.println(rev);
       if(n==rev)
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
       
    }
}