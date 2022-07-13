package com.studentapp.tests;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;
import com.studentapp.model.StudentPOJO;

import io.restassured.http.ContentType;

public class UpdateStudentPOJO extends TestBase{
	@Test
	void CreatePOJO() {
//		List<String> courses=new ArrayList<String>(); 
//		courses.add("JavaScript");
//		courses.add("Python");
//		
//		StudentPOJO student =new StudentPOJO();
//		Faker fake=new Faker();
//		student.setFirstName(fake.name().firstName());
//		student.setLastName(fake.name().lastName());
//		student.setEmail(fake.internet().emailAddress());
//		student.setProgramme("Computer Science");
//		student.setCourses(courses);
//		
//		given()
//		.when()
//		.contentType(ContentType.JSON)
//		.when()
//		.body(student)
//		.put("/101")
//		.then()
//		.statusCode(200);
		StudentPOJO student =new StudentPOJO();
		Faker fake=new Faker();
		student.setEmail(fake.internet().emailAddress());
		
		given()
		.when()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.patch("/101")
		.then()
		.statusCode(200);
	}
}
