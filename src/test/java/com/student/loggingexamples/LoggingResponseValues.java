package com.student.loggingexamples;
import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.Test;

import com.studentapp.tests.TestBase;

public class LoggingResponseValues extends TestBase {
	//Print response headers
	@Test
	void test01() {
		given()
		.param("programme", "Computer Science")
		.param("limit", 1)
		.when()
		.get("/list")
		.then()
		.log()
		.headers()
		.statusCode(200);
	}
	
	//Print response status line 
	@Test
	void test02() {
		given()
		.param("programme", "Computer Science")
		.param("limit", 1)
		.when()
		.get("/list")
		.then()
		.log()
		.status()
		.statusCode(200);
	}
	
	//Print response body
		@Test
		void test03() {
			given()
			.param("programme", "Computer Science")
			.param("limit", 1)
			.when()
			.get("/list")
			.then()
			.log()
			.body()
			.statusCode(200);
		}
		
		//Print response body if error
		@Test
		void test04() {
			given()
			.param("programme", "Computer Science")
			.param("limit", -1)
			.when()
			.get("/list")
			.then()
			.log()
			.ifError();
		}


}
