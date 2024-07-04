package Prctice_29Jun2024;

public class Pattern6 
{

	public static void main(String[] args)
	{
	
		//********
		//*******
		//*****
		//***
		//*
		
		int star=9;
		for(int i=1; i<=5;i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			star=star-2;
			System.out.println();
		}
	}
}
