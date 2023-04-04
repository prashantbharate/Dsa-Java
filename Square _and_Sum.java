import java.util.*;

class Square_and_Sum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        int total=0;
        for(int i=0; i<3; i++)
        {
            int num=sc.nextInt();
            int sqr= num*num;
            total=total+sqr;
        }
        System.out.println(total);
    }
}