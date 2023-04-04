//Sum of five


//Enter code here
import java.util.*;
class Sum_of_five
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        int total=0;
       for(int i=0; i<5 ; i++)
       {
           int num=sc.nextInt();
           total=total+num;
       }
       System.out.println(total);
    }
}