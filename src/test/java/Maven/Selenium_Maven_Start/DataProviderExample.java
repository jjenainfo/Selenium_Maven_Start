package Maven.Selenium_Maven_Start;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  
	@DataProvider(name="test")
	public Object DP() {
		Object[][] object =new Object[3][2];
		
		object[0][0]="user1";
		object[0][1]="pass1";
		
		object[1][0]="user3";
		object[1][1]="pass3";
		
		object[2][0]="user3";
		object[2][1]="pass3";
		
		
		return object;
		
	}
	@Test(dataProvider="test")
	public void executeDP(String user,String Password) {
		
		System.out.println("user is --"+user);
		System.out.println("Password is --"+Password);
		
	}
	
    
  
}
