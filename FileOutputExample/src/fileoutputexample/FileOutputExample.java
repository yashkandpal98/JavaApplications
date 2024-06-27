package fileoutputexample;

import java.io.*;

public class FileOutputExample
{

    public static void main(String[] args)
    {
        try
        {
            FileOutputStream f1=new FileOutputStream("C:\\Yash\\Coding\\JavaApplications\\FileOutputExample\\src\\fileoutputexample\\File1.txt");
            FileOutputStream f2=new FileOutputStream("C:\\Yash\\Coding\\JavaApplications\\FileOutputExample\\src\\fileoutputexample\\File2.txt");
            ByteArrayOutputStream obj=new ByteArrayOutputStream();
            
            obj.write(65);
            obj.write(69);
            obj.writeTo(f1);
            
            obj.close();
            f1.close();
            f2.close();
            
            FileInputStream f11=new FileInputStream("C:\\Yash\\Coding\\JavaApplications\\FileOutputExample\\src\\fileoutputexample\\File1.txt");
            
            System.out.println((char)f11.read());
            System.out.println((char)f11.read());
            
            f1.close();
        }
        
        catch(IOException e)
        {
           System.out.println("Error. File not in searched directory");
        }
    }
    
}