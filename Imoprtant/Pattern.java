//Enter code here
/*

A
AB
ABC
ABCD
ABCDE

*/

class Pattern
{
    public static void main(String args[])
    {
        String newstr="ABCDE";
        for(int i=0;i<newstr.length(); i++)
        {
            String bag="";
            for(int j=0; j<=i; j++)
            {
                char c=newstr.charAt(j);
                bag=bag+c;
            }
            System.out.println(bag);
        }
    }
}