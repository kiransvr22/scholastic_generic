package com.scholastic.rco.orderdetails;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TeacherOderDetailsTest {
	
	private static final String ORDER_DETAILS_TEACHER_EVENT_NO_URL = "https://fusion-order-details.qa.apps.scholastic.tech:443/api/v1/orderDetails/?TeacherEventNo=";

	@Test(dataProvider = "Teacher_Event_No")
	public void teacherOrderDetails(String teacherEventNo) throws Exception {
		Response response=given()
				.accept(ContentType.JSON)
				.when()
				.get(ORDER_DETAILS_TEACHER_EVENT_NO_URL	+ teacherEventNo)
				.andReturn();
		response.prettyPrint();
		ExtractAndVaildateResponse.extractNVaildateResponse(response);		
	}
	
	@DataProvider (name = "Teacher_Event_No")
	public Object[] dpMethod() {
	    return new Object [] { "50017900"};
	}

	

}



