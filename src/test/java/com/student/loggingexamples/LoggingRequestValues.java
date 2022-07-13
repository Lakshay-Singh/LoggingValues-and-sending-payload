package com.student.loggingexamples;

import com.studentapp.model.StudentPOJO;
import com.studentapp.tests.TestBase;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LoggingRequestValues extends TestBase{
	@Test
	void test01() {
		given()
		.log()
		.headers()
		.when()
		.get("/10")
		.then()
		.statusCode(200);
	}
	@Test
	void test02() {
		given()
		.param("programme", "Computer Science")
		.param("limit", 1)
		.log()
		.params()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
	}
	@Test
	void test03() {
		List<String> courses=new ArrayList<String>(); 
		courses.add("JavaScript");
		courses.add("Python");
		StudentPOJO student =new StudentPOJO();
		student.setFirstName("John");
		student.setLastName("Williams");
		student.setEmail("johnk.dt45@edu.co.in");
		student.setProgramme("IT");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.log()
		.body()
		.when()
		.body(student)
		.post();
	}
	@Test
	void test04() {
		List<String> courses=new ArrayList<String>(); 
		courses.add("JavaScript");
		courses.add("Python");
		StudentPOJO student =new StudentPOJO();
		student.setFirstName("John");
		student.setLastName("Williams");
		student.setEmail("johnk.dt45@edu.co.in");
		student.setProgramme("IT");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.log()
		.all()
		.when()
		.body(student)
		.post();
	}
	
}
