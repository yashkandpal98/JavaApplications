/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Second;

/**
 *
 * @author kandp
 */

import java.util.Scanner;

import first.C1;

public class Second {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        NewClass obj=new NewClass();
        
        long num=in.nextLong();
        
        obj.displayOddOrEven(num);
        System.out.println();
        
        C1 o=new C1();
        o.print();
        
    }
    
}
