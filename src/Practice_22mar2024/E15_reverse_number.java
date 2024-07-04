package Practice_22mar2024;

public class E15_reverse_number 
{
    public static void m1(int num) 
    {
		int c,rem,sum=0;
		c=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		
		System.out.println("Reverse number of "+c+" is :"+sum);
	}
    
    public static void main(String[] args) 
    {
		m1(10015);
	}
}
