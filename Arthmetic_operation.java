/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthmetic_operation;

import java.util.Scanner;

/**
 *
 * @author Roshan Soorma
 */
public class Arthmetic_operation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b:\n");
        a=sc.nextInt();
        b=sc.nextInt();
        result=a+b;
        System.out.println("addition of two no is:"+result);
    }
    
}
