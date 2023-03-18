package Day2PKG;

public class ControlStatementsinJAVA {

	public static void main(String args[])
	{
		
		ControlStatementsinJAVA csj=new ControlStatementsinJAVA();
		//Conditional statements(Selection statements)
		csj.conditional(10, 2);
		csj.conditional(2, 10);
		csj.findevenorodd(348);
		csj.defineday(4);
		csj.defineday(7);
		csj.defineday(0);
		csj.defineday(8);
		//switch case
		csj.defineDaynameSwitch(0);
		csj.defineDaynameSwitch(3);
		csj.defineDaynameSwitch(6);
		csj.defineDaynameSwitch(8);
		
		//Loops / Iterative statements
		csj.increamentusingwhile(0);
		csj.printOnlyEvennumber(2);
		csj.doWhiletoPrintEven(2);
		csj.forloop(20);
		//Jump statements
		csj.jumpingStatement(10);
		
	}
	
	public void jumpingStatement(int a)
	{
		for (int i=1;i<=a;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		
		for (int i=1;i<=a;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void forloop(int a) {
		for(int i=2;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is an even number");
			}
			else 
			{
						//System.out.println(i+" is a odd number");
				for(int k=2;k<i;k++)
				{
					if(i%k==0)
					{
						System.out.println(i+" is an odd number");
						break;
					}
					else if(k==(i-1))
					{
						          System.out.println(i+" is a prime number and every prime is an odd numer");
					}
					
				}
				
			}
		}
		
	}

	public void printOnlyEvennumber(int i) {
		while(i<=20)
		{
			System.out.println("Even number "+i);
			i=i+2;
		}
			
		
	}
	
	public void doWhiletoPrintEven(int a)
	{
		do
		{
			if(a%2==0)
			{
				System.out.println(a+" is a even number");
			}
			a++;
		}while(a<=20);
	}

	//Conditional statements(Selection statements)
	
	public void conditional(int a, int b)
	{
		
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
	}
	
	public void findevenorodd(int a)
	{
		if (a%2==0)
		{
			System.out.println("given number "+a+" is even");
		}
		else
		{
			System.out.println("given number "+a+" is odd");
		}
	}
	
	public void defineday(int dayNumber)
	{
		if(dayNumber==1)
		{
			System.out.println("Name of the day for Day"+dayNumber+" is Sunday");
		}
		else if(dayNumber==2)
		{
			System.out.println("Name of the day for Day"+dayNumber+" is Monday");
			
		}else if(dayNumber==3)
		{
			System.out.println("Name of the day for Day"+dayNumber+" is Tuesday");
			
		}else if(dayNumber==4)
		{
			System.out.println("Name of the day for Day"+dayNumber+" is Wednesday");
			
		}else if(dayNumber==5)
		{
			System.out.println("Name of the day for Day"+dayNumber+" is Thurday");
		}else if(dayNumber==6)
		{
			System.out.println("Name of the day for Day"+dayNumber+" is Friday");
		}else if(dayNumber==7)
		{
			System.out.println("Name of the day for Day"+dayNumber+" is Saturday");
		}
		else
		{
			System.out.println("Name of the day for Day"+dayNumber+" is not exist since a week has only 7days and which starts from 1");
		}
	}
	
	public void defineDaynameSwitch(int dayNumber)
	{
		switch(dayNumber)
		{
		case 1:System.out.println("Name of the day for Day"+dayNumber+" is Sunday");break;
		case 2:System.out.println("Name of the day for Day"+dayNumber+" is Monday");break;
		case 3:System.out.println("Name of the day for Day"+dayNumber+" is Tuesday");break;
		case 4:System.out.println("Name of the day for Day"+dayNumber+" is Wednesday");break;
		case 5:System.out.println("Name of the day for Day"+dayNumber+" is Thursday");break;
		case 6:System.out.println("Name of the day for Day"+dayNumber+" is Friday");break;
		case 7:System.out.println("Name of the day for Day"+dayNumber+" is Saturday");break;
		default:System.out.println("Name of the day for Day"+dayNumber+" is not exist since a week has only 7days and which starts from 1");
		
		}
		
	}
	
	//Loops / Iterative statements
	
	//while loop
	public void increamentusingwhile(int a)
	{
		while(a<10)
		{
			a++;
			System.out.println("a value become "+a);
		}
		
			System.out.println("final value of a "+a);
	}
}
