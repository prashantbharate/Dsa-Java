//Enter code here
import java.util.*;

class Prime_Number
{
    public static void main(String args[])
    {

        for(int i=1; i<=100; i++)
        {
            int c=0;
			
            for(int j=1;j<=100; j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(i);
            }
        }
    }
}