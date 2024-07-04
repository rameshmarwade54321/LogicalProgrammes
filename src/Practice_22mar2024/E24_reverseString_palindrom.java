package Practice_22mar2024;

public class E24_reverseString_palindrom 
{
	public static void main(String[] args) 
	{
		String str="asdffdsa";   //original
		
		
		String rev="";
		System.out.println(str.length());
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);  //rev=""+f=f, rev=f+e=fe,fe+d=fed,fed+c=fedc   fedcba
		}
		System.out.println("Original String : "+str);
		System.out.println("Reverse String : "+rev);
	
	
      if (str.equals(rev))
      {
    	  System.out.println("string is palindrom" );
      }
      else
      {
    	  System.out.println("string is not palindrom");
      }
}
}