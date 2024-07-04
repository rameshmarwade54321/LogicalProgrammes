package Practice_22mar2024;

public class E14_palindrome_number 
{

	public static void m1(int num) 
	{
		int c, rem, sum=0;
		
		c=num;    //c=1001   1
		
		while(num>0)
		{
			rem=num%10;    //1001/10=1   100/10=0  10/10 0   1/10  1
			sum=(sum*10)+rem;  // 1   10   100  1001
			num=num/10; //100  10  1   0
			//System.out.println("reverse number  of : "+c + "  is "+sum);	
		}
		System.out.println("reverse number"+sum);
		if (c==sum)
		{
			System.out.println("Number "+c+" is a palimdrone");
		}
		else
			{
				System.out.println("Number "+c+" is not a palimdrone");
			}
		
	}
	
	public static void main(String[] args) 
	{
		m1(1001);
		System.out.println("--------------");
		m1(12345);
	}
	
}

