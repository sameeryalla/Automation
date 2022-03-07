package DemoPKG;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {

	@Test
	public void courseSumValidation()
	{
		JsonPath js=new JsonPath(payload.CoursePrice());
		int coursecount=js.getInt("courses.size()");		
		//print purcahse amount
		int totalAmount=js.getInt("dashboard.purchaseamount");
		System.out.println("Purchase amount is "+totalAmount);
		
		int totalSoldCost=0;
		for (int i=0;i<coursecount;i++)
		{
			String title=js.getString("courses["+i+"].title");
			
				int copies=js.getInt("courses["+i+"].copies");
				int price=js.getInt("courses["+i+"].price");
				totalSoldCost=totalSoldCost+(copies*price);
			
		}
		System.out.println(totalSoldCost);
		Assert.assertEquals(totalAmount, totalSoldCost);

		
	}
}
