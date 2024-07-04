package Prctice_29Jun2024;

public class Pattern7 
{

	public static void main(String[] args) 
	{
	
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		int star=5;
		for(int i=1; i<=5;i++)
		{
			
			for(int j=1; j<=star; j++) 
			{
				System.out.print("*");
			}
			
			star--;
			System.out.println();
		}
		int star1=2;
		for(int i=1;i<=4; i++)
		{
			for(int j=1; j<=star1; j++)
			{
				System.out.print("*");
			}
			star1++;
			System.out.println();
		}
	}
}
