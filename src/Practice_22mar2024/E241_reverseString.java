package Practice_22mar2024;
import java.util.Scanner;
public class E241_reverseString 
{
	public static void main(String[] args) 
	{
		
		String str=m1("ramesh");
		System.out.println(str);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s2=sc.nextLine();
		String s3=m1(s2);
		System.out.println(s3);
		m3();
	}
	
	
	public static String m1(String s1)
	{
		String rev="";
		for(int i=s1.length()-1; i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		return rev;
		
	}
	
	public static void m3()
	{
		String s4 = "Avinash";
		for(int i=s4.length()-1; i>=0; i--)
		{
			System.out.print(s4.charAt(i));
		}
		
	}
}
