
package javaapplication2;

import java.util.Scanner;
public class JavaApplication2 {

    
    public static void main(String[] args) {
    
        int e,b100=0,b20=0,b5=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Cantidad de dinero que se desea desglosar");
        e=sc.nextInt();
        if(e>100)
        {
            b100=e/100;
            e=e%100;
        }   
        if(e>20)
        {
            b20=e/20;
            e=e%20;
        }
        if(e>5)
        {
            b5=e/5;
            e=e%5;
        }
        System.out.println("Desglose:");
        System.out.println(b100+" billetes de 100€");
        System.out.println(b20+" billetes de 20€");
        System.out.println(b5+" billetes de 5€");
        System.out.println(e+" monedas de 1€");
    }
    
}
