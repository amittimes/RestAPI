package amitff;

import java.util.HashMap;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   @Test (priority = 1)
		    public void getUser() {
		        given()
		            // Add any necessary request parameters, headers, etc.
		        .when()
		            .get("https://reqres.in/api/users?page=2")
		        .then()
		            .statusCode(200)
		            .log().all();
		    }

		   
		   
		   @Test(priority = 2)
		   void createUser() {
		       HashMap<String, Object> data = new HashMap<>();
		       data.put("name", "Amit");
		       data.put("job", "Software Engineer");
		       data.put("job", "Software Engineer");

		       int id = given()
		           .contentType("application/json")
		           .body(data)
		       .when()
		           .post("https://reqres.in/api/users")
		           .then()
		           .statusCode(201) // Assuming a successful creation returns 201 status code
		           .extract().jsonPath().getInt("id");

		       System.out.println("Created user ID: " + id);
		   }
		   @Test(priority = 3)
		   void createUser() {
		       HashMap<String, Object> data = new HashMap<>();
		       data.put("name", "Amit");
		       data.put("job", "Software Engineer");
		       data.put("job", "Software Engineer");

		       int id = given()
		           .contentType("application/json")
		           .body(data)
		       .when()
		           .post("https://reqres.in/api/users")
		           .then()
		           .statusCode(201) // Assuming a successful creation returns 201 status code
		           .extract().jsonPath().getInt("id");

		       System.out.println("Created user ID: " + id);
		   

		   
		       @Test(priority = 5)
			   void createUser() {
			       HashMap<String, Object> data = new HashMap<>();
			       data.put("name", "Vipul");
			       data.put("job", "Software Engineer");
			       data.put("job", "Software Engineer");

			       int id = given()
			           .contentType("application/json")
			           .body(data)
			       .when()
			           .post("https://reqres.in/api/users")
			           .then()
			           .statusCode(201) // Assuming a successful creation returns 201 status code
			           .extract().jsonPath().getInt("id");

			       System.out.println("Created user ID: " + id);

	}}

}
