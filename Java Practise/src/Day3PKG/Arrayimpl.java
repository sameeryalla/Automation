package Day3PKG;

import java.util.Arrays;

public class Arrayimpl {

	public static void main(String args[])
	{
		Arrayimpl a=new Arrayimpl();
		//a.singleDimenssionArray();
		//a.twoDimensionalArray();
		a.sortingArray();
	}

	public void sortingArray() {
		
		int data[]= {98,100,10,99,87,45,23,67,4,17};
		Arrays.sort(data);
		for(int x:data)
		{
			System.out.println(x);
		}
	}

	public void twoDimensionalArray() {
		
		int a[][]=new int[3][2];//two dimensional array declaration
		a[0][0]=1;
		a[0][1]=1;
		a[1][0]=2;
		a[1][1]=4;
		a[2][0]=3;
		a[2][1]=6;
		
		int b[][]= {{1,1},{2,4},{3,6}};
		
		System.out.println(a.length);
		System.out.println("Column count "+a[1].length);
		System.out.println(b.length);
		
		for (int i=0;i<a.length;i++)
		{
			for (int k=0;k<a[i].length;k++)
			{
				System.out.println(a[i][k]);
			}
		}
		int sum=0;
		for(int k[]:a)
		{
			for(int j:k)
			{
				System.out.println(j);	
				sum=sum+j;
				
			}
		}
		System.out.println("Sum of array elements "+sum);
		
	}

	private void singleDimenssionArray() {
		
		int a[]=new int[7];//declaration of static array specifying the size
		
		String s[]=new String[7];
		
		//insert the values in to array
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		System.out.println(a.length);
		s[0]="Sunday";
		s[1]="Monday";
		s[2]="Tuesday";
		s[3]="Wednesday";
		s[4]="Thursday";
		s[5]="Friday";
		s[6]="Saturday";
		System.out.println(s.length);
		String c[]= {"January","February","March","April","May","June","July"};//dynamic array
		System.out.println(c.length);//size of an array
		
		for(int i=1;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				System.out.println(a[i]);
				System.out.println(s[i]);
				System.out.println(c[i]);
			}
		}
		
		for(int i:a)//for each statement
		{
			System.out.println(i);
		}
		
		for(String i:s)//for each statement
		{
			System.out.println(i);
		}
		
		
		
	}
	
}
