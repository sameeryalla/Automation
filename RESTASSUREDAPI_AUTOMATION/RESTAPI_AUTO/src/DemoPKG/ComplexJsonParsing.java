package DemoPKG;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParsing {

	public static void main(String[] args) {
		
         
		
		System.out.println(payload.CoursePrice());
		JsonPath js=new JsonPath(payload.CoursePrice());
		
		//count the courses
		int coursecount=js.getInt("courses.size()");
		System.out.println("Total no .of courses are: "+coursecount);
		
		//print purcahse amount
		int totalAmount=js.getInt("dashboard.purchaseamount");
		System.out.println("Purchase amount is "+totalAmount);
		
		//print first course title
		String Ftitle=js.getString("courses[0].title");
		System.out.println("First course title is "+Ftitle);
		
		//Print all courses and respective prices
		for (int i=0;i<coursecount;i++)
		{
			String title=js.getString("courses["+i+"].title");
			int price=js.getInt("courses["+i+"].price");
			System.out.println("for the course "+title+" price amount is "+price);
		}
		
		//print no of copies sold by RPA course
		for (int i=0;i<coursecount;i++)
		{
			String title=js.getString("courses["+i+"].title");
			if(title.equalsIgnoreCase("RPA")) {
				int copies=js.getInt("courses["+i+"].copies");
				System.out.println("for the course "+title+" copies sold is "+copies);
				break;
			}
		}
		
		//verify all the sold amounts equals to total purcahse amount
		
		int totalSoldCost=0;
		for (int i=0;i<coursecount;i++)
		{
			String title=js.getString("courses["+i+"].title");
			
				int copies=js.getInt("courses["+i+"].copies");
				int price=js.getInt("courses["+i+"].price");
				totalSoldCost=totalSoldCost+(copies*price);
			
		}
		System.out.println(totalSoldCost);
		if(totalAmount==totalSoldCost)
			{
			 System.out.println("Both equals");
			}
		
	}

}
