package threadexample;


class MyThread extends Thread
{
    @Override
    public void run()
       {
        while (true)
        {
            System.out.println("Thread program");
        }
    }
}


public class ThreadExample
{
    public static void main(String args[])
    {
        MyThread obj = new MyThread();
        
        obj.start();
        while(true)
        {
            System.out.println("Main Thread");

        }
    }
}