// Product of Six
 //Enter code here


import java.util.*;
class ProductOfSix
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        int total=1;
       for(int i=0; i<6 ; i++)
       {
           int num=sc.nextInt();
           total=total*num;
       }
       System.out.println(total);
    }
}