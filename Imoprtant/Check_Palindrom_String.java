import java.util.*;

class Check_Palindrom_String
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        String str= sc.next();
        
        String rev="";
        
        for(int i=n-1; i>=0; i--)
        {
            char ch=str.charAt(i);
            
            rev=rev+ch;
            //System.out.println(ch);
        }
        
        if(str.equals(rev))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}