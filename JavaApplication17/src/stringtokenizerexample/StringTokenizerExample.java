package stringtokenizerexample;

import java.util.StringTokenizer;


public class StringTokenizerExample
{
    public static void main(String args[])
    {
        String s = "Hello Wel Come";
        
        StringTokenizer ob = new StringTokenizer(s,"+ ");
        
        while(ob.hasMoreTokens())
        {
            System.out.println("Value is: "+ob.nextToken());
        }
    }
}