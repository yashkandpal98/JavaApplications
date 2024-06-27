package inheritance;

class A
{
    int a;
    public void f()
    {
        System.out.println("Parent class");
    }
}


class B extends A
{
    int b;
    @Override
    public void f()
    {
        System.out.println("Child class");
    }
}


public class Inheritance
{
    public static void main(String[] args)
    {
        A o1=new A();
        B o2=new B();
        
        o1.f();
        o2.f();
    }
    
}
