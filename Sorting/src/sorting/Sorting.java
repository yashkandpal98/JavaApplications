package sorting;

import java.util.Scanner;


interface A
{
    abstract public void sort(int[] a, int n);
}

class Array
{
     Scanner obj;
    int a[], n;
    public void create()
    {
        System.out.print("Enter number of elements: "); obj=new Scanner(System.in);
        n=obj.nextInt();
        a=new int[n];
    }
    
    public void input()
    {
        System.out.println("\nEnter elements:");
        for(int i=0; i<n; i++)
        {
            a[i]=obj.nextInt();
        }
    }
    
    public void display()
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}


class Sort implements A
{
    int i;
    
    @Override
    public void sort(int x[], int n)
    {
        if(n>1)
        {
            int a1[]=new int[n/2]; int a2[]=new int[n-n/2];

            /*System.out.print(n+" "+(n/2)+" "+(n-n/2)+);*/
            for(i=0; i<n; i++)
            {
                if(i<(n/2))
                {
                    a1[i]=x[i];
                }
                else
                {
                    a2[i-n/2]=x[i];
                }
            }

            System.out.print("\n");
            for(i=0; i<n/2; i++)
            {
                System.out.print(a1[i]+" ");
            }

            System.out.print("\n");
            for(i=0; i<n-(n/2); i++)
            {
                System.out.print(a2[i]+" ");
            }
            /*sort(a1, n/2);
            sort(a2, n-n/2);

            int n0=0, n2=0, n1=0;

            while(n0<n && n1<n/2 && n2<(n-n/2))
            {
                if(a1[n1]<a2[n2])
                {
                    x[n0]=a1[n1];
                    n0++;
                    n1++;
                }
                else
                {
                    x[n0]=a2[n2];
                    n0++;
                    n2++;
                }
            }

            if(n1>n2)
            {
                while(n2<(n-(n/2)))
                {
                    x[n0]=a2[n2];
                }
            }
            else if (n1<n2)
            {
                while(n1<n/2)
                {
                    x[n0]=a1[n1];
                }
            }
            
            for(i=0; i<n; i++)
            {
                System.out.print(x[i]+"\n");
            }*/
        }
    }
}


public class Sorting
{
    public static void main(String[] args)
    {
        Scanner obj;
        Array a1=new Array();
        Sort s=new Sort();
        
        a1.create();
        a1.input();
        
        System.out.print("\nYour array: ");
        a1.display();
        
        System.out.print("\n");
        
        /*System.out.print("\nSorted array: ");*/s.sort(a1.a, a1.n);
    }
    
}
