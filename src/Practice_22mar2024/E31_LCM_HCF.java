package Practice_22mar2024;

import java.util.Scanner;

public class E31_LCM_HCF 
{
	
	//25 5*5*1      5 5 1   25
	//50 5*2*5*1     5 5 1  2   50
	public static void main(String args[]) {
        int a, b;
        System.out.println("Enter the a and b value");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        //copy the a,b values into x,y
        int x = a;    //5 =5*1        
        int y = b;    //10=5*2*1
        while (x != y)     //5!=10  5!=5
        {
            if (x > y)     //5>10
            {
                x = x - y;
            } 
            else 
            {
                y = y - x;    // y=10-5=5
            }
        }
        /* when we exit the while loop.we get the two value x
        and y which both are equals and this is our HCF(GCD)result.
        */
        System.out.println("HCF of a&b=" + x);
        //Now Apply the Formula of LCM
        System.out.println("LCM of a&b=" + ((a * b)) / x);
    }

}
