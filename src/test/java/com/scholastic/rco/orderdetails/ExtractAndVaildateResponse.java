package com.scholastic.rco.orderdetails;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import io.restassured.response.Response;

public class ExtractAndVaildateResponse {
	
	public  static void extractNVaildateResponse(Response response) {
		String eventDate=response.getBody().jsonPath().getString("ORDER.EVENT_DATE");
		System.out.println("eventDate--->>"+eventDate);
		assertThat(eventDate).isNotNull();
		
		String eventnumber=response.getBody().jsonPath().getString("ORDER.EVENT_NUMBER");
		System.out.println("eventnumber--->>"+eventnumber);
		assertThat(eventnumber).isNotNull();

		
		//List<Object> paymentmethoddetails=response.getBody().jsonPath().getList("ORDER.PAYMENT_METHOD.PAYMENT_METHOD_DETAIL");
		//System.out.println("PAYMENTMETHODDETAIL--->>"+paymentmethoddetails);
		//assertThat(paymentmethoddetails).isNotEmpty();
	
		
		String Couponcode=response.getBody().jsonPath().getString("ORDER.STUDENT_ONLINE_ORDER.STUDENTS[0].STUDENTS_ITEMS[2].DESCRIPTION");
		System.out.println("Couponcode--->>"+Couponcode);
		assertThat(Couponcode).isNotEmpty();

	}

}
