package Day3PKG;



public class StringsImpl {

	public static void main(String args[])
	{ 
		 
		StringsImpl si=new StringsImpl();
		//si.stringOp1("Sameer Yalla");
		String a[]={"Sameer","Yalla","Test Manager","SCB","GBS"};
		si.searchStringinArray(a,"GBS");
		si.searchStringinArray(a,"yalla");
		
		si.stringReverse("Sameer Yalla");
		
	
		
	}
	
	public void stringReverse(String s) {
		
		String dummy="";
		for(int i=s.length()-1;i>=0;i--)
		{
			dummy=dummy+s.charAt(i);
		}
		System.out.println("revese of "+s+" is:"+dummy);
	}

	public void searchStringinArray(String s[], String expected) {
		
		
		boolean flag=false;
		for(String c:s)
		{
			if(c.equals(expected))
			{
				System.out.println("given string "+expected+" found");
				flag=true;
				break;
			}
		}	
			
		if(flag==false) {
				System.out.println("given string "+expected+" not found");
			}
			
				
				
				
		
	}

	public void stringOp1(String s)
	{
		System.out.println("Length of the given string: "+s.length());
		
		String s1="Welcome!,";
		
		//Concatenation
		System.out.println("Length of the given string: "+s1.concat(s));
		System.out.println("Length of the given string: "+s1+s);
		
		//trim
		String s2="        Welcome on Board             ";
		System.out.println("Length of the given string before trim: "+s2.length());
		s2=s2.trim();
		System.out.println("Length of the given string after trim: "+s2.length());
		
		//charAt
		System.out.println("Chara at 3: "+s2.charAt(3));
		//contains
		System.out.println("Contains : "+s2.contains("Wel"));
		System.out.println("Contains : "+s2.contains("wel"));//case sensitive
		
		//equals
		System.out.println("equals : "+s1.equals("Welcome!,"));
		System.out.println("equals : "+s1.equals("welcome!,"));//due to case sensitive it should be false
		System.out.println("equalsIgnoreCase : "+s1.equalsIgnoreCase("weLcoMe!,"));
		
		//Replace
		System.out.println("String replcae after trim: "+s2.trim().replace("Board", "Bus"));
		
		
		//sub string
		System.out.println("subString : "+s2.trim().subSequence(8, 10)); //on should be printed
		
		//lowercase & uppercase
		System.out.println("uppercase : "+s2.toUpperCase()); //on should be printed
		System.out.println("lowercase : "+s2.toLowerCase()); //on should be printed
	}
	
}
