//Enter code here
import java.util.*;

class Substring
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        String str= sc.next();
        
        for(int i=0; i<str.length(); i++)
        {
            int j=i;
            String bag="";
            while(j < str.length())
            {
                bag=bag+str.charAt(j);
                System.out.println(bag);
                j++;
            }
        }
    }
}