
package fileinputecample;

import java.io.*;


public class FileInputExample
{

    public static void main(String[] args)
    {
        int i=32;
        
        try
        {
            FileInputStream obj=new FileInputStream("C:\\Yash\\Coding\\JavaApplications\\Test\\src\\test\\Test.txt");
            byte[]ar;
            ar = new byte[49];
            System.out.println(obj.read(ar, 0, 49));
            
            for(int j=0; j<49; j++)
            {
                System.out.print((char)ar[j]);
            }
            
            /*while(-1!=(i=obj.read()))
            {
                System.out.print((char)i);
            }*/
            System.out.println();
        }
        
        catch(Exception e)
        {
           System.out.println("Error");
        }
    }
    
}
