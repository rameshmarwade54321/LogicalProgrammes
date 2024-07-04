package Practice_22mar2024;
import java.util.Scanner;
public class E17_Prime_number 
{
    public static void main(String[] args) 
    {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  number");
		num=s.nextInt();
		
		int m, flag=0;
    	
		
		if (num==0 || num==1) 
		{
			System.out.println(num+" is not a prime number");
			flag=1;
		}
		else
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a prime number");
					flag=1;
					break;
				}
			}
			
		
			
		}
		if(flag==0)
		{
			System.out.println(num+" is a prime number");
		}
		
	}
    
}
