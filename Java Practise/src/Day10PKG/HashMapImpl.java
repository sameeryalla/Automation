package Day10PKG;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapImpl {

	
	public static void main(String[] args) {
		
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101,"Sameer Yalla");
		hm.put(102,"Swarupa Yalla");
		hm.put(103,"Ramu Naidu Yalla");
		hm.put(104,"Geetha Yalla");
		hm.put(105,"Sanvi Yalla");
		
		System.out.println(hm);
		//remove a pair from HashMap
		hm.remove(103);
		System.out.println("After removing one value "+hm);
		hm.put(103,"Ramu Yalla");
		System.out.println("After adding one value "+hm);
		//reading pairs using for loop
		for(Map.Entry<Integer,String> m:hm.entrySet())
		{
			System.out.println(+m.getKey()+" value is "+m.getValue());
		}
		
		//reading pairs using while
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			int key=(int)it.next();
			System.out.println(+key+" value is "+hm.get(key));
		}
		
		hm.forEach((k,v)->System.out.println(+k+" value is: "+v));
	}  

}
