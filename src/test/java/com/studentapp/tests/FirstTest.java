package com.studentapp.tests;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class FirstTest extends TestBase {
	
	//@Test
	void getAllStudents(){
//		RequestSpecification requestSpecs=RestAssured.given();
//		Response response=requestSpecs.get("http://localhost:8085/student/list");
//		response.prettyPrint();
//		ValidatableResponse validatableResponse= response.then();
//		validatableResponse.statusCode(200);
		
		RestAssured.given()
				   .when()
				   .get("/list")
				   .then()
				   .statusCode(200);
	}
	
	//@Test
	void getSingleStudent() {
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("programme", "Computer Science");
		params.put("limit", 1);
		
		Response response=
		given()
//		.queryParam("programme", "Computer Science")
//		.queryParam("limit", 1)
//		.queryParams("programme", "Computer Science", "limit", 1) 
		.queryParams(params)
		.when()
		.get("/list");
		
		response.prettyPrint();
	}
	
	//@Test
	void getSpecificStudent() {
		Response response=
		given()
		.pathParam("id", 2)
		.when()
		.get("/{id}");
		
		response.prettyPrint();
	}
}
