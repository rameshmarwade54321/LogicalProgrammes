package Prctice_29Jun2024;

public class Pattern5 
{

	public static void main(String [] args)
	{
		//*
		//**
		//***
		//****
		
		int star=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
	}
}
