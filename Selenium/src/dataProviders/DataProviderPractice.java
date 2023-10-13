package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider="dataForTicketBooking")
	public void bookTicketTest(String src,String dest) {
		System.out.println("From: "+src+"\tTo:"+dest);
	}
	
	@DataProvider
	public Object[][] dataForTicketBooking(){
		
		Object [][] obj=new Object[3][2];
		
		obj[0][0]="Bangalore";
		obj[0][1]="Hyderabad";
		
		obj[1][0]="Bangalore";
		obj[1][1]="Chennai";
		
		obj[2][0]="Bangalore";
		obj[2][1]="Kerala";
		
		return obj;
	}
		

}
