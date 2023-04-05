/*
	you are given 6 numbers you have to double the 2nd, 5th,6th
	and 1st will be remain same 
	and rest all will be trippled
	and add all of them 
	final result

*/

//Enter code here
import java.util.*;
class Infinity_Stones
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int[] arr= new int[6];
        for(int i=0; i<=5; i++)
        {
            arr[i]=sc.nextInt();
            if(i==1 || i==4 || i==5 )
            {
                arr[i]=arr[i]*2;
            }
            else if(i==0)
            {
                arr[i]=arr[i];
            }
            else
            {
             arr[i]=arr[i]*3;       
            }
                       
        sum=sum+arr[i];               
        }
         System.out.println(sum);
            

        
        
    }
}