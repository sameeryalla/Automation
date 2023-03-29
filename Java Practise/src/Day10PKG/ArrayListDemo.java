package Day10PKG;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//array declaration
		int a[]=new int[5];//it will save only integer values
		Object b[]=new Object[5];//it will save any data type values
		
		//array list declaration
		ArrayList list=new ArrayList();//we can store any type of data elements
		
		ArrayList<String> sList=new ArrayList<String>();//we can store only String values
		ArrayList<Integer> iList=new ArrayList<Integer>();//we can store only Integer values
		
		sList.add("Sameer");
		sList.add("Yalla");
		sList.add("Test Manager");
		sList.add("SCB");
		iList.add(35);
		iList.add(12);
		iList.add(1);
		
		//Size of any array
		System.out.println("Size of the String arraylist is "+sList.size());
		System.out.println("data of the String arraylist is "+sList);
		System.out.println("Size of the integer arraylist is "+iList.size());
		System.out.println("Data of the integer arraylist before removing "+iList);
		iList.remove(2); 
		System.out.println("Size of the integer arraylist after removing "+iList.size());
		System.out.println("Data of the integer arraylist after removing "+iList);
		
		//inserting a new element in to list
		iList.add(1,1987);
		System.out.println("Data of the integer arraylist after adding "+iList);
		
		//read values from list
		for(String s:sList)
		{
			System.out.println(s);
		}
		
		for(int i:iList)
		{
			System.out.println(i);
		}
		
		
		for(Object o:sList)     //object can be used for any type of data type
		{
			System.out.println(o);
		}
		

	}

}
