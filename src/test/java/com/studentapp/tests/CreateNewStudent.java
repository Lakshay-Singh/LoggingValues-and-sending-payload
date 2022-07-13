package com.studentapp.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateNewStudent extends TestBase {
	@DisplayName("Create a new student by sending payload as a string")
	@Test
	void create() {
		String payload="{\"id\":102,\"firstName\":\"Jamy\",\"lastName\":\"Fell\",\"email\":\"jamy213@Duisac.com\",\"programme\":\"Computer Science\",\"courses\":[\"AI\",\"Cloud\"]}";
		given()
		.when()
		.contentType(ContentType.JSON)
		.when()
		.body(payload)
		.post()
		.then()
		.statusCode(201);
	}
}
