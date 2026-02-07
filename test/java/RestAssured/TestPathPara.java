package RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestPathPara {
    // Set Base URL
// No need to add questions mark in the URL.
// queryParam() will automatically add it while parsing.
final static String ROOT_URI = "http://ip-api.com/json";

@Test
public void getIPDetails() {
    String IPURL = "https://petstore.swagger.io/v2/pet";
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        // Add query parameter
        .when().queryParam("ipAddress", "107.218.134.107")
        .get(IPURL); // Send GET request
    
    // Print response
    String responseBody = response.getBody().asString();
    System.out.println("Response Body is =>  " + responseBody);
}
}
