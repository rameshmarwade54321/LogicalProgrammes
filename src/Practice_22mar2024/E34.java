package Practice_22mar2024;

public class E34 
{

	
	
		public static void main(String[] args) 
		   {
			   String s1="My name is Bhavana";
			   
			   String ar[] = s1.split(" ");
			   
			   for(int i=0; i<ar.length-1; i++)    //edt
			   {
				   
				   
				   if(ar[i]=="Bhavana") 
				   {
					   
					   for(int j=ar[i].length(); j>0; j--) //edt
					   {
							   int r = 0;
							   
							   r=r+ar[i].charAt(i);
						 
					   }
					   System.out.println(ar[i]);      
				   }
				  
			   }
		   }
		
	
}
