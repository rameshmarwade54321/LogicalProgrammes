package Practice_22mar2024;

public class E19_CountNumber 
{
	public static void main(String[] args) 
	{
		int num=100;
		int countdigit=0;
		
		while(num>0)      //100>0, 10>0, 1>0
		{
			num=num/10;         //100/10=10, 10/10=1, 1/10=0
			countdigit++;    //1, 2, 3
		}
		System.out.println("count digit of "+num+"number is :"+countdigit);
	}
	
}
