package primeornot;

import java.util.Scanner;


public class PrimeOrNot {

    
    public static void main(String[] args) {
        int x,i,temp=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Please insert any number:");
        x=s.nextInt();
        if(x==2)
        {
            System.out.println(x+" is a prime number.");
        }
        else
        {
            for(i=2;i<x;i++)
            {
                temp=1;
                if(x%i==0)
                {
                    temp=0;
                    break;
                }
            }
            if(temp==1)
            {
                System.out.println(x+" is a prime number.");
            }
            else
            {
                System.out.println(x+" is not a prime number."); 
            }
        }
    }
}
