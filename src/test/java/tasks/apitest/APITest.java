package tasks.apitest;

import org.junit.Test;

import io.restassured.RestAssured;

public class APITest {

	@Test
	public void test() {
		RestAssured.given()
			.log().all()
		.when()
			.get("http://localhost:8001/tasks-backend/todo")
		.then()
			.statusCode(200)
		;

	}

}
