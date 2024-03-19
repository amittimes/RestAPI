package amitff;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class RestAssuredExample {

    @Test(priority = 1)
    void createUser() throws UnsupportedEncodingException {
        RestAssured.baseURI = "https://uat175.etmoney.tech";

        // Define the payload data
        Map<String, Object> payloadData = new HashMap<>();
        payloadData.put("lineage", new Integer[]{1, 1, 1, 114});
        payloadData.put("type", 1);
        payloadData.put("restRequestType", 1);
        payloadData.put("userId", 0);
        payloadData.put("internalRestRequestType", 1);
        payloadData.put("mobileRestRequestType", 114);
        payloadData.put("versionId", "149");
        payloadData.put("compatibilityVersion", "48.0");
        payloadData.put("email", "caiwebg12@yopmail.com");
        // Add other payload data as needed...

        // Encode the payload as a URL-encoded string
        StringBuilder formData = new StringBuilder();
        for (Map.Entry<String, Object> entry : payloadData.entrySet()) {
            if (formData.length() > 0) {
                formData.append("&");
            }
            formData.append(URLEncoder.encode(entry.getKey(), "UTF-8"))
                    .append("=")
                    .append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
        }

        // Send the request
        RestAssured.given()
                .contentType(ContentType.URLENC)
                .header("authorization", "pubL1ckey@ETM0ney.1n")
                .header("accept", "application/json")
                .queryParam(null, null)
                .body(formData.toString()) // Use .body() to manually set the request body
                .when()
                .post("/users/login")
                .then()
                .statusCode(200) // Assuming 200 is the expected status code
                .log().all();
    }
}
