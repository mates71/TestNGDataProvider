package atHome;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@DataProvider(name="input")
	public Object[][] getData(){
		return new Object[][] {
			{"koyun","kuzu"},//0-0 /0-1
			{"keci","oglak"},//1-0 /1-1
			{"essek","sipa"},//2-0 /2-1
		};
	}
	
	//first change
	
  @Test(dataProvider="input")
  public void testMethod(String input1,String input2) {
	  
	  System.out.println("input 1" +input1);
	  System.out.println("input 2" +input2);
  }
}
