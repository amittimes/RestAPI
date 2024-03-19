package amitff;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class HttpRequests {
int id;



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
   
   
   
   
    @Test (priority = 3, dependsOnMethods={"createUser"})
    void updateUser() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("name", "Sumit");
        data.put("job", "Marketing");

        

        given()
            .contentType("application/json")
            .body(data)
        .when()
            .put("https://reqres.in/api/users/" + id)
        .then()
            .statusCode(200)
            .log().all(); // Log the response details for verification
    }
    
    @Test(priority = 4)
    
    void DeleteUser()
    {
        given()
        // Add any necessary request parameters, headers, etc.
    .when()
        .delete("https://reqres.in/api/users/id")
    .then()
        .statusCode(204)
        .log().all();
}


    }
    
    
    
