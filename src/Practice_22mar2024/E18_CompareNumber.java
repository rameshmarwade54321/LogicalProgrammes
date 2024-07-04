package Practice_22mar2024;

import java.util.Scanner;
public class E18_CompareNumber 
{
	public static void main(String[] args) 
	{
		int n1,n2,n3;
		
		Scanner s=new Scanner(System.in);
				
		System.out.println("Enter numbers");
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		
		int smallest= ((n1<n2 && n1<n3)?n1:(n2<n3)?n2:n3);
		System.out.println("Smallest number is "+smallest);
		int highest = ((n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3);
		System.out.println("Highest Number is "+ highest);
	}
}
